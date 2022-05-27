/*
    This file is part of ciberRatoTools.

    Copyright (C) 2001-2022 Universidade de Aveiro

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
#ifndef __CIBER_CIBERAV_
#define __CIBER_CIBERAV_

#include <stdio.h>
#include <stdint.h>

/* CiberAV.h */

/**
 * \defgroup CiberAV C interface for CiberAV library
 * \brief C interface for CiberAV library
 * \details 
 *   Set of functions that represents a C interface with the simulator, 
 *   used in <b>Academis de Verão</b>.
 *   These functions are implemented on top of the \c RobSock library, but not all are covered.
 */

/**************************************************************************/
/************* registration *********************************************/
/**************************************************************************/

/**
 * \defgroup avRegistering CiberAV registering functions
 * \ingroup CiberAV
 * \brief Registering agent in simulator
 * \details
 *   An agent acts as a client in the simulation environment, being the simulator the server.<br/>
 *   So, it has to register into the simulator, before being able to control its robot.
 */

/** 
 * \brief Connects to a local simulator and initializes local caching of data
 * \details
 *   It aborts execution if registration fails
 * \param [in] name Name as agent appears in score panel
 * \param [in] pos Position of robot in the starting grid (0 for first available)
 */
void init(const char *name, int pos);

/** 
 * \brief Connects to (possible) remote simulator and initializes local caching of data
 * \details
 *   It aborts execution if registration fails
 * \param [in] name Name as agent appears in score panel
 * \param [in] pos Position of robot in the starting grid (0 for first available)
 * \param [in] host IP address of simulator 
 */
void init2(const char *name, int pos, const char *host);

/**************************************************************************/
/************* synchronization ********************************************/
/**************************************************************************/

/**
 * \defgroup avSynchronization CiberAV synchronization functions
 * \ingroup CiberAV
 * \brief Synchronizing with the simulator
 * \details
 *   The simulator makes the state of the world evolve at every cycle, 
 *   which by default is set to 50ms.<br/>
 *   The agent needs to be synchronized with the simulator, in order to have updated information from the simulator.<br/>
 *   This update is done every time the agent calls the \c apply function,<br/>
 *   which is a blocking function, that only returns after new data is received from the simulator.<br/>
 *   All information related to the last simulation step come in a single message and is cached locally.<br/>
 *   This means that all functions that return data (sensors, buttons, leds, time),
 *   just retrieve values cached in the last synchronization step.
 */

/** 
 * \brief apply orders during time cycles 
 * \details This is the only function that calls the ReadSensors function, thus
 *    it is the only one that make the system advance
 * \param cnt The number of cycles to apply (1 by defualt)
 */
void apply(unsigned int cnt = 1);


/** 
 * \defgroup avDriving CiberAV driving functions
 * \ingroup CiberAV
 * \brief Sending actuating orders to wheels
 * \details
 *   A robot is equipped with two parallel wheels, driven by two independent motors.<br/>
 *   An agent can control the desired velocity of every wheel.<br/>
 *   The possible values for the velocity range in interval [-0.15, +0.15], where a value of
 *   0.1 means that the wheel moves 0.1 units in one simulation cycle.<br/>
 *   The unit of lenght corresponds to the diameter of a robot.<br/>
 *   It is assumed that inertia and noise are presented, so the actual movement of the wheels can
 *   be different than the control values.
 */

/**
 * \brief Define the desired velocity of the two robot wheels.
 * \ingroup driving
 * \details
 *   A robot has two parallel wheels, driven by independent motors.
 *   An agent can define the desired velocity for every wheel.
 *   The possible values range in interval [-150, +150], where a value of
 *   100 means that the wheel moves 0.1 units in one simulation cycle.
 *   The unit of lenght corresponds to diameter of a robot.
 * \param [in] leftVel Desired velocity for the left wheel
 * \param [in] rightVel Desired velocity for the right wheel
 */
void motors(double leftVel, double rightVel);


/** 
 * \defgroup avLeds CiberAV led manipulation functions
 * \ingroup CiberAV
 * \brief Setting the state of robot leds
 * \details 
 *   The setting actions are sent immediately to the simulator, 
 *   but only take effect at the next simulation step.
 */

/** 
 * \brief Signal visit to a target area
 * \details 
 *   The robot must be over a target area to be succeful. Otherwise it is penalized
 */
#define pickUp() visit()
void visit();

/** 
 * \brief Signal that the robot starts its returning phase.
 * \details 
 *   In general, when a challenge involves a returning phase, ie., 
 *   when the robot has to return to its starting spot or to a home area,
 *   it has to signal, over a target area, that it is starting that phase.
 *   This signalization is done turning the returning led ON and OFF afterwards.
 *   This function does both steps, in two successive synchronization steps.
 */
void returning();

/** 
 * \brief States that the robot has finished its run
 * \details
 *   In general, a robot has to signal it has finished its run.
 *   This signalization is done turning the \c end led ON.
 *   The simulador finishes the robot's run as soon as this command is issued.
 *   If at the end of the run the robot doesn't send this command a penalty is applied to it.
 */
void finish();


/** 
 * \defgroup avSensing CiberAV sensing functions
 * \ingroup CiberAV
 * \brief Retrieving sensor values
 * \details 
 *   After cycle synchronization (\c ReadSensors or \c apply called), 
 *   the values of all available sensors are cached locally.
 *   The funcions in this group just retrieve information based on values cached in the last synchronization step.
 */

#define FRONTSENSOR  0
#define LEFTSENSOR   1
#define RIGHTSENSOR  2
#define REARSENSOR   3

/** 
 * \brief Retrieve the smallest distance to an obstacle, 
 *   based on the measure of the specified obstacle sensor
 * \details
 *   The value returned by an obstacle sensor is inversely proportional to the 
 *   distance to the closest obstacle captured by the sensor.
 *   This function returns the inverse of the value measured.
 * \param sensorId the sensor to be used. 
 *   Must be one of FRONTSENSOR, LEFTSENSOR, RIGHTSENSOR, or REARSENSOR
 * \return the sensor measure 
 */
double obstacleDistance(int sensorId);

/** 
 * \brief Retrieves the angular position of the specified beacon in relation to
 *   the frontal axis of the robot.
 * \details
 *   In this library, it is assumed beacons are always visible.
 * \param id Id of the beacon to be used. Must be a value between 
 *    1 and n, where n is the number of beacons.
 * \return The angular position of the beacon in relation to the robot front axis
 * \see beaconCount.
 */
double beaconAngle(int id);

/** 
 * \brief Retrieves the angular position of the robot in relation to virtual North.
 * \return the angular position of the robot in relation to virtual North..
 */
double northAngle();

/** 
 * \brief Retrieves the type of floor under the robot.
 * \details 
 *   This is done using the ground sensor
 *   where the robot is at the moment of the reading
 * \return A value between 1 and n, if the robot is over a target area, or
 *   0 if it is out of any target area.
 */
int groundType();

/** 
 * \brief Check if robot is over the specified target area
 * \param id The target area to be detected
 * \return true if the robot is over the specified target area,
 *   and false otherwise.
 */
bool onTarget(int id);

/** 
 * \brief Get the number of beacons in the maze
 * \return The number of beacons
 */
uint32_t beaconCount();

/** 
 * \brief Retrieves the angular position of the robot's starting spot in 
 *     relation to its front axis.
 * \details 
 *   Only available if the GPS is available. The measure is noisy.
 * \return The calculated angular position.
 */
double startAngle();

/** 
 * \brief Retrieves the distance from the robot's center to its starting spot.
 * \details 
 *   Only available if the GPS is available. The measure is noisy.
 * \return The calculated distance
 */
double startDistance();

/** 
 * \brief collision with wall or other robot
 * \details 
 * \return \c true if robot has collided; \c false otherwise
 */
bool collides();

#endif
