cmake_minimum_required(VERSION 3.5)
project(ciberRatoTools)

# Compile in Release by default
if(NOT CMAKE_BUILD_TYPE AND NOT CMAKE_CONFIGURATION_TYPES)
  message(STATUS "Setting build type to 'Release' as none was specified.")
  set(CMAKE_BUILD_TYPE "Release" CACHE STRING "Choose the type of build." FORCE)
  # Set the possible values of build type for cmake-gui
  set_property(CACHE CMAKE_BUILD_TYPE PROPERTY STRINGS
    "Debug" "Release" "MinSizeRel" "RelWithDebInfo")
endif()


set(CMAKE_CXX_STANDARD 14)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

set(CMAKE_AUTOMOC ON)
set(CMAKE_AUTORCC ON)
set(CMAKE_AUTOUIC ON)

find_package(Qt5 COMPONENTS Widgets Multimedia Network Xml REQUIRED)

set(CMAKE_LIBRARY_OUTPUT_DIRECTORY "${CMAKE_SOURCE_DIR}/lib")
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY "${CMAKE_SOURCE_DIR}/bin")

# Global macros that define TRUE and FALSE
# Should TRUE and FALSE exist??
add_compile_options(-DTRUE=1 -DFALSE=0)
add_compile_options(-Wall)
add_compile_options(-pthread -std=gnu++17 -I/usr/local/include/antlr4-runtime)

add_subdirectory(tools/src/simulator)
add_subdirectory(tools/src/Viewer)
add_subdirectory(tools/src/logplayer)
add_subdirectory(tools/src/libRobSock)
add_subdirectory(tools/src/libCiberAV)
add_subdirectory(agents/cClient)
add_subdirectory(agents/qtClient)
add_subdirectory(agents/avAgent)
add_subdirectory(agents/cppAgent)
