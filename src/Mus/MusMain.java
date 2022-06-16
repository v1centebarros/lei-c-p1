import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MusMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(System.in);
         // create a lexer that feeds off of input CharStream:
         MusLexer lexer = new MusLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         MusParser parser = new MusParser(tokens);
         // replace error listener:
         // parser.removeErrorListeners(); // remove ConsoleErrorListener
         // parser.addErrorListener(new ParseErrorListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            //SemanticAnalyser semanticAnalyser = new SemanticAnalyser();
            //semanticAnalyser.visit(tree);
            CodeGenerator codeGenerator = new CodeGenerator();
            codeGenerator.visit(tree);
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
