#include "CiberAV.h"

#include <stdio.h>

void gotoBeacon(int bn)
{
    /* rotate until facing target */
    printf("..Rotating to beacon\n");
    while (beaconAngle(bn) < -10 or beaconAngle(bn) > 10) {
        motors(-80, 80);
        apply();
        //printf("beaconAngle(%d): %g\n", bn, beaconAngle(bn));
    }

    /* go to target, adjusting orientation if necessary */
    printf("\n..Going to beacon\n");
    while (groundType() != bn)
    {
        double linearPower = 80.0;
        double angularPower = 1 * beaconAngle(bn);
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
    while (startAngle() < -10 or startAngle() > 10)
    {
        motors(-80, 80);
        apply(1);
    }

    /* go to start spot, adjusting orientation if necessary */
    while (startDistance() > 2)
    {
        double linearPower = 80.0;
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

    /* go to beacon number 1 */
    printf("Going to beacon 1\n");
    gotoBeacon(1);

    /* picking up its stone */
    pickUp();
    
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

