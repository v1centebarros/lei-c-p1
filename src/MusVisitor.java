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
	 * Visit a parse tree produced by {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MusParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MusParser.ExprContext ctx);
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