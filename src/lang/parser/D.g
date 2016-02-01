/* grammar for my little language */
grammar D;

@header{package lang.parser;}

spec returns [ASTSpec t_spec]
@init{$t_spec=new ASTSpec();}
:
	'Spec' COLON name=IDENT {$t_spec.setName($name.text);}
		LBRACE t=struct {$t_spec.setStruct($t.t_struct);} (p=plan)* command RBRACE EOF
;

struct returns [ASTStruct t_struct]
@init{$t_struct=new ASTStruct();}
:
	'Struct' COLON name=IDENT {$t_struct.setName($name.text);}
		LBRACE (module_decl_expression)* RBRACE
;

plan:
	'Plan' COLON IDENT LBRACE (expr_rule)* RBRACE
;

module_decl_expression:
	 (IDENT EQUAL) ? list ('as' IDENT) ?
	| (IDENT EQUAL) ?
 	    LBRACK (expr_link RARROW expr_link COMMA)* expr_link RARROW expr_link RBRACK ('as' IDENT) ?
	| IDENT EQUAL expr_op ('as' IDENT) ?
;

expr_link : (LBRACE (expr_element COMMA)* expr_element RBRACE) 
	| expr_short_link
	| STRING
	| expr_element;

expr_op: IDENT l_expr_op 
	| list l_expr_op;

l_expr_op: '+' expr_op | ;

list:
	LBRACK ((STRING COMMA)* STRING)* RBRACK;

expr_rule:
	((modifier)? 'rule' IDENT COLON) ? expression ;

expression:
	expr_of
	| expr_element
	| expr_in	
	| expr_with_for
;

expr_of :
	quant 'of' (expr_accessor)? IDENT;

expr_element :
	(expr_accessor) ? element ;

element :
	IDENT LBRACK STRING RBRACK
	| IDENT LBRACK LBRACE STRING RBRACE RBRACK
	| IDENT LBRACK STAR RBRACK
	| IDENT LBRACK (LBRACE (expr_element COMMA)* expr_element RBRACE) RBRACK
	| IDENT LBRACK expr_short_link RBRACK
	| expr_hd_element
;

expr_accessor:
	IDENT DOT	
;

/* multiple edges */
expr_hd_element:
	 IDENT LBRACK (STRING) ? COLON (STRING) ? RBRACK
	| IDENT LBRACK LBRACE (STRING) ? COLON (STRING) ? RBRACE RBRACK
	| IDENT LBRACK (LBRACE (expr_element COMMA)* expr_element RBRACE) ?
		COLON (LBRACE (expr_element COMMA)* expr_element RBRACE) ? RBRACK
	| IDENT LBRACK (expr_short_link)? COLON (expr_short_link)? RBRACK
	| IDENT LBRACK STAR RBRACK
;

expr_short_link: (LBRACE (STRING COMMA)* STRING RBRACE) ;

expr_in:
	expr_of 'in' expr_element ('and' expr_element)*
	| expr_element 'in' expr_element
;

	
expr_with_for:
	expr_element 'with' expr_element 'for' quant;

modifier: 'fixed' 
		| 'relaxed'
;

quant :
	| STAR
	| PLUS
	| QUESTION
	| 'none'
	| 'zero'
	| INT
;

command : cmd_find
		| cmd_print;

cmd_find : 'find' IDENT;
cmd_print: 'print' IDENT LPAREN STRING RPAREN;

/*
--------- lexer rules -------------------- 
*/

// Whitespace -- ignored
WS:
    ( ' '
    | '\t'
    | '\f'
    | NEWLINE
    )
	-> skip
    ;

// Single-line comments
SL_COMMENT:
    ('//' | '--')
    (~('\n'|'\r'))* NEWLINE
	-> skip
    ;

// multiple-line comments
ML_COMMENT:
    '/*' .*? '*/'
	-> skip
;

fragment
NEWLINE	:	
    '\r\n' | '\r' | '\n' ;
    
// Use paraphrases for nice error messages
ARROW 		 : '->';
AT     		 : '@';
BAR 		 : '|';
COLON 		 : ':';
COLON_COLON	 : '::';
COLON_EQUAL	 : ':=';
COMMA 		 : ',';
DOT 		 : '.';
DOTDOT 		 : '..';
EQUAL 		 : '=';
GREATER 	 : '>';
GREATER_EQUAL : '>=';
HASH 		 : '#';
LBRACE 		 : '{';
LBRACK 		 : '[';
LESS 		 : '<';
LESS_EQUAL 	 : '<=';
LPAREN 		 : '(';
MINUS 		 : '-';
NOT_EQUAL 	 : '<>';
PLUS 		 : '+';
RBRACE 		 : '}';
RBRACK 		 : ']';
RPAREN		 : ')';
SEMI		 : ';';
SLASH 		 : '/';
STAR 		 : '*';
QUESTION     : '?';	
RARROW       : '=>';

INT:
	('0'..'9')+
    ;

fragment
REAL:
    INT ('.' INT (('e' | 'E') ('+' | '-')? INT)? | ('e' | 'E') ('+' | '-')? INT)
    ;

// String literals

STRING:	
    '\"' ( ~('\"'|'\\') | ESC)* '\"';

// escape sequence -- note that this is protected; it can only be called
//   from another lexer rule -- it will not ever directly return a token to
//   the parser
// There are various ambiguities hushed in this rule.  The optional
// '0'...'7' digit matches should be matched here rather than letting
// them go back to STRING_LITERAL to be matched.  ANTLR does the
// right thing by matching immediately; hence, it's ok to shut off
// the FOLLOW ambig warnings.
fragment
ESC
:
    '\\'
     ( 'n'
     | 'r'
     | 't'
     | 'b'
     | 'f'
     | '"'
     | '\''
     | '\\'
     | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
     | '0'..'3' ('0'..'7' ('0'..'7')? )?  | '4'..'7' ('0'..'7')?
     )
     ;

// hexadecimal digit (again, note it's protected!)
fragment
HEX_DIGIT:
    ( '0'..'9' | 'A'..'F' | 'a'..'f' );


// An identifier.  Note that testLiterals is set to true!  This means
// that after we match the rule, we look in the literals table to see
// if it's a literal or really an identifer.

IDENT:
    ('$' | 'a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
    ;

// A dummy rule to force vocabulary to be all characters (except
// special ones that ANTLR uses internally (0 to 2)

fragment
VOCAB:	
    '\u0003'..'\u0377'
    ;
