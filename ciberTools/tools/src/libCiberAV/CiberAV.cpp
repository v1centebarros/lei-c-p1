/* CiberAV library
 *
 * Interface ciber para Compiladores 2021-2022
 *
 * For more information about the CiberRato Robot Simulator 
 * please see http://microrato.ua.pt/ or contact us.
 */
#include "CiberAV.h"

#include <stdlib.h>
#include <stdio.h>
#include <sys/time.h>
#include <time.h>
#include <math.h>

#include "RobSock.h"

void printStr(const char *s)
{
    fprintf(stdout, "%s", s); fflush(stdout);
}

void printValue(const int v)
{
    fprintf(stdout, "%d", v); fflush(stdout);
}

static double __x0_, __y0_;

double posX()
{
    return GetX();
}

double posY()
{
    return GetY();
}

void init(const char *name, int pos)
{
    init2(name, pos, "localhost");
}

void init2(const char *name, int pos, const char *host)
{
    /* connect to server/simulator */
    if (InitRobot((char*)name, pos, (char*)host) == -1)
    {
       fprintf(stderr, "Robot \"%s\" fail connecting to simulator\n", name); 
       exit(1);
    }
    printf("Robot \"%s\" connected\n", name);

	/* print simulation parameters */
	ReadSensors();
	fprintf(stdout, "Cycle time = %d\n"
		"Motor's noise = %g\n", 
		GetCycleTime(), GetNoiseMotors());
    __x0_ = posX();
    __y0_ = posY();

	/* wait for start signal */
	while (!GetStartButton())
	{
		ReadSensors();
	}
}

void apply(unsigned int cnt)
{
	//int cnt = (int)((100.0/GetCycleTime())*time + 0.5);
	while (cnt > 0)
	{
		ReadSensors();
		cnt--;
	}
}

static double leftP = 0;
static double rightP = 0;

void motors(double left, double right)
{
	if (left < -150) left = -150; else if (left > 150) left = 150;
	if (right < -150) right = -150; else if (right > 150) right = 150;
	DriveMotors(left/1000.0, right/1000.0);
    leftP = left;
    rightP = right;
}

void pickUp()
{
    SetVisitingLed(1);
    motors(0,0);
    ReadSensors();
    SetVisitingLed(0);
    motors(leftP, rightP);
}

void returning()
{
    SetReturningLed(1);
}

void finish()
{
    Finish();
}

double obstacleDistance(int id)
{
    return 1.0/GetObstacleSensor(id);
}

double beaconAngle(int id)
{
    struct beaconMeasure bm = GetBeaconSensor(id-1);
    return bm.beaconDir;    
}

double northAngle()
{
    return GetCompassSensor();
}

int groundType()
{
    return GetGroundSensor()+1;
}

bool onTarget(int id)
{
    return GetGroundSensor() == (id-1);
}

uint32_t beaconCount()
{
	return (uint32_t)GetNumberOfBeacons();
}

static double ang(double x1, double y1, double x2, double y2)
{
    double dx = x2-x1;
    double dy = y2-y1;
    if (dx == 0 && dy == 0) return 0;
    return atan2(dy, dx)*180.0/M_PI;
}

double startAngle()
{
    double theta1 = ang(posX(), posY(), __x0_, __y0_);
    double theta2 = GetCompassSensor();
    double theta = theta1 - theta2;
    if (theta > 180) theta -= 360;
    else if (theta < -180) theta += 360;
#if defined(DEBUG)
    //fprintf(stderr, "startAngle: %g\n", theta);
    fprintf(stderr, "startAngle: %g ((%g,%g) -> (%g,%g))\n", theta, __x0_, __y0_, posX(), posY());
#endif
    return theta;
}

double startDistance()
{
    double dx = posX() - __x0_;
    double dy = posY() - __y0_;
    double dist = sqrt(dx*dx + dy*dy);
#if defined(DEBUG)
    fprintf(stderr, "startDistance: %g ((%g,%g) -> (%g,%g))\n", dist, __x0_, __y0_, posX(), posY());
#endif
    return dist;
}

bool collides()
{
    return GetBumperSensor();
}

