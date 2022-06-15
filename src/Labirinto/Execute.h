#pragma once

#include "LabBaseVisitor.h"

#include <string>
#include <iostream>
#include <fstream>
#include <vector>
#include "Map.h"

class Map;

class Execute : public LabBaseVisitor {

private:
   std::string ST = "";
   int writeToFile();
   Map* map;

public:
   //Execute(Map* map);
   Execute() {};
   ~Execute();

   void setMap(Map* m);

   virtual antlrcpp::Any visitProgram(LabParser::ProgramContext *ctx) override;

   virtual antlrcpp::Any visitStat(LabParser::StatContext *ctx) override;

   virtual antlrcpp::Any visitGrid(LabParser::GridContext *ctx) override;

   virtual antlrcpp::Any visitPosition(LabParser::PositionContext *ctx) override;

   virtual antlrcpp::Any visitLabirinto(LabParser::LabirintoContext *ctx) override;

   virtual antlrcpp::Any visitDlab(LabParser::DlabContext *ctx) override;

   virtual antlrcpp::Any visitBeacon(LabParser::BeaconContext *ctx) override;

   virtual antlrcpp::Any visitTarget(LabParser::TargetContext *ctx) override;

   virtual antlrcpp::Any visitSpot(LabParser::SpotContext *ctx) override;

   virtual antlrcpp::Any visitRow(LabParser::RowContext *ctx) override;

   virtual antlrcpp::Any visitCoordenadas(LabParser::CoordenadasContext *ctx) override;

   virtual antlrcpp::Any visitNum(LabParser::NumContext *ctx) override;
};
