// Generated from Lab.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabParser}.
 */
public interface LabListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LabParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LabParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LabParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LabParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabParser#grid}.
	 * @param ctx the parse tree
	 */
	void enterGrid(LabParser.GridContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabParser#grid}.
	 * @param ctx the parse tree
	 */
	void exitGrid(LabParser.GridContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(LabParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(LabParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabParser#labirinto}.
	 * @param ctx the parse tree
	 */
	void enterLabirinto(LabParser.LabirintoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabParser#labirinto}.
	 * @param ctx the parse tree
	 */
	void exitLabirinto(LabParser.LabirintoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(LabParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(LabParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabParser#beacon}.
	 * @param ctx the parse tree
	 */
	void enterBeacon(LabParser.BeaconContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabParser#beacon}.
	 * @param ctx the parse tree
	 */
	void exitBeacon(LabParser.BeaconContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabParser#wall}.
	 * @param ctx the parse tree
	 */
	void enterWall(LabParser.WallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabParser#wall}.
	 * @param ctx the parse tree
	 */
	void exitWall(LabParser.WallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabParser#corner}.
	 * @param ctx the parse tree
	 */
	void enterCorner(LabParser.CornerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabParser#corner}.
	 * @param ctx the parse tree
	 */
	void exitCorner(LabParser.CornerContext ctx);
}