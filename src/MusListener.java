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
	 * Enter a parse tree produced by the {@code AssignNum}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignNum(MusParser.AssignNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignNum}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignNum(MusParser.AssignNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignBool}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignBool(MusParser.AssignBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignBool}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignBool(MusParser.AssignBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignText}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignText(MusParser.AssignTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignText}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignText(MusParser.AssignTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignEnum}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignEnum(MusParser.AssignEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignEnum}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignEnum(MusParser.AssignEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignEnumWithValues}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignEnumWithValues(MusParser.AssignEnumWithValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignEnumWithValues}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignEnumWithValues(MusParser.AssignEnumWithValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignRobot}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignRobot(MusParser.AssignRobotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignRobot}
	 * labeled alternative in {@link MusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignRobot(MusParser.AssignRobotContext ctx);
}