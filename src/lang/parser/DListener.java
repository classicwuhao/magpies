// Generated from D.g by ANTLR 4.4
package lang.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DParser}.
 */
public interface DListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DParser#expr_in}.
	 * @param ctx the parse tree
	 */
	void enterExpr_in(@NotNull DParser.Expr_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expr_in}.
	 * @param ctx the parse tree
	 */
	void exitExpr_in(@NotNull DParser.Expr_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(@NotNull DParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(@NotNull DParser.SpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull DParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull DParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull DParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull DParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#cmd_print}.
	 * @param ctx the parse tree
	 */
	void enterCmd_print(@NotNull DParser.Cmd_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#cmd_print}.
	 * @param ctx the parse tree
	 */
	void exitCmd_print(@NotNull DParser.Cmd_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#expr_op}.
	 * @param ctx the parse tree
	 */
	void enterExpr_op(@NotNull DParser.Expr_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expr_op}.
	 * @param ctx the parse tree
	 */
	void exitExpr_op(@NotNull DParser.Expr_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#l_expr_op}.
	 * @param ctx the parse tree
	 */
	void enterL_expr_op(@NotNull DParser.L_expr_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#l_expr_op}.
	 * @param ctx the parse tree
	 */
	void exitL_expr_op(@NotNull DParser.L_expr_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#cmd_find}.
	 * @param ctx the parse tree
	 */
	void enterCmd_find(@NotNull DParser.Cmd_findContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#cmd_find}.
	 * @param ctx the parse tree
	 */
	void exitCmd_find(@NotNull DParser.Cmd_findContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#expr_with_for}.
	 * @param ctx the parse tree
	 */
	void enterExpr_with_for(@NotNull DParser.Expr_with_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expr_with_for}.
	 * @param ctx the parse tree
	 */
	void exitExpr_with_for(@NotNull DParser.Expr_with_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#module_decl_expression}.
	 * @param ctx the parse tree
	 */
	void enterModule_decl_expression(@NotNull DParser.Module_decl_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#module_decl_expression}.
	 * @param ctx the parse tree
	 */
	void exitModule_decl_expression(@NotNull DParser.Module_decl_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull DParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull DParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#expr_hd_element}.
	 * @param ctx the parse tree
	 */
	void enterExpr_hd_element(@NotNull DParser.Expr_hd_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expr_hd_element}.
	 * @param ctx the parse tree
	 */
	void exitExpr_hd_element(@NotNull DParser.Expr_hd_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#expr_of}.
	 * @param ctx the parse tree
	 */
	void enterExpr_of(@NotNull DParser.Expr_ofContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expr_of}.
	 * @param ctx the parse tree
	 */
	void exitExpr_of(@NotNull DParser.Expr_ofContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull DParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull DParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#expr_short_link}.
	 * @param ctx the parse tree
	 */
	void enterExpr_short_link(@NotNull DParser.Expr_short_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expr_short_link}.
	 * @param ctx the parse tree
	 */
	void exitExpr_short_link(@NotNull DParser.Expr_short_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#plan}.
	 * @param ctx the parse tree
	 */
	void enterPlan(@NotNull DParser.PlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#plan}.
	 * @param ctx the parse tree
	 */
	void exitPlan(@NotNull DParser.PlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#expr_rule}.
	 * @param ctx the parse tree
	 */
	void enterExpr_rule(@NotNull DParser.Expr_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expr_rule}.
	 * @param ctx the parse tree
	 */
	void exitExpr_rule(@NotNull DParser.Expr_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(@NotNull DParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(@NotNull DParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#quant}.
	 * @param ctx the parse tree
	 */
	void enterQuant(@NotNull DParser.QuantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#quant}.
	 * @param ctx the parse tree
	 */
	void exitQuant(@NotNull DParser.QuantContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#expr_element}.
	 * @param ctx the parse tree
	 */
	void enterExpr_element(@NotNull DParser.Expr_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expr_element}.
	 * @param ctx the parse tree
	 */
	void exitExpr_element(@NotNull DParser.Expr_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull DParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull DParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#expr_link}.
	 * @param ctx the parse tree
	 */
	void enterExpr_link(@NotNull DParser.Expr_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expr_link}.
	 * @param ctx the parse tree
	 */
	void exitExpr_link(@NotNull DParser.Expr_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#expr_accessor}.
	 * @param ctx the parse tree
	 */
	void enterExpr_accessor(@NotNull DParser.Expr_accessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expr_accessor}.
	 * @param ctx the parse tree
	 */
	void exitExpr_accessor(@NotNull DParser.Expr_accessorContext ctx);
}