// Generated from Lab.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, COORDENADAS=27, DOUBLE=28, ID=29, WS=30, LINE_COMMENT=31, 
		MULTILINE_COMMENT=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "COORDENADAS", "DOUBLE", "ID", "WS", "LINE_COMMENT", "MULTILINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'GRID'", "'{'", "'}'", "'POSITION'", "'DIRECAO'", "'='", 
			"'LABIRINTO'", "'('", "'NAME'", "','", "'WIDTH'", "'HEIGHT'", "')'", 
			"'TARGET'", "'Raio'", "'BEACON'", "'ROW'", "'x'", "'PADRAO'", "':'", 
			"'\"'", "'__.'", "'__|'", "'___'", "'--.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "COORDENADAS", "DOUBLE", "ID", "WS", "LINE_COMMENT", 
			"MULTILINE_COMMENT"
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


	public LabLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00f2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\6\35\u00bf\n\35\r\35\16\35\u00c0\3\35\3\35\6\35\u00c5\n\35"+
		"\r\35\16\35\u00c6\5\35\u00c9\n\35\3\36\3\36\7\36\u00cd\n\36\f\36\16\36"+
		"\u00d0\13\36\3\37\6\37\u00d3\n\37\r\37\16\37\u00d4\3\37\3\37\3 \3 \7 "+
		"\u00db\n \f \16 \u00de\13 \3 \5 \u00e1\n \3 \3 \3!\3!\3!\3!\7!\u00e9\n"+
		"!\f!\16!\u00ec\13!\3!\3!\3!\3!\3!\4\u00dc\u00ea\2\"\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\7\3\2\62"+
		";\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\3\3\f\f\2\u00f8\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7J\3\2\2\2\tL\3"+
		"\2\2\2\13N\3\2\2\2\rW\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23k\3\2\2\2\25m"+
		"\3\2\2\2\27r\3\2\2\2\31t\3\2\2\2\33z\3\2\2\2\35\u0081\3\2\2\2\37\u0083"+
		"\3\2\2\2!\u008a\3\2\2\2#\u008f\3\2\2\2%\u0096\3\2\2\2\'\u009a\3\2\2\2"+
		")\u009c\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61\u00ab"+
		"\3\2\2\2\63\u00af\3\2\2\2\65\u00b3\3\2\2\2\67\u00b7\3\2\2\29\u00be\3\2"+
		"\2\2;\u00ca\3\2\2\2=\u00d2\3\2\2\2?\u00d8\3\2\2\2A\u00e4\3\2\2\2CD\7="+
		"\2\2D\4\3\2\2\2EF\7I\2\2FG\7T\2\2GH\7K\2\2HI\7F\2\2I\6\3\2\2\2JK\7}\2"+
		"\2K\b\3\2\2\2LM\7\177\2\2M\n\3\2\2\2NO\7R\2\2OP\7Q\2\2PQ\7U\2\2QR\7K\2"+
		"\2RS\7V\2\2ST\7K\2\2TU\7Q\2\2UV\7P\2\2V\f\3\2\2\2WX\7F\2\2XY\7K\2\2YZ"+
		"\7T\2\2Z[\7G\2\2[\\\7E\2\2\\]\7C\2\2]^\7Q\2\2^\16\3\2\2\2_`\7?\2\2`\20"+
		"\3\2\2\2ab\7N\2\2bc\7C\2\2cd\7D\2\2de\7K\2\2ef\7T\2\2fg\7K\2\2gh\7P\2"+
		"\2hi\7V\2\2ij\7Q\2\2j\22\3\2\2\2kl\7*\2\2l\24\3\2\2\2mn\7P\2\2no\7C\2"+
		"\2op\7O\2\2pq\7G\2\2q\26\3\2\2\2rs\7.\2\2s\30\3\2\2\2tu\7Y\2\2uv\7K\2"+
		"\2vw\7F\2\2wx\7V\2\2xy\7J\2\2y\32\3\2\2\2z{\7J\2\2{|\7G\2\2|}\7K\2\2}"+
		"~\7I\2\2~\177\7J\2\2\177\u0080\7V\2\2\u0080\34\3\2\2\2\u0081\u0082\7+"+
		"\2\2\u0082\36\3\2\2\2\u0083\u0084\7V\2\2\u0084\u0085\7C\2\2\u0085\u0086"+
		"\7T\2\2\u0086\u0087\7I\2\2\u0087\u0088\7G\2\2\u0088\u0089\7V\2\2\u0089"+
		" \3\2\2\2\u008a\u008b\7T\2\2\u008b\u008c\7c\2\2\u008c\u008d\7k\2\2\u008d"+
		"\u008e\7q\2\2\u008e\"\3\2\2\2\u008f\u0090\7D\2\2\u0090\u0091\7G\2\2\u0091"+
		"\u0092\7C\2\2\u0092\u0093\7E\2\2\u0093\u0094\7Q\2\2\u0094\u0095\7P\2\2"+
		"\u0095$\3\2\2\2\u0096\u0097\7T\2\2\u0097\u0098\7Q\2\2\u0098\u0099\7Y\2"+
		"\2\u0099&\3\2\2\2\u009a\u009b\7z\2\2\u009b(\3\2\2\2\u009c\u009d\7R\2\2"+
		"\u009d\u009e\7C\2\2\u009e\u009f\7F\2\2\u009f\u00a0\7T\2\2\u00a0\u00a1"+
		"\7C\2\2\u00a1\u00a2\7Q\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7<\2\2\u00a4,\3"+
		"\2\2\2\u00a5\u00a6\7$\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7a\2\2\u00a8\u00a9"+
		"\7a\2\2\u00a9\u00aa\7\60\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7a\2\2\u00ac"+
		"\u00ad\7a\2\2\u00ad\u00ae\7~\2\2\u00ae\62\3\2\2\2\u00af\u00b0\7a\2\2\u00b0"+
		"\u00b1\7a\2\2\u00b1\u00b2\7a\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4"+
		"\u00b5\7/\2\2\u00b5\u00b6\7\60\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7*\2\2"+
		"\u00b8\u00b9\59\35\2\u00b9\u00ba\7.\2\2\u00ba\u00bb\59\35\2\u00bb\u00bc"+
		"\7+\2\2\u00bc8\3\2\2\2\u00bd\u00bf\t\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c8\3\2\2\2\u00c2"+
		"\u00c4\7\60\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3"+
		"\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c2\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9:\3\2\2\2\u00ca\u00ce\t\3\2\2"+
		"\u00cb\u00cd\t\4\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf<\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d3\t\5\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\37\2\2\u00d7"+
		">\3\2\2\2\u00d8\u00dc\7%\2\2\u00d9\u00db\13\2\2\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00de\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\t\6\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\b \2\2\u00e3@\3\2\2\2\u00e4\u00e5\7\61\2\2"+
		"\u00e5\u00e6\7,\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00e9\13\2\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7,\2\2\u00ee\u00ef\7\61"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b!\2\2\u00f1B\3\2\2\2\13\2\u00c0"+
		"\u00c6\u00c8\u00ce\u00d4\u00dc\u00e0\u00ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}