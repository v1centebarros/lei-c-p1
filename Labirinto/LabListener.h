
// Generated from Lab.g4 by ANTLR 4.9.3

#pragma once


#include "antlr4-runtime.h"
#include "LabParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by LabParser.
 */
class  LabListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterProgram(LabParser::ProgramContext *ctx) = 0;
  virtual void exitProgram(LabParser::ProgramContext *ctx) = 0;

  virtual void enterStat(LabParser::StatContext *ctx) = 0;
  virtual void exitStat(LabParser::StatContext *ctx) = 0;

  virtual void enterGrid(LabParser::GridContext *ctx) = 0;
  virtual void exitGrid(LabParser::GridContext *ctx) = 0;

  virtual void enterPosition(LabParser::PositionContext *ctx) = 0;
  virtual void exitPosition(LabParser::PositionContext *ctx) = 0;

  virtual void enterLabirinto(LabParser::LabirintoContext *ctx) = 0;
  virtual void exitLabirinto(LabParser::LabirintoContext *ctx) = 0;

  virtual void enterDlab(LabParser::DlabContext *ctx) = 0;
  virtual void exitDlab(LabParser::DlabContext *ctx) = 0;

  virtual void enterBeacon(LabParser::BeaconContext *ctx) = 0;
  virtual void exitBeacon(LabParser::BeaconContext *ctx) = 0;

  virtual void enterTarget(LabParser::TargetContext *ctx) = 0;
  virtual void exitTarget(LabParser::TargetContext *ctx) = 0;

  virtual void enterSpot(LabParser::SpotContext *ctx) = 0;
  virtual void exitSpot(LabParser::SpotContext *ctx) = 0;

  virtual void enterRow(LabParser::RowContext *ctx) = 0;
  virtual void exitRow(LabParser::RowContext *ctx) = 0;

  virtual void enterCoordenadas(LabParser::CoordenadasContext *ctx) = 0;
  virtual void exitCoordenadas(LabParser::CoordenadasContext *ctx) = 0;


};

