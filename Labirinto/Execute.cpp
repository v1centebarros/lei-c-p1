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
   ST.append("</Grid>\n");
   return res;
}

antlrcpp::Any Execute::visitPosition(LabParser::PositionContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   ST.append("<Position");
   res = visitChildren(ctx);
   //dir = ctx->DOUBLE(1)->getText();
   ST.append(">\n");
   return res;
}

antlrcpp::Any Execute::visitLabirinto(LabParser::LabirintoContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   ST.append("<Lab");
   res = visitChildren(ctx);
   ST.append("</Lab>\n");
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
   ST.append("<Beacon\n");
   res = visitChildren(ctx);
   ST.append("/>\n");
   return res;
}

antlrcpp::Any Execute::visitTarget(LabParser::TargetContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   ST.append("<Target\n");
   res = visitChildren(ctx);
   ST.append("/>\n");
   return res;
}

antlrcpp::Any Execute::visitSpot(LabParser::SpotContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   ST.append("<Target\n");
   res = visitChildren(ctx);
   ST.append("/>\n");
   ST.append("<Beacon\n");
   ST.append("/>\n");
   return res;
}

antlrcpp::Any Execute::visitRow(LabParser::RowContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   ST.append("<Row\n");
   res = visitChildren(ctx);
   ST.append("/>\n");
   return res;
}

antlrcpp::Any Execute::visitCoordenadas(LabParser::CoordenadasContext *ctx) {
   antlrcpp::Any res = nullptr;
   std::string r;
   float x, y;
   std::cout << "X= " << ctx->DOUBLE(0)->getText();
   x = std::stof(ctx->DOUBLE(0)->getText());

   std::cout << "Y= " << ctx->DOUBLE(1)->getText();
   y = std::stof(ctx->DOUBLE(1)->getText());
   
   ST.append(" X=\"");   ST.append(std::to_string(x));
   ST.append("\" Y=\""); ST.append(std::to_string(y));
   ST.append("\"");
   res = visitChildren(ctx);
   return res;
}
