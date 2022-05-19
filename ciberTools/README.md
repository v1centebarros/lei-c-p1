
# CiberRato Robot Simulation Environment <br/> Universidade de Aveiro / IEETA / IRIS Lab

## Information

CiberRato Robot Simulation Environment simulates the movement
of robots inside a labyrinth. 
Robots objective is to go from their
starting position to beacon area and then return to their start position.

## Contents

* tools/src/simulator -     The simulator source code
* tools/src/Viewer -        The Visualizer source code
* tools/src/logplayer -     The logplayer source code
* tools/src/libRobSock -    A library for C/C++ agents
* tools/src/libCiberAV -    Another library for C/C++ agents
* agents/qtCient -          Graphical robot agent (C++) source code, using libRobSock library
* agents/cClient -          robot agent (C) source code, using libRobSock library
* agents/avClient -         robot agent (C) source code, using libCiberAV library
* agents/jClient -          robot agent (Java) source code
* agents/pClient -          robot agent (Python) source code
* Labs -                    examples of labyrinths used in previous competitions
* scripts/startSimViewer -  script that runs the simulator and the Viewer, with the default scenario
* scripts/startC{12345} -   scripts that runs the simulator and the Viewer, with simple scenarios
* bin -                     directory where executable files are stored by the building system
* lib -                     directory where library files are stored by the building system

## Install

### Installing dependencies

The source code was compiled with gcc/g++ - Gnu Project C/C++ Compiler (gcc version  9.3.0) using the Qt libraries (release 5.12.8) on Ubuntu 20.04.

It is required to have the development version of gcc/g++, cmake, Qt libraries
release 5.x installed in the system prior to compilation.
On Ubuntu 20.04 run the following:
```bash
sudo apt install build-essential cmake qt5-default qtmultimedia5-dev
```

If you prefer to use `ninja` instead of `make`, you also need it
```bash
sudo apt install ninja-build
```

### Creating and configuring your building directory:

On your `ciberTools` directory, execute
```bash
cmake -B build -S . 
```

or, alternatively
```bash
mkdir build
cd build
cmake ..
```

If you prefer to use `ninja` instead of `make`, add option `-G Ninja` to the cmake command.

### Building

On your `ciberTools` directory, execute
```bash
make -C build 
```

or, alternatively
```bash
cd build
make
```

Of course, you should replace `make` with `ninja`, if you are using it.

### Running

To run the simulator and the Viewer and C++, in your `ciberTools` directory,
```bash
cd scripts
./startC1   # or any of the other scripts
```

To run a C++ agent, in your `ciberTools` directory,
```bash
cd bin
./a1       # or any of the other agents
```

To run the Python agent example, in your `ciberTools` directory,
```bash
cd agents/pClient
python3 mainRob.py
```

To run the Java agent example, in your `ciberTools` directory,
```bash
cd agents/jClient
make                # to compile the several Java files
java pClient
```

 Copyright (C) 2001-2022 Universidade de Aveiro


