// Generated from /home/emanuel/Desktop/C/projeto/comp2022-mus-p3g3/Labirinto/Lab.g4 by ANTLR 4.9.2
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
		RULE_coordenadas = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "grid", "position", "labirinto", "dlab", "beacon", 
			"target", "spot", "row", "coordenadas"
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
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7))) != 0)) {
				{
				{
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==T__7) {
					{
					setState(22);
					stat();
					}
				}

				setState(25);
				match(T__0);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
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
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				grid();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
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
			setState(37);
			match(T__1);
			setState(38);
			match(T__2);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(39);
				position();
				setState(40);
				match(T__0);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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
			setState(49);
			match(T__4);
			setState(50);
			coordenadas();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(51);
				match(T__5);
				setState(52);
				match(T__6);
				setState(53);
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
			setState(56);
			match(T__7);
			setState(57);
			match(T__8);
			setState(58);
			match(T__9);
			setState(59);
			match(T__6);
			setState(60);
			match(ID);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(61);
				match(T__10);
				setState(62);
				match(T__6);
				setState(63);
				match(INT);
				setState(64);
				match(T__11);
				setState(65);
				match(T__6);
				setState(66);
				match(INT);
				}
			}

			setState(69);
			match(T__12);
			setState(70);
			match(T__2);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(71);
				dlab();
				setState(72);
				match(T__0);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				target();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				beacon();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				spot();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
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
			setState(87);
			match(T__13);
			setState(88);
			match(T__6);
			setState(89);
			coordenadas();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(90);
				match(T__11);
				setState(91);
				match(T__6);
				setState(92);
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
		public TerminalNode DOUBLE() { return getToken(LabParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(LabParser.INT, 0); }
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
			setState(95);
			match(T__14);
			setState(96);
			match(T__6);
			setState(97);
			coordenadas();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(98);
				match(T__15);
				setState(99);
				match(T__6);
				setState(100);
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
		public List<TerminalNode> INT() { return getTokens(LabParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LabParser.INT, i);
		}
		public TerminalNode DOUBLE() { return getToken(LabParser.DOUBLE, 0); }
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
			setState(103);
			match(T__16);
			setState(104);
			match(T__6);
			setState(105);
			coordenadas();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(106);
				match(T__11);
				setState(107);
				match(T__6);
				setState(108);
				match(INT);
				}
			}

			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(111);
				match(T__15);
				setState(112);
				match(T__6);
				setState(113);
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
			setState(116);
			match(T__17);
			setState(117);
			match(INT);
			setState(118);
			match(T__18);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PADRAO) {
				{
				{
				setState(119);
				match(PADRAO);
				}
				}
				setState(124);
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
		public List<TerminalNode> DOUBLE() { return getTokens(LabParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(LabParser.DOUBLE, i);
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
			match(DOUBLE);
			setState(127);
			match(T__19);
			setState(128);
			match(DOUBLE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0086\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\5\2\32\n\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3"+
		"\3\3\5\3&\n\3\3\4\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\5\59\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6F\n\6\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\th\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\n\3\n\3\n\5\nu\n\n"+
		"\3\13\3\13\3\13\3\13\7\13{\n\13\f\13\16\13~\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\27\30\2\u0089\2\36\3"+
		"\2\2\2\4%\3\2\2\2\6\'\3\2\2\2\b\63\3\2\2\2\n:\3\2\2\2\fW\3\2\2\2\16Y\3"+
		"\2\2\2\20a\3\2\2\2\22i\3\2\2\2\24v\3\2\2\2\26\177\3\2\2\2\30\32\5\4\3"+
		"\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\35\7\3\2\2\34\31\3\2\2"+
		"\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\""+
		"\7\2\2\3\"\3\3\2\2\2#&\5\6\4\2$&\5\n\6\2%#\3\2\2\2%$\3\2\2\2&\5\3\2\2"+
		"\2\'(\7\4\2\2(.\7\5\2\2)*\5\b\5\2*+\7\3\2\2+-\3\2\2\2,)\3\2\2\2-\60\3"+
		"\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\6\2\2\62\7"+
		"\3\2\2\2\63\64\7\7\2\2\648\5\26\f\2\65\66\7\b\2\2\66\67\7\t\2\2\679\7"+
		"\27\2\28\65\3\2\2\289\3\2\2\29\t\3\2\2\2:;\7\n\2\2;<\7\13\2\2<=\7\f\2"+
		"\2=>\7\t\2\2>E\7\31\2\2?@\7\r\2\2@A\7\t\2\2AB\7\27\2\2BC\7\16\2\2CD\7"+
		"\t\2\2DF\7\27\2\2E?\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\17\2\2HN\7\5\2\2I"+
		"J\5\f\7\2JK\7\3\2\2KM\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"OQ\3\2\2\2PN\3\2\2\2QR\7\6\2\2R\13\3\2\2\2SX\5\20\t\2TX\5\16\b\2UX\5\22"+
		"\n\2VX\5\24\13\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\r\3\2\2\2YZ"+
		"\7\20\2\2Z[\7\t\2\2[_\5\26\f\2\\]\7\16\2\2]^\7\t\2\2^`\7\27\2\2_\\\3\2"+
		"\2\2_`\3\2\2\2`\17\3\2\2\2ab\7\21\2\2bc\7\t\2\2cg\5\26\f\2de\7\22\2\2"+
		"ef\7\t\2\2fh\t\2\2\2gd\3\2\2\2gh\3\2\2\2h\21\3\2\2\2ij\7\23\2\2jk\7\t"+
		"\2\2ko\5\26\f\2lm\7\16\2\2mn\7\t\2\2np\7\27\2\2ol\3\2\2\2op\3\2\2\2pt"+
		"\3\2\2\2qr\7\22\2\2rs\7\t\2\2su\t\2\2\2tq\3\2\2\2tu\3\2\2\2u\23\3\2\2"+
		"\2vw\7\24\2\2wx\7\27\2\2x|\7\25\2\2y{\7\32\2\2zy\3\2\2\2{~\3\2\2\2|z\3"+
		"\2\2\2|}\3\2\2\2}\25\3\2\2\2~|\3\2\2\2\177\u0080\7\13\2\2\u0080\u0081"+
		"\7\30\2\2\u0081\u0082\7\26\2\2\u0082\u0083\7\30\2\2\u0083\u0084\7\17\2"+
		"\2\u0084\27\3\2\2\2\17\31\36%.8ENW_got|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}