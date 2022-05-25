public class Interpreter extends MusBaseVisitor<String> {

   @Override public String visitProgram(MusParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(MusParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssignNum(MusParser.AssignNumContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssignBool(MusParser.AssignBoolContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssignText(MusParser.AssignTextContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssignEnum(MusParser.AssignEnumContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssignEnumWithValues(MusParser.AssignEnumWithValuesContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssignRobot(MusParser.AssignRobotContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
