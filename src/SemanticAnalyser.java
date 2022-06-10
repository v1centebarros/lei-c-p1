import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import static java.util.Map.entry;

import java.lang.ProcessBuilder.Redirect.Type;

public class SemanticAnalyser extends MusBaseVisitor<String> {

   private List<String> keywords = List.of("NUM", "BOOL", "TEXT", "ENUM", "ROBOT", "POINT", "TWIST", "POSE",
   "LIST_NUM", "LIST_BOOL", "LIST_TEXT", "LIST_ENUM", "LIST_ROBOT", "LIST_POINT", "LIST_TWIST", "LIST_POSE",
   "if", "else", "while", "until", "for", "in", "do", "end",
   "not", "and", "or",
   "true", "false", "True", "False",
   "function", "with");

   private SymbolTable table = new SymbolTable(null,
      new HashMap<>(Map.ofEntries(
         entry("print", new String[]{"ANY", "VOID"}),
         entry("use", new String[]{"ROBOT", "VOID"}),
         entry("state", new String[]{"TEXT", "VOID"}),
         entry("input", new String[]{"TEXT", "ANY"}),
         entry("posX", new String[]{"VOID", "NUM"}),
         entry("posY", new String[]{"VOID", "NUM"}),
         entry("rotate", new String[]{"NUM", "VOID"}),
         entry("move", new String[]{"NUM;NUM", "VOID"}),
         entry("pickUp", new String[]{"VOID", "VOID"}),
         entry("returning", new String[]{"VOID", "VOID"}),
         entry("finish", new String[]{"VOID", "VOID"}),
         entry("beaconAngle", new String[]{"NUM", "NUM"}),
         entry("startAngle", new String[]{"VOID", "NUM"}),
         entry("northAngle", new String[]{"VOID", "NUM"}),
         entry("groundType", new String[]{"VOID", "NUM"}),
         entry("onTarget", new String[]{"NUM", "BOOL"}),
         entry("beaconCount", new String[]{"VOID", "NUM"}),
         entry("colides", new String[]{"VOID", "BOOL"}),
         entry("obstacleDistance", new String[]{"TEXT", "NUM"}),
         entry("startDistance", new String[]{"VOID", "NUM"}),
         entry("stop", new String[]{"VOID", "VOID"}),
         entry("setVisitingLed", new String[]{"BOOL", "VOID"}),
         entry("setReturningLed", new String[]{"BOOL", "VOID"}),
         entry("getVisitingLed", new String[]{"VOID", "BOOL"}),
         entry("getReturningLed", new String[]{"VOID", "BOOL"}),
         entry("distance", new String[]{"POINT;POINT", "NUM"})
      )),
      new HashMap<>(Map.ofEntries(
         entry("frontsensor", "NUM"), //macro
         entry("leftsensor", "NUM"), //macro
         entry("rightsensor", "NUM"), //macro
         entry("rearsensor", "NUM") //macro
      ))
   );

   private Stack<SymbolTable> tables = new Stack<>();
   private List<String> currentEnum;
   private boolean isFunction = false;
   private String expectedOutput;
   private boolean newState = false;
   private List<String> states = new ArrayList<>();

   private boolean equalsType(String input, String type) {
      return type.contains(input) || type.equals("ANY");
   }

   // @Override public String visitProgram(MusParser.ProgramContext ctx) {
   //    String res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }
   
   /*
   @Override public String visitStat(MusParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
   */

  @Override public String visitDefFunction(MusParser.DefFunctionContext ctx) {   
      tables.push(table);
      table = new SymbolTable(table);
      Map<String, String> newVars = new HashMap<>();
      String type;
      if (ctx.TYPE().size() == ctx.ID().size()) {
         type = ctx.TYPE(0).getText();
         String name;
         for (int i = 1; i < ctx.TYPE().size(); i++) {
            name = ctx.ID(i).getText();
            if (name.contains(":")) {
               System.err.printf("[Line %d] NameError: symbol ':' is reserved for object's attributes\n", ctx.start.getLine());
               return "ERROR";
            }
            if (keywords.contains(name)) {
               System.err.printf("[Line %d] NameError: name '%s' is a keyword\n", ctx.start.getLine(), name);
               return "ERROR";
            }
            if (table.containsFunction(name) || table.containsVariable(name)) {
               System.err.printf("[Line %d] NameError: name '%s' is already defined\n", ctx.start.getLine(), name);
               return "ERROR";
            }
            newVars.put(name, ctx.TYPE(i).getText());
         }
      }
      else {
         type = "VOID";
         String name;
         for (int i = 1; i < ctx.ID().size(); i++) {
            name = ctx.ID(i).getText();
            if (name.contains(":")) {
               System.err.printf("[Line %d] NameError: symbol ':' is reserved for object's attributes\n", ctx.start.getLine());
               return "ERROR";
            }
            if (keywords.contains(name)) {
               System.err.printf("[Line %d] NameError: name '%s' is a keyword\n", ctx.start.getLine(), name);
               return "ERROR";
            }
            if (table.containsFunction(name) || table.containsVariable(name)) {
               System.err.printf("[Line %d] NameError: name '%s' is already defined\n", ctx.start.getLine(), name);
               return "ERROR";
            }
            newVars.put(name, ctx.TYPE(i-1).getText());
         }
      }
      newVars.forEach((name, typeVar) -> table.putVariable(name, typeVar));
      List<MusParser.StatContext> stats = ctx.stat();
      Iterator<MusParser.StatContext> it = stats.iterator();
      isFunction = true;
      expectedOutput = type;
      String val;
      while(it.hasNext()) {
         val = visit(it.next());
         if (val != null && val.equals("END") && it.hasNext()) {
            System.out.printf("[Line %d] ReturnWarning: code after return statement will not be executed\n", ctx.start.getLine());
         }
      }
      isFunction = false;
      table = tables.pop();
      return null;
   }

   @Override public String visitBlockIf(MusParser.BlockIfContext ctx) {
      tables.push(table);
      table = new SymbolTable(table);
      String expr = visit(ctx.expr());
      if (expr.equals("BOOL")) {
         List<MusParser.StatContext> stats = ctx.stat();
         Iterator<MusParser.StatContext> it = stats.iterator();
         while(it.hasNext()) visit(it.next());
         if (ctx.blockElse() != null) visit(ctx.blockElse());
         table = tables.pop();
         return null;
      }
      System.err.printf("[Line %d] TypeError: condition in block 'if' must be BOOL (not %s)\n", ctx.start.getLine(), expr);
      return "ERROR";
   }

   @Override public String visitBlockElse(MusParser.BlockElseContext ctx) {
      tables.push(table);
      table = new SymbolTable(table.getParent());
      List<MusParser.StatContext> stats = ctx.stat();
      Iterator<MusParser.StatContext> it = stats.iterator();
      while(it.hasNext()) visit(it.next());
      table = tables.pop();
      return null;
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
      System.err.printf("[Line %d] TypeError: condition in block 'while' must be BOOL (not %s)\n", ctx.start.getLine(), expr);
      return "ERROR";
   }

   @Override public String visitBlockForEach(MusParser.BlockForEachContext ctx) {
      String expr = visit(ctx.expr());
      if (expr.contains("LIST")) {
         tables.push(table);
         table = new SymbolTable(table);
         String name = ctx.ID().getText();
         if (name.contains(":")) {
            System.err.printf("[Line %d] NameError: symbol ':' is reserved for object's attributes\n", ctx.start.getLine());
            return "ERROR";
         }
         if (keywords.contains(name)) {
            System.err.printf("[Line %d] NameError: name '%s' is a keyword\n", ctx.start.getLine(), name);
            return "ERROR";
         }
         if (table.containsFunction(name) || table.containsVariable(name)) {
            System.err.printf("[Line %d] NameError: name '%s' is already defined\n", ctx.start.getLine(), name);
            return "ERROR";
         }
         table.putVariable(name, expr.replace("LIST_", ""));
         List<MusParser.StatContext> stats = ctx.stat();
         Iterator<MusParser.StatContext> it = stats.iterator();
         while(it.hasNext()) visit(it.next());
         table = tables.pop();
         return null;
      }
      System.err.printf("[Line %d] TypeError: forEach block must iterate over a list\n", ctx.start.getLine());
      return "ERROR";
   }

   @Override public String visitBlockUntil(MusParser.BlockUntilContext ctx) {
      String expr = visit(ctx.expr());
      if (expr.equals("BOOL"))
         return visit(ctx.call());
      System.err.printf("[Line %d] TypeError: condition in block 'until' must be BOOL (not %s)\n", ctx.start.getLine(), expr);
      return "ERROR";
   }

   @Override public String visitBlockWithState(MusParser.BlockWithStateContext ctx) {
      Iterator<MusParser.BlockCaseContext> it = ctx.blockCase().iterator();
      while(it.hasNext()) visit(it.next());
      return null;
   }

   @Override public String visitBlockCase(MusParser.BlockCaseContext ctx) {
      String state = ctx.expr().getText();
      if (!states.contains(state)) {
         System.err.printf("[Line %d] StateWarning: state %s does not exist\n", ctx.start.getLine(), state);
         return "ERROR";
      }
      String stateType = visit(ctx.expr());
      if (stateType.equals("TEXT")) {
         tables.push(table);
         table = new SymbolTable(table);
         List<MusParser.StatContext> stats = ctx.stat();
         Iterator<MusParser.StatContext> it = stats.iterator();
         while(it.hasNext()) visit(it.next());
         table = tables.pop();
         return null;
      }
      System.err.printf("[Line %d] TypeError: states in block 'with state' must be TEXT (not %s)\n", ctx.start.getLine(), stateType);
      return "ERROR";
   }

   @Override public String visitAssignment(MusParser.AssignmentContext ctx) {
      if (ctx.TYPE() == null) {
         String key = ctx.ID().getText();
         if (!table.containsVariable(key)) {
            System.err.printf("[Line %d] NameError: name '%s' is not defined\n", ctx.start.getLine(), key);
            return "ERROR";
         }
         String[] keyParts = key.split(":");
         if (table.getVariable(keyParts[0]).equals("ENUM")) {
            System.err.printf("[Line %d] ImmutableTypeError: enum '%s' is already defined\n", ctx.start.getLine(), keyParts[0]);
            return "ERROR";
         }
         String type = table.getVariable(key);
         String exprType = visit(ctx.expr());
         if (exprType.equals("ERROR")) return null; 
         if (!equalsType(type, exprType)) {
            System.err.printf("[Line %d] TypeError: cannot assign %s to %s\n", ctx.start.getLine(), exprType, type);
            return "ERROR";
         }
         return null;
      }
      String type = ctx.TYPE().getText();
      String exprType = visit(ctx.expr());
      if (exprType.equals("ERROR")) return null;
      if (!equalsType(type, exprType)) {
         System.err.printf("[Line %d] TypeError: cannot assign %s to %s\n", ctx.start.getLine(), exprType, type);
         return "ERROR";
      }
      String name = ctx.ID().getText();
      if (name.contains(":")) {
         System.err.printf("[Line %d] NameError: symbol ':' is reserved for object's attributes\n", ctx.start.getLine());
         return "ERROR";
      }
      if (keywords.contains(name)) {
         System.err.printf("[Line %d] NameError: name '%s' is a keyword\n", ctx.start.getLine(), name);
         return "ERROR";
      }
      if (table.containsFunction(name) || table.containsVariable(name)) {
         System.err.printf("[Line %d] NameError: name '%s' is already defined\n", ctx.start.getLine(), name);
         return "ERROR";
      }
      if (exprType.equals("ENUM")) {
         Iterator<String> it = currentEnum.iterator();
         String str;
         while(it.hasNext()) {
            str = name + ":" + it.next().replaceAll("\"", "");
            table.putVariable(str, "NUM");
         }
      }
      table.putVariable(name, type);
      return null;
   }

   @Override public String visitExprVar(MusParser.ExprVarContext ctx) {
      String key = ctx.ID().getText();
      if (table.containsVariable(key)) return table.getVariable(key);
      else if (table.containsFunction(key)) return table.getFunction(key)[1];
      else {
         System.err.printf("[Line %d] NameError: name '%s' is not defined\n", ctx.start.getLine(), key);
         return "ERROR";
      }
   }

   @Override public String visitExprEnumWithValues(MusParser.ExprEnumWithValuesContext ctx) {
      currentEnum = new ArrayList<>();
      String element;
      for (int i = 0; i < ctx.TEXT().size(); i++) {
         element = ctx.TEXT(i).getText();
         if (currentEnum.contains(element)) {
            System.err.println("DuplicatedElementsError: enum has duplicated elements");
         }
         currentEnum.add(element);
      }
      List<String> values = new ArrayList<>();
      for (int i = 0; i < ctx.NUM().size(); i++) {
         element = ctx.NUM(i).getText();
         if (values.contains(element)) {
            System.err.println("DuplicatedValuesError: enum has duplicated values");
         }
         values.add(element);
      }
      return "ENUM";
   }

   @Override public String visitBoolNegation(MusParser.BoolNegationContext ctx) {
      String expr = visit(ctx.expr());
      if (expr.equals("BOOL"))
         return "BOOL";
         System.err.printf("[Line %d] TypeError: unsupported operand type for 'not': %s\n", ctx.start.getLine(), expr);
      return "ERROR";
   }

   @Override public String visitNumericAddSub(MusParser.NumericAddSubContext ctx) {
      String expr0 = visit(ctx.expr(0));
      String expr1 = visit(ctx.expr(1));
      if (equalsType(expr0, "NUM") && equalsType(expr1, "NUM")) 
         return "NUM";
      if (expr0.equals("POINT|TWIST") && expr1.equals("POINT|TWIST"))    
         return "POINT|TWIST";      
      if (expr0.equals("POINT|TWIST") && expr1.equals("POINT"))
         return "POINT";
      if (expr0.equals("POINT") && expr1.equals("POINT|TWIST"))
         return "POINT";
      if (expr0.equals("POINT|TWIST") && expr1.equals("TWIST"))
         return "TWIST";
      if (expr0.equals("POINT") && expr1.equals("POINT|TWIST"))
         return "TWIST";
      if (expr0.contains("LIST") && expr0.equals(expr1))
         return expr0;
      System.err.printf("[Line %d] TypeError: unsupported operand type(s) for '%s': %s and %s\n", ctx.start.getLine(), ctx.op.getText(), expr0, expr1);
      return "ERROR";
   }

   @Override public String visitNumericNegative(MusParser.NumericNegativeContext ctx) {
      String expr = visit(ctx.expr());
      if (expr.equals("NUM"))
         return "NUM";
      System.err.printf("[Line %d] TypeError: unsupported operand type for unary operator '-': %s\n", ctx.start.getLine(), expr);
      return "ERROR";
   }

   @Override public String visitNumericLiteral(MusParser.NumericLiteralContext ctx) {
      return "NUM";
   }

   @Override public String visitExprParenthesis(MusParser.ExprParenthesisContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExprTuple(MusParser.ExprTupleContext ctx) {
      String expr0 = visit(ctx.expr(0));
      String expr1 = visit(ctx.expr(1));
      if (equalsType(expr0, "TEXT") && equalsType(expr1, "NUM")) 
         return "ROBOT";
      if (equalsType(expr0, "NUM") && equalsType(expr1, "NUM"))
         return "POINT|TWIST";
      if (equalsType(expr0, "POINT|TWIST") && equalsType(expr1, "NUM"))
         return "POSE";
      System.err.printf("[Line %d] TypeError: tuple must be ROBOT, POINT or POSE\n", ctx.start.getLine());
      return "ERROR";
   }

   @Override public String visitBoolDoubleCompare(MusParser.BoolDoubleCompareContext ctx) {
      String expr0 = visit(ctx.expr(0));
      String op1 = ctx.op1.getText();
      String expr1 = visit(ctx.expr(1));
      String op2 = ctx.op2.getText();
      String expr2 = visit(ctx.expr(2));
      
      if (op1.equals("and") || op1.equals("or")) {
         if (equalsType(expr0, "BOOL") && equalsType(expr1, "BOOL")) return "BOOL";
         System.err.printf("[Line %d] TypeError: unsupported operand types for '%s': %s and %s\n", ctx.start.getLine(), op1, expr0, expr1);
         return "ERROR";
      }
      if (op2.equals("and") || op2.equals("or")) {
         if (equalsType(expr1, "BOOL") && expr2.equals("BOOL")) return "BOOL";
         System.err.printf("[Line %d] TypeError: unsupported operand types for '%s': %s and %s\n", ctx.start.getLine(), op2, expr1, expr2);
         return "ERROR";
      }
      if (!equalsType(expr0, "NUM") || !equalsType(expr1, "NUM")) {
         System.err.printf("[Line %d] TypeError: unsupported operand types for '%s': %s and %s\n", ctx.start.getLine(), op1, expr0, expr1);
         return "ERROR";
      }
      if (!equalsType(expr1, "NUM") || !expr2.equals("NUM")) {
         System.err.printf("[Line %d] TypeError: unsupported operand types for '%s': %s and %s\n", ctx.start.getLine(), op2, expr1, expr2);
         return "ERROR";
      }
      return "BOOL";
   }

   // @Override public String visitExprCall(MusParser.ExprCallContext ctx) {
   //    String res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   @Override public String visitBoolCompare(MusParser.BoolCompareContext ctx) {
      String expr0 = visit(ctx.expr(0));
      String op = ctx.op.getText();
      String expr1 = visit(ctx.expr(1));
      if (op.equals("and") || op.equals("or")) {
         if (equalsType(expr0, "BOOL") && equalsType(expr1, "BOOL")) return "BOOL";
         System.err.printf("[Line %d] TypeError: unsupported operand types for '%s': %s and %s\n", ctx.start.getLine(), op, expr0, expr1);
         return "ERROR";
      }
      if (expr0.contains("POINT") || expr0.contains("TWIST")) {
         if ( (op.equals("==") || op.equals("!="))
               && (
               ( expr0.equals("POINT|TWIST") && expr1.equals("POINT|TWIST"))    //compare(POINT|TWIST [LITERAL], POINT|TWIST [LITERAL])
               || ( expr0.equals("POINT|TWIST") && expr1.equals("POINT") )      //compare(POINT|TWIST [LITERAL], POINT [ID])
               || ( expr0.equals("POINT") && expr1.equals("POINT|TWIST") )      //compare(POINT [ID], POINT|TWIST [LITERAL])
               || ( expr0.equals("POINT|TWIST") && expr1.equals("TWIST") )      //compare(POINT|TWIST [LITERAL], TWIST [ID])
               || ( expr0.equals("TWIST") && expr1.equals("POINT|TWIST") )      //compare(TWIST [ID], POINT|TWIST [LITERAL])
               )
            ) return "BOOL";
         System.err.printf("[Line %d] TypeError: unsupported operand types for '%s': %s and %s\n", ctx.start.getLine(), op, expr0, expr1);
         return "ERROR";
      }
      if (!equalsType(expr0, expr1)) {
         System.err.printf("[Line %d] TypeError: cannot compare %s with %s\n", ctx.start.getLine(), expr0, expr1);
         return "ERROR";
      }
      return "BOOL";
   }

   @Override public String visitBoolLiteral(MusParser.BoolLiteralContext ctx) {
      return "BOOL";
   }

   @Override public String visitExprEnum(MusParser.ExprEnumContext ctx) {
      currentEnum = new ArrayList<>();
      String element;
      for (int i = 0; i < ctx.TEXT().size(); i++) {
         element = ctx.TEXT(i).getText();
         if (currentEnum.contains(element)) {
            System.err.println("DuplicatedElementsError: enum has duplicated elements");
         }
         currentEnum.add(element);
      }
      return "ENUM";
   }

   @Override public String visitExprList(MusParser.ExprListContext ctx) {
      List<MusParser.ExprContext> stats = ctx.expr();
      Iterator<MusParser.ExprContext> it = stats.iterator();
      String type;
      if (!it.hasNext()) return null;
      type = visit(it.next());
      while(it.hasNext())
         if (!equalsType(visit(it.next()), type)) {
            System.out.println("TypeError: all list elements must have the same type");
            return "ERROR";
         }
      return "LIST_" + type;
   }

   @Override public String visitNumericMultDivMod(MusParser.NumericMultDivModContext ctx) { 
      String expr0 = visit(ctx.expr(0));
      String expr1 = visit(ctx.expr(1));
      if (equalsType(expr0, "NUM") && equalsType(expr1, "NUM")) 
         return "NUM";
      String op = ctx.op.getText();
      if (op.equals("*")) {
         if (expr0.equals("POINT|TWIST") && equalsType(expr1, "NUM"))    
            return "POINT|TWIST";
         if (equalsType(expr0, "NUM") && expr1.equals("POINT|TWIST"))    
            return "POINT|TWIST";
         if (expr0.equals("POINT") && equalsType(expr1, "NUM"))    
            return "POINT";
         if (equalsType(expr0, "NUM") && expr1.equals("POINT"))    
            return "POINT";
         if (expr0.equals("TWIST") && equalsType(expr1, "NUM"))    
            return "TWIST";
         if (equalsType(expr0, "NUM") && expr1.equals("TWIST"))    
            return "TWIST";
         if (expr0.contains("LIST") && expr1.equals("NUM"))
            return expr0;
         if (expr0.equals("NUM") && expr1.contains("LIST"))
            return expr0;
      }
      System.err.printf("[Line %d] TypeError: unsupported operand types for '%s': %s and %s\n", ctx.start.getLine(), op, expr0, expr1);
      return "ERROR";
   }

   @Override public String visitTextLiteral(MusParser.TextLiteralContext ctx) {
      if (newState) states.add(ctx.TEXT().getText());
      return "TEXT";
   }

   @Override public String visitSingleCall(MusParser.SingleCallContext ctx) {
      return visit(ctx.call());
   }

   @Override public String visitCall(MusParser.CallContext ctx) {
      String func;
      if (ctx.ID().size() == 1) func = ctx.ID(0).getText();
      else func = ctx.ID(1).getText();

      if (func.equals("return")) {
         if (isFunction) {
            if (ctx.expr().size() == 0 && expectedOutput.equals("VOID")) return "END";
            if (ctx.expr().size() == 1) {
               String received = visit(ctx.expr(0));
               if (expectedOutput.equals(received)) return "END";
               if (expectedOutput.equals("VOID")) {
                  System.err.printf("[Line %d] InvalidReturnError: returned %s inside a void function\n", ctx.start.getLine(), received);
                  return "ERROR";
               }
               System.err.printf("[Line %d] InvalidReturnError: returned %s but expected %s\n", ctx.start.getLine(), received, expectedOutput);
               return "ERROR";
            }
            System.err.printf("[Line %d] InvalidReturnError: function must return only 1 value\n", ctx.start.getLine());
            return "ERROR";
         }
         System.err.printf("[Line %d] InvalidReturnError: return statement must be inside a function\n", ctx.start.getLine());
         return "ERROR";
      }

      if (func.equals("state")) newState = true;

      if (!table.containsFunction(func)) {
         System.err.printf("[Line %d] NameError: name '%s' is not defined\n", ctx.start.getLine(), func);
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
            System.err.printf("[Line %d] ArgError: argument of type %s is missing\n", ctx.start.getLine(), arg);
            return "ERROR";
         }
         type = visit(it.next());
         if (!equalsType(type, arg)) {
            System.err.printf("[Line %d] ArgError: received %s but expected %s at position %d\n", ctx.start.getLine(), type, arg, pos);
            return "ERROR";
         }
      }
      if (it.hasNext()) {
         System.err.printf("[Line %d] ArgError: expected only %d argument(s)\n", ctx.start.getLine(), expectedArgs.length);
         return "ERROR";
      }
      newState = false;
      return info[1];
   }
}
