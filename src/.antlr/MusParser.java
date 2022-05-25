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
		T__9=10, NUM=11, BOOL=12, TEXT=13, VAR=14, NEWLINE=15, WS=16, COMMENT=17;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_assignment = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NUM'", "'='", "'BOOL'", "'TEXT'", "'ENUM'", "'|'", "','", "'ROBOT'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NUM", 
			"BOOL", "TEXT", "VAR", "NEWLINE", "WS", "COMMENT"
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
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(6);
				stat();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
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
		public TerminalNode NEWLINE() { return getToken(MusParser.NEWLINE, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__7))) != 0)) {
				{
				setState(14);
				assignment();
				}
			}

			setState(17);
			match(NEWLINE);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignBoolContext extends AssignmentContext {
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public TerminalNode BOOL() { return getToken(MusParser.BOOL, 0); }
		public AssignBoolContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class AssignNumContext extends AssignmentContext {
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(MusParser.NUM, 0); }
		public AssignNumContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class AssignEnumContext extends AssignmentContext {
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public List<TerminalNode> TEXT() { return getTokens(MusParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(MusParser.TEXT, i);
		}
		public AssignEnumContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class AssignEnumWithValuesContext extends AssignmentContext {
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public List<TerminalNode> TEXT() { return getTokens(MusParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(MusParser.TEXT, i);
		}
		public List<TerminalNode> NUM() { return getTokens(MusParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MusParser.NUM, i);
		}
		public AssignEnumWithValuesContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class AssignRobotContext extends AssignmentContext {
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public TerminalNode TEXT() { return getToken(MusParser.TEXT, 0); }
		public TerminalNode NUM() { return getToken(MusParser.NUM, 0); }
		public AssignRobotContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class AssignTextContext extends AssignmentContext {
		public TerminalNode VAR() { return getToken(MusParser.VAR, 0); }
		public TerminalNode TEXT() { return getToken(MusParser.TEXT, 0); }
		public AssignTextContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssignNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__0);
				setState(20);
				match(VAR);
				setState(21);
				match(T__1);
				setState(22);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new AssignBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(T__2);
				setState(24);
				match(VAR);
				setState(25);
				match(T__1);
				setState(26);
				match(BOOL);
				}
				break;
			case 3:
				_localctx = new AssignTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(T__3);
				setState(28);
				match(VAR);
				setState(29);
				match(T__1);
				setState(30);
				match(TEXT);
				}
				break;
			case 4:
				_localctx = new AssignEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(T__4);
				setState(32);
				match(VAR);
				setState(33);
				match(T__1);
				setState(34);
				match(TEXT);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(35);
					match(T__5);
					setState(36);
					match(TEXT);
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new AssignEnumWithValuesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				match(T__4);
				setState(43);
				match(VAR);
				setState(44);
				match(T__1);
				setState(45);
				match(TEXT);
				setState(46);
				match(T__6);
				setState(47);
				match(NUM);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(48);
					match(T__5);
					setState(49);
					match(TEXT);
					setState(50);
					match(T__6);
					setState(51);
					match(NUM);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				_localctx = new AssignRobotContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				match(T__7);
				setState(58);
				match(VAR);
				setState(59);
				match(T__1);
				setState(60);
				match(T__8);
				setState(61);
				match(TEXT);
				setState(62);
				match(T__6);
				setState(63);
				match(NUM);
				setState(64);
				match(T__9);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\3\3\5\3\22\n\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4D\n\4\3\4"+
		"\2\2\5\2\4\6\2\2\2K\2\13\3\2\2\2\4\21\3\2\2\2\6C\3\2\2\2\b\n\5\4\3\2\t"+
		"\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\16\3\2\2\2\r\13\3\2"+
		"\2\2\16\17\7\2\2\3\17\3\3\2\2\2\20\22\5\6\4\2\21\20\3\2\2\2\21\22\3\2"+
		"\2\2\22\23\3\2\2\2\23\24\7\21\2\2\24\5\3\2\2\2\25\26\7\3\2\2\26\27\7\20"+
		"\2\2\27\30\7\4\2\2\30D\7\r\2\2\31\32\7\5\2\2\32\33\7\20\2\2\33\34\7\4"+
		"\2\2\34D\7\16\2\2\35\36\7\6\2\2\36\37\7\20\2\2\37 \7\4\2\2 D\7\17\2\2"+
		"!\"\7\7\2\2\"#\7\20\2\2#$\7\4\2\2$)\7\17\2\2%&\7\b\2\2&(\7\17\2\2\'%\3"+
		"\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*D\3\2\2\2+)\3\2\2\2,-\7\7\2\2-."+
		"\7\20\2\2./\7\4\2\2/\60\7\17\2\2\60\61\7\t\2\2\618\7\r\2\2\62\63\7\b\2"+
		"\2\63\64\7\17\2\2\64\65\7\t\2\2\65\67\7\r\2\2\66\62\3\2\2\2\67:\3\2\2"+
		"\28\66\3\2\2\289\3\2\2\29D\3\2\2\2:8\3\2\2\2;<\7\n\2\2<=\7\20\2\2=>\7"+
		"\4\2\2>?\7\13\2\2?@\7\17\2\2@A\7\t\2\2AB\7\r\2\2BD\7\f\2\2C\25\3\2\2\2"+
		"C\31\3\2\2\2C\35\3\2\2\2C!\3\2\2\2C,\3\2\2\2C;\3\2\2\2D\7\3\2\2\2\7\13"+
		"\21)8C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}