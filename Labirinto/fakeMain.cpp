#include <iostream>

#include "LabMain.cpp"
#include "Map.h"



int main(int argc, const char* argv[]) {
    
    Map m("teste.lab");
    std::cout << "Parede à frente: " << m.isWallAhead(840, 399, 0) << "\n";
}

/*
Em mus:

ROBOT r = ("Nome", 0) WITH "test.lab" as m;
m.save;
m.wallInFront(r.get, r.gety, r,dir);
*/