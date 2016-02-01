// Generated from D.g by ANTLR 4.4
package lang.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		WS=17, SL_COMMENT=18, ML_COMMENT=19, ARROW=20, AT=21, BAR=22, COLON=23, 
		COLON_COLON=24, COLON_EQUAL=25, COMMA=26, DOT=27, DOTDOT=28, EQUAL=29, 
		GREATER=30, GREATER_EQUAL=31, HASH=32, LBRACE=33, LBRACK=34, LESS=35, 
		LESS_EQUAL=36, LPAREN=37, MINUS=38, NOT_EQUAL=39, PLUS=40, RBRACE=41, 
		RBRACK=42, RPAREN=43, SEMI=44, SLASH=45, STAR=46, QUESTION=47, RARROW=48, 
		INT=49, STRING=50, IDENT=51;
	public static final String[] tokenNames = {
		"<INVALID>", "'fixed'", "'in'", "'of'", "'for'", "'Spec'", "'print'", 
		"'none'", "'Plan'", "'find'", "'with'", "'as'", "'relaxed'", "'Struct'", 
		"'and'", "'zero'", "'rule'", "WS", "SL_COMMENT", "ML_COMMENT", "'->'", 
		"'@'", "'|'", "':'", "'::'", "':='", "','", "'.'", "'..'", "'='", "'>'", 
		"'>='", "'#'", "'{'", "'['", "'<'", "'<='", "'('", "'-'", "'<>'", "'+'", 
		"'}'", "']'", "')'", "';'", "'/'", "'*'", "'?'", "'=>'", "INT", "STRING", 
		"IDENT"
	};
	public static final int
		RULE_spec = 0, RULE_struct = 1, RULE_plan = 2, RULE_module_decl_expression = 3, 
		RULE_expr_link = 4, RULE_expr_op = 5, RULE_l_expr_op = 6, RULE_list = 7, 
		RULE_expr_rule = 8, RULE_expression = 9, RULE_expr_of = 10, RULE_expr_element = 11, 
		RULE_element = 12, RULE_expr_accessor = 13, RULE_expr_hd_element = 14, 
		RULE_expr_short_link = 15, RULE_expr_in = 16, RULE_expr_with_for = 17, 
		RULE_modifier = 18, RULE_quant = 19, RULE_command = 20, RULE_cmd_find = 21, 
		RULE_cmd_print = 22;
	public static final String[] ruleNames = {
		"spec", "struct", "plan", "module_decl_expression", "expr_link", "expr_op", 
		"l_expr_op", "list", "expr_rule", "expression", "expr_of", "expr_element", 
		"element", "expr_accessor", "expr_hd_element", "expr_short_link", "expr_in", 
		"expr_with_for", "modifier", "quant", "command", "cmd_find", "cmd_print"
	};

	@Override
	public String getGrammarFileName() { return "D.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SpecContext extends ParserRuleContext {
		public ASTSpec t_spec;
		public Token name;
		public StructContext t;
		public PlanContext p;
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DParser.EOF, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(DParser.LBRACE, 0); }
		public PlanContext plan(int i) {
			return getRuleContext(PlanContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(DParser.RBRACE, 0); }
		public List<PlanContext> plan() {
			return getRuleContexts(PlanContext.class);
		}
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(DParser.COLON, 0); }
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitSpec(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_spec);
		((SpecContext)_localctx).t_spec = new ASTSpec();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(T__11);
			setState(47); match(COLON);
			setState(48); ((SpecContext)_localctx).name = match(IDENT);
			_localctx.t_spec.setName((((SpecContext)_localctx).name!=null?((SpecContext)_localctx).name.getText():null));
			setState(50); match(LBRACE);
			setState(51); ((SpecContext)_localctx).t = struct();
			_localctx.t_spec.setStruct(((SpecContext)_localctx).t.t_struct);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(53); ((SpecContext)_localctx).p = plan();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59); command();
			setState(60); match(RBRACE);
			setState(61); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructContext extends ParserRuleContext {
		public ASTStruct t_struct;
		public Token name;
		public TerminalNode LBRACE() { return getToken(DParser.LBRACE, 0); }
		public Module_decl_expressionContext module_decl_expression(int i) {
			return getRuleContext(Module_decl_expressionContext.class,i);
		}
		public List<Module_decl_expressionContext> module_decl_expression() {
			return getRuleContexts(Module_decl_expressionContext.class);
		}
		public TerminalNode RBRACE() { return getToken(DParser.RBRACE, 0); }
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(DParser.COLON, 0); }
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitStruct(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_struct);
		((StructContext)_localctx).t_struct = new ASTStruct();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(T__3);
			setState(64); match(COLON);
			setState(65); ((StructContext)_localctx).name = match(IDENT);
			_localctx.t_struct.setName((((StructContext)_localctx).name!=null?((StructContext)_localctx).name.getText():null));
			setState(67); match(LBRACE);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==IDENT) {
				{
				{
				setState(68); module_decl_expression();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlanContext extends ParserRuleContext {
		public List<Expr_ruleContext> expr_rule() {
			return getRuleContexts(Expr_ruleContext.class);
		}
		public TerminalNode LBRACE() { return getToken(DParser.LBRACE, 0); }
		public Expr_ruleContext expr_rule(int i) {
			return getRuleContext(Expr_ruleContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(DParser.RBRACE, 0); }
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(DParser.COLON, 0); }
		public PlanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterPlan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitPlan(this);
		}
	}

	public final PlanContext plan() throws RecognitionException {
		PlanContext _localctx = new PlanContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_plan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(T__8);
			setState(77); match(COLON);
			setState(78); match(IDENT);
			setState(79); match(LBRACE);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__13) | (1L << T__9) | (1L << T__4) | (1L << T__1) | (1L << T__0) | (1L << PLUS) | (1L << STAR) | (1L << QUESTION) | (1L << INT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(80); expr_rule();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_decl_expressionContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(DParser.RBRACK, 0); }
		public Expr_opContext expr_op() {
			return getRuleContext(Expr_opContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DParser.COMMA); }
		public Expr_linkContext expr_link(int i) {
			return getRuleContext(Expr_linkContext.class,i);
		}
		public TerminalNode RARROW(int i) {
			return getToken(DParser.RARROW, i);
		}
		public TerminalNode EQUAL() { return getToken(DParser.EQUAL, 0); }
		public List<TerminalNode> RARROW() { return getTokens(DParser.RARROW); }
		public List<Expr_linkContext> expr_link() {
			return getRuleContexts(Expr_linkContext.class);
		}
		public List<TerminalNode> IDENT() { return getTokens(DParser.IDENT); }
		public TerminalNode COMMA(int i) {
			return getToken(DParser.COMMA, i);
		}
		public TerminalNode IDENT(int i) {
			return getToken(DParser.IDENT, i);
		}
		public TerminalNode LBRACK() { return getToken(DParser.LBRACK, 0); }
		public Module_decl_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_decl_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterModule_decl_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitModule_decl_expression(this);
		}
	}

	public final Module_decl_expressionContext module_decl_expression() throws RecognitionException {
		Module_decl_expressionContext _localctx = new Module_decl_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_module_decl_expression);
		int _la;
		try {
			int _alt;
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(88); match(IDENT);
					setState(89); match(EQUAL);
					}
				}

				setState(92); list();
				setState(95);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(93); match(T__5);
					setState(94); match(IDENT);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(97); match(IDENT);
					setState(98); match(EQUAL);
					}
				}

				setState(101); match(LBRACK);
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(102); expr_link();
						setState(103); match(RARROW);
						setState(104); expr_link();
						setState(105); match(COMMA);
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(112); expr_link();
				setState(113); match(RARROW);
				setState(114); expr_link();
				setState(115); match(RBRACK);
				setState(118);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(116); match(T__5);
					setState(117); match(IDENT);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120); match(IDENT);
				setState(121); match(EQUAL);
				setState(122); expr_op();
				setState(125);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(123); match(T__5);
					setState(124); match(IDENT);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_linkContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(DParser.LBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DParser.COMMA); }
		public List<Expr_elementContext> expr_element() {
			return getRuleContexts(Expr_elementContext.class);
		}
		public TerminalNode RBRACE() { return getToken(DParser.RBRACE, 0); }
		public TerminalNode STRING() { return getToken(DParser.STRING, 0); }
		public Expr_elementContext expr_element(int i) {
			return getRuleContext(Expr_elementContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DParser.COMMA, i);
		}
		public Expr_short_linkContext expr_short_link() {
			return getRuleContext(Expr_short_linkContext.class,0);
		}
		public Expr_linkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpr_link(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpr_link(this);
		}
	}

	public final Expr_linkContext expr_link() throws RecognitionException {
		Expr_linkContext _localctx = new Expr_linkContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr_link);
		try {
			int _alt;
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(129); match(LBRACE);
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(130); expr_element();
						setState(131); match(COMMA);
						}
						} 
					}
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(138); expr_element();
				setState(139); match(RBRACE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); expr_short_link();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142); match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143); expr_element();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_opContext extends ParserRuleContext {
		public L_expr_opContext l_expr_op() {
			return getRuleContext(L_expr_opContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public Expr_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpr_op(this);
		}
	}

	public final Expr_opContext expr_op() throws RecognitionException {
		Expr_opContext _localctx = new Expr_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr_op);
		try {
			setState(151);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); match(IDENT);
				setState(147); l_expr_op();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); list();
				setState(149); l_expr_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class L_expr_opContext extends ParserRuleContext {
		public Expr_opContext expr_op() {
			return getRuleContext(Expr_opContext.class,0);
		}
		public L_expr_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_expr_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterL_expr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitL_expr_op(this);
		}
	}

	public final L_expr_opContext l_expr_op() throws RecognitionException {
		L_expr_opContext _localctx = new L_expr_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_l_expr_op);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(PLUS);
				setState(154); expr_op();
				}
				break;
			case T__5:
			case LBRACK:
			case RBRACE:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(DParser.RBRACK, 0); }
		public TerminalNode STRING(int i) {
			return getToken(DParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DParser.COMMA); }
		public List<TerminalNode> STRING() { return getTokens(DParser.STRING); }
		public TerminalNode COMMA(int i) {
			return getToken(DParser.COMMA, i);
		}
		public TerminalNode LBRACK() { return getToken(DParser.LBRACK, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(LBRACK);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(159); match(STRING);
						setState(160); match(COMMA);
						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(166); match(STRING);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_ruleContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public Expr_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpr_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpr_rule(this);
		}
	}

	public final Expr_ruleContext expr_rule() throws RecognitionException {
		Expr_ruleContext _localctx = new Expr_ruleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__4) | (1L << T__0))) != 0)) {
				{
				setState(175);
				_la = _input.LA(1);
				if (_la==T__15 || _la==T__4) {
					{
					setState(174); modifier();
					}
				}

				setState(177); match(T__0);
				setState(178); match(IDENT);
				setState(179); match(COLON);
				}
			}

			setState(182); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expr_inContext expr_in() {
			return getRuleContext(Expr_inContext.class,0);
		}
		public Expr_elementContext expr_element() {
			return getRuleContext(Expr_elementContext.class,0);
		}
		public Expr_ofContext expr_of() {
			return getRuleContext(Expr_ofContext.class,0);
		}
		public Expr_with_forContext expr_with_for() {
			return getRuleContext(Expr_with_forContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); expr_of();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); expr_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186); expr_in();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187); expr_with_for();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_ofContext extends ParserRuleContext {
		public Expr_accessorContext expr_accessor() {
			return getRuleContext(Expr_accessorContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public QuantContext quant() {
			return getRuleContext(QuantContext.class,0);
		}
		public Expr_ofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpr_of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpr_of(this);
		}
	}

	public final Expr_ofContext expr_of() throws RecognitionException {
		Expr_ofContext _localctx = new Expr_ofContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); quant();
			setState(191); match(T__13);
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(192); expr_accessor();
				}
				break;
			}
			setState(195); match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Expr_accessorContext expr_accessor() {
			return getRuleContext(Expr_accessorContext.class,0);
		}
		public Expr_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpr_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpr_element(this);
		}
	}

	public final Expr_elementContext expr_element() throws RecognitionException {
		Expr_elementContext _localctx = new Expr_elementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(197); expr_accessor();
				}
				break;
			}
			setState(200); element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(DParser.RBRACK, 0); }
		public TerminalNode LBRACE() { return getToken(DParser.LBRACE, 0); }
		public List<Expr_elementContext> expr_element() {
			return getRuleContexts(Expr_elementContext.class);
		}
		public Expr_hd_elementContext expr_hd_element() {
			return getRuleContext(Expr_hd_elementContext.class,0);
		}
		public TerminalNode STAR() { return getToken(DParser.STAR, 0); }
		public TerminalNode RBRACE() { return getToken(DParser.RBRACE, 0); }
		public Expr_elementContext expr_element(int i) {
			return getRuleContext(Expr_elementContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DParser.COMMA, i);
		}
		public TerminalNode LBRACK() { return getToken(DParser.LBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DParser.COMMA); }
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public TerminalNode STRING() { return getToken(DParser.STRING, 0); }
		public Expr_short_linkContext expr_short_link() {
			return getRuleContext(Expr_short_linkContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_element);
		try {
			int _alt;
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); match(IDENT);
				setState(203); match(LBRACK);
				setState(204); match(STRING);
				setState(205); match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); match(IDENT);
				setState(207); match(LBRACK);
				setState(208); match(LBRACE);
				setState(209); match(STRING);
				setState(210); match(RBRACE);
				setState(211); match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212); match(IDENT);
				setState(213); match(LBRACK);
				setState(214); match(STAR);
				setState(215); match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216); match(IDENT);
				setState(217); match(LBRACK);
				{
				setState(218); match(LBRACE);
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(219); expr_element();
						setState(220); match(COMMA);
						}
						} 
					}
					setState(226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(227); expr_element();
				setState(228); match(RBRACE);
				}
				setState(230); match(RBRACK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232); match(IDENT);
				setState(233); match(LBRACK);
				setState(234); expr_short_link();
				setState(235); match(RBRACK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237); expr_hd_element();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_accessorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DParser.DOT, 0); }
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public Expr_accessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_accessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpr_accessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpr_accessor(this);
		}
	}

	public final Expr_accessorContext expr_accessor() throws RecognitionException {
		Expr_accessorContext _localctx = new Expr_accessorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_accessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(IDENT);
			setState(241); match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_hd_elementContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(DParser.RBRACK, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(DParser.LBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(DParser.RBRACE, i);
		}
		public TerminalNode STRING(int i) {
			return getToken(DParser.STRING, i);
		}
		public List<Expr_elementContext> expr_element() {
			return getRuleContexts(Expr_elementContext.class);
		}
		public TerminalNode STAR() { return getToken(DParser.STAR, 0); }
		public List<TerminalNode> RBRACE() { return getTokens(DParser.RBRACE); }
		public Expr_elementContext expr_element(int i) {
			return getRuleContext(Expr_elementContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DParser.COMMA, i);
		}
		public TerminalNode LBRACK() { return getToken(DParser.LBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DParser.COMMA); }
		public Expr_short_linkContext expr_short_link(int i) {
			return getRuleContext(Expr_short_linkContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(DParser.COLON, 0); }
		public List<TerminalNode> STRING() { return getTokens(DParser.STRING); }
		public TerminalNode LBRACE(int i) {
			return getToken(DParser.LBRACE, i);
		}
		public List<Expr_short_linkContext> expr_short_link() {
			return getRuleContexts(Expr_short_linkContext.class);
		}
		public Expr_hd_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_hd_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpr_hd_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpr_hd_element(this);
		}
	}

	public final Expr_hd_elementContext expr_hd_element() throws RecognitionException {
		Expr_hd_elementContext _localctx = new Expr_hd_elementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_hd_element);
		int _la;
		try {
			int _alt;
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); match(IDENT);
				setState(244); match(LBRACK);
				setState(246);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(245); match(STRING);
					}
				}

				setState(248); match(COLON);
				setState(250);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(249); match(STRING);
					}
				}

				setState(252); match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); match(IDENT);
				setState(254); match(LBRACK);
				setState(255); match(LBRACE);
				setState(257);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(256); match(STRING);
					}
				}

				setState(259); match(COLON);
				setState(261);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(260); match(STRING);
					}
				}

				setState(263); match(RBRACE);
				setState(264); match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265); match(IDENT);
				setState(266); match(LBRACK);
				setState(279);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(267); match(LBRACE);
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(268); expr_element();
							setState(269); match(COMMA);
							}
							} 
						}
						setState(275);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					}
					setState(276); expr_element();
					setState(277); match(RBRACE);
					}
				}

				setState(281); match(COLON);
				setState(294);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(282); match(LBRACE);
					setState(288);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(283); expr_element();
							setState(284); match(COMMA);
							}
							} 
						}
						setState(290);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(291); expr_element();
					setState(292); match(RBRACE);
					}
				}

				setState(296); match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297); match(IDENT);
				setState(298); match(LBRACK);
				setState(300);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(299); expr_short_link();
					}
				}

				setState(302); match(COLON);
				setState(304);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(303); expr_short_link();
					}
				}

				setState(306); match(RBRACK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307); match(IDENT);
				setState(308); match(LBRACK);
				setState(309); match(STAR);
				setState(310); match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_short_linkContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(DParser.LBRACE, 0); }
		public TerminalNode STRING(int i) {
			return getToken(DParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DParser.COMMA); }
		public TerminalNode RBRACE() { return getToken(DParser.RBRACE, 0); }
		public List<TerminalNode> STRING() { return getTokens(DParser.STRING); }
		public TerminalNode COMMA(int i) {
			return getToken(DParser.COMMA, i);
		}
		public Expr_short_linkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_short_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpr_short_link(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpr_short_link(this);
		}
	}

	public final Expr_short_linkContext expr_short_link() throws RecognitionException {
		Expr_short_linkContext _localctx = new Expr_short_linkContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_short_link);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313); match(LBRACE);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(314); match(STRING);
					setState(315); match(COMMA);
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(321); match(STRING);
			setState(322); match(RBRACE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_inContext extends ParserRuleContext {
		public List<Expr_elementContext> expr_element() {
			return getRuleContexts(Expr_elementContext.class);
		}
		public Expr_ofContext expr_of() {
			return getRuleContext(Expr_ofContext.class,0);
		}
		public Expr_elementContext expr_element(int i) {
			return getRuleContext(Expr_elementContext.class,i);
		}
		public Expr_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpr_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpr_in(this);
		}
	}

	public final Expr_inContext expr_in() throws RecognitionException {
		Expr_inContext _localctx = new Expr_inContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_in);
		int _la;
		try {
			setState(338);
			switch (_input.LA(1)) {
			case T__13:
			case T__9:
			case T__1:
			case PLUS:
			case STAR:
			case QUESTION:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(324); expr_of();
				setState(325); match(T__14);
				setState(326); expr_element();
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(327); match(T__2);
					setState(328); expr_element();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(334); expr_element();
				setState(335); match(T__14);
				setState(336); expr_element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_with_forContext extends ParserRuleContext {
		public List<Expr_elementContext> expr_element() {
			return getRuleContexts(Expr_elementContext.class);
		}
		public Expr_elementContext expr_element(int i) {
			return getRuleContext(Expr_elementContext.class,i);
		}
		public QuantContext quant() {
			return getRuleContext(QuantContext.class,0);
		}
		public Expr_with_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_with_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpr_with_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpr_with_for(this);
		}
	}

	public final Expr_with_forContext expr_with_for() throws RecognitionException {
		Expr_with_forContext _localctx = new Expr_with_forContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_with_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); expr_element();
			setState(341); match(T__6);
			setState(342); expr_element();
			setState(343); match(T__12);
			setState(344); quant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(DParser.QUESTION, 0); }
		public TerminalNode INT() { return getToken(DParser.INT, 0); }
		public TerminalNode STAR() { return getToken(DParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(DParser.PLUS, 0); }
		public QuantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterQuant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitQuant(this);
		}
	}

	public final QuantContext quant() throws RecognitionException {
		QuantContext _localctx = new QuantContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_quant);
		try {
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349); match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350); match(PLUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351); match(QUESTION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(352); match(T__9);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(353); match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(354); match(INT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public Cmd_printContext cmd_print() {
			return getRuleContext(Cmd_printContext.class,0);
		}
		public Cmd_findContext cmd_find() {
			return getRuleContext(Cmd_findContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_command);
		try {
			setState(359);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(357); cmd_find();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(358); cmd_print();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_findContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public Cmd_findContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_find; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterCmd_find(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitCmd_find(this);
		}
	}

	public final Cmd_findContext cmd_find() throws RecognitionException {
		Cmd_findContext _localctx = new Cmd_findContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmd_find);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(T__7);
			setState(362); match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_printContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(DParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(DParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(DParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public Cmd_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterCmd_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitCmd_print(this);
		}
	}

	public final Cmd_printContext cmd_print() throws RecognitionException {
		Cmd_printContext _localctx = new Cmd_printContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmd_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(T__10);
			setState(365); match(IDENT);
			setState(366); match(LPAREN);
			setState(367); match(STRING);
			setState(368); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u0175\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7"+
		"\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\3\5\5\5]\n\5\3\5\3\5\3\5\5\5b\n\5\3"+
		"\5\3\5\5\5f\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5n\n\5\f\5\16\5q\13\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5y\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\5\5\u0082"+
		"\n\5\3\6\3\6\3\6\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u0093\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3\b\5"+
		"\b\u009f\n\b\3\t\3\t\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7\13\t\3\t\7\t\u00aa"+
		"\n\t\f\t\16\t\u00ad\13\t\3\t\3\t\3\n\5\n\u00b2\n\n\3\n\3\n\3\n\5\n\u00b7"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00bf\n\13\3\f\3\f\3\f\5\f\u00c4"+
		"\n\f\3\f\3\f\3\r\5\r\u00c9\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7"+
		"\16\u00e1\n\16\f\16\16\16\u00e4\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00f1\n\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\5\20\u00f9\n\20\3\20\3\20\5\20\u00fd\n\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u0104\n\20\3\20\3\20\5\20\u0108\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u0112\n\20\f\20\16\20\u0115\13\20\3\20\3\20\3\20\5\20"+
		"\u011a\n\20\3\20\3\20\3\20\3\20\3\20\7\20\u0121\n\20\f\20\16\20\u0124"+
		"\13\20\3\20\3\20\3\20\5\20\u0129\n\20\3\20\3\20\3\20\3\20\5\20\u012f\n"+
		"\20\3\20\3\20\5\20\u0133\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u013a\n\20"+
		"\3\21\3\21\3\21\7\21\u013f\n\21\f\21\16\21\u0142\13\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u014c\n\22\f\22\16\22\u014f\13\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0155\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0166\n\25\3\26\3\26\5\26\u016a"+
		"\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\4\2\3\3\16\16\u0195\2\60"+
		"\3\2\2\2\4A\3\2\2\2\6N\3\2\2\2\b\u0081\3\2\2\2\n\u0092\3\2\2\2\f\u0099"+
		"\3\2\2\2\16\u009e\3\2\2\2\20\u00a0\3\2\2\2\22\u00b6\3\2\2\2\24\u00be\3"+
		"\2\2\2\26\u00c0\3\2\2\2\30\u00c8\3\2\2\2\32\u00f0\3\2\2\2\34\u00f2\3\2"+
		"\2\2\36\u0139\3\2\2\2 \u013b\3\2\2\2\"\u0154\3\2\2\2$\u0156\3\2\2\2&\u015c"+
		"\3\2\2\2(\u0165\3\2\2\2*\u0169\3\2\2\2,\u016b\3\2\2\2.\u016e\3\2\2\2\60"+
		"\61\7\7\2\2\61\62\7\31\2\2\62\63\7\65\2\2\63\64\b\2\1\2\64\65\7#\2\2\65"+
		"\66\5\4\3\2\66:\b\2\1\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;"+
		"\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\5*\26\2>?\7+\2\2?@\7\2\2\3@\3\3\2\2\2A"+
		"B\7\17\2\2BC\7\31\2\2CD\7\65\2\2DE\b\3\1\2EI\7#\2\2FH\5\b\5\2GF\3\2\2"+
		"\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7+\2\2M\5\3\2\2"+
		"\2NO\7\n\2\2OP\7\31\2\2PQ\7\65\2\2QU\7#\2\2RT\5\22\n\2SR\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7+\2\2Y\7\3\2\2\2Z[\7\65"+
		"\2\2[]\7\37\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^a\5\20\t\2_`\7\r\2\2`"+
		"b\7\65\2\2a_\3\2\2\2ab\3\2\2\2b\u0082\3\2\2\2cd\7\65\2\2df\7\37\2\2ec"+
		"\3\2\2\2ef\3\2\2\2fg\3\2\2\2go\7$\2\2hi\5\n\6\2ij\7\62\2\2jk\5\n\6\2k"+
		"l\7\34\2\2ln\3\2\2\2mh\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2"+
		"qo\3\2\2\2rs\5\n\6\2st\7\62\2\2tu\5\n\6\2ux\7,\2\2vw\7\r\2\2wy\7\65\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y\u0082\3\2\2\2z{\7\65\2\2{|\7\37\2\2|\177\5\f\7"+
		"\2}~\7\r\2\2~\u0080\7\65\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081\\\3\2\2\2\u0081e\3\2\2\2\u0081z\3\2\2\2\u0082\t\3\2\2\2"+
		"\u0083\u0089\7#\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7\34\2\2\u0086\u0088"+
		"\3\2\2\2\u0087\u0084\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\5\30"+
		"\r\2\u008d\u008e\7+\2\2\u008e\u0093\3\2\2\2\u008f\u0093\5 \21\2\u0090"+
		"\u0093\7\64\2\2\u0091\u0093\5\30\r\2\u0092\u0083\3\2\2\2\u0092\u008f\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\13\3\2\2\2\u0094"+
		"\u0095\7\65\2\2\u0095\u009a\5\16\b\2\u0096\u0097\5\20\t\2\u0097\u0098"+
		"\5\16\b\2\u0098\u009a\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0096\3\2\2\2"+
		"\u009a\r\3\2\2\2\u009b\u009c\7*\2\2\u009c\u009f\5\f\7\2\u009d\u009f\3"+
		"\2\2\2\u009e\u009b\3\2\2\2\u009e\u009d\3\2\2\2\u009f\17\3\2\2\2\u00a0"+
		"\u00ab\7$\2\2\u00a1\u00a2\7\64\2\2\u00a2\u00a4\7\34\2\2\u00a3\u00a1\3"+
		"\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\7\64\2\2\u00a9\u00a5\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7,\2\2\u00af\21\3\2\2\2"+
		"\u00b0\u00b2\5&\24\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\7\22\2\2\u00b4\u00b5\7\65\2\2\u00b5\u00b7\7\31\2"+
		"\2\u00b6\u00b1\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\5\24\13\2\u00b9\23\3\2\2\2\u00ba\u00bf\5\26\f\2\u00bb\u00bf\5\30\r\2"+
		"\u00bc\u00bf\5\"\22\2\u00bd\u00bf\5$\23\2\u00be\u00ba\3\2\2\2\u00be\u00bb"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\25\3\2\2\2\u00c0"+
		"\u00c1\5(\25\2\u00c1\u00c3\7\5\2\2\u00c2\u00c4\5\34\17\2\u00c3\u00c2\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\65\2\2\u00c6"+
		"\27\3\2\2\2\u00c7\u00c9\5\34\17\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\5\32\16\2\u00cb\31\3\2\2\2\u00cc"+
		"\u00cd\7\65\2\2\u00cd\u00ce\7$\2\2\u00ce\u00cf\7\64\2\2\u00cf\u00f1\7"+
		",\2\2\u00d0\u00d1\7\65\2\2\u00d1\u00d2\7$\2\2\u00d2\u00d3\7#\2\2\u00d3"+
		"\u00d4\7\64\2\2\u00d4\u00d5\7+\2\2\u00d5\u00f1\7,\2\2\u00d6\u00d7\7\65"+
		"\2\2\u00d7\u00d8\7$\2\2\u00d8\u00d9\7\60\2\2\u00d9\u00f1\7,\2\2\u00da"+
		"\u00db\7\65\2\2\u00db\u00dc\7$\2\2\u00dc\u00e2\7#\2\2\u00dd\u00de\5\30"+
		"\r\2\u00de\u00df\7\34\2\2\u00df\u00e1\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7\7+\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9\u00f1\3\2\2\2\u00ea\u00eb\7\65"+
		"\2\2\u00eb\u00ec\7$\2\2\u00ec\u00ed\5 \21\2\u00ed\u00ee\7,\2\2\u00ee\u00f1"+
		"\3\2\2\2\u00ef\u00f1\5\36\20\2\u00f0\u00cc\3\2\2\2\u00f0\u00d0\3\2\2\2"+
		"\u00f0\u00d6\3\2\2\2\u00f0\u00da\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\33\3\2\2\2\u00f2\u00f3\7\65\2\2\u00f3\u00f4\7\35\2\2\u00f4"+
		"\35\3\2\2\2\u00f5\u00f6\7\65\2\2\u00f6\u00f8\7$\2\2\u00f7\u00f9\7\64\2"+
		"\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc"+
		"\7\31\2\2\u00fb\u00fd\7\64\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u013a\7,\2\2\u00ff\u0100\7\65\2\2\u0100\u0101"+
		"\7$\2\2\u0101\u0103\7#\2\2\u0102\u0104\7\64\2\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\7\31\2\2\u0106\u0108\7"+
		"\64\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\7+\2\2\u010a\u013a\7,\2\2\u010b\u010c\7\65\2\2\u010c\u0119\7$\2"+
		"\2\u010d\u0113\7#\2\2\u010e\u010f\5\30\r\2\u010f\u0110\7\34\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010e\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\5\30\r\2\u0117\u0118\7+\2\2\u0118\u011a\3\2\2\2\u0119\u010d\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0128\7\31\2\2\u011c"+
		"\u0122\7#\2\2\u011d\u011e\5\30\r\2\u011e\u011f\7\34\2\2\u011f\u0121\3"+
		"\2\2\2\u0120\u011d\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\5\30"+
		"\r\2\u0126\u0127\7+\2\2\u0127\u0129\3\2\2\2\u0128\u011c\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u013a\7,\2\2\u012b\u012c\7\65"+
		"\2\2\u012c\u012e\7$\2\2\u012d\u012f\5 \21\2\u012e\u012d\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\7\31\2\2\u0131\u0133\5"+
		" \21\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u013a\7,\2\2\u0135\u0136\7\65\2\2\u0136\u0137\7$\2\2\u0137\u0138\7\60"+
		"\2\2\u0138\u013a\7,\2\2\u0139\u00f5\3\2\2\2\u0139\u00ff\3\2\2\2\u0139"+
		"\u010b\3\2\2\2\u0139\u012b\3\2\2\2\u0139\u0135\3\2\2\2\u013a\37\3\2\2"+
		"\2\u013b\u0140\7#\2\2\u013c\u013d\7\64\2\2\u013d\u013f\7\34\2\2\u013e"+
		"\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7\64\2\2\u0144"+
		"\u0145\7+\2\2\u0145!\3\2\2\2\u0146\u0147\5\26\f\2\u0147\u0148\7\4\2\2"+
		"\u0148\u014d\5\30\r\2\u0149\u014a\7\20\2\2\u014a\u014c\5\30\r\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0155\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\5\30\r\2\u0151"+
		"\u0152\7\4\2\2\u0152\u0153\5\30\r\2\u0153\u0155\3\2\2\2\u0154\u0146\3"+
		"\2\2\2\u0154\u0150\3\2\2\2\u0155#\3\2\2\2\u0156\u0157\5\30\r\2\u0157\u0158"+
		"\7\f\2\2\u0158\u0159\5\30\r\2\u0159\u015a\7\6\2\2\u015a\u015b\5(\25\2"+
		"\u015b%\3\2\2\2\u015c\u015d\t\2\2\2\u015d\'\3\2\2\2\u015e\u0166\3\2\2"+
		"\2\u015f\u0166\7\60\2\2\u0160\u0166\7*\2\2\u0161\u0166\7\61\2\2\u0162"+
		"\u0166\7\t\2\2\u0163\u0166\7\21\2\2\u0164\u0166\7\63\2\2\u0165\u015e\3"+
		"\2\2\2\u0165\u015f\3\2\2\2\u0165\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0165"+
		"\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166)\3\2\2\2"+
		"\u0167\u016a\5,\27\2\u0168\u016a\5.\30\2\u0169\u0167\3\2\2\2\u0169\u0168"+
		"\3\2\2\2\u016a+\3\2\2\2\u016b\u016c\7\13\2\2\u016c\u016d\7\65\2\2\u016d"+
		"-\3\2\2\2\u016e\u016f\7\b\2\2\u016f\u0170\7\65\2\2\u0170\u0171\7\'\2\2"+
		"\u0171\u0172\7\64\2\2\u0172\u0173\7-\2\2\u0173/\3\2\2\2):IU\\aeox\177"+
		"\u0081\u0089\u0092\u0099\u009e\u00a5\u00ab\u00b1\u00b6\u00be\u00c3\u00c8"+
		"\u00e2\u00f0\u00f8\u00fc\u0103\u0107\u0113\u0119\u0122\u0128\u012e\u0132"+
		"\u0139\u0140\u014d\u0154\u0165\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}