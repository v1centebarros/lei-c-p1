#!/bin/bash

function main(){

    checkArgs $@

    ./src/Mus/MusMain.java < $1

    if [ $? -ne 0 ]; then
        exit 1
    fi

    cd ciberTools/build && make && cd ../../

    

    
}

function checkArgs(){
    if [ $# -ne 1 ]; then
        echo "Usage: $0 <Mus file path>"
        exit 1
    fi
}

main $@