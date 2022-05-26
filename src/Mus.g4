grammar Mus;

program:
    stat* EOF
    ;

stat:
    block | assignment | (call ';') ;

block: 'if' expr /*SUBSTITUIR EXPR POR CONDITION */  'then' stat* 'end' #BlockIf
        | 'while' expr /*SUBSTITUIR EXPR POR CONDITION */ 'do' stat* 'end' #BlockWhile
        | 'do' call 'until' expr /*SUBSTITUIR EXPR POR CONDITION */  ';' #BlockUntil
        /*TO DO FUNCTION DEFINITION */
        ; 

assignment:
    type? VAR '=' expr ';';

expr:
    '(' TEXT ',' NUM ')' #ExprRobot
    | TEXT ('|' TEXT)* #ExprEnum
    | TEXT ',' NUM  ('|' TEXT ',' NUM)* #ExprEnumWithValues
    | bool #ExprBool
    | numeric #ExprNumeric
    | VAR #ExprVar
    | TEXT #ExprText
    | call #ExprCallFunc
    ;

bool:
    '!' bool #BoolNegation
    | '(' bool ')' #BoolParenthesis
    | numeric LOGICALOP VAR LOGICALOP numeric #BoolDoubleCompareNum     // -10 < beaconAngle < 10
    | numeric LOGICALOP numeric #BoolCompareNum                         // beaconAngle > 10
    | bool LOGICALOP VAR LOGICALOP bool #BoolDoubleCompare              // -10 < beaconAngle < 10
    | bool LOGICALOP bool #BoolCompare
    | BOOL #BoolLiteral
    | VAR #BoolVar
    ;

numeric:
    '-' numeric #NumericNegative
    | '(' numeric ')' #NumericParenthesis
    | numeric op=('*'|'/'|'%') numeric #NumericMultDivMod
    | numeric op=('+'|'-') numeric #NumericAddSub
    | NUM #NumericLiteral
    | VAR #NumericVar
    ;

call: (VAR '.')? VAR ( ('('(expr (',' expr)*))')' | '()'); 
type:  'NUM' | 'BOOL' | 'TEXT' | 'ENUM' | 'ROBOT';

NUM: [0-9]+('.'[0-9]+)?;
BOOL: [tT]'rue' | [fF]'alse';
TEXT: '"' (~["] | '""')* '"';
//temos de garantir que não colide com outras keywords (podemos inicializar um hashmap com o valor de certas keywords)
VAR: ([a-zA-Z_]+);
LOGICALOP: 'and'|'or'|'>'|'>='|'<'|'<='|'=='|'!=';
WS: [ \t\r\n]+ -> skip;
COMMENT_INLINE: '#' .*? '\n' -> skip;
COMMENT_MULTILINE: '/*' .*? '*/' -> skip;