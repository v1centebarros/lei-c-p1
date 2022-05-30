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
		T__17=18, T__18=19, COORDENADAS=20, DOUBLE=21, ID=22, WS=23, LINE_COMMENT=24, 
		MULTILINE_COMMENT=25;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_grid = 2, RULE_position = 3, RULE_labirinto = 4, 
		RULE_target = 5, RULE_beacon = 6, RULE_wall = 7, RULE_corner = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "grid", "position", "labirinto", "target", "beacon", 
			"wall", "corner"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'GRID'", "'{'", "'}'", "'POSITION'", "'DIRECAO'", "'='", 
			"'LABIRINTO'", "'('", "'NAME'", "','", "'WIDTH'", "'HEIGHT'", "')'", 
			"'TARGET'", "'Raio'", "'BEACON'", "'WALL'", "'CORNER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "COORDENADAS", "DOUBLE", 
			"ID", "WS", "LINE_COMMENT", "MULTILINE_COMMENT"
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
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				position();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(40);
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
		public TerminalNode DOUBLE() { return getToken(LabParser.DOUBLE, 0); }
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
			setState(42);
			match(T__4);
			setState(43);
			match(COORDENADAS);
			setState(44);
			match(T__5);
			setState(45);
			match(T__6);
			setState(46);
			match(DOUBLE);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(47);
				match(T__0);
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
		public List<TerminalNode> DOUBLE() { return getTokens(LabParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(LabParser.DOUBLE, i);
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
		public List<WallContext> wall() {
			return getRuleContexts(WallContext.class);
		}
		public WallContext wall(int i) {
			return getRuleContext(WallContext.class,i);
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
				match(DOUBLE);
				setState(59);
				match(T__10);
				setState(60);
				match(T__12);
				setState(61);
				match(T__6);
				setState(62);
				match(DOUBLE);
				}
			}

			setState(65);
			match(T__13);
			setState(66);
			match(T__2);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(67);
				target();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(73);
				beacon();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(79);
				wall();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
			setState(87);
			match(T__14);
			setState(88);
			match(T__6);
			setState(89);
			match(COORDENADAS);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(90);
				match(T__10);
				setState(91);
				match(T__15);
				setState(92);
				match(T__6);
				setState(93);
				match(DOUBLE);
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(96);
				match(T__0);
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
		public TerminalNode DOUBLE() { return getToken(LabParser.DOUBLE, 0); }
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
			setState(99);
			match(T__16);
			setState(100);
			match(T__6);
			setState(101);
			match(COORDENADAS);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(102);
				match(T__10);
				setState(103);
				match(T__12);
				setState(104);
				match(T__6);
				setState(105);
				match(DOUBLE);
				}
			}

			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(108);
				match(T__0);
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

	public static class WallContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(LabParser.DOUBLE, 0); }
		public List<CornerContext> corner() {
			return getRuleContexts(CornerContext.class);
		}
		public CornerContext corner(int i) {
			return getRuleContext(CornerContext.class,i);
		}
		public WallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wall; }
	}

	public final WallContext wall() throws RecognitionException {
		WallContext _localctx = new WallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_wall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__17);
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
				match(DOUBLE);
				}
			}

			setState(117);
			match(T__2);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(118);
				corner();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__3);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(125);
				match(T__0);
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

	public static class CornerContext extends ParserRuleContext {
		public TerminalNode COORDENADAS() { return getToken(LabParser.COORDENADAS, 0); }
		public CornerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corner; }
	}

	public final CornerContext corner() throws RecognitionException {
		CornerContext _localctx = new CornerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_corner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__18);
			setState(129);
			match(COORDENADAS);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(130);
				match(T__0);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5"+
		"\2\26\n\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\3\3\3\5\3\"\n\3\3"+
		"\4\3\4\3\4\6\4\'\n\4\r\4\16\4(\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\6"+
		"\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\7\6S"+
		"\n\6\f\6\16\6V\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\7\5"+
		"\7d\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\b\5\bp\n\b\3\t\3\t\3\t"+
		"\3\t\5\tv\n\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\5\t\u0081\n\t\3"+
		"\n\3\n\3\n\5\n\u0086\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2\u008f\2"+
		"\32\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b,\3\2\2\2\n\64\3\2\2\2\fY\3\2\2\2\16"+
		"e\3\2\2\2\20q\3\2\2\2\22\u0082\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\25"+
		"\26\3\2\2\2\26\27\3\2\2\2\27\31\7\3\2\2\30\25\3\2\2\2\31\34\3\2\2\2\32"+
		"\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35\36\7\2\2\3\36"+
		"\3\3\2\2\2\37\"\5\6\4\2 \"\5\n\6\2!\37\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#"+
		"$\7\4\2\2$&\7\5\2\2%\'\5\b\5\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2"+
		"\2)*\3\2\2\2*+\7\6\2\2+\7\3\2\2\2,-\7\7\2\2-.\7\26\2\2./\7\b\2\2/\60\7"+
		"\t\2\2\60\62\7\27\2\2\61\63\7\3\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\t\3"+
		"\2\2\2\64\65\7\n\2\2\65\66\7\13\2\2\66\67\7\f\2\2\678\7\t\2\28A\7\30\2"+
		"\29:\7\r\2\2:;\7\16\2\2;<\7\t\2\2<=\7\27\2\2=>\7\r\2\2>?\7\17\2\2?@\7"+
		"\t\2\2@B\7\27\2\2A9\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\20\2\2DH\7\5\2\2E"+
		"G\5\f\7\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IN\3\2\2\2JH\3\2\2\2"+
		"KM\5\16\b\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OT\3\2\2\2PN\3\2\2"+
		"\2QS\5\20\t\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2"+
		"\2\2WX\7\6\2\2X\13\3\2\2\2YZ\7\21\2\2Z[\7\t\2\2[`\7\26\2\2\\]\7\r\2\2"+
		"]^\7\22\2\2^_\7\t\2\2_a\7\27\2\2`\\\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\7\3"+
		"\2\2cb\3\2\2\2cd\3\2\2\2d\r\3\2\2\2ef\7\23\2\2fg\7\t\2\2gl\7\26\2\2hi"+
		"\7\r\2\2ij\7\17\2\2jk\7\t\2\2km\7\27\2\2lh\3\2\2\2lm\3\2\2\2mo\3\2\2\2"+
		"np\7\3\2\2on\3\2\2\2op\3\2\2\2p\17\3\2\2\2qu\7\24\2\2rs\7\17\2\2st\7\t"+
		"\2\2tv\7\27\2\2ur\3\2\2\2uv\3\2\2\2vw\3\2\2\2w{\7\5\2\2xz\5\22\n\2yx\3"+
		"\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0080\7\6\2"+
		"\2\177\u0081\7\3\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\21\3"+
		"\2\2\2\u0082\u0083\7\25\2\2\u0083\u0085\7\26\2\2\u0084\u0086\7\3\2\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\23\3\2\2\2\23\25\32!(\62AHNT"+
		"`clou{\u0080\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}