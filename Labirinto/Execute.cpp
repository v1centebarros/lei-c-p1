#include "Execute.h"


Execute::Execute() {
   
   ST.append("ola\n");
   std::cout << ST;
}

Execute::~Execute() {
   std::cout << "ola2";
}

int Execute::writeToFile() {
   std::ofstream fileout;
   fileout.open("destino.xml");
   fileout << ST;
   std::cout << "Escrevi no ficheiro: " << ST;
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
   ST.append("\t<Position");
   res = visitChildren(ctx);
   if(ctx->INT()!=nullptr){
      std::cout << "DIR= " << ctx->INT()->getText();
      int dir = std::stoi(ctx->INT()->getText());
      ST.append(" DIR=\"");   ST.append(std::to_string(dir));
      ST.append("\"");
   }else{
      ST.append(" DIR=\"180\"");
   }
   ST.append(">\n");
   return res;
}

antlrcpp::Any Execute::visitLabirinto(LabParser::LabirintoContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   ST.append("<Lab");
   std::cout << ctx->ID()->getText();
   ST.append(" Name=\"");   ST.append(ctx->ID()->getText());
   ST.append("\"");
   
   std::cout << "Width= " << ctx->num(0)->getText();
   float Width = std::stof(ctx->num(0)->getText());
   ST.append(" Width=\"");   ST.append(std::to_string(Width));
   ST.append("\"");

   std::cout << "Height= " << ctx->num(1)->getText();
   float Height = std::stof(ctx->num(1)->getText());
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
   ST.append("\t<Beacon");
   res = visitChildren(ctx);
   if(ctx->INT()!=nullptr){
      std::cout << " HEIGHT= " << ctx->INT()->getText();
      int height = std::stoi(ctx->INT()->getText());
      ST.append(" Height=\"");   ST.append(std::to_string(height));
      ST.append("\"");
   }else{
      ST.append(" Height=\"2\"");
   }
   ST.append("/>\n");
   return res;
}

antlrcpp::Any Execute::visitTarget(LabParser::TargetContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   ST.append("\t<Target");
   res = visitChildren(ctx);
   if(ctx->num()!=nullptr){
      std::cout << " Radius= " << ctx->num()->getText();
      float radius = std::stof(ctx->num()->getText());
      ST.append(" Radius=\"");   ST.append(std::to_string(radius));
      ST.append("\"");
   }else{
      ST.append(" Radius=\"1\"");
   }
   ST.append("/>\n");
   return res;
}

antlrcpp::Any Execute::visitSpot(LabParser::SpotContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   ST.append("\t<Beacon");
   res = visitChildren(ctx);
   if(ctx->INT()!=nullptr){
      std::cout << " HEIGHT= " << ctx->INT()->getText();
      int height = std::stoi(ctx->INT()->getText());
      ST.append(" Height=\"");   ST.append(std::to_string(height));
      ST.append("\"");
   }else{
      ST.append(" Height=\"2\"");
   }
   ST.append("/>\n");
   
   ST.append("\t<Target");
   res = visitChildren(ctx);
   if(ctx->num()!=nullptr){
      std::cout << " Radius= " << ctx->num()->getText();
      float radius = std::stof(ctx->num()->getText());
      ST.append(" Radius=\"");   ST.append(std::to_string(radius));
      ST.append("\"");
   }else{
      ST.append(" Radius=\"1\"");
   }
   ST.append("/>\n");
   
   return res;
}

antlrcpp::Any Execute::visitRow(LabParser::RowContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   ST.append("\t<Row");
   res = visitChildren(ctx);
   std::cout << " POS= " << ctx->INT()->getText();
   int pos = std::stoi(ctx->INT()->getText());
   ST.append(" Pos=\"");   ST.append(std::to_string(pos));
   ST.append("\"");
   std::cout << " POS= " << ctx->PADRAO()->getText();
   ST.append(" Pattern="); ST.append(ctx->PADRAO()->getText());
   ST.append("/>\n");
   return res;
}

antlrcpp::Any Execute::visitCoordenadas(LabParser::CoordenadasContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   float x, y;
   std::cout << " X=" << ctx->num(0)->getText();
   x = std::stof(ctx->num(0)->getText());

   std::cout << " Y=" << ctx->num(1)->getText();
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
