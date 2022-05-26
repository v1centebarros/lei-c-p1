// Generated from /home/rafael/Documentos/LEI/C/P/Projeto Final/comp2022-mus-p3g3/src/Mus.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, NUM=26, BOOL=27, TEXT=28, VAR=29, LOGICALOP=30, WS=31, COMMENT_INLINE=32, 
		COMMENT_MULTILINE=33;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_block = 2, RULE_assignment = 3, 
		RULE_expr = 4, RULE_bool = 5, RULE_numeric = 6, RULE_call = 7, RULE_type = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "block", "assignment", "expr", "bool", "numeric", 
			"call", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'then'", "'end'", "'while'", "'do'", "'until'", 
			"'='", "'('", "','", "')'", "'|'", "'!'", "'-'", "'*'", "'/'", "'%'", 
			"'+'", "'.'", "'()'", "'NUM'", "'BOOL'", "'TEXT'", "'ENUM'", "'ROBOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NUM", "BOOL", "TEXT", "VAR", "LOGICALOP", "WS", "COMMENT_INLINE", 
			"COMMENT_MULTILINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Mus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MusParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << VAR))) != 0)) {
				{
				{
				setState(18);
				stat();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(28);
				call();
				setState(29);
				match(T__0);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockUntilContext extends BlockContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockUntilContext(BlockContext ctx) { copyFrom(ctx); }
	}
	public static class BlockIfContext extends BlockContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockIfContext(BlockContext ctx) { copyFrom(ctx); }
	}
	public static class BlockWhileContext extends BlockContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockWhileContext(BlockContext ctx) { copyFrom(ctx); }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new BlockIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(T__1);
				setState(34);
				expr();
				setState(35);
				match(T__2);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << VAR))) != 0)) {
					{
					{
					setState(36);
					stat();
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(42);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new BlockWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__4);
				setState(45);
				expr();
				setState(46);
				match(T__5);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << VAR))) != 0)) {
					{
					{
					setState(47);
					stat();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(T__3);
				}
				break;
			case T__5:
				_localctx = new BlockUntilContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(T__5);
				setState(56);
				call();
				setState(57);
				match(T__6);
				setState(58);
				expr();
				setState(59);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				setState(63);
				type();
				}
			}

			setState(66);
			match(VAR);
			setState(67);
			match(T__7);
			setState(68);
			expr();
			setState(69);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprVarContext extends ExprContext {
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public ExprVarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprEnumWithValuesContext extends ExprContext {
		public List<TerminalNode> TEXT() { return getTokens(MusParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(MusParser.TEXT, i);
		}
		public List<TerminalNode> NUM() { return getTokens(MusParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MusParser.NUM, i);
		}
		public ExprEnumWithValuesContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprEnumContext extends ExprContext {
		public List<TerminalNode> TEXT() { return getTokens(MusParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(MusParser.TEXT, i);
		}
		public ExprEnumContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprTextContext extends ExprContext {
		public TerminalNode TEXT() { return getToken(MusParser.TEXT, 0); }
		public ExprTextContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNumericContext extends ExprContext {
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public ExprNumericContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprRobotContext extends ExprContext {
		public TerminalNode TEXT() { return getToken(MusParser.TEXT, 0); }
		public TerminalNode NUM() { return getToken(MusParser.NUM, 0); }
		public ExprRobotContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCallFuncContext extends ExprContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExprCallFuncContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBoolContext extends ExprContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ExprBoolContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ExprRobotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__8);
				setState(72);
				match(TEXT);
				setState(73);
				match(T__9);
				setState(74);
				match(NUM);
				setState(75);
				match(T__10);
				}
				break;
			case 2:
				_localctx = new ExprEnumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(TEXT);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(77);
					match(T__11);
					setState(78);
					match(TEXT);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new ExprEnumWithValuesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(TEXT);
				setState(85);
				match(T__9);
				setState(86);
				match(NUM);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(87);
					match(T__11);
					setState(88);
					match(TEXT);
					setState(89);
					match(T__9);
					setState(90);
					match(NUM);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new ExprBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				bool(0);
				}
				break;
			case 5:
				_localctx = new ExprNumericContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				numeric(0);
				}
				break;
			case 6:
				_localctx = new ExprVarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				match(VAR);
				}
				break;
			case 7:
				_localctx = new ExprTextContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				match(TEXT);
				}
				break;
			case 8:
				_localctx = new ExprCallFuncContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolNegationContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolNegationContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class BoolCompareNumContext extends BoolContext {
		public List<NumericContext> numeric() {
			return getRuleContexts(NumericContext.class);
		}
		public NumericContext numeric(int i) {
			return getRuleContext(NumericContext.class,i);
		}
		public TerminalNode LOGICALOP() { return getToken(MusParser.LOGICALOP, 0); }
		public BoolCompareNumContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class BoolDoubleCompareContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<TerminalNode> LOGICALOP() { return getTokens(MusParser.LOGICALOP); }
		public TerminalNode LOGICALOP(int i) {
			return getToken(MusParser.LOGICALOP, i);
		}
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public BoolDoubleCompareContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class BoolCompareContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public TerminalNode LOGICALOP() { return getToken(MusParser.LOGICALOP, 0); }
		public BoolCompareContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class BoolLiteralContext extends BoolContext {
		public TerminalNode BOOL() { return getToken(MusParser.BOOL, 0); }
		public BoolLiteralContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class BoolParenthesisContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolParenthesisContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class BoolDoubleCompareNumContext extends BoolContext {
		public List<NumericContext> numeric() {
			return getRuleContexts(NumericContext.class);
		}
		public NumericContext numeric(int i) {
			return getRuleContext(NumericContext.class,i);
		}
		public List<TerminalNode> LOGICALOP() { return getTokens(MusParser.LOGICALOP); }
		public TerminalNode LOGICALOP(int i) {
			return getToken(MusParser.LOGICALOP, i);
		}
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public BoolDoubleCompareNumContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class BoolVarContext extends BoolContext {
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public BoolVarContext(BoolContext ctx) { copyFrom(ctx); }
	}

	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new BoolNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(104);
				match(T__12);
				setState(105);
				bool(8);
				}
				break;
			case 2:
				{
				_localctx = new BoolParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(T__8);
				setState(107);
				bool(0);
				setState(108);
				match(T__10);
				}
				break;
			case 3:
				{
				_localctx = new BoolDoubleCompareNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				numeric(0);
				setState(111);
				match(LOGICALOP);
				setState(112);
				match(VAR);
				setState(113);
				match(LOGICALOP);
				setState(114);
				numeric(0);
				}
				break;
			case 4:
				{
				_localctx = new BoolCompareNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				numeric(0);
				setState(117);
				match(LOGICALOP);
				setState(118);
				numeric(0);
				}
				break;
			case 5:
				{
				_localctx = new BoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(BOOL);
				}
				break;
			case 6:
				{
				_localctx = new BoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(VAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new BoolDoubleCompareContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(124);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(125);
						match(LOGICALOP);
						setState(126);
						match(VAR);
						setState(127);
						match(LOGICALOP);
						setState(128);
						bool(5);
						}
						break;
					case 2:
						{
						_localctx = new BoolCompareContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
						match(LOGICALOP);
						setState(131);
						bool(4);
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumericContext extends ParserRuleContext {
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
	 
		public NumericContext() { }
		public void copyFrom(NumericContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericVarContext extends NumericContext {
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public NumericVarContext(NumericContext ctx) { copyFrom(ctx); }
	}
	public static class NumericAddSubContext extends NumericContext {
		public Token op;
		public List<NumericContext> numeric() {
			return getRuleContexts(NumericContext.class);
		}
		public NumericContext numeric(int i) {
			return getRuleContext(NumericContext.class,i);
		}
		public NumericAddSubContext(NumericContext ctx) { copyFrom(ctx); }
	}
	public static class NumericParenthesisContext extends NumericContext {
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public NumericParenthesisContext(NumericContext ctx) { copyFrom(ctx); }
	}
	public static class NumericNegativeContext extends NumericContext {
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public NumericNegativeContext(NumericContext ctx) { copyFrom(ctx); }
	}
	public static class NumericLiteralContext extends NumericContext {
		public TerminalNode NUM() { return getToken(MusParser.NUM, 0); }
		public NumericLiteralContext(NumericContext ctx) { copyFrom(ctx); }
	}
	public static class NumericMultDivModContext extends NumericContext {
		public Token op;
		public List<NumericContext> numeric() {
			return getRuleContexts(NumericContext.class);
		}
		public NumericContext numeric(int i) {
			return getRuleContext(NumericContext.class,i);
		}
		public NumericMultDivModContext(NumericContext ctx) { copyFrom(ctx); }
	}

	public final NumericContext numeric() throws RecognitionException {
		return numeric(0);
	}

	private NumericContext numeric(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumericContext _localctx = new NumericContext(_ctx, _parentState);
		NumericContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_numeric, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				_localctx = new NumericNegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(138);
				match(T__13);
				setState(139);
				numeric(6);
				}
				break;
			case T__8:
				{
				_localctx = new NumericParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(T__8);
				setState(141);
				numeric(0);
				setState(142);
				match(T__10);
				}
				break;
			case NUM:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(NUM);
				}
				break;
			case VAR:
				{
				_localctx = new NumericVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new NumericMultDivModContext(new NumericContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric);
						setState(148);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(149);
						((NumericMultDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
							((NumericMultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(150);
						numeric(5);
						}
						break;
					case 2:
						{
						_localctx = new NumericAddSubContext(new NumericContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numeric);
						setState(151);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(152);
						((NumericAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__17) ) {
							((NumericAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(153);
						numeric(4);
						}
						break;
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(MusParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(MusParser.VAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(159);
				match(VAR);
				setState(160);
				match(T__18);
				}
				break;
			}
			setState(163);
			match(VAR);
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				{
				setState(164);
				match(T__8);
				{
				setState(165);
				expr();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(166);
					match(T__9);
					setState(167);
					expr();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(173);
				match(T__10);
				}
				break;
			case T__19:
				{
				setState(175);
				match(T__19);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return bool_sempred((BoolContext)_localctx, predIndex);
		case 6:
			return numeric_sempred((NumericContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean numeric_sempred(NumericContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4"+
		"\3\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f"+
		"\4\16\4\66\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\5\5C\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6R\n\6\f\6\16\6"+
		"U\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u0087\n\7\f\7\16\7\u008a\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0095\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009d\n\b\f\b\16\b\u00a0\13\b\3"+
		"\t\3\t\5\t\u00a4\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae"+
		"\13\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\n\3\n\3\n\2\4\f\16\13\2\4\6\b\n\f\16"+
		"\20\22\2\5\3\2\21\23\4\2\20\20\24\24\3\2\27\33\2\u00cd\2\27\3\2\2\2\4"+
		"!\3\2\2\2\6?\3\2\2\2\bB\3\2\2\2\ng\3\2\2\2\f|\3\2\2\2\16\u0094\3\2\2\2"+
		"\20\u00a3\3\2\2\2\22\u00b4\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3"+
		"\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7"+
		"\2\2\3\33\3\3\2\2\2\34\"\5\6\4\2\35\"\5\b\5\2\36\37\5\20\t\2\37 \7\3\2"+
		"\2 \"\3\2\2\2!\34\3\2\2\2!\35\3\2\2\2!\36\3\2\2\2\"\5\3\2\2\2#$\7\4\2"+
		"\2$%\5\n\6\2%)\7\5\2\2&(\5\4\3\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2"+
		"\2\2*,\3\2\2\2+)\3\2\2\2,-\7\6\2\2-@\3\2\2\2./\7\7\2\2/\60\5\n\6\2\60"+
		"\64\7\b\2\2\61\63\5\4\3\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\6\2\28@\3\2\2\29:\7\b\2"+
		"\2:;\5\20\t\2;<\7\t\2\2<=\5\n\6\2=>\7\3\2\2>@\3\2\2\2?#\3\2\2\2?.\3\2"+
		"\2\2?9\3\2\2\2@\7\3\2\2\2AC\5\22\n\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7"+
		"\37\2\2EF\7\n\2\2FG\5\n\6\2GH\7\3\2\2H\t\3\2\2\2IJ\7\13\2\2JK\7\36\2\2"+
		"KL\7\f\2\2LM\7\34\2\2Mh\7\r\2\2NS\7\36\2\2OP\7\16\2\2PR\7\36\2\2QO\3\2"+
		"\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2Th\3\2\2\2US\3\2\2\2VW\7\36\2\2WX\7"+
		"\f\2\2X_\7\34\2\2YZ\7\16\2\2Z[\7\36\2\2[\\\7\f\2\2\\^\7\34\2\2]Y\3\2\2"+
		"\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`h\3\2\2\2a_\3\2\2\2bh\5\f\7\2ch\5\16"+
		"\b\2dh\7\37\2\2eh\7\36\2\2fh\5\20\t\2gI\3\2\2\2gN\3\2\2\2gV\3\2\2\2gb"+
		"\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\13\3\2\2\2ij\b\7\1\2"+
		"jk\7\17\2\2k}\5\f\7\nlm\7\13\2\2mn\5\f\7\2no\7\r\2\2o}\3\2\2\2pq\5\16"+
		"\b\2qr\7 \2\2rs\7\37\2\2st\7 \2\2tu\5\16\b\2u}\3\2\2\2vw\5\16\b\2wx\7"+
		" \2\2xy\5\16\b\2y}\3\2\2\2z}\7\35\2\2{}\7\37\2\2|i\3\2\2\2|l\3\2\2\2|"+
		"p\3\2\2\2|v\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\u0088\3\2\2\2~\177\f\6\2\2\177"+
		"\u0080\7 \2\2\u0080\u0081\7\37\2\2\u0081\u0082\7 \2\2\u0082\u0087\5\f"+
		"\7\7\u0083\u0084\f\5\2\2\u0084\u0085\7 \2\2\u0085\u0087\5\f\7\6\u0086"+
		"~\3\2\2\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\r\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\b"+
		"\b\1\2\u008c\u008d\7\20\2\2\u008d\u0095\5\16\b\b\u008e\u008f\7\13\2\2"+
		"\u008f\u0090\5\16\b\2\u0090\u0091\7\r\2\2\u0091\u0095\3\2\2\2\u0092\u0095"+
		"\7\34\2\2\u0093\u0095\7\37\2\2\u0094\u008b\3\2\2\2\u0094\u008e\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u009e\3\2\2\2\u0096\u0097"+
		"\f\6\2\2\u0097\u0098\t\2\2\2\u0098\u009d\5\16\b\7\u0099\u009a\f\5\2\2"+
		"\u009a\u009b\t\3\2\2\u009b\u009d\5\16\b\6\u009c\u0096\3\2\2\2\u009c\u0099"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\17\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\37\2\2\u00a2\u00a4\7\25"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00b2\7\37\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00ac\5\n\6\2\u00a8\u00a9\7"+
		"\f\2\2\u00a9\u00ab\5\n\6\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b0\7\r\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b3\7\26\2\2\u00b2"+
		"\u00a6\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\21\3\2\2\2\u00b4\u00b5\t\4\2"+
		"\2\u00b5\23\3\2\2\2\24\27!)\64?BS_g|\u0086\u0088\u0094\u009c\u009e\u00a3"+
		"\u00ac\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}