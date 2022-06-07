
// Generated from Lab.g4 by ANTLR 4.9.3

#pragma once


#include "antlr4-runtime.h"
#include "LabListener.h"


/**
 * This class provides an empty implementation of LabListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  LabBaseListener : public LabListener {
public:

  virtual void enterProgram(LabParser::ProgramContext * /*ctx*/) override { }
  virtual void exitProgram(LabParser::ProgramContext * /*ctx*/) override { }

  virtual void enterStat(LabParser::StatContext * /*ctx*/) override { }
  virtual void exitStat(LabParser::StatContext * /*ctx*/) override { }

  virtual void enterGrid(LabParser::GridContext * /*ctx*/) override { }
  virtual void exitGrid(LabParser::GridContext * /*ctx*/) override { }

  virtual void enterPosition(LabParser::PositionContext * /*ctx*/) override { }
  virtual void exitPosition(LabParser::PositionContext * /*ctx*/) override { }

  virtual void enterLabirinto(LabParser::LabirintoContext * /*ctx*/) override { }
  virtual void exitLabirinto(LabParser::LabirintoContext * /*ctx*/) override { }

  virtual void enterDlab(LabParser::DlabContext * /*ctx*/) override { }
  virtual void exitDlab(LabParser::DlabContext * /*ctx*/) override { }

  virtual void enterBeacon(LabParser::BeaconContext * /*ctx*/) override { }
  virtual void exitBeacon(LabParser::BeaconContext * /*ctx*/) override { }

  virtual void enterTarget(LabParser::TargetContext * /*ctx*/) override { }
  virtual void exitTarget(LabParser::TargetContext * /*ctx*/) override { }

  virtual void enterSpot(LabParser::SpotContext * /*ctx*/) override { }
  virtual void exitSpot(LabParser::SpotContext * /*ctx*/) override { }

  virtual void enterRow(LabParser::RowContext * /*ctx*/) override { }
  virtual void exitRow(LabParser::RowContext * /*ctx*/) override { }

  virtual void enterCoordenadas(LabParser::CoordenadasContext * /*ctx*/) override { }
  virtual void exitCoordenadas(LabParser::CoordenadasContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

