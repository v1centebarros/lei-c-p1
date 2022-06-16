#include <iostream>
#include <antlr4-runtime.h>
#include "LabLexer.h"
#include "LabParser.h"
#include "Execute.h"

#include <fstream>

using namespace std;
using namespace antlr4;
using namespace antlr4::tree;

int main(int argc, const char* argv[]) {
   
   std::filebuf fb;
   fb.open("teste.lab", std::ios::in);
   if (!fb.is_open()){
      cout << "File not open\n";
      return -1;
   }

   std::istream stream(&fb);
   // create a ANTLRInputStream that reads from standard input:
   ANTLRInputStream* input;
   //stream = &cin;
   

   input = new ANTLRInputStream(stream);
   // create a lexer that feeds off of input ANTLRInputStream:
   LabLexer* lexer = new LabLexer(input);
   // create a buffer of tokens pulled from the lexer:
   CommonTokenStream* tokens = new CommonTokenStream(lexer);
   // create a parser that feeds off the tokens buffer:
   LabParser* parser = new LabParser(tokens);
   // replace error listener:
   //parser->removeErrorListeners(); // remove ConsoleErrorListener
   //parser->addErrorListener(new ErrorHandlingListener());
   // begin parsing at program rule:
   ParseTree* tree = parser->program();
   if (parser->getNumberOfSyntaxErrors() == 0) {
      // print LISP-style tree:
      // cout << tree->toStringTree(parser) << endl;
      Execute* visitor0 = new Execute();
      visitor0->visit(tree);
   }else{
      cout<<">> ERROS SINTÁTICOS\n\n";
   }

   fb.close();
   return 0;
}
