/*
    This file is part of ciberRatoToolsSrc.

    Copyright (C) 2001-2011 Universidade de Aveiro

    ciberRatoToolsSrc is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    ciberRatoToolsSrc is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
*/
#include "cmeasures.h"

#include <iostream>
#include <fstream>
#include <cmath>

CMeasures::CMeasures(int nBeacons) : beaconReady(nBeacons), beacon(nBeacons)
{
	time = 0;

	ground    = -1;
	compass   = 0.0;
	collision = false;

	for(int b=0;b<nBeacons;b++)
	{
		beaconReady[b]=false;
		beacon[b].beaconVisible=false;
		beacon[b].beaconDir=0.0;
	}

	for(int i=0;i<NUM_IR_SENSORS;i++)
	{
		IRSensor[i] = 0.0;
		IRSensorReady[i]=false;
	}

	compassReady=false;
	groundReady=false;
    collisionReady=false;
    gpsReady=false;
    gpsDirReady=false;
    scoreReady = arrivalTimeReady = returningTimeReady = collisionsReady =false;
    score=0;
    arrivalTime=0;
    returningTime=0;
    collisions=0;
}

void CMeasures::showValues()
{
	fprintf(stderr, "Measures Time: %u\n{\n", time);
    /* print compass */
	fprintf(stderr, "  Compass: %g\n", (compassReady) ? compass : NAN);
    /* print beacon sensors */
	fprintf(stderr, "  Beacons: [%g", (beaconReady[0]) ? beacon[0].beaconDir : NAN);
    for (unsigned int i = 1; i < beacon.size(); i++) 
	    fprintf(stderr, ",%g", (beaconReady[i]) ? beacon[i].beaconDir : NAN);
	fprintf(stderr, "]\n");
    /* print buttons */
	fprintf(stderr, "  Start/Stop buttons: %s/%s; \n", start ? "true" : "false", stop ? "true" : "false");
	fprintf(stderr, "}\n");
}
