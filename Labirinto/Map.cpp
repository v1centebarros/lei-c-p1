#include "Map.h"
#include "Execute.h"

Map::Map(string filename) {

    std::filebuf fb;
    fb.open(filename.c_str(), std::ios::in);
    if (!fb.is_open()){
        cout << "File not open";
        return;
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
        visitor0->setMap(this);
        visitor0->visit(tree);
    }
    fb.close();
}

bool Map::isWallAhead(float xx, float yy, float dir) {
    size_t x, y;
    x = xx - 800;
    y = yy - 395;
    if(dir > 135) {
        //virado para tras
        if(x - 1 < 0) {
            return true;
        }
        return mapa[y][x - 1];
    } else if(dir > 45) {
        //virado para cima
        if(y + 1 >= mapa.size()) {
            return true;
        }
        return mapa[y + 1][x];
    } else if(dir > -45) {
        //virado para a frente
        if(x + 1 >= mapa[0].size()) {
            return true;
        }
        return mapa[y][x + 1];
    } else if(dir > -135) {
        //virado para baixo
        if(y - 1 < 0) {
            return true;
        }
        return mapa[y - 1][x];
    } else {
        //virado para tras novamente
        if(x + 1 >= mapa[0].size()) {
            return true;
        }
        return mapa[y][x - 1];
    }
}

bool Map::isWallAtLeft(float xx, float yy, float dir) {
    size_t x, y;
    x = xx - 800;
    y = yy - 395;
    if(dir > 135) {
        //virado para tras
        if(y + 1 >= mapa.size()) {
            return true;
        } 
        return mapa[y][x - 1];
    } else if(dir > 45) {
        //virado para cima
        if(y - 1 < 0) {
            return true;
        }
        return mapa[y - 1][x];
    } else if(dir > -45) {
        //virado para a frente
        if(y - 1 < 0) {
            return true;
        } 
        return mapa[y][x + 1];
    } else if(dir > -135) {
        //virado para baixo
        if(x + 1 >= mapa[0].size()) {
            return true;
        }
        return mapa[y + 1][x];
    } else {
        //virado para tras novamente
        if(y + 1 >= mapa.size()) {
            return true;
        }
        return mapa[y][x - 1];
    }
}

bool Map::isWallAtRight(float xx, float yy, float dir) {
    size_t x, y;
    x = xx - 800;
    y = yy - 395;
    if(dir > 135) {
        //virado para tras
        if(y + 1 >= mapa.size()) {
            return true;
        } 
        return mapa[y][x + 1];
    } else if(dir > 45) {
        //virado para cima
        if(y - 1 < 0) {
            return true;
        }
        return mapa[y + 1][x];
    } else if(dir > -45) {
        //virado para a frente
        if(y - 1 < 0) {
            return true;
        } 
        return mapa[y][x - 1];
    } else if(dir > -135) {
        //virado para baixo
        if(x + 1 >= mapa[0].size()) {
            return true;
        }
        return mapa[y - 1][x];
    } else {
        //virado para tras novamente
        if(y + 1 >= mapa.size()) {
            return true;
        }
        return mapa[y][x + 1];
    }
}


void Map::addRow(vector<bool> row) {
    mapa.push_back(row);
}

Map::~Map()
{
}