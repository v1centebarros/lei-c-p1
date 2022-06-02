import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import static java.util.Map.entry;

public class SemanticAnalyser extends MusBaseVisitor<String> {

   private List<String> types = List.of("NUM", "BOOL", "TEXT", "ENUM", "ROBOT");
   private List<String> keywords = List.of("if", "do", "end",
   "while", "until",
   "not", "or",
   "true", "false", "True", "False");

   private Map<String, String[]> functions = Map.ofEntries(
      entry("print", new String[]{"ANY", ""}),
      entry("use", new String[]{"ROBOT", ""}),
      entry("input", new String[]{"TEXT", "ANY"}),
      entry("posX", new String[]{"", "NUM"}),
      entry("posY", new String[]{"", "NUM"}),
      entry("rotate", new String[]{"NUM", ""}),
      entry("move", new String[]{"NUM;NUM", ""}),
      entry("pickUp", new String[]{"", ""}),
      entry("returning", new String[]{"", ""}),
      entry("finish", new String[]{"", ""}),
      entry("beaconAngle", new String[]{"NUM", "NUM"}),
      entry("startAngle", new String[]{"", "NUM"}),
      entry("northAngle", new String[]{"", "NUM"}),
      entry("groundType", new String[]{"", "NUM"}),
      entry("onTarget", new String[]{"NUM", "BOOL"}),
      entry("beaconCount", new String[]{"", "NUM"}),
      entry("obstacleDistance", new String[]{"", "NUM"}),
      entry("colides", new String[]{"", "BOOL"}),
      entry("obstacleDistance", new String[]{"TEXT", "NUM"}),
      entry("startDistance", new String[]{"", "NUM"}),
      entry("stop", new String[]{"", ""}),
      entry("setVisitingLed", new String[]{"BOOL", ""}),
      entry("setReturningLed", new String[]{"BOOL", ""}),
      entry("getVisitingLed", new String[]{"", "BOOL"}),
      entry("getReturningLed", new String[]{"", "BOOL"})
   );
   
   private Map<String, String> variables = Map.ofEntries(
      entry("frontsensor", "NUM"), //macro
      entry("leftsensor", "NUM"), //macro
      entry("rightsensor", "NUM"), //macro
      entry("rearsensor", "NUM") //macro
   );

   private boolean equalsType(String input, String type) {
      return input.equals(type) || type.equals("ANY");
   }

   /*
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
   */

   @Override public String visitBlockIf(MusParser.BlockIfContext ctx) {
      String expr = visit(ctx.expr());
      if (expr.equals("BOOL")) {
         List<MusParser.StatContext> stats = ctx.stat();
         Iterator<MusParser.StatContext> it = stats.iterator();
         while(it.hasNext()) visit(it.next());
         return null;
      }
      System.out.printf("TypeError: condition in block 'if' must be BOOL (not %s)\n", expr);
      return "ERROR";
   }

   @Override public String visitBlockWhile(MusParser.BlockWhileContext ctx) {
      String expr = visit(ctx.expr());
      if (expr.equals("BOOL")) {
         List<MusParser.StatContext> stats = ctx.stat();
         Iterator<MusParser.StatContext> it = stats.iterator();
         while(it.hasNext()) visit(it.next());
         return null;
      }
      System.out.printf("TypeError: condition in block 'while' must be BOOL (not %s)\n", expr);
      return "ERROR";
   }

   @Override public String visitBlockUntil(MusParser.BlockUntilContext ctx) {
      String expr = visit(ctx.expr());
      if (expr.equals("BOOL"))
         return visit(ctx.call());
      System.out.printf("TypeError: condition in block 'until' must be BOOL (not %s)\n", expr);
      return "ERROR";
   }

   @Override public String visitAssignment(MusParser.AssignmentContext ctx) {
      if (ctx.TYPE() == null) {
         String key = ctx.ID().getText();
         if (!variables.containsKey(key)) {
            System.out.printf("NameError: name '%s' is not defined\n", key);
            return "ERROR";
         }
         String type = variables.get(key);
         String exprType = visit(ctx.expr());
         if (!type.equals(exprType)) {
            System.out.printf("TypeError: cannot assign %s to %s\n", exprType, type);
            return "ERROR";
         }
         variables.put(key, exprType);
         return null;
      }
      String type = ctx.TYPE().getText();
      String exprType = visit(ctx.expr());
      if (!type.equals(exprType)) {
         System.out.printf("TypeError: cannot assign %s to %s\n", exprType, type);
         return "ERROR";
      }
      String name = ctx.ID().getText();
      if (types.contains(name)) {
         System.out.printf("NameError: name '%s' is a data type\n", name);
         return "ERROR";
      }
      if (functions.containsKey(name)) {
         System.out.printf("NameError: name '%s' is a function\n", name);
         return "ERROR";
      }
      if (variables.containsKey(name)) {
         System.out.printf("NameError: name '%s' is already defined\n", name);
         return "ERROR";
      }
      variables.put(name, exprType);
      return null;
   }

   @Override public String visitExprVar(MusParser.ExprVarContext ctx) {
      String key = ctx.ID().getText();
      if (variables.containsKey(key)) return variables.get(key);
      else if (functions.containsKey(key)) return functions.get(key)[1];
      else {
         System.out.printf("NameError: name '%s' is not defined\n", key);
         return "ERROR";
      }
   }

   @Override public String visitExprEnumWithValues(MusParser.ExprEnumWithValuesContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitBoolNegation(MusParser.BoolNegationContext ctx) {
      if (visit(ctx.expr()).equals("BOOL"))
         return "BOOL";
      System.out.println("imprimir erro bool negation");
      return "ERROR";
   }

   @Override public String visitNumericAddSub(MusParser.NumericAddSubContext ctx) {
      String expr0 = visit(ctx.expr(0));
      String expr1 = visit(ctx.expr(1));
      if (expr0.equals("NUM") && expr1.equals("NUM")) 
         return "NUM";
      System.out.printf("TypeError: unsupported operand type(s) for %s: %s and %s\n", ctx.op.getText(), expr0, expr1);
      return "ERROR";
   }

   @Override public String visitNumericNegative(MusParser.NumericNegativeContext ctx) {
      String expr = visit(ctx.expr());
      if (expr.equals("NUM"))
         return "NUM";
      System.out.printf("TypeError: unsupported operand type for unary operator '-': %s\n", expr);
      return "ERROR";
   }

   @Override public String visitNumericLiteral(MusParser.NumericLiteralContext ctx) {
      return "NUM";
   }

   @Override public String visitExprParenthesis(MusParser.ExprParenthesisContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExprRobot(MusParser.ExprRobotContext ctx) {
      String expr0 = visit(ctx.expr(0));
      String expr1 = visit(ctx.expr(1));
      if (expr0.equals("TEXT") && expr1.equals("NUM")) 
         return "ROBOT";
      System.out.printf("TypeError: robot must be declared with (TEXT, NUM)\n");
      return "ERROR";
   }

   @Override public String visitBoolDoubleCompare(MusParser.BoolDoubleCompareContext ctx) {
      if (visit(ctx.expr(0)).equals(visit(ctx.expr(1))) && visit(ctx.expr(1)).equals(visit(ctx.expr(2))))
         return "BOOL";
      System.out.println("imprimir erro bool compare");
      return "ERROR";
   }

   @Override public String visitExprCall(MusParser.ExprCallContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitBoolCompare(MusParser.BoolCompareContext ctx) {
      if (visit(ctx.expr(0)).equals(visit(ctx.expr(1))))
         return "BOOL";
      System.out.println("imprimir erro bool compare");
      return "ERROR";
   }

   @Override public String visitBoolLiteral(MusParser.BoolLiteralContext ctx) {
      return "BOOL";
   }

   @Override public String visitExprEnum(MusParser.ExprEnumContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitNumericMultDivMod(MusParser.NumericMultDivModContext ctx) {
      String expr0 = visit(ctx.expr(0));
      String expr1 = visit(ctx.expr(1));
      if (expr0.equals("NUM") && expr1.equals("NUM")) 
         return "NUM";
      System.out.printf("TypeError: unsupported operand type(s) for %s: %s and %s\n", ctx.op.getText(), expr0, expr1);
      return "ERROR";
   }

   @Override public String visitTextLiteral(MusParser.TextLiteralContext ctx) {
      return "TEXT";
   }

   @Override public String visitSingleCall(MusParser.SingleCallContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitCall(MusParser.CallContext ctx) {
      String func;
      if (ctx.ID().size() == 1) func = ctx.ID(0).getText();
      else func = ctx.ID(1).getText();

      if (!functions.containsKey(func)) {
         System.out.printf("NameError: name '%s' is not defined\n", func);
         return "ERROR";
      }
      String[] info = functions.get(func);
      String[] expectedArgs = info[0].split(";");
      List<MusParser.ExprContext> stats = ctx.expr();
      Iterator<MusParser.ExprContext> it = stats.iterator();
      String type, arg;
      for (int pos = 0; pos < expectedArgs.length; pos++) {
         arg = expectedArgs[pos];
         if (arg.equals("")) break;
         if (!it.hasNext()) {
            System.out.printf("ArgError: argument of type %s is missing\n", arg);
            return "ERROR";
         }
         type = visit(it.next());
         if (!equalsType(type, arg)) {
            System.out.printf("ArgError: received %s but expected %s at position %d\n", type, arg, pos);
            return "ERROR";
         }
      }
      if (it.hasNext()) {
         System.out.printf("ArgError: expected only %d argument(s)\n", expectedArgs.length);
         return "ERROR";
      }
      return info[1];
   }
}
