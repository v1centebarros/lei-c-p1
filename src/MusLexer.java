// Generated from Mus.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, LOGICALOP2=20, LOGICALOP1=21, TYPE=22, NUM=23, BOOL=24, 
		TEXT=25, ID=26, WS=27, COMMENT_INLINE=28, COMMENT_MULTILINE=29;
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
			"T__17", "T__18", "LOGICALOP2", "LOGICALOP1", "TYPE", "NUM", "BOOL", 
			"TEXT", "ID", "WS", "COMMENT_INLINE", "COMMENT_MULTILINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'do'", "'end'", "'while'", "'until'", "';'", "'else'", 
			"'='", "'('", "','", "')'", "'|'", "'not'", "'-'", "'*'", "'/'", "'%'", 
			"'+'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "LOGICALOP2", "LOGICALOP1", 
			"TYPE", "NUM", "BOOL", "TEXT", "ID", "WS", "COMMENT_INLINE", "COMMENT_MULTILINE"
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


	public MusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mus.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00f5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0080\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0091\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u00a7\n\27\3\30\5\30\u00aa\n\30\3\30\6\30\u00ad\n\30\r\30\16\30\u00ae"+
		"\3\30\3\30\6\30\u00b3\n\30\r\30\16\30\u00b4\5\30\u00b7\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00c2\n\31\3\32\3\32\3\32\3\32"+
		"\7\32\u00c8\n\32\f\32\16\32\u00cb\13\32\3\32\3\32\3\33\3\33\7\33\u00d1"+
		"\n\33\f\33\16\33\u00d4\13\33\3\34\6\34\u00d7\n\34\r\34\16\34\u00d8\3\34"+
		"\3\34\3\35\3\35\7\35\u00df\n\35\f\35\16\35\u00e2\13\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\7\36\u00ec\n\36\f\36\16\36\u00ef\13\36\3\36"+
		"\3\36\3\36\3\36\3\36\4\u00e0\u00ed\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\t\3\2\62;\4\2VVvv\4\2HHh"+
		"h\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u010f\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3"+
		"\2\2\2\5@\3\2\2\2\7C\3\2\2\2\tG\3\2\2\2\13M\3\2\2\2\rS\3\2\2\2\17U\3\2"+
		"\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31b\3\2\2\2\33d"+
		"\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#n\3\2\2\2%p\3\2\2\2\'r\3\2"+
		"\2\2)\177\3\2\2\2+\u0090\3\2\2\2-\u00a6\3\2\2\2/\u00a9\3\2\2\2\61\u00c1"+
		"\3\2\2\2\63\u00c3\3\2\2\2\65\u00ce\3\2\2\2\67\u00d6\3\2\2\29\u00dc\3\2"+
		"\2\2;\u00e7\3\2\2\2=>\7k\2\2>?\7h\2\2?\4\3\2\2\2@A\7f\2\2AB\7q\2\2B\6"+
		"\3\2\2\2CD\7g\2\2DE\7p\2\2EF\7f\2\2F\b\3\2\2\2GH\7y\2\2HI\7j\2\2IJ\7k"+
		"\2\2JK\7n\2\2KL\7g\2\2L\n\3\2\2\2MN\7w\2\2NO\7p\2\2OP\7v\2\2PQ\7k\2\2"+
		"QR\7n\2\2R\f\3\2\2\2ST\7=\2\2T\16\3\2\2\2UV\7g\2\2VW\7n\2\2WX\7u\2\2X"+
		"Y\7g\2\2Y\20\3\2\2\2Z[\7?\2\2[\22\3\2\2\2\\]\7*\2\2]\24\3\2\2\2^_\7.\2"+
		"\2_\26\3\2\2\2`a\7+\2\2a\30\3\2\2\2bc\7~\2\2c\32\3\2\2\2de\7p\2\2ef\7"+
		"q\2\2fg\7v\2\2g\34\3\2\2\2hi\7/\2\2i\36\3\2\2\2jk\7,\2\2k \3\2\2\2lm\7"+
		"\61\2\2m\"\3\2\2\2no\7\'\2\2o$\3\2\2\2pq\7-\2\2q&\3\2\2\2rs\7\60\2\2s"+
		"(\3\2\2\2tu\7c\2\2uv\7p\2\2v\u0080\7f\2\2wx\7q\2\2x\u0080\7t\2\2y\u0080"+
		"\7@\2\2z{\7@\2\2{\u0080\7?\2\2|\u0080\7>\2\2}~\7>\2\2~\u0080\7?\2\2\177"+
		"t\3\2\2\2\177w\3\2\2\2\177y\3\2\2\2\177z\3\2\2\2\177|\3\2\2\2\177}\3\2"+
		"\2\2\u0080*\3\2\2\2\u0081\u0082\7c\2\2\u0082\u0083\7p\2\2\u0083\u0091"+
		"\7f\2\2\u0084\u0085\7q\2\2\u0085\u0091\7t\2\2\u0086\u0091\7@\2\2\u0087"+
		"\u0088\7@\2\2\u0088\u0091\7?\2\2\u0089\u0091\7>\2\2\u008a\u008b\7>\2\2"+
		"\u008b\u0091\7?\2\2\u008c\u008d\7?\2\2\u008d\u0091\7?\2\2\u008e\u008f"+
		"\7#\2\2\u008f\u0091\7?\2\2\u0090\u0081\3\2\2\2\u0090\u0084\3\2\2\2\u0090"+
		"\u0086\3\2\2\2\u0090\u0087\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2"+
		"\2\2\u0090\u008c\3\2\2\2\u0090\u008e\3\2\2\2\u0091,\3\2\2\2\u0092\u0093"+
		"\7P\2\2\u0093\u0094\7W\2\2\u0094\u00a7\7O\2\2\u0095\u0096\7D\2\2\u0096"+
		"\u0097\7Q\2\2\u0097\u0098\7Q\2\2\u0098\u00a7\7N\2\2\u0099\u009a\7V\2\2"+
		"\u009a\u009b\7G\2\2\u009b\u009c\7Z\2\2\u009c\u00a7\7V\2\2\u009d\u009e"+
		"\7G\2\2\u009e\u009f\7P\2\2\u009f\u00a0\7W\2\2\u00a0\u00a7\7O\2\2\u00a1"+
		"\u00a2\7T\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7D\2\2\u00a4\u00a5\7Q\2\2"+
		"\u00a5\u00a7\7V\2\2\u00a6\u0092\3\2\2\2\u00a6\u0095\3\2\2\2\u00a6\u0099"+
		"\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7.\3\2\2\2\u00a8"+
		"\u00aa\7/\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00ad\t\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b6\3\2\2\2\u00b0\u00b2\7\60"+
		"\2\2\u00b1\u00b3\t\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b0\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\60\3\2\2\2\u00b8\u00b9\t\3\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\u00bb\7w\2\2\u00bb\u00c2\7g\2\2\u00bc\u00bd\t\4\2\2\u00bd"+
		"\u00be\7c\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c2\7g\2\2"+
		"\u00c1\u00b8\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\62\3\2\2\2\u00c3\u00c9"+
		"\7$\2\2\u00c4\u00c8\n\5\2\2\u00c5\u00c6\7$\2\2\u00c6\u00c8\7$\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7$\2\2\u00cd\64\3\2\2\2\u00ce\u00d2\t\6\2\2\u00cf\u00d1\t\7\2\2"+
		"\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\66\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\t\b\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b\34\2\2\u00db8\3\2\2\2\u00dc\u00e0"+
		"\7%\2\2\u00dd\u00df\13\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e4\7\f\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\35\2\2\u00e6"+
		":\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9\7,\2\2\u00e9\u00ed\3\2\2\2"+
		"\u00ea\u00ec\13\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f1\7,\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\36"+
		"\2\2\u00f4<\3\2\2\2\21\2\177\u0090\u00a6\u00a9\u00ae\u00b4\u00b6\u00c1"+
		"\u00c7\u00c9\u00d2\u00d8\u00e0\u00ed\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}