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

/* RobSock.h
 *
 * Interface to libRobSock.a/so, the library that allows programming
 * CiberRato Robot Agents using C and C++.
 *
 * For more information about the CiberRato Robot Simulator 
 * please see http://microrato.ua.pt/ or contact us.
 */

#ifndef ROBSOCK_H
#define ROBSOCK_H

#if defined(ROBSOCK_LIBRARY)
#  define ROBSOCK_EXPORT Q_DECL_EXPORT
#else
#  define ROBSOCK_EXPORT Q_DECL_IMPORT
#endif

#define CELLROWS 7
#define CELLCOLS 14

#define CENTER  0
#define FRONTAL 0
#define LEFT    1
#define RIGHT   2
#define OTHER1  3
#define REAR    3

#ifdef __cplusplus
extern "C" 
{
#else
typedef unsigned char bool;
#endif

/**
 * \defgroup CRobSock C interface for RobSock library
 * \brief C interface for RobSock library
 * \details 
 *   Set of functions that represents the default C interaction with the simulator.
 *   These functions are wrappers of the corresponding C++ equivalents.
 *
 * \defgroup registering RobSock registering functions
 * \ingroup CRobSock
 * \brief Registering agent in simulator
 * \details
 *   An agent acts as a client in the simulation environment, being the simulator the server.<br/>
 *   So, it has to register into the simulator, before being able to control its robot.
 *
 * \defgroup driving RobSock driving functions
 * \ingroup CRobSock
 * \brief Sending actuating orders to wheels
 * \details
 *   A robot is equipped with two parallel wheels, driven by two independent motors.<br/>
 *   An agent can control the desired velocity of every wheel.<br/>
 *   The possible values for the velocity range in interval [-0.15, +0.15], where a value of
 *   0.1 means that the wheel moves 0.1 units in one simulation cycle.<br/>
 *   The unit of lenght corresponds to the diameter of a robot.<br/>
 *   It is assumed that inertia and noise are presented, so the actual movement of the wheels can
 *   be different than the control values.
 *
 * \defgroup synchronization RobSock synchronization functions
 * \ingroup CRobSock
 * \brief Wait for next simulator's data record
 * \details
 *   The simulator makes the state of the world evolve at every cycle, 
 *   which by default is set to 50ms.<br/>
 *   The agent needs to be synchronized with the simulator, in order to have updated information from the simulator.<br/>
 *   This update is done every time the agent calls the \c ReadSensors function.<br/>
 *   \c ReadSensors is a blocking function, that only returns after new data is received from the simulator.<br/>
 *   All information related to the last simulation step come in a single message and is cached locally.<br/>
 *   This means that all functions that return data (sensors, buttons, leds, time),
 *   just retrieve values cached in the last synchronization step.
 *
 * \defgroup sensing RobSock sensing functions
 * \ingroup CRobSock
 * \brief Consulting sensor values
 * \details 
 *   After cycle synchronization (ReadSensors called), 
 *   the values of all available sensors are cached locally.
 *   The funcions in this group just retrieve values cached in the last synchronization step.
 *
 * \defgroup leds RobSock led manipulation functions
 * \ingroup CRobSock
 * \brief Setting and getting the state of robot leds
 * \details 
 *   The setting actions are sent immediately to the simulator, 
 *   but only take effect at the next simulation step.
 *   Information from the simulator is only received through the \c ReadSensors call,
 *   being cached locally.
 *   So, the getting functions just retrieve values cached in the last synchronization step.
 *
 * \defgroup buttons RobSock button state functions
 * \ingroup CRobSock
 * \brief Get the state of the buttons
 * \details
 *   The robot body has 2 buttons that are manipulated only by the simulator.<br/>
 *   The \c start button is pressed by the simulator to start the run or to resume it after a stoppage.<br/>
 *   The \c stop button is pressed by the simulator to suspend the run in order to issue any required action,
 *   for instance, to remove a badly behaved robot. 
 *   Information from the simulator is only received through the \c ReadSensors call,
 *   being cached locally.
 *   So, these getting functions just retrieve values cached in the last synchronization step.
 *
 * \defgroup times RobSock time funcions
 * \ingroup CRobSock
 * \brief Get time
 * \details
 *   In general, in a challenge 3 times are defined: <br/>
 *   - \c final time, representing the overall time available for the run;<br/>
 *   - \c key time, representing the time until a first phase is completed;<br/>
 *   - \c cycle time, representing the time step at which simulation is done.<br/>
 *   These time are received at registering time and are cached locally.
 *   At every \c ReadSensors, the agent receives the current simulation time,
 *
 * \defgroup config RobSock configuration parameters
 * \ingroup CRobSock
 * \brief Get parameters of current simulation
 * \details
 *   This parameters are received on registration and cached locally.
 *   The funcions in this group just retrieve values cached at that time.
 */

/**************************************************************************/
/************* registration *********************************************/
/**************************************************************************/

/** 
 * \brief Connects to simulator and initializes local caching of data
 * \ingroup registering
 * \param [in] name Name as agent appears in score panel
 * \param [in] pos Position of robot in the starting grid (0 for first available)
 * \param [in] host IP address of simulator 
 * \returns 0 on success; -1 otherwise
 */
int InitRobot(char *name, int pos, char *host);

/** 
 * \brief Connects to simulator, setting obstacle sensors' positions, and initializes local caching of data
 * \ingroup registering
 * \param [in] name Name as agent appears in score panel
 * \param [in] pos Position of robot in the starting grid (0 for first available)
 * \param [in] IRSensorAngles Angular position for the obstacle sensors
 * \param [in] host IP address of simulator 
 * \returns 0 on success; -1 otherwise
 */
int InitRobot2(char *name, int pos, double IRSensorAngles[4], char *host);

/** 
 * \brief Initializes robot that also works as a beacon and connects to simulator 
 * \ingroup registering
 * \param [in] name Name as agent appears in score panel
 * \param [in] pos Position of robot in the starting grid (0 for first available)
 * \param [in] height Height of the beacon
 * \param [in] host IP address of simulator 
 * \returns 0 on success; -1 otherwise
 */
int InitRobotBeacon(char *name, int pos, double height, char *host);


/**************************************************************************/
/************* synchronization ********************************************/
/**************************************************************************/

/**
 * \brief Blocks until next simulator's data record has been received
 * \ingroup synchronization
 * \details 
 *   This is a blocking call that waits until a new record with data has been received from the simulator.
 *   It only blocks if the new record hasn't yet been received.
 *   The received data record (XML message) is parsed and sensor data is cached locally.
 * \returns 0 on success; -1 otherwise
 */
int ReadSensors(void);


/**************************************************************************/
/************* sensing ****************************************************/
/**************************************************************************/

/**
 * \brief Retrieves the last received simulation time 
 * \ingroup times
 * \return The last received current simulation time
 */
unsigned int GetTime(void);

/**
 * \brief Indicates if a new measure of the given obstacle sensor was received in the last synchronization step.
 * \ingroup sensing
 * \details
 *   If not ready, the value returned by \c GetObstacleSensor is invalid.
 * \param id Sensor id (one of FRONTAL, LEFT, RIGHT, REAR)
 * \returns \c true if a measure exists; \c false otherwise
 * \see GetObstacleSensor
 */
bool IsObstacleReady(int id);

/**
 * \brief Retrieves the last received measure of the given obstacle sensor 
 * \ingroup sensing
 * \details
 *   The value returned by an obstacle sensor is inversely proportional to the 
 *   distance to the closest obstacle captured by the sensor.
 * \param id Sensor id (one of FRONTAL, LEFT, RIGHT, REAR)
 * \returns the last received measure of the given obstacle sensor
 */
double GetObstacleSensor(int id); 
    
/**
 * \brief Indicates if a new measure of the given beacon sensor was received in the last synchronization step.
 * \ingroup sensing
 * \details
 *   If not ready, the value returned by \c GetBeaconSensor is invalid.
 * \param id Beacon id (from 0 to n-1, being n the number of beacons)
 * \returns \c true if a measure exists; \c false otherwise
 * \see GetBeaconSensor, GetNumberOfBeacons, beaconMeasure
 */
bool IsBeaconReady(int id);

/**
 * \brief Get the number of beacons in the maze
 * \ingroup sensing
 * \returns The number of beacons in the maze
 * \see GetBeaconSensor, GetNumberOfBeacons, beaconMeasure
 */
int GetNumberOfBeacons(void);     

/**
 * \brief The data type returned by the \c GetBeaconSensor function
 * \ingroup sensing
 * \details
 *   If there is no line of sight between the robot and a beacon,
 *   because they are too far apart or there is a wall in between,
 *   the beacon is said to be not visible.
 *   If it is visible, the measure is the angle between the frontal axis of the robot
 *   and the beacon, in degrees.
 * \see GetBeaconSensor, GetNumberOfBeacons, IsBeaconReady
 */
struct beaconMeasure {
        bool   beaconVisible;  ///< \c true if robot can see beacon; \c false otherwise
        double beaconDir;      ///< angular position of beacon, in range [-180,+180] (only valid if \c beaconVisible is true)
};

/**
 * \brief Retrieves the last received measure of the given beacon sensor 
 * \ingroup sensing
 * \details
 *   The value returned by a beacon sensor is a structure containing a flag
 *   indicatinf if the beacon is visible and its angular position, in range [-180,+180], if it is visible.
 * \param id Beacon id (from 0 to n-1, being n the number of beacons)
 * \returns the last received measure of the given beacon sensor
 * \see IsBeaconReady, GetNumberOfBeacons, beaconMeasure
 */
struct beaconMeasure GetBeaconSensor(int id);    
    
/**
 * \brief Indicates if a new measure of the compass was received in the last synchronization step.
 * \ingroup sensing
 * \details
 *   If not ready, the value returned by \c GetCompassSensor is invalid.
 * \returns \c true if a measure exists; \c false otherwise
 * \see GetCompassSensor
 */
bool IsCompassReady(void);

/**
 * \brief Retrieves the last received measure of the compass sensor 
 * \ingroup sensing
 * \details
 *   The value returned by the compass sensor is the angular position, in range [-180,+180],
 *   of the robot in relation to the north,
 *   which, in this simulation environment, corresponds to X axis.
 * \returns the last received measure of the compass sensor
 */
double GetCompassSensor(void);
    
/**
 * \brief Indicates if a new measure of the ground sensor was received in the last synchronization step.
 * \ingroup sensing
 * \details
 *   If not ready, the value returned by \c GetGroundSensor is invalid.
 * \returns \c true if a measure exists; \c false otherwise
 * \see GetGroundSensor
 */
bool IsGroundReady(void);

/**
 * \brief Retrieves the last received measure of the ground sensor 
 * \ingroup sensing
 * \details
 *   The value returned by the sensor indicates the type of floor on which the robot is located.
 *   It is related to the target areas that exist in the maze.
 *   Being N the number of target areas, it is an integer value between 0 and N-1.
 * \returns the last received measure of the ground sensor
 * \see IsGroundReady
 */
int GetGroundSensor(void);     
    
/**
 * \brief Indicates if a new measure of the bumper sensor was received in the last synchronization step.
 * \ingroup sensing
 * \details
 *   If not ready, the value returned by \c GetBumperSensor is invalid.
 * \returns \c true if a measure exists; \c false otherwise
 * \see GetBumperSensor
 */
bool IsBumperReady(void);

/**
 * \brief Retrieves the last received measure of the bumper sensor 
 * \ingroup sensing
 * \details
 *   The value returned by the sensor indicates if the robot has collided with
 *   obstacles (walls or other robots).
 *   It is a ring placed around the robot, so it is impossible to know where in the 
 *   robot's perimeter the collision occurs.
 * \returns the last received measure of the bumper sensor
 * \see IsBumperReady
 */
bool GetBumperSensor(void);     

/**
 * \brief Indicates if a new measure of the score sensor was received in the last synchronization step.
 * \ingroup sensing
 * \details
 *   If not ready, the value returned by \c GetScoreSensor is invalid.
 * \returns \c true if a measure exists; \c false otherwise
 * \see GetScoreSensor
 */
bool IsScoreReady(void);

/**
 * \brief Retrieves the last received measure of the score sensor 
 * \ingroup sensing
 * \details
 *   The value returned by the sensor is the current score of the robot.
 * \returns the last received measure of the score sensor
 * \see IsScoreReady
 */
int GetScoreSensor(void);

/**
 * \brief Indicates if a new measure of the GPS sensor was received in the last synchronization step.
 * \ingroup sensing
 * \details
 *   If not ready, the values returned by \c GetX, \c GetY and \c GetDir are invalid.
 * \returns \c true if a measure exists; \c false otherwise
 * \see IsGPSDirReady, GetX, GetY, GetDir
 */
bool IsGPSReady();

/**
 * \brief Indicates if a new measure of the GPS sensor related to direction was received in the last synchronization step.
 * \ingroup sensing
 * \details
 *   If not ready, the values returned by \c GetDir is invalid.
 * \returns \c true if a measure exists; \c false otherwise
 * \see IsGPSReady, GetX, GetY, GetDir
 */
bool IsGPSDirReady();

/**
 * \brief Retrieves the X component of the last received measure of the GPS sensor 
 * \ingroup sensing
 * \details
 *   The value returned by the sensor is the X position of the robot in the world, not in the maze.
 * \returns the X component of the last received measure of the GPS sensor
 * \see IsGPSReady, IsGPSDirReady, GetY, GetDir
 */
double GetX(void); 

/**
 * \brief Retrieves the Y component of the last received measure of the GPS sensor 
 * \ingroup sensing
 * \details
 *   The value returned by the sensor is the Y position of the robot in the world, not in the maze.
 * \returns the Y component of the last received measure of the GPS sensor
 * \see IsGPSReady, IsGPSDirReady, GetX, GetDir
 */
double GetY(void); 

/**
 * \brief Retrieves the Dir component of the last received measure of the GPS sensor 
 * \ingroup sensing
 * \details
 *   The value returned by the sensor is the orientation of the robot in the world, being the same as the orientation in the maze.
 * \returns the Dir component of the last received measure of the GPS sensor
 * \see IsGPSReady, IsGPSDirReady, GetX, GetY
 */
double GetDir(void);


/**************************************************************************/
/************* communication **********************************************/
/**************************************************************************/

extern bool NewMessageFrom(int id);
extern char* GetMessageFrom(int id);

/* Broadcast message */
extern void           Say(char * msg);


/**************************************************************************/
/************* requesting *************************************************/
/**************************************************************************/

/*
 Request a list of nReqs Sensors
 Sensors are identified by the following strings: 
    "Compass", "Ground", "Collision", "IRSensor0", IRSensor1", etc, "Beacon0", "Beacon1", etc
*/
void RequestSensors(int nReqs, ...);

/* Requests */
void RequestCompassSensor(void);
void RequestGroundSensor(void);
void RequestObstacleSensor(int Id);
void RequestBeaconSensor(int Id);


/**************************************************************************/
/************* Buttons ****************************************************/
/**************************************************************************/

/**
 * \brief Retrieves the last received state of the start button
 * \ingroup buttons
 * \returns \c true if button was pressed; \c false otherwise
 */
bool GetStartButton(void);

/**
 * \brief Retrieves the last received state of the stop button
 * \ingroup buttons
 * \returns \c true if button was pressed; \c false otherwise
 */
bool GetStopButton(void);


/**************************************************************************/
/************* driving ****************************************************/
/**************************************************************************/

/* Drive right motor with rPow and left motor with lPow - Powers in (-0.15,0.15) */
/**
 * \brief Define the desired velocity of the two robot wheels.
 * \ingroup driving
 * \details
 *   A robot has two parallel wheels, driven by independent motors.
 *   An agent can define the desired velocity for every wheel.
 *   The possible values range in interval [-0.15, +0.15], where a value of
 *   0.1 means that the wheel moves 0.1 units in one simulation cycle.
 *   The unit of lenght corresponds to diameter of a robot.
 * \param [in] lVel Desired velocity for the left wheel
 * \param [in] rVel Desired velocity for the right wheel
 */
void DriveMotors(double lVel, double rVel);


/**************************************************************************/
/************* Led manipulation *******************************************/
/**************************************************************************/

/**
 * \brief Turn \c returning led ON and OFF
 * \ingroup leds
 * \details
 *   In general, when a challenge involves a returning phase, ie., 
 *   when the robot has to return to its starting spot or to a home area,
 *   it has to signal, over a target area, that it is starting that phase.
 *   This signalization is done turning the returning led ON and OFF afterwards.
 * \param [in] val \c true to turn the led ON and \c false otherwise
 */
void SetReturningLed(bool val);

/**
 * \brief Turn \c visiting led ON and OFF
 * \ingroup leds
 * \details
 *   In general, a robot has to signal it is over a given target area.
 *   This signalization is done turning the \c visiting led ON and OFF afterwards.
 *   The robot must be over a target area to be succeful. Otherwise it is penalized.
 * \param [in] val \c true to turn the led ON and \c false otherwise
 */
void SetVisitingLed(bool val);

/**
 * \brief Turn \c end led ON
 * \ingroup leds
 * \details
 *   In general, a robot has to signal it has finished its run.
 *   This signalization is done turning the \c end led ON.
 *   The simulador finishes the robot's run as soon as this command is issued.
 *   If at the end of the run the robot doesn't send this command a penalty is applied to it.
 */
void Finish(void);

/**
 * \brief Retrieves the last received state of the returning led
 * \ingroup leds
 * \returns \c true if led is ON; \c false otherwise
 */
bool GetReturningLed(void);

/**
 * \brief Retrieves the last received state of the visiting led
 * \ingroup leds
 * \returns \c true if led is ON; \c false otherwise
 */
bool GetVisitingLed(void);

/**
 * \brief Retrieves the last received state of the end led
 * \ingroup leds
 * \returns \c true if led is ON; \c false otherwise
 */
bool GetFinished(void);

/**************************************************************************/
/**************************************************************************/

/**************************************************************************/
/************* Parameters *************************************************/
/**************************************************************************/

/** 
 * \brief Retrieves the cycle time
 * \ingroup times
 * \returns The cycle time, in milliseconds
 */
int GetCycleTime(void);

/** 
 * \brief Retrieves the total time
 * \ingroup times
 * \returns The total time, in milliseconds
 */
int GetFinalTime(void);

/** 
 * \brief Retrieves the key time
 * \ingroup times
 * \returns The key time, in milliseconds
 */
int GetKeyTime(void);

/*****
        Functions returning noise levels
******/

/* Returns maximum additive noise of infra-red sensors */
double GetNoiseObstacleSensor(void);

/* Returns maximum additive noise of beacon angular direction */
double GetNoiseBeaconSensor(void);

/* Returns maximum additive noise of compass */
double GetNoiseCompassSensor(void);

/* Returns maximum multipicative noise of motors */
double GetNoiseMotors(void);

unsigned int GetNumberRequestsPerCycle(void);

double GetBeaconAperture();

unsigned int GetBeaconLatency();
unsigned int GetIRLatency();
unsigned int GetGroundLatency();
unsigned int GetBumperLatency();

bool GetBeaconRequestable();
bool GetIRRequestable();
bool GetGroundRequestable();
bool GetBumperRequestable();

void ReadMap(char *filename, void *vmap);

#ifdef __cplusplus
}
#endif

#ifdef CIBERQTAPP

#include <qapplication.h>

extern void *        Link(void);

#endif /* CIBERQTAPP */

#endif /*ROBSOCK_H */
