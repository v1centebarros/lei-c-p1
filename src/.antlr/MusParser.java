// Generated from /home/mariana/UNIVERSIDADE/C/Projeto/comp2022-mus-p3g3/src/Mus.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, TYPE=31, NUM=32, 
		BOOL=33, TEXT=34, ID=35, WS=36, COMMENT_INLINE=37, COMMENT_MULTILINE=38;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_defFunction = 2, RULE_block = 3, 
		RULE_blockElse = 4, RULE_assignment = 5, RULE_singleCall = 6, RULE_expr = 7, 
		RULE_call = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "defFunction", "block", "blockElse", "assignment", 
			"singleCall", "expr", "call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'with'", "'('", "')'", "'if'", "'do'", "'end'", 
			"'while'", "'until'", "';'", "'else'", "'='", "','", "'->'", "'|'", "'not'", 
			"'and'", "'or'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'-'", 
			"'*'", "'/'", "'%'", "'+'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TYPE", "NUM", "BOOL", "TEXT", 
			"ID", "WS", "COMMENT_INLINE", "COMMENT_MULTILINE"
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
		public List<DefFunctionContext> defFunction() {
			return getRuleContexts(DefFunctionContext.class);
		}
		public DefFunctionContext defFunction(int i) {
			return getRuleContext(DefFunctionContext.class,i);
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
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << TYPE) | (1L << ID))) != 0)) {
				{
				setState(20);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(18);
					stat();
					}
					break;
				case 2:
					{
					setState(19);
					defFunction();
					}
					break;
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
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
		public SingleCallContext singleCall() {
			return getRuleContext(SingleCallContext.class,0);
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
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				singleCall();
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

	public static class DefFunctionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MusParser.ID, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(MusParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(MusParser.TYPE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public DefFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunction; }
	}

	public final DefFunctionContext defFunction() throws RecognitionException {
		DefFunctionContext _localctx = new DefFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(32);
				match(TYPE);
				}
			}

			setState(35);
			match(T__0);
			setState(36);
			match(ID);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(37);
				match(T__1);
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(38);
					match(TYPE);
					setState(39);
					match(ID);
					}
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TYPE );
				}
			}

			setState(46);
			match(T__2);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << TYPE) | (1L << ID))) != 0)) {
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
		public BlockElseContext blockElse() {
			return getRuleContext(BlockElseContext.class,0);
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
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new BlockIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__4);
				setState(56);
				expr(0);
				setState(57);
				match(T__5);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << TYPE) | (1L << ID))) != 0)) {
					{
					{
					setState(58);
					stat();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(64);
					blockElse();
					}
				}

				setState(67);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new BlockWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__7);
				setState(70);
				expr(0);
				setState(71);
				match(T__5);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << TYPE) | (1L << ID))) != 0)) {
					{
					{
					setState(72);
					stat();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(T__6);
				}
				break;
			case ID:
				_localctx = new BlockUntilContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				call();
				setState(81);
				match(T__8);
				setState(82);
				expr(0);
				setState(83);
				match(T__9);
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

	public static class BlockElseContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockElse; }
	}

	public final BlockElseContext blockElse() throws RecognitionException {
		BlockElseContext _localctx = new BlockElseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__10);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(88);
				stat();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MusParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(MusParser.TYPE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(94);
				match(TYPE);
				}
			}

			setState(97);
			match(ID);
			setState(98);
			match(T__11);
			setState(99);
			expr(0);
			setState(100);
			match(T__9);
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

	public static class SingleCallContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public SingleCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCall; }
	}

	public final SingleCallContext singleCall() throws RecognitionException {
		SingleCallContext _localctx = new SingleCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			call();
			setState(103);
			match(T__9);
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
		public TerminalNode ID() { return getToken(MusParser.ID, 0); }
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
	public static class BoolNegationContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolNegationContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolDoubleCompareContext extends ExprContext {
		public Token op1;
		public Token op2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolDoubleCompareContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolCompareContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolCompareContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumericAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NumericAddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprTupleContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprTupleContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumericNegativeContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NumericNegativeContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumericLiteralContext extends ExprContext {
		public TerminalNode NUM() { return getToken(MusParser.NUM, 0); }
		public NumericLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCallContext extends ExprContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExprCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolLiteralContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(MusParser.BOOL, 0); }
		public BoolLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprEnumContext extends ExprContext {
		public List<TerminalNode> TEXT() { return getTokens(MusParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(MusParser.TEXT, i);
		}
		public ExprEnumContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumericMultDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NumericMultDivModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class TextLiteralContext extends ExprContext {
		public TerminalNode TEXT() { return getToken(MusParser.TEXT, 0); }
		public TextLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ExprTupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(106);
				match(T__2);
				setState(107);
				expr(0);
				setState(108);
				match(T__12);
				setState(109);
				expr(0);
				setState(110);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new ExprEnumWithValuesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(TEXT);
				setState(113);
				match(T__13);
				setState(114);
				match(NUM);
				setState(119); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(115);
						match(T__14);
						setState(116);
						match(TEXT);
						setState(117);
						match(T__13);
						setState(118);
						match(NUM);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(121); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(T__2);
				setState(124);
				expr(0);
				setState(125);
				match(T__3);
				}
				break;
			case 4:
				{
				_localctx = new BoolNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(T__15);
				setState(128);
				expr(12);
				}
				break;
			case 5:
				{
				_localctx = new NumericNegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(T__24);
				setState(130);
				expr(9);
				}
				break;
			case 6:
				{
				_localctx = new ExprVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new ExprCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				call();
				}
				break;
			case 8:
				{
				_localctx = new TextLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(TEXT);
				}
				break;
			case 9:
				{
				_localctx = new ExprEnumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(TEXT);
				setState(137); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(135);
						match(T__14);
						setState(136);
						match(TEXT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(139); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 10:
				{
				_localctx = new BoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(BOOL);
				}
				break;
			case 11:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(NUM);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new BoolDoubleCompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(146);
						((BoolDoubleCompareContext)_localctx).op1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
							((BoolDoubleCompareContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(147);
						expr(0);
						setState(148);
						((BoolDoubleCompareContext)_localctx).op2 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
							((BoolDoubleCompareContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new BoolCompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(152);
						((BoolCompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((BoolCompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(153);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new NumericMultDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(155);
						((NumericMultDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((NumericMultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new NumericAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(158);
						((NumericAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__28) ) {
							((NumericAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public List<TerminalNode> ID() { return getTokens(MusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MusParser.ID, i);
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
		enterRule(_localctx, 16, RULE_call);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(165);
				match(ID);
				setState(166);
				match(T__29);
				}
				break;
			}
			setState(169);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					expr(0);
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\3\3\5\3!\n\3\3\4\5\4$\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\6\4+\n\4\r\4\16\4,\5\4/\n\4\3\4\3\4\7\4\63\n\4\f"+
		"\4\16\4\66\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\5"+
		"\5D\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\7\5\7b\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\6\tz\n\t\r\t\16\t{\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u008c\n\t\r\t\16\t\u008d\3\t\3\t\5\t\u0092"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a3"+
		"\n\t\f\t\16\t\u00a6\13\t\3\n\3\n\5\n\u00aa\n\n\3\n\3\n\7\n\u00ae\n\n\f"+
		"\n\16\n\u00b1\13\n\3\n\2\3\20\13\2\4\6\b\n\f\16\20\22\2\6\3\2\23\30\3"+
		"\2\23\32\3\2\34\36\4\2\33\33\37\37\2\u00ca\2\30\3\2\2\2\4 \3\2\2\2\6#"+
		"\3\2\2\2\bW\3\2\2\2\nY\3\2\2\2\fa\3\2\2\2\16h\3\2\2\2\20\u0091\3\2\2\2"+
		"\22\u00a9\3\2\2\2\24\27\5\4\3\2\25\27\5\6\4\2\26\24\3\2\2\2\26\25\3\2"+
		"\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2"+
		"\2\2\33\34\7\2\2\3\34\3\3\2\2\2\35!\5\b\5\2\36!\5\f\7\2\37!\5\16\b\2 "+
		"\35\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!\5\3\2\2\2\"$\7!\2\2#\"\3\2\2\2#$"+
		"\3\2\2\2$%\3\2\2\2%&\7\3\2\2&.\7%\2\2\'*\7\4\2\2()\7!\2\2)+\7%\2\2*(\3"+
		"\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\'\3\2\2\2./\3\2\2\2/\60"+
		"\3\2\2\2\60\64\7\5\2\2\61\63\5\4\3\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\6\2\28\7\3\2"+
		"\2\29:\7\7\2\2:;\5\20\t\2;?\7\b\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2BD\5\n\6\2CB\3\2\2\2CD\3\2\2\2DE\3"+
		"\2\2\2EF\7\t\2\2FX\3\2\2\2GH\7\n\2\2HI\5\20\t\2IM\7\b\2\2JL\5\4\3\2KJ"+
		"\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\t\2\2Q"+
		"X\3\2\2\2RS\5\22\n\2ST\7\13\2\2TU\5\20\t\2UV\7\f\2\2VX\3\2\2\2W9\3\2\2"+
		"\2WG\3\2\2\2WR\3\2\2\2X\t\3\2\2\2Y]\7\r\2\2Z\\\5\4\3\2[Z\3\2\2\2\\_\3"+
		"\2\2\2][\3\2\2\2]^\3\2\2\2^\13\3\2\2\2_]\3\2\2\2`b\7!\2\2a`\3\2\2\2ab"+
		"\3\2\2\2bc\3\2\2\2cd\7%\2\2de\7\16\2\2ef\5\20\t\2fg\7\f\2\2g\r\3\2\2\2"+
		"hi\5\22\n\2ij\7\f\2\2j\17\3\2\2\2kl\b\t\1\2lm\7\5\2\2mn\5\20\t\2no\7\17"+
		"\2\2op\5\20\t\2pq\7\6\2\2q\u0092\3\2\2\2rs\7$\2\2st\7\20\2\2ty\7\"\2\2"+
		"uv\7\21\2\2vw\7$\2\2wx\7\20\2\2xz\7\"\2\2yu\3\2\2\2z{\3\2\2\2{y\3\2\2"+
		"\2{|\3\2\2\2|\u0092\3\2\2\2}~\7\5\2\2~\177\5\20\t\2\177\u0080\7\6\2\2"+
		"\u0080\u0092\3\2\2\2\u0081\u0082\7\22\2\2\u0082\u0092\5\20\t\16\u0083"+
		"\u0084\7\33\2\2\u0084\u0092\5\20\t\13\u0085\u0092\7%\2\2\u0086\u0092\5"+
		"\22\n\2\u0087\u0092\7$\2\2\u0088\u008b\7$\2\2\u0089\u008a\7\21\2\2\u008a"+
		"\u008c\7$\2\2\u008b\u0089\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0092\3\2\2\2\u008f\u0092\7#\2\2\u0090"+
		"\u0092\7\"\2\2\u0091k\3\2\2\2\u0091r\3\2\2\2\u0091}\3\2\2\2\u0091\u0081"+
		"\3\2\2\2\u0091\u0083\3\2\2\2\u0091\u0085\3\2\2\2\u0091\u0086\3\2\2\2\u0091"+
		"\u0087\3\2\2\2\u0091\u0088\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2"+
		"\2\2\u0092\u00a4\3\2\2\2\u0093\u0094\f\r\2\2\u0094\u0095\t\2\2\2\u0095"+
		"\u0096\5\20\t\2\u0096\u0097\t\2\2\2\u0097\u0098\5\20\t\16\u0098\u00a3"+
		"\3\2\2\2\u0099\u009a\f\f\2\2\u009a\u009b\t\3\2\2\u009b\u00a3\5\20\t\r"+
		"\u009c\u009d\f\n\2\2\u009d\u009e\t\4\2\2\u009e\u00a3\5\20\t\13\u009f\u00a0"+
		"\f\t\2\2\u00a0\u00a1\t\5\2\2\u00a1\u00a3\5\20\t\n\u00a2\u0093\3\2\2\2"+
		"\u00a2\u0099\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3\u00a6"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\21\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a8\7%\2\2\u00a8\u00aa\7 \2\2\u00a9\u00a7\3\2\2"+
		"\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00af\7%\2\2\u00ac\u00ae"+
		"\5\20\t\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\23\3\2\2\2\u00b1\u00af\3\2\2\2\26\26\30 #,"+
		".\64?CMW]a{\u008d\u0091\u00a2\u00a4\u00a9\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}