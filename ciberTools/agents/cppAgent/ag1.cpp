/* 
 * Agent in C++, using CRobLink class 
 */

#include <math.h>
#include <stdlib.h>
#include <stdio.h>

#include "croblink.h"

class Agent : public CRobLink {
public:
    /* GPS position at start */
    double X0, Y0;
    const char *name;

    /* Constructor */
    Agent(const char* n) : CRobLink(n, 0, "localhost") 
    {
        name = n;
        ReadSensors();
        X0 = posx();
        Y0 = posy();
    }
    
    /* agent must wait for the start button to start its run */
    void waitForStart()
    {
        printf("%s: waiting for start\n", name);
        do {
            ReadSensors();
        } while (not start());
    }

    /* rotate to face a beacon, go to there and signal its visit */
    void gotoBeacon(int bn)
    {
        /* rotate until facing target */
        printf("%s: rotating to face beacon %d\n", name, bn);
        double angle = beacon(bn).beaconDir;
        while (angle < -10.0 or angle > 10.0) {
            DriveMotors(-80.0/1000, 80.0/1000);
            ReadSensors();
            angle = beacon(bn).beaconDir;
        }

        /* go to target, adjusting orientation if necessary */
        printf("%s: going to beacon %d\n", name, bn);
        while (ground() != bn)
        {
            double linearPower = 80.0/1000;
            double angularPower = 1.0/1000 * angle;
            DriveMotors(linearPower - angularPower, linearPower + angularPower);
            ReadSensors();
            angle = beacon(bn).beaconDir;
        }
    }

    void signalVisiting(int bn)
    {
        printf("%s: signaling visit to target %d\n", name, bn);
        do {
            SetVisitingLed(true);
            ReadSensors();
        } while (visitingLed() == false);
        SetVisitingLed(false);
        ReadSensors();
    }

    void signalTheReturning()
    {
        printf("%s: signaling the returning\n", name);
        do {
            SetReturningLed(true);
            ReadSensors();
        } while (returningLed() == false);
        SetReturningLed(false);
        ReadSensors();
    }

    void finishTheRun()
    {
        printf("%s: finising the run\n", name);
        for (unsigned int i = 0; i < 3; i++)
        {
            Finish();
            DriveMotors(0.0, 0.0);
            ReadSensors();
        }
    }

    double startSpotAngle()
    {
        double theta1 = atan2(Y0-posy(), X0-posx()) * 180.0 / M_PI;
        double theta2 = compass();
        double theta = theta1 - theta2;
        if (theta > 180.0) theta -= 360.0;
        else if (theta < -180.0) theta += 360.0;
        return theta;
    }

    double startSpotDistance()
    {
        double dx = posx() - X0;
        double dy = posy() - Y0;
        double dist = sqrt(dx*dx + dy*dy);
        return dist;
    }

    void gotoStartSpot(double window, double speed, double distance)
    {
        /* rotate until facing target */
        printf("%s: rotating to face start spot\n", name);
        double angle = startSpotAngle();
        while (angle < -window or angle > window) {
            DriveMotors(-speed/1000, speed/1000);
            ReadSensors();
            angle = startSpotAngle();
        }

        /* go to target, adjusting orientation if necessary */
        printf("%s: going to start spot\n", name);
        while (startSpotDistance() > distance)
        {
            double linearPower = speed/1000;
            double angularPower = 1.0/1000 * angle;
            DriveMotors(linearPower - angularPower, linearPower + angularPower);
            ReadSensors();
            angle = startSpotAngle();
        }
    }

};

int main(int argc, char *argv[])
{
    /* create agent and register in simulator*/
    Agent *agent = new Agent("Agent 1");
    if (agent == NULL) {
        fprintf(stderr, "Fail in creation of agent\n");
        return EXIT_FAILURE;
    }
    if (agent->status() == -1) {
        fprintf(stderr, "Fail in registration of agent\n");
        return EXIT_FAILURE;
    }

    agent->waitForStart();
    agent->gotoBeacon(0);
    agent->signalVisiting(0);
    agent->signalTheReturning();
    agent->gotoStartSpot(10.0, 100.0, 1.5);
    agent->gotoStartSpot(5.0, 20.0, 0.2);
    agent->finishTheRun();
    
    /* that's all */
    return EXIT_SUCCESS;
}


