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
	 * Enter a parse tree produced by {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MusParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MusParser.ExprContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link MusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MusParser.TypeContext ctx);
}