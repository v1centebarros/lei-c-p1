/*
    This file is part of ciberRatoToolsSrc.

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
#ifndef _CIBER_ROBLINK_
#define _CIBER_ROBLINK_

#include <qobject.h>
#include <assert.h>

#include <stdarg.h>

#include "cmeasures.h"
#include "csimparam.h"
#include "netif.h"

#include "structureparser.h"

#include <iostream>

using std::cerr;

/**
 * \defgroup CppRobSock C++ interface for RobSock library
 * \brief C++ interface for RobSock library
 * \details 
 *   Set of functions that represents the default C interaction with the simulator.
 *   These functions are wrappers of the corresponding C++ equivalents.
 *
 * \defgroup Cpp_registering C++ RobSock registering functions
 * \ingroup CppRobSock
 * \brief Registering agent in simulator
 * \details
 *   An agent acts as a client in the simulation environment, being the simulator the server.<br/>
 *   So, it has to register into the simulator, before being able to control its robot.
 *
 * \defgroup Cpp_driving C++ RobSock driving functions
 * \ingroup CppRobSock
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
 * \defgroup Cpp_synchronization C++ RobSock synchronization functions
 * \ingroup CppRobSock
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
 * \defgroup Cpp_sensing C++ RobSock sensing functions
 * \ingroup CppRobSock
 * \brief Consulting sensor values
 * \details 
 *   After cycle synchronization (ReadSensors called), 
 *   the values of all available sensors are cached locally.
 *   The funcions in this group just retrieve values cached in the last synchronization step.
 *
 * \defgroup Cpp_leds C++ RobSock led manipulation functions
 * \ingroup CppRobSock
 * \brief Setting and getting the state of robot leds
 * \details 
 *   The setting actions are sent immediately to the simulator, 
 *   but only take effect at the next simulation step.
 *   Information from the simulator is only received through the \c ReadSensors call,
 *   being cached locally.
 *   So, the getting functions just retrieve values cached in the last synchronization step.
 *
 * \defgroup Cpp_buttons C++ RobSock button state functions
 * \ingroup CppRobSock
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
 * \defgroup Cpp_times C++ RobSock time funcions
 * \ingroup CppRobSock
 * \brief Get time
 * \details
 *   In general, in a challenge 3 times are defined: <br/>
 *   - \c final time, representing the overall time available for the run;<br/>
 *   - \c key time, representing the time until a first phase is completed;<br/>
 *   - \c cycle time, representing the time step at which simulation is done.<br/>
 *   These time are received at registering time and are cached locally.
 *   At every \c ReadSensors, the agent receives the current simulation time,
 *
 * \defgroup Cpp_config C++ RobSock configuration parameters
 * \ingroup CppRobSock
 * \brief Get parameters of current simulation
 * \details
 *   This parameters are received on registration and cached locally.
 *   The funcions in this group just retrieve values cached at that time.
 */
 
/**
 * \brief A class that implements a link between an agent and a robot in the simulator
 */
class CRobLink  
#ifdef CIBERQTAPP
: public QObject
#endif
{
#ifdef CIBERQTAPP
    Q_OBJECT
#endif
public:
    /** 
     * \brief Constructor that connects to simulator, keeping default position of obstacle sensors, and initializes local caching of data
     * \ingroup Cpp_registering
     * \details
     *   When instantiated an object is always created. 
     *   Call the \c status method to check if connection with the simulator has actually been established.
     * \param [in] name Name as agent appears in score panel
     * \param [in] pos Position of robot in the starting grid (0 for first available)
     * \param [in] host IP address of simulator 
     */

    CRobLink(char *name, int pos, char *host);
    /** 
     * \brief Constructor that connects to simulator, setting obstacle sensors' positions, and initializes local caching of data
     * \ingroup Cpp_registering
     * \details
     *   When instantiated an object is always created. 
     *   Call the \c status method to check if connection with the simulator has actually been established.
     * \param [in] name Name as agent appears in score panel
     * \param [in] pos Position of robot in the starting grid (0 for first available)
     * \param [in] IRSensorAngles Angular position for the obstacle sensors
     * \param [in] host IP address of simulator 
     */

    CRobLink(char *name, int pos, double IRSensorAngles[], char *host);
    /** 
     * \brief Constructor that initializes robot that also works as a beacon
     * \ingroup Cpp_registering
     * \details
     *   When instantiated an object is always created. 
     *   Call the \c status method to check if connection with the simulator has actually been established.
     * \param [in] name Name as agent appears in score panel
     * \param [in] pos Position of robot in the starting grid (0 for first available)
     * \param [in] height Height of the beacon
     * \param [in] host IP address of simulator 
     * \returns 0 on success; -1 otherwise
     */
    CRobLink(char *name, int pos, double height, char *host); // for RobotBeacon
    
    virtual ~CRobLink();

    //int ReadSensors();

    /**
     * \brief Get the status of the registering function
     * \details
     *   The constructors have to connect to the simulator and parse a reply message.
     *   If all this ends well, a status flag is put at 0; otherwise it is put at -1.
     *   This function retrieves the value of this flag.
     * \return The value of the status flag
     */
	inline int status() { return Status; }
    
/**************************************************************************/
/************* driving ****************************************************/
/**************************************************************************/

    /**
     * \brief Define the desired velocity of the two robot wheels.
     * \ingroup Cpp_driving
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
    void Say(char * msg);

/**************************************************************************/
/************* Led manipulation *******************************************/
/**************************************************************************/

    /**
     * \brief Turn \c returning led ON and OFF
     * \ingroup Cpp_leds
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
     * \ingroup Cpp_leds
     * \details
     *   In general, a robot has to signal it is over a given target area.
     *   This signalization is done turning the \c visiting led ON and OFF afterwards.
     *   The robot must be over a target area to be succeful. Otherwise it is penalized.
     * \param [in] val \c true to turn the led ON and \c false otherwise
     */
    void SetVisitingLed(bool val);

    /**
     * \brief Turn \c end led ON
     * \ingroup Cpp_leds
     * \details
     *   In general, a robot has to signal it has finished its run.
     *   This signalization is done turning the \c end led ON.
     *   The simulador finishes the robot's run as soon as this command is issued.
     *   If at the end of the run the robot doesn't send this command a penalty is applied to it.
     */
    void Finish(void);

    /**
     * \brief Retrieves the last received state of the end led
     * \ingroup Cpp_leds
     * \returns \c true if led is ON; \c false otherwise
     */
	inline bool endLed() { return measures.endLed; }

    /**
     * \brief Retrieves the last received state of the returning led
     * \ingroup Cpp_leds
     * \returns \c true if led is ON; \c false otherwise
     */
	inline bool returningLed() { return measures.returningLed; }

    /**
     * \brief Retrieves the last received state of the visiting led
     * \ingroup Cpp_leds
     * \returns \c true if led is ON; \c false otherwise
     */
	inline bool visitingLed() { return measures.visitingLed; }
	
/**************************************************************************/
/************* synchronization ********************************************/
/**************************************************************************/

#ifdef CIBERQTAPP
signals:
    void NewMessage();
public slots:
#endif
    /**
     * \brief Blocks until next simulator's data record has been received
     * \ingroup Cpp_synchronization
     * \details 
     *   This is a blocking call that waits until a new record with data has been received from the simulator.
     *   It only blocks if the new record hasn't yet been received.
     *   The received data record (XML message) is parsed and sensor data is cached locally.
     * \returns 0 on success; -1 otherwise
     */
    int ReadSensors();

/**************************************************************************/
/************* Buttons ****************************************************/
/**************************************************************************/

    /**
     * \brief Retrieves the last received state of the start button
     * \ingroup Cpp_buttons
     * \returns \c true if button was pressed; \c false otherwise
     */
	inline bool start() { return measures.start; }

    /**
     * \brief Retrieves the last received state of the stop button
     * \ingroup Cpp_buttons
     * \returns \c true if button was pressed; \c false otherwise
     */
	inline bool stop() { return measures.stop; }

/**************************************************************************/
/************* sensing ****************************************************/
/**************************************************************************/

    /**
     * \brief Indicates if a new measure of the given obstacle sensor was received in the last synchronization step.
     * \ingroup Cpp_sensing
     * \details
     *   If not ready, the value returned by \c IRSensor is invalid.
     * \param id Sensor id (one of FRONTAL, LEFT, RIGHT, REAR)
     * \returns \c true if a measure exists; \c false otherwise
     * \see IRSensor
     */
	inline bool IRSensorReady(int id) { if(id>=0 && id < NUM_IR_SENSORS) return measures.IRSensorReady[id]; else return false;}

    /**
     * \brief Retrieves the last received measure of the given obstacle sensor 
     * \ingroup Cpp_sensing
     * \details
     *   The value returned by an obstacle sensor is inversely proportional to the 
     *   distance to the closest obstacle captured by the sensor.
     * \param id Sensor id (one of FRONTAL, LEFT, RIGHT, REAR)
     * \returns the last received measure of the given obstacle sensor
     * \see IRSensorReady
     */
	inline double IRSensor(int id) { return measures.IRSensor[id]; }

    /**
     * \brief Get the number of beacons in the maze
     * \ingroup Cpp_sensing
     * \returns The number of beacons in the maze
     * \see beaconReady, beacon, beaconMeasure
     */
	inline int nBeacons(void) { return simParam.nBeacons; }

    /**
     * \brief Indicates if a new measure of the given beacon sensor was received in the last synchronization step.
     * \ingroup Cpp_sensing
     * \details
     *   If not ready, the value returned by \c GetBeaconSensor is invalid.
     * \param id Beacon id (from 0 to n-1, being n the number of beacons)
     * \returns \c true if a measure exists; \c false otherwise
     * \see beacon, nBeacons, beaconMeasure
     */
	inline bool beaconReady(unsigned int id) { if(id<simParam.nBeacons) return measures.beaconReady[id]; else return false;}

    /**
     * \brief Retrieves the last received measure of the given beacon sensor 
     * \ingroup Cpp_sensing
     * \details
     *   The value returned by a beacon sensor is a structure containing a flag
     *   indicatinf if the beacon is visible and its angular position, in range [-180,+180], if it is visible.
     * \param id Beacon id (from 0 to n-1, being n the number of beacons)
     * \returns the last received measure of the given beacon sensor
     * \see beaconReady, nBeacons, beaconMeasure
     */
	inline struct beaconMeasure beacon(unsigned int id) { assert(id<simParam.nBeacons); return measures.beacon[id]; }

    /**
     * \brief Indicates if a new measure of the compass was received in the last synchronization step.
     * \ingroup Cpp_sensing
     * \details
     *   If not ready, the value returned by \c compass is invalid.
     * \returns \c true if a measure exists; \c false otherwise
     * \see compass
     */
	inline bool compassReady() { return measures.compassReady; }

    /**
     * \brief Retrieves the last received measure of the compass sensor 
     * \ingroup Cpp_sensing
     * \details
     *   The value returned by the compass sensor is the angular position, in range [-180,+180],
     *   of the robot in relation to the north,
     *   which, in this simulation environment, corresponds to X axis.
     * \returns the last received measure of the compass sensor
     */
	inline double compass() { return measures.compass; }

    /**
     * \brief Indicates if a new measure of the ground sensor was received in the last synchronization step.
     * \ingroup Cpp_sensing
     * \details
     *   If not ready, the value returned by \c ground is invalid.
     * \returns \c true if a measure exists; \c false otherwise
     * \see ground
     */
	inline bool groundReady() { return measures.groundReady; }

    /**
     * \brief Retrieves the last received measure of the ground sensor 
     * \ingroup Cpp_sensing
     * \details
     *   The value returned by the sensor indicates the type of floor on which the robot is located.
     *   It is related to the target areas that exist in the maze.
     *   Being N the number of target areas, it is an integer value between 0 and N-1.
     * \returns the last received measure of the ground sensor
     * \see groundReady
     */
	inline int ground() { return measures.ground; }

    /**
     * \brief Indicates if a new measure of the bumper sensor was received in the last synchronization step.
     * \ingroup Cpp_sensing
     * \details
     *   If not ready, the value returned by \c collision is invalid.
     * \returns \c true if a measure exists; \c false otherwise
     * \see collision
     */
	inline bool collisionReady() { return measures.collisionReady; }

    /**
     * \brief Retrieves the last received measure of the bumper sensor 
     * \ingroup Cpp_sensing
     * \details
     *   The value returned by the sensor indicates if the robot has collided with
     *   obstacles (walls or other robots).
     *   It is a ring placed around the robot, so it is impossible to know where in the 
     *   robot's perimeter the collision occurs.
     * \returns the last received measure of the bumper sensor
     * \see collisionReady
     */
    inline bool collision() { return measures.collision; }

    /**
     * \brief Indicates if a new measure of the score sensor was received in the last synchronization step.
     * \ingroup Cpp_sensing
     * \details
     *   If not ready, the value returned by \c score is invalid.
     * \returns \c true if a measure exists; \c false otherwise
     * \see score
     */
	inline bool scoreReady() { return measures.scoreReady; }

    /**
     * \brief Retrieves the last received measure of the score sensor 
     * \ingroup Cpp_sensing
     * \details
     *   The value returned by the sensor is the current score of the robot.
     * \returns the last received measure of the score sensor
     * \see scoreReady
     */
    inline int score() { return measures.score; }

    /**
     * \brief Indicates if a new measure of the GPS sensor was received in the last synchronization step.
     * \ingroup Cpp_sensing
     * \details
     *   If not ready, the values returned by \c posx, \c posy and \c posdir are invalid.
     * \returns \c true if a measure exists; \c false otherwise
     * \see gpsDirReady, posx, posyY, posdir
     */
    inline bool gpsReady() { return measures.gpsReady; }

    /**
     * \brief Indicates if a new measure of the GPS sensor related to direction was received in the last synchronization step.
     * \ingroup Cpp_sensing
     * \details
     *   If not ready, the values returned by \c posdir is invalid.
     * \returns \c true if a measure exists; \c false otherwise
     * \see gpsReady, posx, posyY, posdir
     */
    inline bool gpsDirReady() { return measures.gpsDirReady; }

    /**
     * \brief Retrieves the X component of the last received measure of the GPS sensor 
     * \ingroup Cpp_sensing
     * \details
     *   The value returned by the sensor is the X position of the robot in the world, not in the maze.
     * \returns the X component of the last received measure of the GPS sensor
     * \see gpsReady, gpsDirReady, posy, posdir
     */
	inline double posx() { return measures.x; }

    /**
     * \brief Retrieves the Y component of the last received measure of the GPS sensor 
     * \ingroup Cpp_sensing
     * \details
     *   The value returned by the sensor is the Y position of the robot in the world, not in the maze.
     * \returns the Y component of the last received measure of the GPS sensor
     * \see gpsReady, gpsDirReady, posx, posdir
     */
	inline double posy() { return measures.y; }

    /**
     * \brief Retrieves the orientation component of the last received measure of the GPS sensor 
     * \ingroup Cpp_sensing
     * \details
     *   The value returned by the sensor is the orientation of the robot in the world, being the same as the orientation in the maze.
     * \returns the Dir component of the last received measure of the GPS sensor
     * \see gpsReady, gpsDirReady, posx, posy
     */
	inline double posdir() { return measures.dir; }

/**************************************************************************/
/************* communication **********************************************/
/**************************************************************************/

	inline bool newMessage(int from) { return measures.hearMessage[from-1]!=QString(); }
	inline QString message(int from) { return measures.hearMessage[from-1]; }

/**************************************************************************/
/************* requesting *************************************************/
/**************************************************************************/

	void requestGround();
	void requestCompass();
	void requestBeacon(int id);
	void requestObstacle(int id);
	void requestSensors(int nReqs, va_list ap);
    
/** \ingroup Cpp_config */
	inline bool compassRequestable() { return simParam.compassRequestable; }
/** \ingroup Cpp_config */
	inline bool groundRequestable() { return simParam.groundRequestable; }
/** \ingroup Cpp_config */
	inline bool obstRequestable() { return simParam.obstRequestable; }
/** \ingroup Cpp_config */
	inline bool collisionRequestable() { return simParam.collisionRequestable; }
/** \ingroup Cpp_config */
	inline bool beaconRequestable() { return simParam.beaconRequestable; }

/**************************************************************************/
/************* times ******************************************************/
/**************************************************************************/

    /**
     * \brief Retrieves the last received simulation time 
     * \ingroup Cpp_times
     * \return The last received current simulation time
     */
	inline unsigned int time() { return measures.time; }

    /** 
     * \brief Retrieves the cycle time
     * \ingroup Cpp_times
     * \returns The cycle time, in milliseconds
     */
	inline int cycleTime() { return simParam.cycleTime; }

    /** 
     * \brief Retrieves the total time
     * \ingroup Cpp_times
     * \returns The total time, in milliseconds
     */
	inline int finalTime() { return simParam.simTimeFinal; }

    /** 
     * \brief Retrieves the key time
     * \ingroup Cpp_times
     * \returns The key time, in milliseconds
     */
	inline int keyTime() { return simParam.keyTime; }

/**************************************************************************/
/************* Parameters *************************************************/
/**************************************************************************/

/** \ingroup Cpp_config */
	inline double beaconNoise() { return simParam.beaconNoise; }
/** \ingroup Cpp_config */
	inline double compassNoise() { return simParam.compassNoise; }
/** \ingroup Cpp_config */
	inline double motorsNoise() { return simParam.motorsNoise; }
/** \ingroup Cpp_config */
	inline double obstacleNoise() { return simParam.obstNoise; }

	inline double beaconAperture() { return simParam.beaconAperture; }
/** \ingroup Cpp_config */
	inline unsigned int beaconLatency() { return simParam.beaconLatency; }
/** \ingroup Cpp_config */
	inline unsigned int compassLatency() { return simParam.compassLatency; }
/** \ingroup Cpp_config */
	inline unsigned int groundLatency() { return simParam.groundLatency; }
/** \ingroup Cpp_config */
	inline unsigned int obstLatency() { return simParam.obstLatency; }
/** \ingroup Cpp_config */
	inline unsigned int collisionLatency() { return simParam.collisionLatency; }

/** \ingroup Cpp_config */
	inline unsigned int nReqPerCycle() { return simParam.nReqPerCycle; }

protected:
     void send_register_message(char *robot_name, int robId);
     void send_register_message(char *robot_name, int robId, double IRSensorAngles[]);
     void send_robotbeacon_register_message(char *rob_name,int rob_id, double height);
     void parse_server_reply(void);

private:
	CMeasures measures;	// measures sent by simulator
	CSimParam simParam;	// simulation parameters sent after registration
    int Status;	

    Port port;			// communication port
  
};

#endif
