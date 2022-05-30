import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import static java.util.Map.entry;

class FunctionData {
   private String input;
   private String output;
   
   public FunctionData(String input, String output) {
      this.input = input;
      this.output = output;
   }
   public String[] splitInput(String delimiter) {return input.split(delimiter);}
   public String getOutput() {return output;}
}

public class SemanticAnalyser extends MusBaseVisitor<String> {

   private List<String> types = List.of("NUM", "BOOL", "TEXT", "ENUM", "ROBOT");
   private List<String> keywords = List.of("if", "do", "end",
   "while", "until",
   "not", "or",
   "true", "false", "True", "False");
   private Map<String, FunctionData> functions = Map.ofEntries(
      entry("print", new FunctionData("ANY", "")), //alterar para print de outros objetos
      entry("rotate", new FunctionData("NUM", "")),
      entry("move", new FunctionData("NUM+NUM", "")),
      entry("pickUp", new FunctionData("", "")),
      entry("returning", new FunctionData("", "")),
      entry("finish", new FunctionData("", "")),
      entry("beaconAngle", new FunctionData("NUM", "NUM")),
      entry("startAngle", new FunctionData("", "NUM")),
      entry("colides", new FunctionData("", "BOOL")),
      entry("obstacleDistance", new FunctionData("TEXT", "NUM")),
      entry("startDistance", new FunctionData("", "NUM")),
      entry("stop", new FunctionData("", ""))
   );
   private Map<String, String> variables = new HashMap<>();

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
         while(it.hasNext()) System.out.println(visit(it.next()));
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
         while(it.hasNext()) System.out.println(visit(it.next()));
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
      // if (ctx.TYPE() == null) {
      //    String key = ctx.ID().getText();
      //    String type;
      //    if (variables.containsKey(key)) {
      //       type = variables.get(key);
      //    else {
      //       System.out.printf("NameError: name '%s' is not defined\n", key);
      //       return "ERROR";
      //    }
      //    String exprType = visit(ctx.expr());
      //    if (!type.equals(exprType)) {
      //       System.out.printf("TypeError: cannot assign %s to %s\n", exprType, type);
      //       return "ERROR";
      //    }
      //    return null;
      // }
      // else {
      //    String type = ctx.TYPE().getText();
      //    String exprType = visit(ctx.expr());
      //    if (!type.equals(exprType)) {
      //       System.out.printf("TypeError: cannot assign %s to %s\n", exprType, type);
      //       return "ERROR";
      //    }
      //    return null;
      // }
      return null;
   }

   @Override public String visitExprVar(MusParser.ExprVarContext ctx) {
      String key = ctx.ID().getText();
      if (variables.containsKey(key)) return variables.get(key);
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
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitBoolDoubleCompare(MusParser.BoolDoubleCompareContext ctx) {
      //TODO
      System.out.println("imprimir erro double compare");
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

   @Override public String visitCall(MusParser.CallContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
