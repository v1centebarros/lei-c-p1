// Generated from /home/mariana/UNIVERSIDADE/C/Projeto/comp2022-mus-p3g3/Labirinto/Lab.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, COORDENADAS=21, INT=22, DOUBLE=23, ID=24, 
		PADRAO=25, WS=26, LINE_COMMENT=27, MULTILINE_COMMENT=28;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_grid = 2, RULE_position = 3, RULE_labirinto = 4, 
		RULE_target = 5, RULE_beacon = 6, RULE_spot = 7, RULE_row = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "grid", "position", "labirinto", "target", "beacon", 
			"spot", "row"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'GRID'", "'{'", "'}'", "'POSITION'", "'DIRECTION'", "'='", 
			"'LABIRINTO'", "'('", "'NAME'", "','", "'WIDTH'", "'HEIGHT'", "')'", 
			"'TARGET'", "'RADIUS'", "'BEACON'", "'SPOT'", "'ROW'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "COORDENADAS", 
			"INT", "DOUBLE", "ID", "PADRAO", "WS", "LINE_COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "Lab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LabParser.EOF, 0); }
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
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7))) != 0)) {
				{
				{
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==T__7) {
					{
					setState(18);
					stat();
					}
				}

				setState(21);
				match(T__0);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
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
		public GridContext grid() {
			return getRuleContext(GridContext.class,0);
		}
		public LabirintoContext labirinto() {
			return getRuleContext(LabirintoContext.class,0);
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
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				grid();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				labirinto();
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

	public static class GridContext extends ParserRuleContext {
		public List<PositionContext> position() {
			return getRuleContexts(PositionContext.class);
		}
		public PositionContext position(int i) {
			return getRuleContext(PositionContext.class,i);
		}
		public GridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grid; }
	}

	public final GridContext grid() throws RecognitionException {
		GridContext _localctx = new GridContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__1);
			setState(34);
			match(T__2);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				position();
				setState(36);
				match(T__0);
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(42);
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

	public static class PositionContext extends ParserRuleContext {
		public TerminalNode COORDENADAS() { return getToken(LabParser.COORDENADAS, 0); }
		public TerminalNode INT() { return getToken(LabParser.INT, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__4);
			setState(45);
			match(COORDENADAS);
			setState(46);
			match(T__5);
			setState(47);
			match(T__6);
			setState(48);
			match(INT);
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

	public static class LabirintoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LabParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(LabParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LabParser.INT, i);
		}
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public List<BeaconContext> beacon() {
			return getRuleContexts(BeaconContext.class);
		}
		public BeaconContext beacon(int i) {
			return getRuleContext(BeaconContext.class,i);
		}
		public List<SpotContext> spot() {
			return getRuleContexts(SpotContext.class);
		}
		public SpotContext spot(int i) {
			return getRuleContext(SpotContext.class,i);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public LabirintoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labirinto; }
	}

	public final LabirintoContext labirinto() throws RecognitionException {
		LabirintoContext _localctx = new LabirintoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_labirinto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__7);
			setState(51);
			match(T__8);
			setState(52);
			match(T__9);
			setState(53);
			match(T__6);
			setState(54);
			match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(55);
				match(T__10);
				setState(56);
				match(T__11);
				setState(57);
				match(T__6);
				setState(58);
				match(INT);
				setState(59);
				match(T__10);
				setState(60);
				match(T__12);
				setState(61);
				match(T__6);
				setState(62);
				match(INT);
				}
			}

			setState(65);
			match(T__13);
			setState(66);
			match(T__2);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(67);
				target();
				setState(68);
				match(T__0);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(75);
				beacon();
				setState(76);
				match(T__0);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(83);
				spot();
				setState(84);
				match(T__0);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(91);
				row();
				setState(92);
				match(T__0);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode COORDENADAS() { return getToken(LabParser.COORDENADAS, 0); }
		public TerminalNode DOUBLE() { return getToken(LabParser.DOUBLE, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__14);
			setState(102);
			match(T__6);
			setState(103);
			match(COORDENADAS);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(104);
				match(T__15);
				setState(105);
				match(T__6);
				setState(106);
				match(DOUBLE);
				}
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

	public static class BeaconContext extends ParserRuleContext {
		public TerminalNode COORDENADAS() { return getToken(LabParser.COORDENADAS, 0); }
		public TerminalNode INT() { return getToken(LabParser.INT, 0); }
		public BeaconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beacon; }
	}

	public final BeaconContext beacon() throws RecognitionException {
		BeaconContext _localctx = new BeaconContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_beacon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__16);
			setState(110);
			match(T__6);
			setState(111);
			match(COORDENADAS);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(112);
				match(T__12);
				setState(113);
				match(T__6);
				setState(114);
				match(INT);
				}
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

	public static class SpotContext extends ParserRuleContext {
		public TerminalNode COORDENADAS() { return getToken(LabParser.COORDENADAS, 0); }
		public TerminalNode INT() { return getToken(LabParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(LabParser.DOUBLE, 0); }
		public SpotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spot; }
	}

	public final SpotContext spot() throws RecognitionException {
		SpotContext _localctx = new SpotContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_spot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__17);
			setState(118);
			match(T__6);
			setState(119);
			match(COORDENADAS);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(120);
				match(T__12);
				setState(121);
				match(T__6);
				setState(122);
				match(INT);
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(125);
				match(T__15);
				setState(126);
				match(T__6);
				setState(127);
				match(DOUBLE);
				}
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

	public static class RowContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LabParser.INT, 0); }
		public List<TerminalNode> PADRAO() { return getTokens(LabParser.PADRAO); }
		public TerminalNode PADRAO(int i) {
			return getToken(LabParser.PADRAO, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__18);
			setState(131);
			match(INT);
			setState(132);
			match(T__19);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PADRAO) {
				{
				{
				setState(133);
				match(PADRAO);
				}
				}
				setState(138);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u008e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5"+
		"\2\26\n\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\3\3\3\5\3\"\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\6\4)\n\4\r\4\16\4*\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13"+
		"\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\6\7\6a\n\6\f\6\16\6"+
		"d\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bv\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\5\t\u0083\n\t"+
		"\3\n\3\n\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\3\n\2\2\13\2\4\6\b"+
		"\n\f\16\20\22\2\2\2\u0092\2\32\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b.\3\2\2"+
		"\2\n\64\3\2\2\2\fg\3\2\2\2\16o\3\2\2\2\20w\3\2\2\2\22\u0084\3\2\2\2\24"+
		"\26\5\4\3\2\25\24\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\31\7\3\2\2\30"+
		"\25\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34"+
		"\32\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37\"\5\6\4\2 \"\5\n\6\2!\37\3\2"+
		"\2\2! \3\2\2\2\"\5\3\2\2\2#$\7\4\2\2$(\7\5\2\2%&\5\b\5\2&\'\7\3\2\2\'"+
		")\3\2\2\2(%\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\6\2\2"+
		"-\7\3\2\2\2./\7\7\2\2/\60\7\27\2\2\60\61\7\b\2\2\61\62\7\t\2\2\62\63\7"+
		"\30\2\2\63\t\3\2\2\2\64\65\7\n\2\2\65\66\7\13\2\2\66\67\7\f\2\2\678\7"+
		"\t\2\28A\7\32\2\29:\7\r\2\2:;\7\16\2\2;<\7\t\2\2<=\7\30\2\2=>\7\r\2\2"+
		">?\7\17\2\2?@\7\t\2\2@B\7\30\2\2A9\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\20"+
		"\2\2DJ\7\5\2\2EF\5\f\7\2FG\7\3\2\2GI\3\2\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2"+
		"\2\2JK\3\2\2\2KR\3\2\2\2LJ\3\2\2\2MN\5\16\b\2NO\7\3\2\2OQ\3\2\2\2PM\3"+
		"\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SZ\3\2\2\2TR\3\2\2\2UV\5\20\t\2VW"+
		"\7\3\2\2WY\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[b\3\2\2\2"+
		"\\Z\3\2\2\2]^\5\22\n\2^_\7\3\2\2_a\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2"+
		"\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\6\2\2f\13\3\2\2\2gh\7\21\2\2hi\7"+
		"\t\2\2im\7\27\2\2jk\7\22\2\2kl\7\t\2\2ln\7\31\2\2mj\3\2\2\2mn\3\2\2\2"+
		"n\r\3\2\2\2op\7\23\2\2pq\7\t\2\2qu\7\27\2\2rs\7\17\2\2st\7\t\2\2tv\7\30"+
		"\2\2ur\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wx\7\24\2\2xy\7\t\2\2y}\7\27\2\2z"+
		"{\7\17\2\2{|\7\t\2\2|~\7\30\2\2}z\3\2\2\2}~\3\2\2\2~\u0082\3\2\2\2\177"+
		"\u0080\7\22\2\2\u0080\u0081\7\t\2\2\u0081\u0083\7\31\2\2\u0082\177\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\21\3\2\2\2\u0084\u0085\7\25\2\2\u0085\u0086"+
		"\7\30\2\2\u0086\u008a\7\26\2\2\u0087\u0089\7\33\2\2\u0088\u0087\3\2\2"+
		"\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\23"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\20\25\32!*AJRZbmu}\u0082\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}