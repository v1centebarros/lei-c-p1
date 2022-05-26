// Generated from Mus.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MusParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockIf}
	 * labeled alternative in {@link MusParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockIf(MusParser.BlockIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockWhile}
	 * labeled alternative in {@link MusParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockWhile(MusParser.BlockWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockUntil}
	 * labeled alternative in {@link MusParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockUntil(MusParser.BlockUntilContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MusParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRobot}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRobot(MusParser.ExprRobotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEnum}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnum(MusParser.ExprEnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEnumWithValues}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnumWithValues(MusParser.ExprEnumWithValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(MusParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumeric}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumeric(MusParser.ExprNumericContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(MusParser.ExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprText}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprText(MusParser.ExprTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCallFunc}
	 * labeled alternative in {@link MusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCallFunc(MusParser.ExprCallFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolCompareNum}
	 * labeled alternative in {@link MusParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCompareNum(MusParser.BoolCompareNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolDoubleCompare}
	 * labeled alternative in {@link MusParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDoubleCompare(MusParser.BoolDoubleCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolCompare}
	 * labeled alternative in {@link MusParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCompare(MusParser.BoolCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link MusParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(MusParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolParenthesis}
	 * labeled alternative in {@link MusParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParenthesis(MusParser.BoolParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolDoubleCompareNum}
	 * labeled alternative in {@link MusParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDoubleCompareNum(MusParser.BoolDoubleCompareNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link MusParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVar(MusParser.BoolVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericVar}
	 * labeled alternative in {@link MusParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericVar(MusParser.NumericVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericAddSub}
	 * labeled alternative in {@link MusParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericAddSub(MusParser.NumericAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericParenthesis}
	 * labeled alternative in {@link MusParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericParenthesis(MusParser.NumericParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericNegative}
	 * labeled alternative in {@link MusParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericNegative(MusParser.NumericNegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericLiteral}
	 * labeled alternative in {@link MusParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(MusParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericMultDivMod}
	 * labeled alternative in {@link MusParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericMultDivMod(MusParser.NumericMultDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(MusParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MusParser.TypeContext ctx);
}