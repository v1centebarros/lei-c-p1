import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.stringtemplate.v4.*;



public class CodeGenerator extends MusBaseVisitor<ST> {

   // ST Group
   STGroup allTemplates;

   //all ST -> main & robot processes functions
   private ST mainST;
   private HashMap<String, ST> robotFunc;
   private HashMap<String, ST> userFunc;   // st hashmap with {funcName: ST}


   //simple functions (without arguments) inculind UDFs
   private Map<String, String> simpleFunc = new HashMap<>();

   //UDFs with arguments
   private Map<String, String> UDF = new HashMap<>();

   //List variables
   private HashMap<String, String> listVariables;


   //type and values of the last assignment
   private String lastType;


   //use keyword activate
   private String lastVar;


   //current robot (for robot functions)
   private String currentRobot;


   //functions that need an apply statement
   private List<String> needApplyFunc;
   private boolean needApply;

   //aux vars
   private boolean useActive;  //true -> the statement is a 'use' keyword
   private boolean isInit;   // true -> if the stat is the init (for ';')
   private boolean isUDF;
   private boolean isList;     // true -> is a list (var or [e1, e2, etc])  => important for the behaviour of +, -, etc
   private boolean isNum;
   private boolean isBool;
   private boolean isText;
   private boolean isTuple;
   private int robotCounter;

   //data types
   private HashMap<String, String> dataTypes;
   

   public CodeGenerator() {
      //stringTemplate = new ST();
      allTemplates = new STGroupFile("Templates.stg");

      //all ST -> main & robot process function
      mainST = new ST("<main_f>");
      robotFunc = new HashMap<>();
      userFunc = new HashMap<>();

      //last assignment info
      lastType = null;
      lastVar = null;

      //current robot
      currentRobot = null;  //null --> main function

      useActive = false;  //use keyword activate
      isInit = false;     //is init robot
      isUDF = false;      //is UDF
      isList = false;   //true if is a list
      isNum = false;
      isBool = false;
      isText = false;
      isTuple = false;      
      robotCounter = 0;

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

      //UDF
      UDF = new HashMap<>();

      //list variables
      listVariables = new HashMap<>();

      //Data types (for function declaration)
      dataTypes = new HashMap<>();
      dataTypes.put("NUM", "float");
      dataTypes.put("BOOL", "bool");
      dataTypes.put("TEXT", "string");
      dataTypes.put("ENUM", "int");
      dataTypes.put("LIST_NUM", "std::vector<float>");
      dataTypes.put("LIST_TEXT", "std::vector<string>");
      dataTypes.put("LIST_BOOL", "std::vector<bool>");
      dataTypes.put("LIST_POINT", "std::vector<Point>");
      dataTypes.put("LIST_TWIST", "std::vector<Point>");
   }



   private void printToFile(ST stringTemplate) {
      try {
         FileWriter myWriter = new FileWriter("destinationLanguage.cpp");

         //render ST
         String s = stringTemplate.render();
         System.out.println("ST: \n" +  s);
         myWriter.write(s);
         myWriter.close();
         System.out.println("Successfully wrote to the file.");

      } catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }

   @Override public ST visitProgram(MusParser.ProgramContext ctx) {
      ST programaTodo = allTemplates.getInstanceOf("program");

      programaTodo.add("global", "");  //see later

      //UDFs  (need to be first!!!)
      for(int i = 0; i < ctx.defFunction().size(); i++) {
         ST funcST = visit(ctx.defFunction(i));
      }


      //main and robot_process_func
      for(int i = 0; i < ctx.stat().size(); i++) {
         ST statST = visit(ctx.stat(i));

         if (currentRobot == null)
            mainST.add("main_f", statST);
         else{
            robotFunc.get(currentRobot).add("stats", statST);
         }
            
      }

      if (robotCounter > 0)
         mainST.add("main_f", "\n\nwhile(wait(NULL) > 0);");

      //add main ST
      mainST.add("main_f", "\n//end of main function");  //importante if the main is empty
      programaTodo.add("main", mainST);


      //add robotFunc ST
      for (String func : robotFunc.keySet()) {
         programaTodo.add("processBlock", robotFunc.get(func));
      }

      //add  UDF ST
      for (String func : userFunc.keySet()) {
         programaTodo.add("funcBlock", userFunc.get(func));
      }      


      //print target code into file
      printToFile(programaTodo);
      return programaTodo;
   }

   @Override public ST visitDefFunction(MusParser.DefFunctionContext ctx) {

      ST funcST = allTemplates.getInstanceOf("funcBlock");
      
      String func_type = "";
      String func_name = "";

      //If #id == #type --> not void,   #id > #type  -->  void
      boolean isVoid = ctx.ID().size() > ctx.TYPE().size() || ctx.ID().size()==0 && ctx.TYPE().size()==0;


      //get func type
      if (ctx.TYPE() != null) {
         if (isVoid)
            func_type = "void";
         else
            func_type = dataTypes.get(ctx.TYPE(0).getText());
      }

      //get func name
      if (ctx.ID(0) != null) 
         func_name = ctx.ID(0).getText();

      
      //get args and its type
      String arg = "";
      String arg_type = "";

      if (isVoid) {
         for (int i=1; i<ctx.ID().size(); i++)
            funcST.add("funcArgs", dataTypes.get(ctx.TYPE(i-1).getText()) + " var_" + ctx.ID(i).getText());         
      }
      else {
         for (int i=1; i<ctx.ID().size(); i++)
            funcST.add("funcArgs", dataTypes.get(ctx.TYPE(i).getText()) + " var_" + ctx.ID(i).getText());            
      }


      for (int i=0; i<ctx.stat().size(); i++)
         funcST.add("funcStat", visit(ctx.stat(i)));

      

      funcST.add("funcType", func_type);
      funcST.add("funcName", func_name);

      userFunc.put(func_name, funcST);
      return userFunc.get(func_name);

   }

   @Override public ST visitStat(MusParser.StatContext ctx) {
      ST res = new ST("<stat><comma>");

      if(ctx.block() != null) {
         res.add("stat", visit(ctx.block()));
         res.add("comma","\n");
      }
      else if(ctx.assignment() != null) {
         ST tmp = visit(ctx.assignment());

         if (isInit) {
            res.add("stat", "");
            res.add("comma","");          
            isInit = false;     
         }
         else {
            res.add("stat", tmp);
            res.add("comma",";\n");   
         }
       
      }
      else if(ctx.singleCall() != null) {
         ST tmp = visit(ctx.singleCall());

         //insert apply(); if needed
            if (!useActive) {
               res.add("stat", tmp);
               if (!needApply)
                  res.add("comma",";\n");
               else {
                  res.add("comma",";\napply();\n");
                  needApply = false;  //reset apply() var
               }            
            }
            else{
               useActive = false;
               res.add("stat", "");
               res.add("comma", "");
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

      ST assign = allTemplates.getInstanceOf("assign");

      //var name
      String varName = ctx.ID().getText();
      lastVar = "var_" + varName;

      if(ctx.TYPE() != null) {
         String type = ctx.TYPE().getText();
         lastType = type;

         //store var name (important to chnage the behaviour of +, -, etc)
         if (varName.startsWith("LIST_")) {
            isList = true;
            listVariables.put(varName, type);
         }

         if (type.equals("ROBOT")) {
            ST fork = allTemplates.getInstanceOf("forkBlock");

            //create process function
            fork.add("counter", robotCounter + "");
            fork.add("func", "robot_process_" + varName);
            mainST.add("main_f", fork);
            robotCounter++;

            //register string template
            isInit = true;
            ST initRobotST = new ST("init(<expr>);\n");
            initRobotST.add("expr", visit(ctx.expr()));
            robotFunc.put(varName, allTemplates.getInstanceOf("processBlock"));
            robotFunc.get(varName).add("process_name", "robot_process_" + varName);
            robotFunc.get(varName).add("stats", initRobotST);

            return new ST("");
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

   @Override public ST visitExprList(MusParser.ExprListContext ctx) {

      isList = true;
      ST listST = new ST("{<value; separator=\", \">}");

      if (ctx.expr().size() == 0)
         listST.add("value", "");
      else {
         for (int i=0; i<ctx.expr().size(); i++) {
            listST.add("value", visit(ctx.expr(i)));
         }         
      }

      return listST;

   }

   @Override public ST visitExprVar(MusParser.ExprVarContext ctx) {
      String varName = ctx.ID().getText();
      
      //if the name is a func name -> return function()
      if (simpleFunc.containsKey(varName)) {
         if (simpleFunc.get(varName).equals("beaconCount()"))
            return new ST("(int) beaconCount()");  //cast to int
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

      if (useActive)
         return new ST(ctx.ID().getText());

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

      // this will update isList, isNum, isText, isTuple, isBool
      ST op1 = visit(ctx.expr(0));
      ST op2 = visit(ctx.expr(1));

      //if operands are only numbers
      if (!isList && !isTuple) {
         ST res = new ST("<expr1> <op> <expr2>");
         String op = ctx.op.getText();

         res.add("expr1", visit(ctx.expr(0)));
         res.add("op", ctx.op.getText());
         res.add("expr2", visit(ctx.expr(1)));

         return res;         
      
      }
      else if (isList) {

         if (isNum){
            isNum = false;
            return new ST("concat_num(" + op1.render() + ", " + op2.render() + ")");            
         }

         if (isBool) {
            isBool = false;
            return new ST("concat_bool(" + op1.render() + ", " + op2.render() + ")");            
         }

         if (isText){
            isNum = false;
            return new ST("concat_text(" + op1.render() + ", " + op2.render() + ")");            
         }

         if (isTuple) {
            isBool = false;
            return new ST("concat_tuple(" + op1.render() + ", " + op2.render() + ")");            
         }

      }
      else if (!isList && isTuple){
         //TODO: fazer operacao entre point
      }

      return new ST("");

   }

   @Override public ST visitNumericNegative(MusParser.NumericNegativeContext ctx) {
      ST res = new ST("-<num>");
      res.add("num", visit(ctx.expr()));
      return res;
   }

   @Override public ST visitNumericLiteral(MusParser.NumericLiteralContext ctx) {
      isNum = true;
      return new ST(ctx.NUM().getText());
   }

   @Override public ST visitExprParenthesis(MusParser.ExprParenthesisContext ctx) {
      ST res = new ST("(<expr>)");
      res.add("expr", visit(ctx.expr()));
      return res;
   }

   @Override public ST visitExprTuple(MusParser.ExprTupleContext ctx) {


      // TODO: fazer casos para os point, etc.
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
      isBool = true;
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
      isText = true;
      return new ST(ctx.TEXT().getText());
   }

   @Override public ST visitSingleCall(MusParser.SingleCallContext ctx) {
      return visit(ctx.call());
   }

   @Override public ST visitCall(MusParser.CallContext ctx) {

      ST callST = allTemplates.getInstanceOf("externalFunctions");
      String func = "";

      if (ctx.ID().size() == 1) {
         func = ctx.ID(0).getText();

         if (func.equals("use")) {
            useActive = true;
            currentRobot = (visit(ctx.expr(0))).render();
            return new ST("");            
         }

         if (func.equals("return")) {
            return new ST("return " + visit(ctx.expr(0)).render());
         }

         // check if is UDF or external functions
         if (userFunc.containsKey(func)) 
            callST.add("user_func", func);
         else 
            callST.add("ID2", ctx.ID(0).getText());

      }
      if (ctx.ID().size() == 2) {
         func = ctx.ID(1).getText();
         callST.add("ID1", "var_" + ctx.ID(0).getText());
         callST.add("ID2", ctx.ID(1).getText());
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

}