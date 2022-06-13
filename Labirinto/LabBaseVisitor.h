
// Generated from Lab.g4 by ANTLR 4.9.3

#pragma once


#include "antlr4-runtime.h"
#include "LabVisitor.h"


/**
 * This class provides an empty implementation of LabVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  LabBaseVisitor : public LabVisitor {
public:

  virtual antlrcpp::Any visitProgram(LabParser::ProgramContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitStat(LabParser::StatContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitGrid(LabParser::GridContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitPosition(LabParser::PositionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLabirinto(LabParser::LabirintoContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitDlab(LabParser::DlabContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBeacon(LabParser::BeaconContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTarget(LabParser::TargetContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSpot(LabParser::SpotContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRow(LabParser::RowContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCoordenadas(LabParser::CoordenadasContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitNum(LabParser::NumContext *ctx) override {
    return visitChildren(ctx);
  }


};

