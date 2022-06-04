// Generated from /home/mariana/UNIVERSIDADE/C/Projeto/comp2022-mus-p3g3/Labirinto/Lab.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, COORDENADAS=20, INT=21, DOUBLE=22, ID=23, PADRAO=24, 
		WS=25, LINE_COMMENT=26, MULTILINE_COMMENT=27;
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
			"T__17", "T__18", "COORDENADAS", "INT", "DOUBLE", "ID", "PADRAO", "WS", 
			"LINE_COMMENT", "MULTILINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'GRID'", "'{'", "'}'", "'POSITION'", "'DIRECTION'", "'='", 
			"'LABIRINTO'", "'('", "'NAME'", "'WIDTH'", "'HEIGHT'", "')'", "'TARGET'", 
			"'RADIUS'", "'BEACON'", "'SPOT'", "'ROW'", "':'"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00e3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\6\26\u00a1\n\26\r\26\16\26\u00a2\3\27\6\27\u00a6\n\27\r\27\16\27"+
		"\u00a7\3\27\3\27\7\27\u00ac\n\27\f\27\16\27\u00af\13\27\3\30\3\30\7\30"+
		"\u00b3\n\30\f\30\16\30\u00b6\13\30\3\31\3\31\3\31\3\31\7\31\u00bc\n\31"+
		"\f\31\16\31\u00bf\13\31\3\31\3\31\3\32\6\32\u00c4\n\32\r\32\16\32\u00c5"+
		"\3\32\3\32\3\33\3\33\7\33\u00cc\n\33\f\33\16\33\u00cf\13\33\3\33\5\33"+
		"\u00d2\n\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00da\n\34\f\34\16\34\u00dd"+
		"\13\34\3\34\3\34\3\34\3\34\3\34\4\u00cd\u00db\2\35\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\b\3\2\62;\5\2C\\aac|\6"+
		"\2\62;C\\aac|\5\2\"\"\60\60~~\5\2\13\f\17\17\"\"\3\3\f\f\2\u00eb\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2"+
		"\7@\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rM\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2"+
		"\23c\3\2\2\2\25e\3\2\2\2\27j\3\2\2\2\31p\3\2\2\2\33w\3\2\2\2\35y\3\2\2"+
		"\2\37\u0080\3\2\2\2!\u0087\3\2\2\2#\u008e\3\2\2\2%\u0093\3\2\2\2\'\u0097"+
		"\3\2\2\2)\u0099\3\2\2\2+\u00a0\3\2\2\2-\u00a5\3\2\2\2/\u00b0\3\2\2\2\61"+
		"\u00b7\3\2\2\2\63\u00c3\3\2\2\2\65\u00c9\3\2\2\2\67\u00d5\3\2\2\29:\7"+
		"=\2\2:\4\3\2\2\2;<\7I\2\2<=\7T\2\2=>\7K\2\2>?\7F\2\2?\6\3\2\2\2@A\7}\2"+
		"\2A\b\3\2\2\2BC\7\177\2\2C\n\3\2\2\2DE\7R\2\2EF\7Q\2\2FG\7U\2\2GH\7K\2"+
		"\2HI\7V\2\2IJ\7K\2\2JK\7Q\2\2KL\7P\2\2L\f\3\2\2\2MN\7F\2\2NO\7K\2\2OP"+
		"\7T\2\2PQ\7G\2\2QR\7E\2\2RS\7V\2\2ST\7K\2\2TU\7Q\2\2UV\7P\2\2V\16\3\2"+
		"\2\2WX\7?\2\2X\20\3\2\2\2YZ\7N\2\2Z[\7C\2\2[\\\7D\2\2\\]\7K\2\2]^\7T\2"+
		"\2^_\7K\2\2_`\7P\2\2`a\7V\2\2ab\7Q\2\2b\22\3\2\2\2cd\7*\2\2d\24\3\2\2"+
		"\2ef\7P\2\2fg\7C\2\2gh\7O\2\2hi\7G\2\2i\26\3\2\2\2jk\7Y\2\2kl\7K\2\2l"+
		"m\7F\2\2mn\7V\2\2no\7J\2\2o\30\3\2\2\2pq\7J\2\2qr\7G\2\2rs\7K\2\2st\7"+
		"I\2\2tu\7J\2\2uv\7V\2\2v\32\3\2\2\2wx\7+\2\2x\34\3\2\2\2yz\7V\2\2z{\7"+
		"C\2\2{|\7T\2\2|}\7I\2\2}~\7G\2\2~\177\7V\2\2\177\36\3\2\2\2\u0080\u0081"+
		"\7T\2\2\u0081\u0082\7C\2\2\u0082\u0083\7F\2\2\u0083\u0084\7K\2\2\u0084"+
		"\u0085\7W\2\2\u0085\u0086\7U\2\2\u0086 \3\2\2\2\u0087\u0088\7D\2\2\u0088"+
		"\u0089\7G\2\2\u0089\u008a\7C\2\2\u008a\u008b\7E\2\2\u008b\u008c\7Q\2\2"+
		"\u008c\u008d\7P\2\2\u008d\"\3\2\2\2\u008e\u008f\7U\2\2\u008f\u0090\7R"+
		"\2\2\u0090\u0091\7Q\2\2\u0091\u0092\7V\2\2\u0092$\3\2\2\2\u0093\u0094"+
		"\7T\2\2\u0094\u0095\7Q\2\2\u0095\u0096\7Y\2\2\u0096&\3\2\2\2\u0097\u0098"+
		"\7<\2\2\u0098(\3\2\2\2\u0099\u009a\7*\2\2\u009a\u009b\5-\27\2\u009b\u009c"+
		"\7.\2\2\u009c\u009d\5-\27\2\u009d\u009e\7+\2\2\u009e*\3\2\2\2\u009f\u00a1"+
		"\t\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3,\3\2\2\2\u00a4\u00a6\t\2\2\2\u00a5\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ad\7\60\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2"+
		"\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae.\3"+
		"\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b4\t\3\2\2\u00b1\u00b3\t\4\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\60\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00bd\7$\2\2\u00b8\u00bc"+
		"\t\5\2\2\u00b9\u00ba\7/\2\2\u00ba\u00bc\7/\2\2\u00bb\u00b8\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7$\2\2\u00c1"+
		"\62\3\2\2\2\u00c2\u00c4\t\6\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2"+
		"\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\b\32\2\2\u00c8\64\3\2\2\2\u00c9\u00cd\7%\2\2\u00ca\u00cc\13\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\t\7\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\33\2\2\u00d4\66\3\2\2"+
		"\2\u00d5\u00d6\7\61\2\2\u00d6\u00d7\7,\2\2\u00d7\u00db\3\2\2\2\u00d8\u00da"+
		"\13\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df"+
		"\7,\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\34\2\2"+
		"\u00e28\3\2\2\2\r\2\u00a2\u00a7\u00ad\u00b4\u00bb\u00bd\u00c5\u00cd\u00d1"+
		"\u00db\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}