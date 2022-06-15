#pragma once

#include <antlr4-runtime.h>
#include "LabLexer.h"
#include "LabParser.h"

#include <fstream>
#include <iostream>
#include <vector>
#include <string>


using namespace std;
using namespace antlr4;
using namespace antlr4::tree;

//class Execute;

class Map {

private:
    vector<vector<bool>> mapa;

public:
    Map(string filename);
    Map() {}
    bool isWallAhead(float x, float y, float dir);
    bool isWallAtLeft(float x, float y, float dir);
    bool isWallAtRight(float x, float y, float dir);
    void addRow(vector<bool> row);
    ~Map();
};