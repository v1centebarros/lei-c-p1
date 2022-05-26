// Generated from /home/rafael/Documentos/LEI/C/P/Projeto Final/comp2022-mus-p3g3/src/Mus.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, NUM=14, BOOL=15, TEXT=16, UPPERCASE=17, 
		VAR=18, WS=19, COMMENT_INLINE=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "NUM", "BOOL", "TEXT", "UPPERCASE", 
			"VAR", "WS", "COMMENT_INLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "'|'", "','", "'.'", "'()'", "'NUM'", 
			"'BOOL'", "'TEXT'", "'ENUM'", "'ROBOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NUM", "BOOL", "TEXT", "UPPERCASE", "VAR", "WS", "COMMENT_INLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\6\17W\n\17\r\17\16\17X\3\17\3\17\6\17]\n\17\r\17\16\17^\5\17"+
		"a\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20l\n\20\3\21\3"+
		"\21\3\21\3\21\7\21r\n\21\f\21\16\21u\13\21\3\21\3\21\3\22\6\22z\n\22\r"+
		"\22\16\22{\3\23\6\23\177\n\23\r\23\16\23\u0080\3\24\6\24\u0084\n\24\r"+
		"\24\16\24\u0085\3\24\3\24\3\25\3\25\7\25\u008c\n\25\f\25\16\25\u008f\13"+
		"\25\3\25\3\25\3\25\3\25\3\u008d\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\t"+
		"\3\2\62;\4\2VVvv\4\2HHhh\3\2$$\3\2C\\\5\2C\\aac|\5\2\13\f\17\17\"\"\2"+
		"\u009d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7"+
		"/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3"+
		"\2\2\2\23<\3\2\2\2\25@\3\2\2\2\27E\3\2\2\2\31J\3\2\2\2\33O\3\2\2\2\35"+
		"V\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#y\3\2\2\2%~\3\2\2\2\'\u0083\3\2\2\2)\u0089"+
		"\3\2\2\2+,\7?\2\2,\4\3\2\2\2-.\7=\2\2.\6\3\2\2\2/\60\7*\2\2\60\b\3\2\2"+
		"\2\61\62\7+\2\2\62\n\3\2\2\2\63\64\7~\2\2\64\f\3\2\2\2\65\66\7.\2\2\66"+
		"\16\3\2\2\2\678\7\60\2\28\20\3\2\2\29:\7*\2\2:;\7+\2\2;\22\3\2\2\2<=\7"+
		"P\2\2=>\7W\2\2>?\7O\2\2?\24\3\2\2\2@A\7D\2\2AB\7Q\2\2BC\7Q\2\2CD\7N\2"+
		"\2D\26\3\2\2\2EF\7V\2\2FG\7G\2\2GH\7Z\2\2HI\7V\2\2I\30\3\2\2\2JK\7G\2"+
		"\2KL\7P\2\2LM\7W\2\2MN\7O\2\2N\32\3\2\2\2OP\7T\2\2PQ\7Q\2\2QR\7D\2\2R"+
		"S\7Q\2\2ST\7V\2\2T\34\3\2\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y`\3\2\2\2Z\\\7\60\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_a\3\2\2\2`Z\3\2\2\2`a\3\2\2\2a\36\3\2\2\2bc\t\3\2\2cd\7"+
		"t\2\2de\7w\2\2el\7g\2\2fg\t\4\2\2gh\7c\2\2hi\7n\2\2ij\7u\2\2jl\7g\2\2"+
		"kb\3\2\2\2kf\3\2\2\2l \3\2\2\2ms\7$\2\2nr\n\5\2\2op\7$\2\2pr\7$\2\2qn"+
		"\3\2\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2v"+
		"w\7$\2\2w\"\3\2\2\2xz\t\6\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2"+
		"|$\3\2\2\2}\177\t\7\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081&\3\2\2\2\u0082\u0084\t\b\2\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\b\24\2\2\u0088(\3\2\2\2\u0089\u008d\7%\2\2\u008a"+
		"\u008c\13\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\f\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\25\2\2\u0093*\3\2\2\2"+
		"\r\2X^`kqs{\u0080\u0085\u008d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}