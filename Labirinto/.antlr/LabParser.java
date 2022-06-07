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
		T__17=18, T__18=19, T__19=20, INT=21, DOUBLE=22, ID=23, PADRAO=24, WS=25, 
		LINE_COMMENT=26, MULTILINE_COMMENT=27;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_grid = 2, RULE_position = 3, RULE_labirinto = 4, 
		RULE_dlab = 5, RULE_beacon = 6, RULE_target = 7, RULE_spot = 8, RULE_row = 9, 
		RULE_coordenadas = 10, RULE_num = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "grid", "position", "labirinto", "dlab", "beacon", 
			"target", "spot", "row", "coordenadas", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'GRID'", "'{'", "'}'", "'POS'", "'DIRECTION'", "'='", "'LABIRINTO'", 
			"'('", "'NAME'", "'WIDTH'", "'HEIGHT'", "')'", "'BEACON'", "'TARGET'", 
			"'RADIUS'", "'SPOT'", "'ROW'", "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "INT", "DOUBLE", 
			"ID", "PADRAO", "WS", "LINE_COMMENT", "MULTILINE_COMMENT"
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
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7))) != 0)) {
				{
				{
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==T__7) {
					{
					setState(24);
					stat();
					}
				}

				setState(27);
				match(T__0);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
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
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				grid();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
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
			setState(39);
			match(T__1);
			setState(40);
			match(T__2);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(41);
				position();
				setState(42);
				match(T__0);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public TerminalNode INT() { return getToken(LabParser.INT, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_position);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__4);
			setState(52);
			coordenadas();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(53);
				match(T__5);
				setState(54);
				match(T__6);
				setState(55);
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

	public static class LabirintoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LabParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(LabParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LabParser.INT, i);
		}
		public List<DlabContext> dlab() {
			return getRuleContexts(DlabContext.class);
		}
		public DlabContext dlab(int i) {
			return getRuleContext(DlabContext.class,i);
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
			setState(58);
			match(T__7);
			setState(59);
			match(T__8);
			setState(60);
			match(T__9);
			setState(61);
			match(T__6);
			setState(62);
			match(ID);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(63);
				match(T__10);
				setState(64);
				match(T__6);
				setState(65);
				match(INT);
				setState(66);
				match(T__11);
				setState(67);
				match(T__6);
				setState(68);
				match(INT);
				}
			}

			setState(71);
			match(T__12);
			setState(72);
			match(T__2);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(73);
				dlab();
				setState(74);
				match(T__0);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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

	public static class DlabContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public BeaconContext beacon() {
			return getRuleContext(BeaconContext.class,0);
		}
		public SpotContext spot() {
			return getRuleContext(SpotContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public DlabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlab; }
	}

	public final DlabContext dlab() throws RecognitionException {
		DlabContext _localctx = new DlabContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dlab);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				target();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				beacon();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				spot();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				row();
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

	public static class BeaconContext extends ParserRuleContext {
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
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
			setState(89);
			match(T__13);
			setState(90);
			match(T__6);
			setState(91);
			coordenadas();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(92);
				match(T__11);
				setState(93);
				match(T__6);
				setState(94);
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

	public static class TargetContext extends ParserRuleContext {
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__14);
			setState(98);
			match(T__6);
			setState(99);
			coordenadas();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(100);
				match(T__15);
				setState(101);
				match(T__6);
				{
				setState(102);
				num();
				}
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
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public TerminalNode INT() { return getToken(LabParser.INT, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public SpotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spot; }
	}

	public final SpotContext spot() throws RecognitionException {
		SpotContext _localctx = new SpotContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_spot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__16);
			setState(106);
			match(T__6);
			setState(107);
			coordenadas();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(108);
				match(T__11);
				setState(109);
				match(T__6);
				setState(110);
				match(INT);
				}
			}

			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(113);
				match(T__15);
				setState(114);
				match(T__6);
				{
				setState(115);
				num();
				}
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
		enterRule(_localctx, 18, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__17);
			setState(119);
			match(INT);
			setState(120);
			match(T__18);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PADRAO) {
				{
				{
				setState(121);
				match(PADRAO);
				}
				}
				setState(126);
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

	public static class CoordenadasContext extends ParserRuleContext {
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public CoordenadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordenadas; }
	}

	public final CoordenadasContext coordenadas() throws RecognitionException {
		CoordenadasContext _localctx = new CoordenadasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_coordenadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__8);
			setState(128);
			num();
			setState(129);
			match(T__19);
			setState(130);
			num();
			setState(131);
			match(T__12);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(LabParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(LabParser.INT, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3"+
		"\2\3\2\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6H\n\6\3\6\3\6\3\6\3\6\3\6\7\6O\n\6\f\6\16\6R\13\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bb\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nr\n\n\3\n\3\n\3\n"+
		"\5\nw\n\n\3\13\3\13\3\13\3\13\7\13}\n\13\f\13\16\13\u0080\13\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2"+
		"\3\3\2\27\30\2\u008c\2 \3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b\65\3\2\2\2\n"+
		"<\3\2\2\2\fY\3\2\2\2\16[\3\2\2\2\20c\3\2\2\2\22k\3\2\2\2\24x\3\2\2\2\26"+
		"\u0081\3\2\2\2\30\u0087\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\33\34\3\2"+
		"\2\2\34\35\3\2\2\2\35\37\7\3\2\2\36\33\3\2\2\2\37\"\3\2\2\2 \36\3\2\2"+
		"\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\2\2\3$\3\3\2\2\2%(\5\6\4\2&(\5\n"+
		"\6\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*\7\4\2\2*\60\7\5\2\2+,\5\b\5\2"+
		",-\7\3\2\2-/\3\2\2\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\63\3\2\2\2\62\60\3\2\2\2\63\64\7\6\2\2\64\7\3\2\2\2\65\66\7\7\2\2\66"+
		":\5\26\f\2\678\7\b\2\289\7\t\2\29;\7\27\2\2:\67\3\2\2\2:;\3\2\2\2;\t\3"+
		"\2\2\2<=\7\n\2\2=>\7\13\2\2>?\7\f\2\2?@\7\t\2\2@G\7\31\2\2AB\7\r\2\2B"+
		"C\7\t\2\2CD\7\27\2\2DE\7\16\2\2EF\7\t\2\2FH\7\27\2\2GA\3\2\2\2GH\3\2\2"+
		"\2HI\3\2\2\2IJ\7\17\2\2JP\7\5\2\2KL\5\f\7\2LM\7\3\2\2MO\3\2\2\2NK\3\2"+
		"\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\6\2\2T\13\3"+
		"\2\2\2UZ\5\20\t\2VZ\5\16\b\2WZ\5\22\n\2XZ\5\24\13\2YU\3\2\2\2YV\3\2\2"+
		"\2YW\3\2\2\2YX\3\2\2\2Z\r\3\2\2\2[\\\7\20\2\2\\]\7\t\2\2]a\5\26\f\2^_"+
		"\7\16\2\2_`\7\t\2\2`b\7\27\2\2a^\3\2\2\2ab\3\2\2\2b\17\3\2\2\2cd\7\21"+
		"\2\2de\7\t\2\2ei\5\26\f\2fg\7\22\2\2gh\7\t\2\2hj\5\30\r\2if\3\2\2\2ij"+
		"\3\2\2\2j\21\3\2\2\2kl\7\23\2\2lm\7\t\2\2mq\5\26\f\2no\7\16\2\2op\7\t"+
		"\2\2pr\7\27\2\2qn\3\2\2\2qr\3\2\2\2rv\3\2\2\2st\7\22\2\2tu\7\t\2\2uw\5"+
		"\30\r\2vs\3\2\2\2vw\3\2\2\2w\23\3\2\2\2xy\7\24\2\2yz\7\27\2\2z~\7\25\2"+
		"\2{}\7\32\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\25\3"+
		"\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\13\2\2\u0082\u0083\5\30\r\2\u0083"+
		"\u0084\7\26\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7\17\2\2\u0086\27\3\2"+
		"\2\2\u0087\u0088\t\2\2\2\u0088\31\3\2\2\2\17\33 \'\60:GPYaiqv~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}