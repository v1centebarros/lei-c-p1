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
	 * Visit a parse tree produced by the {@code AssignNum}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignNum(MusParser.AssignNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignBool}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignBool(MusParser.AssignBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignText}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignText(MusParser.AssignTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignEnum}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignEnum(MusParser.AssignEnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignEnumWithValues}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignEnumWithValues(MusParser.AssignEnumWithValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignRobot}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignRobot(MusParser.AssignRobotContext ctx);
}