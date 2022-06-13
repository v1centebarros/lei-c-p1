#include "Execute.h"

using std::vector;
using std::string;

// -- guardar keywords
string keyWords[] = {"GRID", "LABIRINTO", "POS" , "DIRECTION", "NAME",
                        "WIDTH", "HEIGHT", "BEACON", "TARGET", "RADIUS" ,
                        "SPOT" , "ROW"};

int HeightMap;
int WidthMap;
// Execute::Execute(Map* map) {
//    //this->map = map;
//    std::cout << ST;
// }

void Execute::setMap(Map* m) {
   this->map = m;
}

Execute::~Execute() {
   std::cout << "ola2";
}

int Execute::writeToFile() {
   std::ofstream fileout;
   fileout.open("destino.xml");
   fileout << ST;
   std::cout << "Escrevi no ficheiro: \n" << ST;
   fileout.close();
   return 0;
}

antlrcpp::Any Execute::visitProgram(LabParser::ProgramContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   res = visitChildren(ctx);
   writeToFile();
   return res;
}

antlrcpp::Any Execute::visitStat(LabParser::StatContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   return visitChildren(ctx);
   //return res;
}

antlrcpp::Any Execute::visitGrid(LabParser::GridContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;

   ST.append("<Grid>\n");
   res = visitChildren(ctx);
   ST.append("</Grid>\n\n");

   return res;
}

antlrcpp::Any Execute::visitPosition(LabParser::PositionContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   
   int dir;
   if(ctx->INT()!=nullptr){
      //std::cout << "DIR= " << ctx->INT()->getText();
      dir = std::stoi(ctx->INT()->getText())%360;
      if(dir < 0){
         std::cout << "[Line "<< ctx->start->getLine() << "] NameError: Direção não pode ser negativa";
         return "ERROR";
      }
   }else{
      dir = 180;
   }
   
   //colocar position no ficheiro
   ST.append("\t<Position");
   res = visitChildren(ctx);
   ST.append(" DIR=\"");   ST.append(std::to_string(dir));
   ST.append("\"");
   ST.append(">\n");
   return res;
}

antlrcpp::Any Execute::visitLabirinto(LabParser::LabirintoContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;

   int Width = std::stoi(ctx->INT(0)->getText());
   if (Width <= 0){
      std::cout << "[Line "<< ctx->start->getLine() << "] NameError:  Width tem ser maior que zero.\n";
      //exit(0);
      return "ERROR";
   }
   WidthMap = std::stoi(ctx->INT(0)->getText())- 1;  

   int Height = std::stoi(ctx->INT(1)->getText());
   if (Height <= 0){
      std::cout << "[Line "<< ctx->start->getLine() << "] NameError: Height tem ser maior que zero.\n";
      //exit(0);
      return "ERROR";
   }
   HeightMap = std::stoi(ctx->INT(1)->getText()) - 1;

   //colocar labirinto no ficheiro
   ST.append("<Lab");
   ST.append(" Name=\"");   
   ST.append(ctx->ID()->getText());
   ST.append("\"");
   ST.append(" Width=\"");   ST.append(std::to_string(Width));
   ST.append("\"");
   ST.append(" Height=\"");   ST.append(std::to_string(Height));
   ST.append("\"");
   ST.append(">\n");
   res = visitChildren(ctx);
   ST.append("</Lab>\n\n"); 
   return res;
}

antlrcpp::Any Execute::visitDlab(LabParser::DlabContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   return visitChildren(ctx);
   //return res;
}

antlrcpp::Any Execute::visitBeacon(LabParser::BeaconContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   int height = 0;
   if(ctx->INT()!=nullptr){
      height = std::stoi(ctx->INT()->getText());
      if (height <= 0){
         std::cout << "[Line "<< ctx->start->getLine() << "] NameError: Height tem ser maior que zero.\n";
         //exit(0);
         return "ERROR";
      }
   }else{
      height=2;
   } 

   //colocar beacon no ficheiro
   ST.append("\t<Beacon");
   res = visitChildren(ctx);
   ST.append(" Height=\"");   ST.append(std::to_string(height));
   ST.append("\"");
   ST.append("/>\n");
   return res;
}

antlrcpp::Any Execute::visitTarget(LabParser::TargetContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;

   float radius = -1;
   if(ctx->num()!=nullptr){
      radius = std::stof(ctx->num()->getText());
      if (radius <= 0){
         std::cout << "[Line "<< ctx->start->getLine() << "] NameError: Radius tem ser maior que zero.\n";
         //exit(0);
         return "ERROR";
      }
   }else{
      radius=1;
   }

   //colocar target no ficheiro
   ST.append("\t<Target");
   res = visitChildren(ctx);
   ST.append(" Radius=\"");   ST.append(std::to_string(radius));
   ST.append("\"");
   ST.append("/>\n");
   return res;
}

antlrcpp::Any Execute::visitSpot(LabParser::SpotContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   
   int height = 0;
   if(ctx->INT()!=nullptr){
      height = std::stoi(ctx->INT()->getText());
      if (height <= 0){
         std::cout << "[Line "<< ctx->start->getLine() << "] NameError: Height tem ser maior que zero.\n";
         //exit(0);
         return "ERROR";
      }
   }else{
      height=2;
   } 

   float radius = -1;
   if(ctx->num()!=nullptr){
      radius = std::stof(ctx->num()->getText());
      if (radius <= 0){
         std::cout << "[Line "<< ctx->start->getLine() << "] NameError: Radius tem ser maior que zero.\n";
         //exit(0);
         return "ERROR";
      }
   }else{
      radius=1;
   }

   //colocar o beacon no ficheiro
   ST.append("\t<Beacon");
   res = visitChildren(ctx);
   ST.append(" Height=\"");   ST.append(std::to_string(height));
   ST.append("\"");
   ST.append("/>\n");
   
   //colocar o target no ficheiro
   ST.append("\t<Target");
   res = visitChildren(ctx);
   ST.append(" Radius=\"");   ST.append(std::to_string(radius));
   ST.append("\"");
   ST.append("/>\n");

   return res;
}

antlrcpp::Any Execute::visitRow(LabParser::RowContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;

   res = visitChildren(ctx);
   int pos = std::stoi(ctx->INT()->getText());
   if(pos != --HeightMap){
     std::cout << "[Line "<< ctx->start->getLine() << "] NameError: A Ordem das linhas està incorreta.\n";
      //exit(0);
      return "ERROR";
   }

   string row = ctx->PADRAO()->getText();
   vector<bool> linha;
   bool teste =true;
   for(size_t i = 1; i < row.size()-1; i++) {
      if(teste){
         if(row[i] == '-' && row[i+1] == '-'){
            linha.push_back(true);
         } else if(row[i] == ' ' && row[i+1] == ' '){
            linha.push_back(false);
         }
         teste =false;
         i++;
      }else{
         if(row[i] == '+'){
            linha.push_back(true);
         } else if(row[i] == '|'){
            linha.push_back(true);
         }else {if(row[i] == ' '){
            linha.push_back(false);
            }
         }
         teste =true;   
      }
   }
   if(WidthMap != linha.size()){
      std::cout << "[Line "<< ctx->start->getLine() << "] NameError: .\n";
      //exit(0);
      return "ERROR";
   }

   //imprimir mapa no terminal 0-não tem parede; 1- tem parede
   //this->map->addRow(linha);
   /*for (size_t i = 0; i < linha.size(); i++)
   {
      std::cout << linha[i] << " ";
   }
   std::cout << "\n";*/

   //colocar o mapa no ficheiro
   ST.append("\t<Row");
   ST.append(" Pos=\"");   ST.append(std::to_string(pos));
   ST.append("\"");
   ST.append(" Pattern="); ST.append(row);
   ST.append("/>\n");

   return res;
}

antlrcpp::Any Execute::visitCoordenadas(LabParser::CoordenadasContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   
   float x, y;
   x = std::stof(ctx->num(0)->getText());
   y = std::stof(ctx->num(1)->getText());
   
   ST.append(" X=\"");   ST.append(std::to_string(x)); //remover casas decimais
   ST.append("\" Y=\""); ST.append(std::to_string(y));
   ST.append("\"");
   res = visitChildren(ctx);
   return res;
}

antlrcpp::Any Execute::visitNum(LabParser::NumContext *ctx){
   antlrcpp::Any res = nullptr;
   std::string r;
   return visitChildren(ctx);
}
