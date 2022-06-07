
// Generated from Lab.g4 by ANTLR 4.9.3

#pragma once


#include "antlr4-runtime.h"
#include "LabParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by LabParser.
 */
class  LabVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by LabParser.
   */
    virtual antlrcpp::Any visitProgram(LabParser::ProgramContext *context) = 0;

    virtual antlrcpp::Any visitStat(LabParser::StatContext *context) = 0;

    virtual antlrcpp::Any visitGrid(LabParser::GridContext *context) = 0;

    virtual antlrcpp::Any visitPosition(LabParser::PositionContext *context) = 0;

    virtual antlrcpp::Any visitLabirinto(LabParser::LabirintoContext *context) = 0;

    virtual antlrcpp::Any visitDlab(LabParser::DlabContext *context) = 0;

    virtual antlrcpp::Any visitBeacon(LabParser::BeaconContext *context) = 0;

    virtual antlrcpp::Any visitTarget(LabParser::TargetContext *context) = 0;

    virtual antlrcpp::Any visitSpot(LabParser::SpotContext *context) = 0;

    virtual antlrcpp::Any visitRow(LabParser::RowContext *context) = 0;

    virtual antlrcpp::Any visitCoordenadas(LabParser::CoordenadasContext *context) = 0;

    virtual antlrcpp::Any visitNum(LabParser::NumContext *context) = 0;


};

