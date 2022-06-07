
// Generated from Lab.g4 by ANTLR 4.9.3


#include "LabListener.h"
#include "LabVisitor.h"

#include "LabParser.h"


using namespace antlrcpp;
using namespace antlr4;

LabParser::LabParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

LabParser::~LabParser() {
  delete _interpreter;
}

std::string LabParser::getGrammarFileName() const {
  return "Lab.g4";
}

const std::vector<std::string>& LabParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& LabParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- ProgramContext ------------------------------------------------------------------

LabParser::ProgramContext::ProgramContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* LabParser::ProgramContext::EOF() {
  return getToken(LabParser::EOF, 0);
}

std::vector<LabParser::StatContext *> LabParser::ProgramContext::stat() {
  return getRuleContexts<LabParser::StatContext>();
}

LabParser::StatContext* LabParser::ProgramContext::stat(size_t i) {
  return getRuleContext<LabParser::StatContext>(i);
}


size_t LabParser::ProgramContext::getRuleIndex() const {
  return LabParser::RuleProgram;
}

void LabParser::ProgramContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterProgram(this);
}

void LabParser::ProgramContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitProgram(this);
}


antlrcpp::Any LabParser::ProgramContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitProgram(this);
  else
    return visitor->visitChildren(this);
}

LabParser::ProgramContext* LabParser::program() {
  ProgramContext *_localctx = _tracker.createInstance<ProgramContext>(_ctx, getState());
  enterRule(_localctx, 0, LabParser::RuleProgram);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(30);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << LabParser::T__0)
      | (1ULL << LabParser::T__1)
      | (1ULL << LabParser::T__7))) != 0)) {
      setState(25);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == LabParser::T__1

      || _la == LabParser::T__7) {
        setState(24);
        stat();
      }
      setState(27);
      match(LabParser::T__0);
      setState(32);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(33);
    match(LabParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatContext ------------------------------------------------------------------

LabParser::StatContext::StatContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

LabParser::GridContext* LabParser::StatContext::grid() {
  return getRuleContext<LabParser::GridContext>(0);
}

LabParser::LabirintoContext* LabParser::StatContext::labirinto() {
  return getRuleContext<LabParser::LabirintoContext>(0);
}


size_t LabParser::StatContext::getRuleIndex() const {
  return LabParser::RuleStat;
}

void LabParser::StatContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStat(this);
}

void LabParser::StatContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStat(this);
}


antlrcpp::Any LabParser::StatContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitStat(this);
  else
    return visitor->visitChildren(this);
}

LabParser::StatContext* LabParser::stat() {
  StatContext *_localctx = _tracker.createInstance<StatContext>(_ctx, getState());
  enterRule(_localctx, 2, LabParser::RuleStat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(37);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case LabParser::T__1: {
        enterOuterAlt(_localctx, 1);
        setState(35);
        grid();
        break;
      }

      case LabParser::T__7: {
        enterOuterAlt(_localctx, 2);
        setState(36);
        labirinto();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- GridContext ------------------------------------------------------------------

LabParser::GridContext::GridContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<LabParser::PositionContext *> LabParser::GridContext::position() {
  return getRuleContexts<LabParser::PositionContext>();
}

LabParser::PositionContext* LabParser::GridContext::position(size_t i) {
  return getRuleContext<LabParser::PositionContext>(i);
}


size_t LabParser::GridContext::getRuleIndex() const {
  return LabParser::RuleGrid;
}

void LabParser::GridContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterGrid(this);
}

void LabParser::GridContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitGrid(this);
}


antlrcpp::Any LabParser::GridContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitGrid(this);
  else
    return visitor->visitChildren(this);
}

LabParser::GridContext* LabParser::grid() {
  GridContext *_localctx = _tracker.createInstance<GridContext>(_ctx, getState());
  enterRule(_localctx, 4, LabParser::RuleGrid);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(39);
    match(LabParser::T__1);
    setState(40);
    match(LabParser::T__2);
    setState(46);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == LabParser::T__4) {
      setState(41);
      position();
      setState(42);
      match(LabParser::T__0);
      setState(48);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(49);
    match(LabParser::T__3);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PositionContext ------------------------------------------------------------------

LabParser::PositionContext::PositionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

LabParser::CoordenadasContext* LabParser::PositionContext::coordenadas() {
  return getRuleContext<LabParser::CoordenadasContext>(0);
}

tree::TerminalNode* LabParser::PositionContext::INT() {
  return getToken(LabParser::INT, 0);
}


size_t LabParser::PositionContext::getRuleIndex() const {
  return LabParser::RulePosition;
}

void LabParser::PositionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPosition(this);
}

void LabParser::PositionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPosition(this);
}


antlrcpp::Any LabParser::PositionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitPosition(this);
  else
    return visitor->visitChildren(this);
}

LabParser::PositionContext* LabParser::position() {
  PositionContext *_localctx = _tracker.createInstance<PositionContext>(_ctx, getState());
  enterRule(_localctx, 6, LabParser::RulePosition);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(51);
    match(LabParser::T__4);
    setState(52);
    coordenadas();
    setState(56);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == LabParser::T__5) {
      setState(53);
      match(LabParser::T__5);
      setState(54);
      match(LabParser::T__6);
      setState(55);
      match(LabParser::INT);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LabirintoContext ------------------------------------------------------------------

LabParser::LabirintoContext::LabirintoContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* LabParser::LabirintoContext::ID() {
  return getToken(LabParser::ID, 0);
}

std::vector<LabParser::NumContext *> LabParser::LabirintoContext::num() {
  return getRuleContexts<LabParser::NumContext>();
}

LabParser::NumContext* LabParser::LabirintoContext::num(size_t i) {
  return getRuleContext<LabParser::NumContext>(i);
}

std::vector<LabParser::DlabContext *> LabParser::LabirintoContext::dlab() {
  return getRuleContexts<LabParser::DlabContext>();
}

LabParser::DlabContext* LabParser::LabirintoContext::dlab(size_t i) {
  return getRuleContext<LabParser::DlabContext>(i);
}


size_t LabParser::LabirintoContext::getRuleIndex() const {
  return LabParser::RuleLabirinto;
}

void LabParser::LabirintoContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLabirinto(this);
}

void LabParser::LabirintoContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLabirinto(this);
}


antlrcpp::Any LabParser::LabirintoContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitLabirinto(this);
  else
    return visitor->visitChildren(this);
}

LabParser::LabirintoContext* LabParser::labirinto() {
  LabirintoContext *_localctx = _tracker.createInstance<LabirintoContext>(_ctx, getState());
  enterRule(_localctx, 8, LabParser::RuleLabirinto);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(58);
    match(LabParser::T__7);
    setState(59);
    match(LabParser::T__8);
    setState(60);
    match(LabParser::T__9);
    setState(61);
    match(LabParser::T__6);
    setState(62);
    match(LabParser::ID);
    setState(63);
    match(LabParser::T__10);
    setState(64);
    match(LabParser::T__6);
    setState(65);
    num();
    setState(66);
    match(LabParser::T__11);
    setState(67);
    match(LabParser::T__6);
    setState(68);
    num();
    setState(69);
    match(LabParser::T__12);
    setState(70);
    match(LabParser::T__2);
    setState(76);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << LabParser::T__13)
      | (1ULL << LabParser::T__14)
      | (1ULL << LabParser::T__16)
      | (1ULL << LabParser::T__17))) != 0)) {
      setState(71);
      dlab();
      setState(72);
      match(LabParser::T__0);
      setState(78);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(79);
    match(LabParser::T__3);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DlabContext ------------------------------------------------------------------

LabParser::DlabContext::DlabContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

LabParser::TargetContext* LabParser::DlabContext::target() {
  return getRuleContext<LabParser::TargetContext>(0);
}

LabParser::BeaconContext* LabParser::DlabContext::beacon() {
  return getRuleContext<LabParser::BeaconContext>(0);
}

LabParser::SpotContext* LabParser::DlabContext::spot() {
  return getRuleContext<LabParser::SpotContext>(0);
}

LabParser::RowContext* LabParser::DlabContext::row() {
  return getRuleContext<LabParser::RowContext>(0);
}


size_t LabParser::DlabContext::getRuleIndex() const {
  return LabParser::RuleDlab;
}

void LabParser::DlabContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDlab(this);
}

void LabParser::DlabContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDlab(this);
}


antlrcpp::Any LabParser::DlabContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitDlab(this);
  else
    return visitor->visitChildren(this);
}

LabParser::DlabContext* LabParser::dlab() {
  DlabContext *_localctx = _tracker.createInstance<DlabContext>(_ctx, getState());
  enterRule(_localctx, 10, LabParser::RuleDlab);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(85);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case LabParser::T__14: {
        enterOuterAlt(_localctx, 1);
        setState(81);
        target();
        break;
      }

      case LabParser::T__13: {
        enterOuterAlt(_localctx, 2);
        setState(82);
        beacon();
        break;
      }

      case LabParser::T__16: {
        enterOuterAlt(_localctx, 3);
        setState(83);
        spot();
        break;
      }

      case LabParser::T__17: {
        enterOuterAlt(_localctx, 4);
        setState(84);
        row();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BeaconContext ------------------------------------------------------------------

LabParser::BeaconContext::BeaconContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

LabParser::CoordenadasContext* LabParser::BeaconContext::coordenadas() {
  return getRuleContext<LabParser::CoordenadasContext>(0);
}

tree::TerminalNode* LabParser::BeaconContext::INT() {
  return getToken(LabParser::INT, 0);
}


size_t LabParser::BeaconContext::getRuleIndex() const {
  return LabParser::RuleBeacon;
}

void LabParser::BeaconContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBeacon(this);
}

void LabParser::BeaconContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBeacon(this);
}


antlrcpp::Any LabParser::BeaconContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitBeacon(this);
  else
    return visitor->visitChildren(this);
}

LabParser::BeaconContext* LabParser::beacon() {
  BeaconContext *_localctx = _tracker.createInstance<BeaconContext>(_ctx, getState());
  enterRule(_localctx, 12, LabParser::RuleBeacon);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(87);
    match(LabParser::T__13);
    setState(88);
    match(LabParser::T__6);
    setState(89);
    coordenadas();
    setState(93);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == LabParser::T__11) {
      setState(90);
      match(LabParser::T__11);
      setState(91);
      match(LabParser::T__6);
      setState(92);
      match(LabParser::INT);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TargetContext ------------------------------------------------------------------

LabParser::TargetContext::TargetContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

LabParser::CoordenadasContext* LabParser::TargetContext::coordenadas() {
  return getRuleContext<LabParser::CoordenadasContext>(0);
}

LabParser::NumContext* LabParser::TargetContext::num() {
  return getRuleContext<LabParser::NumContext>(0);
}


size_t LabParser::TargetContext::getRuleIndex() const {
  return LabParser::RuleTarget;
}

void LabParser::TargetContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterTarget(this);
}

void LabParser::TargetContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitTarget(this);
}


antlrcpp::Any LabParser::TargetContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitTarget(this);
  else
    return visitor->visitChildren(this);
}

LabParser::TargetContext* LabParser::target() {
  TargetContext *_localctx = _tracker.createInstance<TargetContext>(_ctx, getState());
  enterRule(_localctx, 14, LabParser::RuleTarget);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(95);
    match(LabParser::T__14);
    setState(96);
    match(LabParser::T__6);
    setState(97);
    coordenadas();
    setState(101);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == LabParser::T__15) {
      setState(98);
      match(LabParser::T__15);
      setState(99);
      match(LabParser::T__6);

      setState(100);
      num();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SpotContext ------------------------------------------------------------------

LabParser::SpotContext::SpotContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

LabParser::CoordenadasContext* LabParser::SpotContext::coordenadas() {
  return getRuleContext<LabParser::CoordenadasContext>(0);
}

tree::TerminalNode* LabParser::SpotContext::INT() {
  return getToken(LabParser::INT, 0);
}

LabParser::NumContext* LabParser::SpotContext::num() {
  return getRuleContext<LabParser::NumContext>(0);
}


size_t LabParser::SpotContext::getRuleIndex() const {
  return LabParser::RuleSpot;
}

void LabParser::SpotContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSpot(this);
}

void LabParser::SpotContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSpot(this);
}


antlrcpp::Any LabParser::SpotContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitSpot(this);
  else
    return visitor->visitChildren(this);
}

LabParser::SpotContext* LabParser::spot() {
  SpotContext *_localctx = _tracker.createInstance<SpotContext>(_ctx, getState());
  enterRule(_localctx, 16, LabParser::RuleSpot);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(103);
    match(LabParser::T__16);
    setState(104);
    match(LabParser::T__6);
    setState(105);
    coordenadas();
    setState(109);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == LabParser::T__11) {
      setState(106);
      match(LabParser::T__11);
      setState(107);
      match(LabParser::T__6);
      setState(108);
      match(LabParser::INT);
    }
    setState(114);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == LabParser::T__15) {
      setState(111);
      match(LabParser::T__15);
      setState(112);
      match(LabParser::T__6);

      setState(113);
      num();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RowContext ------------------------------------------------------------------

LabParser::RowContext::RowContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* LabParser::RowContext::INT() {
  return getToken(LabParser::INT, 0);
}

tree::TerminalNode* LabParser::RowContext::PADRAO() {
  return getToken(LabParser::PADRAO, 0);
}


size_t LabParser::RowContext::getRuleIndex() const {
  return LabParser::RuleRow;
}

void LabParser::RowContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterRow(this);
}

void LabParser::RowContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitRow(this);
}


antlrcpp::Any LabParser::RowContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitRow(this);
  else
    return visitor->visitChildren(this);
}

LabParser::RowContext* LabParser::row() {
  RowContext *_localctx = _tracker.createInstance<RowContext>(_ctx, getState());
  enterRule(_localctx, 18, LabParser::RuleRow);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(116);
    match(LabParser::T__17);
    setState(117);
    match(LabParser::INT);
    setState(118);
    match(LabParser::T__18);
    setState(119);
    match(LabParser::PADRAO);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CoordenadasContext ------------------------------------------------------------------

LabParser::CoordenadasContext::CoordenadasContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<LabParser::NumContext *> LabParser::CoordenadasContext::num() {
  return getRuleContexts<LabParser::NumContext>();
}

LabParser::NumContext* LabParser::CoordenadasContext::num(size_t i) {
  return getRuleContext<LabParser::NumContext>(i);
}


size_t LabParser::CoordenadasContext::getRuleIndex() const {
  return LabParser::RuleCoordenadas;
}

void LabParser::CoordenadasContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCoordenadas(this);
}

void LabParser::CoordenadasContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCoordenadas(this);
}


antlrcpp::Any LabParser::CoordenadasContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitCoordenadas(this);
  else
    return visitor->visitChildren(this);
}

LabParser::CoordenadasContext* LabParser::coordenadas() {
  CoordenadasContext *_localctx = _tracker.createInstance<CoordenadasContext>(_ctx, getState());
  enterRule(_localctx, 20, LabParser::RuleCoordenadas);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(121);
    match(LabParser::T__8);
    setState(122);
    num();
    setState(123);
    match(LabParser::T__19);
    setState(124);
    num();
    setState(125);
    match(LabParser::T__12);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- NumContext ------------------------------------------------------------------

LabParser::NumContext::NumContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* LabParser::NumContext::DOUBLE() {
  return getToken(LabParser::DOUBLE, 0);
}

tree::TerminalNode* LabParser::NumContext::INT() {
  return getToken(LabParser::INT, 0);
}


size_t LabParser::NumContext::getRuleIndex() const {
  return LabParser::RuleNum;
}

void LabParser::NumContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterNum(this);
}

void LabParser::NumContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitNum(this);
}


antlrcpp::Any LabParser::NumContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<LabVisitor*>(visitor))
    return parserVisitor->visitNum(this);
  else
    return visitor->visitChildren(this);
}

LabParser::NumContext* LabParser::num() {
  NumContext *_localctx = _tracker.createInstance<NumContext>(_ctx, getState());
  enterRule(_localctx, 22, LabParser::RuleNum);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(127);
    _la = _input->LA(1);
    if (!(_la == LabParser::INT

    || _la == LabParser::DOUBLE)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> LabParser::_decisionToDFA;
atn::PredictionContextCache LabParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN LabParser::_atn;
std::vector<uint16_t> LabParser::_serializedATN;

std::vector<std::string> LabParser::_ruleNames = {
  "program", "stat", "grid", "position", "labirinto", "dlab", "beacon", 
  "target", "spot", "row", "coordenadas", "num"
};

std::vector<std::string> LabParser::_literalNames = {
  "", "';'", "'GRID'", "'{'", "'}'", "'POS'", "'DIRECTION'", "'='", "'LABIRINTO'", 
  "'('", "'NAME'", "'WIDTH'", "'HEIGHT'", "')'", "'BEACON'", "'TARGET'", 
  "'RADIUS'", "'SPOT'", "'ROW'", "':'", "','"
};

std::vector<std::string> LabParser::_symbolicNames = {
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "INT", "DOUBLE", "ID", "PADRAO", "WS", "LINE_COMMENT", "MULTILINE_COMMENT"
};

dfa::Vocabulary LabParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> LabParser::_tokenNames;

LabParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  static const uint16_t serializedATNSegment0[] = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
       0x3, 0x1d, 0x84, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
       0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 
       0x7, 0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 
       0x4, 0xb, 0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x3, 
       0x2, 0x5, 0x2, 0x1c, 0xa, 0x2, 0x3, 0x2, 0x7, 0x2, 0x1f, 0xa, 0x2, 
       0xc, 0x2, 0xe, 0x2, 0x22, 0xb, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 
       0x3, 0x3, 0x5, 0x3, 0x28, 0xa, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 
       0x3, 0x4, 0x3, 0x4, 0x7, 0x4, 0x2f, 0xa, 0x4, 0xc, 0x4, 0xe, 0x4, 
       0x32, 0xb, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x5, 0x5, 0x3b, 0xa, 0x5, 0x3, 0x6, 0x3, 0x6, 
       0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 
       0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 
       0x3, 0x6, 0x7, 0x6, 0x4d, 0xa, 0x6, 0xc, 0x6, 0xe, 0x6, 0x50, 0xb, 
       0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 
       0x5, 0x7, 0x58, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 
       0x3, 0x8, 0x3, 0x8, 0x5, 0x8, 0x60, 0xa, 0x8, 0x3, 0x9, 0x3, 0x9, 
       0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x5, 0x9, 0x68, 0xa, 0x9, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x5, 
       0xa, 0x70, 0xa, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x5, 0xa, 0x75, 
       0xa, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 
       0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xd, 
       0x3, 0xd, 0x3, 0xd, 0x2, 0x2, 0xe, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 
       0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x2, 0x3, 0x3, 0x2, 0x17, 0x18, 
       0x2, 0x84, 0x2, 0x20, 0x3, 0x2, 0x2, 0x2, 0x4, 0x27, 0x3, 0x2, 0x2, 
       0x2, 0x6, 0x29, 0x3, 0x2, 0x2, 0x2, 0x8, 0x35, 0x3, 0x2, 0x2, 0x2, 
       0xa, 0x3c, 0x3, 0x2, 0x2, 0x2, 0xc, 0x57, 0x3, 0x2, 0x2, 0x2, 0xe, 
       0x59, 0x3, 0x2, 0x2, 0x2, 0x10, 0x61, 0x3, 0x2, 0x2, 0x2, 0x12, 0x69, 
       0x3, 0x2, 0x2, 0x2, 0x14, 0x76, 0x3, 0x2, 0x2, 0x2, 0x16, 0x7b, 0x3, 
       0x2, 0x2, 0x2, 0x18, 0x81, 0x3, 0x2, 0x2, 0x2, 0x1a, 0x1c, 0x5, 0x4, 
       0x3, 0x2, 0x1b, 0x1a, 0x3, 0x2, 0x2, 0x2, 0x1b, 0x1c, 0x3, 0x2, 0x2, 
       0x2, 0x1c, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x1d, 0x1f, 0x7, 0x3, 0x2, 0x2, 
       0x1e, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x1f, 0x22, 0x3, 0x2, 0x2, 0x2, 0x20, 
       0x1e, 0x3, 0x2, 0x2, 0x2, 0x20, 0x21, 0x3, 0x2, 0x2, 0x2, 0x21, 0x23, 
       0x3, 0x2, 0x2, 0x2, 0x22, 0x20, 0x3, 0x2, 0x2, 0x2, 0x23, 0x24, 0x7, 
       0x2, 0x2, 0x3, 0x24, 0x3, 0x3, 0x2, 0x2, 0x2, 0x25, 0x28, 0x5, 0x6, 
       0x4, 0x2, 0x26, 0x28, 0x5, 0xa, 0x6, 0x2, 0x27, 0x25, 0x3, 0x2, 0x2, 
       0x2, 0x27, 0x26, 0x3, 0x2, 0x2, 0x2, 0x28, 0x5, 0x3, 0x2, 0x2, 0x2, 
       0x29, 0x2a, 0x7, 0x4, 0x2, 0x2, 0x2a, 0x30, 0x7, 0x5, 0x2, 0x2, 0x2b, 
       0x2c, 0x5, 0x8, 0x5, 0x2, 0x2c, 0x2d, 0x7, 0x3, 0x2, 0x2, 0x2d, 0x2f, 
       0x3, 0x2, 0x2, 0x2, 0x2e, 0x2b, 0x3, 0x2, 0x2, 0x2, 0x2f, 0x32, 0x3, 
       0x2, 0x2, 0x2, 0x30, 0x2e, 0x3, 0x2, 0x2, 0x2, 0x30, 0x31, 0x3, 0x2, 
       0x2, 0x2, 0x31, 0x33, 0x3, 0x2, 0x2, 0x2, 0x32, 0x30, 0x3, 0x2, 0x2, 
       0x2, 0x33, 0x34, 0x7, 0x6, 0x2, 0x2, 0x34, 0x7, 0x3, 0x2, 0x2, 0x2, 
       0x35, 0x36, 0x7, 0x7, 0x2, 0x2, 0x36, 0x3a, 0x5, 0x16, 0xc, 0x2, 
       0x37, 0x38, 0x7, 0x8, 0x2, 0x2, 0x38, 0x39, 0x7, 0x9, 0x2, 0x2, 0x39, 
       0x3b, 0x7, 0x17, 0x2, 0x2, 0x3a, 0x37, 0x3, 0x2, 0x2, 0x2, 0x3a, 
       0x3b, 0x3, 0x2, 0x2, 0x2, 0x3b, 0x9, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x3d, 
       0x7, 0xa, 0x2, 0x2, 0x3d, 0x3e, 0x7, 0xb, 0x2, 0x2, 0x3e, 0x3f, 0x7, 
       0xc, 0x2, 0x2, 0x3f, 0x40, 0x7, 0x9, 0x2, 0x2, 0x40, 0x41, 0x7, 0x19, 
       0x2, 0x2, 0x41, 0x42, 0x7, 0xd, 0x2, 0x2, 0x42, 0x43, 0x7, 0x9, 0x2, 
       0x2, 0x43, 0x44, 0x5, 0x18, 0xd, 0x2, 0x44, 0x45, 0x7, 0xe, 0x2, 
       0x2, 0x45, 0x46, 0x7, 0x9, 0x2, 0x2, 0x46, 0x47, 0x5, 0x18, 0xd, 
       0x2, 0x47, 0x48, 0x7, 0xf, 0x2, 0x2, 0x48, 0x4e, 0x7, 0x5, 0x2, 0x2, 
       0x49, 0x4a, 0x5, 0xc, 0x7, 0x2, 0x4a, 0x4b, 0x7, 0x3, 0x2, 0x2, 0x4b, 
       0x4d, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x49, 0x3, 0x2, 0x2, 0x2, 0x4d, 0x50, 
       0x3, 0x2, 0x2, 0x2, 0x4e, 0x4c, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x4f, 0x3, 
       0x2, 0x2, 0x2, 0x4f, 0x51, 0x3, 0x2, 0x2, 0x2, 0x50, 0x4e, 0x3, 0x2, 
       0x2, 0x2, 0x51, 0x52, 0x7, 0x6, 0x2, 0x2, 0x52, 0xb, 0x3, 0x2, 0x2, 
       0x2, 0x53, 0x58, 0x5, 0x10, 0x9, 0x2, 0x54, 0x58, 0x5, 0xe, 0x8, 
       0x2, 0x55, 0x58, 0x5, 0x12, 0xa, 0x2, 0x56, 0x58, 0x5, 0x14, 0xb, 
       0x2, 0x57, 0x53, 0x3, 0x2, 0x2, 0x2, 0x57, 0x54, 0x3, 0x2, 0x2, 0x2, 
       0x57, 0x55, 0x3, 0x2, 0x2, 0x2, 0x57, 0x56, 0x3, 0x2, 0x2, 0x2, 0x58, 
       0xd, 0x3, 0x2, 0x2, 0x2, 0x59, 0x5a, 0x7, 0x10, 0x2, 0x2, 0x5a, 0x5b, 
       0x7, 0x9, 0x2, 0x2, 0x5b, 0x5f, 0x5, 0x16, 0xc, 0x2, 0x5c, 0x5d, 
       0x7, 0xe, 0x2, 0x2, 0x5d, 0x5e, 0x7, 0x9, 0x2, 0x2, 0x5e, 0x60, 0x7, 
       0x17, 0x2, 0x2, 0x5f, 0x5c, 0x3, 0x2, 0x2, 0x2, 0x5f, 0x60, 0x3, 
       0x2, 0x2, 0x2, 0x60, 0xf, 0x3, 0x2, 0x2, 0x2, 0x61, 0x62, 0x7, 0x11, 
       0x2, 0x2, 0x62, 0x63, 0x7, 0x9, 0x2, 0x2, 0x63, 0x67, 0x5, 0x16, 
       0xc, 0x2, 0x64, 0x65, 0x7, 0x12, 0x2, 0x2, 0x65, 0x66, 0x7, 0x9, 
       0x2, 0x2, 0x66, 0x68, 0x5, 0x18, 0xd, 0x2, 0x67, 0x64, 0x3, 0x2, 
       0x2, 0x2, 0x67, 0x68, 0x3, 0x2, 0x2, 0x2, 0x68, 0x11, 0x3, 0x2, 0x2, 
       0x2, 0x69, 0x6a, 0x7, 0x13, 0x2, 0x2, 0x6a, 0x6b, 0x7, 0x9, 0x2, 
       0x2, 0x6b, 0x6f, 0x5, 0x16, 0xc, 0x2, 0x6c, 0x6d, 0x7, 0xe, 0x2, 
       0x2, 0x6d, 0x6e, 0x7, 0x9, 0x2, 0x2, 0x6e, 0x70, 0x7, 0x17, 0x2, 
       0x2, 0x6f, 0x6c, 0x3, 0x2, 0x2, 0x2, 0x6f, 0x70, 0x3, 0x2, 0x2, 0x2, 
       0x70, 0x74, 0x3, 0x2, 0x2, 0x2, 0x71, 0x72, 0x7, 0x12, 0x2, 0x2, 
       0x72, 0x73, 0x7, 0x9, 0x2, 0x2, 0x73, 0x75, 0x5, 0x18, 0xd, 0x2, 
       0x74, 0x71, 0x3, 0x2, 0x2, 0x2, 0x74, 0x75, 0x3, 0x2, 0x2, 0x2, 0x75, 
       0x13, 0x3, 0x2, 0x2, 0x2, 0x76, 0x77, 0x7, 0x14, 0x2, 0x2, 0x77, 
       0x78, 0x7, 0x17, 0x2, 0x2, 0x78, 0x79, 0x7, 0x15, 0x2, 0x2, 0x79, 
       0x7a, 0x7, 0x1a, 0x2, 0x2, 0x7a, 0x15, 0x3, 0x2, 0x2, 0x2, 0x7b, 
       0x7c, 0x7, 0xb, 0x2, 0x2, 0x7c, 0x7d, 0x5, 0x18, 0xd, 0x2, 0x7d, 
       0x7e, 0x7, 0x16, 0x2, 0x2, 0x7e, 0x7f, 0x5, 0x18, 0xd, 0x2, 0x7f, 
       0x80, 0x7, 0xf, 0x2, 0x2, 0x80, 0x17, 0x3, 0x2, 0x2, 0x2, 0x81, 0x82, 
       0x9, 0x2, 0x2, 0x2, 0x82, 0x19, 0x3, 0x2, 0x2, 0x2, 0xd, 0x1b, 0x20, 
       0x27, 0x30, 0x3a, 0x4e, 0x57, 0x5f, 0x67, 0x6f, 0x74, 
  };

  _serializedATN.insert(_serializedATN.end(), serializedATNSegment0,
    serializedATNSegment0 + sizeof(serializedATNSegment0) / sizeof(serializedATNSegment0[0]));


  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

LabParser::Initializer LabParser::_init;
