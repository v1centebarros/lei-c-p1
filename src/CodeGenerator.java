import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.stringtemplate.v4.*;



public class CodeGenerator extends MusBaseVisitor<ST> {

   // private ST stringTemplate;
   STGroup allTemplates;

   //simple functions (without arguments)
   private Map<String, String> simpleFunc = new HashMap<>();

   //type and values of the last assignment
   private String lastType;
   private String lastVar;

   //functions that need an apply statement
   List<String> needApplyFunc;
   boolean needApply;
   

   public CodeGenerator() {
      //stringTemplate = new ST();
      allTemplates = new STGroupFile("Templates.stg");

      //last assignment info
      lastType = null;
      lastVar = null;

      //functions that need an apply statement
      needApply = false;
      needApplyFunc = new ArrayList<>();
      needApplyFunc.add("move");
      needApplyFunc.add("rotate");
      needApplyFunc.add("stop");

      // add simple functions
      simpleFunc.put("posX", "posX()");
      simpleFunc.put("posY", "posY()");
      simpleFunc.put("pickUp", "pickUp()");
      simpleFunc.put("returning", "returning()");
      simpleFunc.put("finish", "finish()");
      simpleFunc.put("northAngle", "northAngle()");
      simpleFunc.put("groundType", "groundType()");
      simpleFunc.put("beaconCount", "beaconCount()");
      simpleFunc.put("startAngle", "startAngle()");
      simpleFunc.put("startDistance", "startDistance()");
      simpleFunc.put("collides", "collides()");
      simpleFunc.put("getReturningLed", "getReturningLed()");
      simpleFunc.put("getVisitingLed", "getVisitingLed()");
   }



   private void printToFile(ST stringTemplate) {
      try {
         FileWriter myWriter = new FileWriter("destinationLanguage.cpp");

         String s = stringTemplate.render();
         System.out.println("ST: " +  s);
         myWriter.write(s);
         //myWriter.write("escrevendo");
         myWriter.close();
         System.out.println("Successfully wrote to the file.");

      } catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }

   @Override public ST visitProgram(MusParser.ProgramContext ctx) {
      ST programaTodo = allTemplates.getInstanceOf("header");

      programaTodo.add("global", "");
      //List<StatContext> contextes = ctx.stat();
      for(int i = 0; i < ctx.stat().size(); i++) {
         programaTodo.add("main", visit(ctx.stat(i)));
      }
      printToFile(programaTodo);
      return programaTodo;
   }

   @Override public ST visitStat(MusParser.StatContext ctx) {
      ST res = new ST("<stat><comma>");
      if(ctx.block() != null) {
         res.add("stat", visit(ctx.block()));
         res.add("comma","\n");
      } else if(ctx.assignment() != null) {
         res.add("stat", visit(ctx.assignment()));
         res.add("comma",";\n");
      } else if(ctx.singleCall() != null) {
         res.add("stat", visit(ctx.singleCall()));

         //insert apply(); if needed
         if (!needApply)
            res.add("comma",";\n");
         else {
            res.add("comma",";\napply();\n");
            needApply = false;  //reset apply() var
         }

      }
      return res;
   }

   @Override public ST visitBlockIf(MusParser.BlockIfContext ctx) {
      ST ifST = allTemplates.getInstanceOf("blockIf");
      ifST.add("expr", visit(ctx.expr()));
      for(int i = 0; i < ctx.stat().size(); i++) {
         ifST.add("stat", visit(ctx.stat(i)));
      }

      if (ctx.blockElse() != null) {
         ifST.add("blockElse", visit(ctx.blockElse()));
      }

      return ifST;
   }

   @Override public ST visitBlockElse(MusParser.BlockElseContext ctx) {
      ST elseST = allTemplates.getInstanceOf("blockElse");

      for(int i = 0; i < ctx.stat().size(); i++) {
         elseST.add("stat", visit(ctx.stat(i)));
      }
  
      return elseST;
   }

   @Override public ST visitBlockWhile(MusParser.BlockWhileContext ctx) {
      ST whileST = allTemplates.getInstanceOf("blockWhile");
      whileST.add("expr", visit(ctx.expr()));
      for(int i = 0; i < ctx.stat().size(); i++) {
         whileST.add("stat", visit(ctx.stat(i)));
      }
      return whileST;
   }

   @Override public ST visitBlockUntil(MusParser.BlockUntilContext ctx) {
      ST untilST = allTemplates.getInstanceOf("blockUntil");
      untilST.add("expr", visit(ctx.expr()));
      untilST.add("call", visit(ctx.call()));


      //insert apply(); if needed
      if (!needApply)
         untilST.add("call",";\n");
      else {
         untilST.add("call",";\napply();\n");
         needApply = false;  //reset apply() var
      }

      return untilST;
   }

   @Override public ST visitAssignment(MusParser.AssignmentContext ctx) {
      // ST assign = allTemplates.getInstanceOf("assign");
      // if(ctx.TYPE() != null) {
      //    assign.add("type", ctx.TYPE().getText());
      // }
      // assign.add("name", ctx.ID().getText());
      // assign.add("value", visit(ctx.expr()));
      // return assign;

      ST initRobotST = new ST("init(<expr>)");
      ST assign = allTemplates.getInstanceOf("assign");

      lastVar = "var_" + ctx.ID().getText();
      if(ctx.TYPE() != null) {
         String type = ctx.TYPE().getText();
         lastType = type;

         if (type.equals("ROBOT")) {
            initRobotST.add("expr", visit(ctx.expr()));
            return initRobotST;
         }
         else {
            assign.add("type", type);
            assign.add("name", ctx.ID().getText());
            assign.add("value", visit(ctx.expr()));
            return assign;
         }
      }
      else {
         assign.add("name", ctx.ID().getText());
         assign.add("value", visit(ctx.expr()));
         return assign;
      }

   }

   @Override public ST visitExprVar(MusParser.ExprVarContext ctx) {
      String varName = ctx.ID().getText();
      
      //if the name is a func name -> return function()
      if (simpleFunc.containsKey(varName)) {
         if (simpleFunc.get(varName).equals("beaconCount()"))
            return new ST("(int)beaconCount()");  //cast to int
         else
            return new ST(simpleFunc.get(varName));
      }
      else if (varName.equals("input")) {
         if (lastType.equals("NUM")){

            return new ST("0;\ncin >> " + lastVar);

         } else if (lastType.equals("TEXT")){

            return new ST("\"\";\ngetline(cin, " + lastVar + ")" );

         }
      }
      
      return new ST("var_" + ctx.ID().getText());
   }

   @Override public ST visitExprEnumWithValues(MusParser.ExprEnumWithValuesContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitBoolNegation(MusParser.BoolNegationContext ctx) {
      return new ST("!(" + visit(ctx.expr()).render() + ")");
   }

   @Override public ST visitNumericAddSub(MusParser.NumericAddSubContext ctx) {
      ST res = new ST("<expr1> <op> <expr2>");
      String op = ctx.op.getText();

      res.add("expr1", visit(ctx.expr(0)));
      res.add("op", ctx.op.getText());
      res.add("expr2", visit(ctx.expr(1)));

      return res;
   }

   @Override public ST visitNumericNegative(MusParser.NumericNegativeContext ctx) {
      ST res = new ST("-<num>");
      res.add("num", visit(ctx.expr()));
      return res;
   }

   @Override public ST visitNumericLiteral(MusParser.NumericLiteralContext ctx) {
      return new ST(ctx.NUM().getText());
   }

   @Override public ST visitExprParenthesis(MusParser.ExprParenthesisContext ctx) {
      ST res = new ST("(<expr>)");
      res.add("expr", visit(ctx.expr()));
      return res;
   }

   @Override public ST visitExprRobot(MusParser.ExprRobotContext ctx) {
      ST callST = new ST("<robotName>, <pos>");
      callST.add("robotName", visit(ctx.expr(0)));
      callST.add("pos", visit(ctx.expr(1)));
      return callST;
   }

   @Override public ST visitBoolDoubleCompare(MusParser.BoolDoubleCompareContext ctx) {
      ST res = new ST("<expr> <op1> <exprL> && <expr> <op2> <exprR>");
      String op1 = ctx.op1.getText();
      String op2 = ctx.op2.getText();

      switch (op1) {
         case "and":
            res.add("op1", "&&");
            break;

         case "or":
            res.add("op1", "||");
            break;

         case "<":
            res.add("op1", ">");
            break; 

         case "<=":
            res.add("op1", ">=");
            break;   
            
         case ">":
            res.add("op1", "<");
            break;   
            
         case ">=":
            res.add("op1", "<=");
            break;   

         default:
            res.add("op1", op1);
      }


      switch (op2) {
         case "and":
            res.add("op2", "&&");
            break;

         case "or":
            res.add("op2", "||");
            break;

         case "<":
            res.add("op2", "<");
            break; 

         case "<=":
            res.add("op2", "<=");
            break;   
            
         case ">":
            res.add("op2", ">");
            break;   
            
         case ">=":
            res.add("op2", ">=");
            break;   

         default:
            res.add("op2", op2);
      }

      
      res.add("expr", visit(ctx.expr(1)));
      res.add("exprL", visit(ctx.expr(0)));
      res.add("exprR", visit(ctx.expr(2)));

      return res;
   }

   @Override public ST visitExprCall(MusParser.ExprCallContext ctx) {
      return new ST(visit(ctx.call()));
   }

   /*@Override public ST visitBoolDoubleCompare(MusParser.BoolCompareContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }*/

   @Override public ST visitBoolCompare(MusParser.BoolCompareContext ctx) {
      ST condition = new ST("<op1> <operation> <op2>");
      condition.add("op1", visit(ctx.expr(0)));
      condition.add("op2", visit(ctx.expr(1)));

      String op = ctx.op.getText();

      switch (op) {
         case "and":
            condition.add("operation", "&&");
            break;
         case "or":
            condition.add("operation", "||");
            break;
         default:
            condition.add("operation", op);
      }

      return condition;
   }

   @Override public ST visitBoolLiteral(MusParser.BoolLiteralContext ctx) {
      return new ST((ctx.BOOL().getText()).toLowerCase());
   }

   @Override public ST visitExprEnum(MusParser.ExprEnumContext ctx) {
      ST res = null;
      //res.add("value", ctx.TEXT().getText());
      return res;
   }

   @Override public ST visitNumericMultDivMod(MusParser.NumericMultDivModContext ctx) {
      ST res = new ST("<expr1> <op> <expr2>");
      String op = ctx.op.getText();

      res.add("expr1", visit(ctx.expr(0)));
      res.add("op", ctx.op.getText());
      res.add("expr2", visit(ctx.expr(1)));

      return res;
   }

   @Override public ST visitTextLiteral(MusParser.TextLiteralContext ctx) {
      return new ST(ctx.TEXT().getText());
   }

   @Override public ST visitSingleCall(MusParser.SingleCallContext ctx) {
      return visit(ctx.call());
   }

   @Override public ST visitCall(MusParser.CallContext ctx) {

      ST callST = allTemplates.getInstanceOf("externalFunctions");
      String func = "";

      if (ctx.ID().size() == 1) {
         callST.add("ID2", ctx.ID(0).getText());
         func = ctx.ID(0).getText();
      }
      if (ctx.ID().size() == 2) {
         callST.add("ID1", ctx.ID(0).getText());
         callST.add("ID2", "." + ctx.ID(1).getText());
         func = ctx.ID(1).getText();
      }

      if (ctx.expr() != null) {  

         //rotate
         if (ctx.ID().size() == 1 && (ctx.ID(0).getText()).equals("rotate")) {
            String value = visit(ctx.expr(0)).render();
            callST.add("expr", value); 
            callST.add("expr", "-" + value); 
         }

         //stop
         else if (ctx.ID().size() == 1 && (ctx.ID(0).getText()).equals("stop")) {
            callST.add("expr", "0"); 
            callST.add("expr", "0"); 
         }

         //default
         else {
            for (int i=0; i<ctx.expr().size(); i++) {
               callST.add("expr", visit(ctx.expr(i))); 
            }            
         }
      }
      
      if (needApplyFunc.contains(func))  // the visitStat will insert an apply()
         needApply = true;

      return callST;
   }

   /*@Override public ST visitLogicalop(MusParser.LogicalopContext ctx) {
      ST res = new ST("<op>");
      String op = ctx.getText();
      System.out.println("LOGICAL OP: " + op);
      return null;

   }

   // @Override public ST visitType(MusParser.TypeContext ctx) {
   //    ST res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }*/
}