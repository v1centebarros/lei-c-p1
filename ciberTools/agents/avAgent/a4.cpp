#include "CiberAV.h"

#include <stdio.h>
#include <stdint.h>
#include <iostream>

void gotoBeacon(int bn)
{
    /* rotate until facing target */
    printf("..Rotating to beacon\n");
    while (beaconAngle(bn) < -10 or beaconAngle(bn) > 10) {
        motors(-80, 80);
        apply();
    }

    /* go to target, avoiding obstacle and adjusting orientation if necessary */
    printf("\n..Going to beacon\n");
    while (groundType() != bn)
    {
        double linearPower = 80.0;
        double angularPower = 1 * beaconAngle(bn);
        double fdist = obstacleDistance(FRONTSENSOR);
        double ldist = obstacleDistance(LEFTSENSOR);
        double rdist = obstacleDistance(RIGHTSENSOR);
        if (collides()) {
            linearPower = 0.0;
            angularPower = -50.0;
        }
        else if (fdist < 1.5) {
            if (ldist < 1.5) {
                linearPower = 0.0;
                angularPower = -50.0;
            }
            else {
                linearPower = 0.0;
                angularPower = 50.0;
            }
        }
        else if (ldist < 1.5) {
            angularPower = -30.0;
        }
        else if (rdist < 1.5) {
            angularPower = 30.0;
        }
        motors(linearPower - angularPower, linearPower + angularPower);
    	apply();
    }

    /* stopping */
    motors(0, 0);
    apply();
}

void gotoStart()
{
    /* rotate until facing start spot */
    printf("..Rotating to start spot\n");
    while (startAngle() < -10 or startAngle() > 10)
    {
        motors(-80, 80);
        apply(1);
    }

    /* go to start spot, adjusting orientation if necessary */
    printf("\n..Going to start spot, full speed\n");
    while (startDistance() > 2)
    {
        double linearPower = 80.0;
        double angularPower = 1 * startAngle();
        double fdist = obstacleDistance(FRONTSENSOR);
        double ldist = obstacleDistance(LEFTSENSOR);
        double rdist = obstacleDistance(RIGHTSENSOR);
        if (collides()) {
            linearPower = 0.0;
            angularPower = -50.0;
        }
        else if (fdist < 1.5) {
            if (ldist < 1.5) {
                linearPower = 0.0;
                angularPower = -50.0;
            }
            else {
                linearPower = 0.0;
                angularPower = 50.0;
            }
        }
        else if (ldist < 1.5) {
            angularPower = -30.0;
        }
        else if (rdist < 1.5) {
            angularPower = 30.0;
        }
        motors(linearPower - angularPower, linearPower + angularPower);
    	apply(1);
    }

    /* go to start spot, adjusting orientation if necessary */
    printf("\n..Going to start spot, slowly\n");
    while (startDistance() > .3)
    {
        double linearPower = 40.0;
        double angularPower = 1 * startAngle();
        motors(linearPower - angularPower, linearPower + angularPower);
    	apply(1);
    }

    /* stopping */
    motors(0, 0);
    apply(5);
}

int main()
{
    /* connecting to simulator */
    init2("Grimmy bear", 0, "localhost");

    /* visit all beacons */
    printf("beaconCount: %u\n", beaconCount());
    for (uint32_t i = 1; i <= beaconCount(); i++) {
        /* visiting beacon i */
        printf("Going to beacon %u\n", i);
        gotoBeacon(i);
    
        /* picking up its stone */
        pickUp();
    }

    /* anouncing the returning */
    returning();
    
    /* return to start position */
    gotoStart();
            	
    /* anouncing the end of the run */
    finish();
    
    /* ending the program */
    printf("Bye!\n");
    return 0;
}

