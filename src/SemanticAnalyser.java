import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import static java.util.Map.entry;

import java.lang.ProcessBuilder.Redirect.Type;

public class SemanticAnalyser extends MusBaseVisitor<String> {

   private List<String> keywords = List.of("NUM", "BOOL", "TEXT", "ENUM", "ROBOT",
   "while", "until",
   "not", "or",
   "true", "false", "True", "False");

   private SymbolTable table = new SymbolTable(null,
      new HashMap<>(Map.ofEntries(
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
         entry("colides", new String[]{"", "BOOL"}),
         entry("obstacleDistance", new String[]{"TEXT", "NUM"}),
         entry("startDistance", new String[]{"", "NUM"}),
         entry("stop", new String[]{"", ""}),
         entry("setVisitingLed", new String[]{"BOOL", ""}),
         entry("setReturningLed", new String[]{"BOOL", ""}),
         entry("getVisitingLed", new String[]{"", "BOOL"}),
         entry("getReturningLed", new String[]{"", "BOOL"})
      )),
      new HashMap<>(Map.ofEntries(
         entry("frontsensor", "NUM"), //macro
         entry("leftsensor", "NUM"), //macro
         entry("rightsensor", "NUM"), //macro
         entry("rearsensor", "NUM") //macro
      ))
   );

   private Stack<SymbolTable> tables = new Stack<>();

   private boolean equalsType(String input, String type) {
      return input.equals(type) || type.equals("ANY");
   }

   @Override public String visitProgram(MusParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }
   
   /*
   @Override public String visitStat(MusParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
   */

   @Override public String visitBlockIf(MusParser.BlockIfContext ctx) {
      tables.push(table);
      table = new SymbolTable(table);
      String expr = visit(ctx.expr());
      if (expr.equals("BOOL")) {
         List<MusParser.StatContext> stats = ctx.stat();
         Iterator<MusParser.StatContext> it = stats.iterator();
         while(it.hasNext()) visit(it.next());
         table = tables.pop();
         return null;
      }
      System.out.printf("[Line %d] TypeError: condition in block 'if' must be BOOL (not %s)\n", ctx.start.getLine(), expr);
      return "ERROR";
   }

   @Override public String visitBlockWhile(MusParser.BlockWhileContext ctx) {
      tables.push(table);
      table = new SymbolTable(table);
      String expr = visit(ctx.expr());
      if (expr.equals("BOOL")) {
         List<MusParser.StatContext> stats = ctx.stat();
         Iterator<MusParser.StatContext> it = stats.iterator();
         while(it.hasNext()) visit(it.next());
         table = tables.pop();
         return null;
      }
      System.out.printf("[Line %d] TypeError: condition in block 'while' must be BOOL (not %s)\n", ctx.start.getLine(), expr);
      return "ERROR";
   }

   @Override public String visitBlockUntil(MusParser.BlockUntilContext ctx) {
      String expr = visit(ctx.expr());
      if (expr.equals("BOOL"))
         return visit(ctx.call());
      System.out.printf("[Line %d] TypeError: condition in block 'until' must be BOOL (not %s)\n", ctx.start.getLine(), expr);
      return "ERROR";
   }

   @Override public String visitAssignment(MusParser.AssignmentContext ctx) {
      if (ctx.TYPE() == null) {
         String key = ctx.ID().getText();
         if (!table.containsVariable(key)) {
            System.out.printf("[Line %d] NameError: name '%s' is not defined\n", ctx.start.getLine(), key);
            return "ERROR";
         }
         String type = table.getVariable(key);
         String exprType = visit(ctx.expr());
         if (!type.equals(exprType)) {
            System.out.printf("[Line %d] TypeError: cannot assign %s to %s\n", ctx.start.getLine(), exprType, type);
            return "ERROR";
         }
         table.putVariable(key, exprType);
         return null;
      }
      String type = ctx.TYPE().getText();
      String exprType = visit(ctx.expr());
      if (!type.equals(exprType)) {
         System.out.printf("[Line %d] TypeError: cannot assign %s to %s\n", ctx.start.getLine(), exprType, type);
         return "ERROR";
      }
      String name = ctx.ID().getText();
      if (keywords.contains(name)) {
         System.out.printf("[Line %d] NameError: name '%s' is a data type\n", ctx.start.getLine(), name);
         return "ERROR";
      }
      if (table.containsFunction(name)) {
         System.out.printf("[Line %d] NameError: name '%s' is a function\n", ctx.start.getLine(), name);
         return "ERROR";
      }
      if (table.containsVariable(name)) {
         System.out.printf("[Line %d] NameError: name '%s' is already defined\n", ctx.start.getLine(), name);
         return "ERROR";
      }
      table.putVariable(name, exprType);
      return null;
   }

   @Override public String visitExprVar(MusParser.ExprVarContext ctx) {
      String key = ctx.ID().getText();
      if (table.containsVariable(key)) return table.getVariable(key);
      else if (table.containsFunction(key)) return table.getFunction(key)[1];
      else {
         System.out.printf("[Line %d] NameError: name '%s' is not defined\n", ctx.start.getLine(), key);
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
      System.out.printf("[Line %d] TypeError: unsupported operand type(s) for %s: %s and %s\n", ctx.start.getLine(), expr0, expr1);
      return "ERROR";
   }

   @Override public String visitNumericNegative(MusParser.NumericNegativeContext ctx) {
      String expr = visit(ctx.expr());
      if (expr.equals("NUM"))
         return "NUM";
      System.out.printf("[Line %d] TypeError: unsupported operand type for unary operator '-': %s\n", ctx.start.getLine(), expr);
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
      System.out.printf("[Line %d] TypeError: robot must be declared with (TEXT, NUM)\n", ctx.start.getLine());
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
      System.out.printf("[Line %d] TypeError: unsupported operand type(s) for %s: %s and %s\n", ctx.start.getLine(), expr0, expr1);
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

      if (!table.containsFunction(func)) {
         System.out.printf("[Line %d] NameError: name '%s' is not defined\n", ctx.start.getLine(), func);
         return "ERROR";
      }
      String[] info = table.getFunction(func);
      String[] expectedArgs = info[0].split(";");
      List<MusParser.ExprContext> stats = ctx.expr();
      Iterator<MusParser.ExprContext> it = stats.iterator();
      String type, arg;
      for (int pos = 0; pos < expectedArgs.length; pos++) {
         arg = expectedArgs[pos];
         if (arg.equals("")) break;
         if (!it.hasNext()) {
            System.out.printf("[Line %d] ArgError: argument of type %s is missing\n", ctx.start.getLine(), arg);
            return "ERROR";
         }
         type = visit(it.next());
         if (!equalsType(type, arg)) {
            System.out.printf("[Line %d] ArgError: received %s but expected %s at position %d\n", ctx.start.getLine(), type, arg, pos);
            return "ERROR";
         }
      }
      if (it.hasNext()) {
         System.out.printf("[Line %d] ArgError: expected only %d argument(s)\n", ctx.start.getLine(), expectedArgs.length);
         return "ERROR";
      }
      return info[1];
   }
}
