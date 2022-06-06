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
		T__17=18, T__18=19, COORDENADAS=20, INT=21, DOUBLE=22, ID=23, PADRAO=24, 
		WS=25, LINE_COMMENT=26, MULTILINE_COMMENT=27;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_grid = 2, RULE_position = 3, RULE_labirinto = 4, 
		RULE_dados = 5, RULE_beacon = 6, RULE_target = 7, RULE_spot = 8, RULE_row = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "grid", "position", "labirinto", "dados", "beacon", 
			"target", "spot", "row"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'GRID'", "'{'", "'}'", "'POSITION'", "'DIRECTION'", "'='", 
			"'LABIRINTO'", "'('", "'NAME'", "'WIDTH'", "'HEIGHT'", "')'", "'BEACON'", 
			"'TARGET'", "'RADIUS'", "'SPOT'", "'ROW'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "COORDENADAS", "INT", 
			"DOUBLE", "ID", "PADRAO", "WS", "LINE_COMMENT", "MULTILINE_COMMENT"
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
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7))) != 0)) {
				{
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==T__7) {
					{
					setState(20);
					stat();
					}
				}

				setState(23);
				match(T__0);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				grid();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
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
			setState(35);
			match(T__1);
			setState(36);
			match(T__2);
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				position();
				setState(38);
				match(T__0);
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(44);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__4);
			setState(47);
			match(COORDENADAS);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(48);
				match(T__5);
				setState(49);
				match(T__6);
				setState(50);
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
		public List<DadosContext> dados() {
			return getRuleContexts(DadosContext.class);
		}
		public DadosContext dados(int i) {
			return getRuleContext(DadosContext.class,i);
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
			setState(53);
			match(T__7);
			setState(54);
			match(T__8);
			setState(55);
			match(T__9);
			setState(56);
			match(T__6);
			setState(57);
			match(ID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(58);
				match(T__10);
				setState(59);
				match(T__6);
				setState(60);
				match(INT);
				setState(61);
				match(T__11);
				setState(62);
				match(T__6);
				setState(63);
				match(INT);
				}
			}

			setState(66);
			match(T__12);
			setState(67);
			match(T__2);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(68);
				dados();
				setState(69);
				match(T__0);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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

	public static class DadosContext extends ParserRuleContext {
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
		public DadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dados; }
	}

	public final DadosContext dados() throws RecognitionException {
		DadosContext _localctx = new DadosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dados);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				target();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				beacon();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				spot();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
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
			setState(84);
			match(T__13);
			setState(85);
			match(T__6);
			setState(86);
			match(COORDENADAS);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(87);
				match(T__11);
				setState(88);
				match(T__6);
				setState(89);
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
		public TerminalNode COORDENADAS() { return getToken(LabParser.COORDENADAS, 0); }
		public TerminalNode DOUBLE() { return getToken(LabParser.DOUBLE, 0); }
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
			setState(92);
			match(T__14);
			setState(93);
			match(T__6);
			setState(94);
			match(COORDENADAS);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(95);
				match(T__15);
				setState(96);
				match(T__6);
				setState(97);
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
		enterRule(_localctx, 16, RULE_spot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__16);
			setState(101);
			match(T__6);
			setState(102);
			match(COORDENADAS);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(103);
				match(T__11);
				setState(104);
				match(T__6);
				setState(105);
				match(INT);
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(108);
				match(T__15);
				setState(109);
				match(T__6);
				setState(110);
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
		enterRule(_localctx, 18, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__17);
			setState(114);
			match(INT);
			setState(115);
			match(T__18);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PADRAO) {
				{
				{
				setState(116);
				match(PADRAO);
				}
				}
				setState(121);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\5\2\30\n\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\5\3$\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\6\4+\n\4\r\4\16\4,\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\66\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6C\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7U\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\te\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\nm\n\n\3\n\3\n\3\n\5\nr\n\n\3\13\3\13\3\13\3\13"+
		"\7\13x\n\13\f\13\16\13{\13\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2"+
		"\u0081\2\34\3\2\2\2\4#\3\2\2\2\6%\3\2\2\2\b\60\3\2\2\2\n\67\3\2\2\2\f"+
		"T\3\2\2\2\16V\3\2\2\2\20^\3\2\2\2\22f\3\2\2\2\24s\3\2\2\2\26\30\5\4\3"+
		"\2\27\26\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\33\7\3\2\2\32\27\3\2\2"+
		"\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2"+
		"\2\37 \7\2\2\3 \3\3\2\2\2!$\5\6\4\2\"$\5\n\6\2#!\3\2\2\2#\"\3\2\2\2$\5"+
		"\3\2\2\2%&\7\4\2\2&*\7\5\2\2\'(\5\b\5\2()\7\3\2\2)+\3\2\2\2*\'\3\2\2\2"+
		"+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\6\2\2/\7\3\2\2\2\60\61\7"+
		"\7\2\2\61\65\7\26\2\2\62\63\7\b\2\2\63\64\7\t\2\2\64\66\7\27\2\2\65\62"+
		"\3\2\2\2\65\66\3\2\2\2\66\t\3\2\2\2\678\7\n\2\289\7\13\2\29:\7\f\2\2:"+
		";\7\t\2\2;B\7\31\2\2<=\7\r\2\2=>\7\t\2\2>?\7\27\2\2?@\7\16\2\2@A\7\t\2"+
		"\2AC\7\27\2\2B<\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\17\2\2EK\7\5\2\2FG\5\f"+
		"\7\2GH\7\3\2\2HJ\3\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2"+
		"\2\2MK\3\2\2\2NO\7\6\2\2O\13\3\2\2\2PU\5\20\t\2QU\5\16\b\2RU\5\22\n\2"+
		"SU\5\24\13\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\r\3\2\2\2VW\7\20"+
		"\2\2WX\7\t\2\2X\\\7\26\2\2YZ\7\16\2\2Z[\7\t\2\2[]\7\27\2\2\\Y\3\2\2\2"+
		"\\]\3\2\2\2]\17\3\2\2\2^_\7\21\2\2_`\7\t\2\2`d\7\26\2\2ab\7\22\2\2bc\7"+
		"\t\2\2ce\7\30\2\2da\3\2\2\2de\3\2\2\2e\21\3\2\2\2fg\7\23\2\2gh\7\t\2\2"+
		"hl\7\26\2\2ij\7\16\2\2jk\7\t\2\2km\7\27\2\2li\3\2\2\2lm\3\2\2\2mq\3\2"+
		"\2\2no\7\22\2\2op\7\t\2\2pr\7\30\2\2qn\3\2\2\2qr\3\2\2\2r\23\3\2\2\2s"+
		"t\7\24\2\2tu\7\27\2\2uy\7\25\2\2vx\7\32\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z\25\3\2\2\2{y\3\2\2\2\17\27\34#,\65BKT\\dlqy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}