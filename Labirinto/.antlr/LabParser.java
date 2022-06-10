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
		LINE_COMMENT=26, MULTILINE_COMMENT=27, ERROR=28;
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
			"ID", "PADRAO", "WS", "LINE_COMMENT", "MULTILINE_COMMENT", "ERROR"
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
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
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
			setState(29);
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
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				grid();
				setState(32);
				match(T__0);
				setState(33);
				labirinto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				labirinto();
				setState(36);
				match(T__0);
				setState(37);
				grid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				labirinto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				grid();
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
			setState(43);
			match(T__1);
			setState(44);
			match(T__2);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(45);
				position();
				setState(46);
				match(T__0);
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
			setState(55);
			match(T__4);
			setState(56);
			coordenadas();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(57);
				match(T__5);
				setState(58);
				match(T__6);
				setState(59);
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
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
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
			setState(62);
			match(T__7);
			setState(63);
			match(T__8);
			setState(64);
			match(T__9);
			setState(65);
			match(T__6);
			setState(66);
			match(ID);
			setState(67);
			match(T__10);
			setState(68);
			match(T__6);
			setState(69);
			num();
			setState(70);
			match(T__11);
			setState(71);
			match(T__6);
			setState(72);
			num();
			setState(73);
			match(T__12);
			setState(74);
			match(T__2);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(75);
				dlab();
				setState(76);
				match(T__0);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				target();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				beacon();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				spot();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
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
			setState(91);
			match(T__13);
			setState(92);
			match(T__6);
			setState(93);
			coordenadas();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(94);
				match(T__11);
				setState(95);
				match(T__6);
				setState(96);
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
			setState(99);
			match(T__14);
			setState(100);
			match(T__6);
			setState(101);
			coordenadas();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(102);
				match(T__15);
				setState(103);
				match(T__6);
				{
				setState(104);
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
			setState(107);
			match(T__16);
			setState(108);
			match(T__6);
			setState(109);
			coordenadas();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(110);
				match(T__11);
				setState(111);
				match(T__6);
				setState(112);
				match(INT);
				}
			}

			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(115);
				match(T__15);
				setState(116);
				match(T__6);
				{
				setState(117);
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
		public TerminalNode PADRAO() { return getToken(LabParser.PADRAO, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__17);
			setState(121);
			match(INT);
			setState(122);
			match(T__18);
			setState(123);
			match(PADRAO);
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
			setState(125);
			match(T__8);
			setState(126);
			num();
			setState(127);
			match(T__19);
			setState(128);
			num();
			setState(129);
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
			setState(131);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f\4\16"+
		"\4\66\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nt\n\n\3\n\3\n\3"+
		"\n\5\ny\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\27\30\2\u0089\2\33\3\2"+
		"\2\2\4+\3\2\2\2\6-\3\2\2\2\b9\3\2\2\2\n@\3\2\2\2\f[\3\2\2\2\16]\3\2\2"+
		"\2\20e\3\2\2\2\22m\3\2\2\2\24z\3\2\2\2\26\177\3\2\2\2\30\u0085\3\2\2\2"+
		"\32\34\5\4\3\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\3\2\2"+
		"\36\37\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!\"\5\6\4\2\"#\7\3\2\2#$\5\n\6\2"+
		"$,\3\2\2\2%&\5\n\6\2&\'\7\3\2\2\'(\5\6\4\2(,\3\2\2\2),\5\n\6\2*,\5\6\4"+
		"\2+!\3\2\2\2+%\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-.\7\4\2\2.\64\7"+
		"\5\2\2/\60\5\b\5\2\60\61\7\3\2\2\61\63\3\2\2\2\62/\3\2\2\2\63\66\3\2\2"+
		"\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\6\2\2"+
		"8\7\3\2\2\29:\7\7\2\2:>\5\26\f\2;<\7\b\2\2<=\7\t\2\2=?\7\27\2\2>;\3\2"+
		"\2\2>?\3\2\2\2?\t\3\2\2\2@A\7\n\2\2AB\7\13\2\2BC\7\f\2\2CD\7\t\2\2DE\7"+
		"\31\2\2EF\7\r\2\2FG\7\t\2\2GH\5\30\r\2HI\7\16\2\2IJ\7\t\2\2JK\5\30\r\2"+
		"KL\7\17\2\2LR\7\5\2\2MN\5\f\7\2NO\7\3\2\2OQ\3\2\2\2PM\3\2\2\2QT\3\2\2"+
		"\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\6\2\2V\13\3\2\2\2W\\\5"+
		"\20\t\2X\\\5\16\b\2Y\\\5\22\n\2Z\\\5\24\13\2[W\3\2\2\2[X\3\2\2\2[Y\3\2"+
		"\2\2[Z\3\2\2\2\\\r\3\2\2\2]^\7\20\2\2^_\7\t\2\2_c\5\26\f\2`a\7\16\2\2"+
		"ab\7\t\2\2bd\7\27\2\2c`\3\2\2\2cd\3\2\2\2d\17\3\2\2\2ef\7\21\2\2fg\7\t"+
		"\2\2gk\5\26\f\2hi\7\22\2\2ij\7\t\2\2jl\5\30\r\2kh\3\2\2\2kl\3\2\2\2l\21"+
		"\3\2\2\2mn\7\23\2\2no\7\t\2\2os\5\26\f\2pq\7\16\2\2qr\7\t\2\2rt\7\27\2"+
		"\2sp\3\2\2\2st\3\2\2\2tx\3\2\2\2uv\7\22\2\2vw\7\t\2\2wy\5\30\r\2xu\3\2"+
		"\2\2xy\3\2\2\2y\23\3\2\2\2z{\7\24\2\2{|\7\27\2\2|}\7\25\2\2}~\7\32\2\2"+
		"~\25\3\2\2\2\177\u0080\7\13\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7\26"+
		"\2\2\u0082\u0083\5\30\r\2\u0083\u0084\7\17\2\2\u0084\27\3\2\2\2\u0085"+
		"\u0086\t\2\2\2\u0086\31\3\2\2\2\f\33+\64>R[cksx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}