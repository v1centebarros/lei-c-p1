// Generated from Mus.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MusParser}.
 */
public interface MusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MusParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MusParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockIf}
	 * labeled alternative in {@link MusParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockIf(MusParser.BlockIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockIf}
	 * labeled alternative in {@link MusParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockIf(MusParser.BlockIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockWhile}
	 * labeled alternative in {@link MusParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockWhile(MusParser.BlockWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockWhile}
	 * labeled alternative in {@link MusParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockWhile(MusParser.BlockWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockUntil}
	 * labeled alternative in {@link MusParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockUntil(MusParser.BlockUntilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockUntil}
	 * labeled alternative in {@link MusParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockUntil(MusParser.BlockUntilContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MusParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MusParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusParser#singleCall}.
	 * @param ctx the parse tree
	 */
	void enterSingleCall(MusParser.SingleCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusParser#singleCall}.
	 * @param ctx the parse tree
	 */
	void exitSingleCall(MusParser.SingleCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(MusParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(MusParser.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolNegation}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolNegation(MusParser.BoolNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolNegation}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolNegation(MusParser.BoolNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolDoubleCompare}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolDoubleCompare(MusParser.BoolDoubleCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolDoubleCompare}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolDoubleCompare(MusParser.BoolDoubleCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEnumWithValues}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEnumWithValues(MusParser.ExprEnumWithValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEnumWithValues}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEnumWithValues(MusParser.ExprEnumWithValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolCompare}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolCompare(MusParser.BoolCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolCompare}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolCompare(MusParser.BoolCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericAddSub}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumericAddSub(MusParser.NumericAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericAddSub}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumericAddSub(MusParser.NumericAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericNegative}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumericNegative(MusParser.NumericNegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericNegative}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumericNegative(MusParser.NumericNegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericLiteral}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(MusParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericLiteral}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(MusParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(MusParser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(MusParser.ExprParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRobot}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRobot(MusParser.ExprRobotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRobot}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRobot(MusParser.ExprRobotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCall}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCall(MusParser.ExprCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCall}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCall(MusParser.ExprCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(MusParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(MusParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEnum}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEnum(MusParser.ExprEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEnum}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEnum(MusParser.ExprEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericMultDivMod}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumericMultDivMod(MusParser.NumericMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericMultDivMod}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumericMultDivMod(MusParser.NumericMultDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(MusParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextLiteral}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(MusParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(MusParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(MusParser.CallContext ctx);
}