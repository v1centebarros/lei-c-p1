#!/bin/bash

function main(){

    if [ $# -ne 2 ]; then
        echo "Usage: $0 <Mus file path> <Viewer>"
        echo "Available viewers:"
        cd ./ciberTools/scripts
        ls -l | grep "^-.*" | awk '{print $9}'
        cd ../../
        exit 1
    fi

    cd ./src/Mus && antlr4-build

    java MusMain < ../../$1


    if [ $? -ne 0 ]; then
        echo "Invalid argument: $1"
        exit 1
    fi

    antlr4-clean > /dev/null 2>&1 && cd ../../

    cp ./src/Mus/destinationLanguage.cpp ./ciberTools/agents/avAgent/myAgent.cpp

    cd ./ciberTools/build && make && cd ../../

    {
        cd ./ciberTools/scripts && ./$2 
        if [ $? -ne 0 ]; then
            echo "Invalid argument: $2"
            echo "Available viewers:"
            ls -l | grep "^-.*" | awk '{print $9}'
            exit 1
        fi
    }& # Run in background

    echo "Waiting for viewer"
    sleep 2
 
    cd ./ciberTools/bin && ./myAgent
}

main $@
