grammar Mus;

program:
    stat* EOF
    ;

stat:
    block | assignment | (call ';') ;

//o analisador semântico verificará se expr representa um valor booleano
block: 'if' expr 'then' stat* 'end' #BlockIf
        | 'while' expr 'do' stat* 'end' #BlockWhile
        | call 'until' expr  ';' #BlockUntil
        ; 

assignment:
    type? VAR '=' expr ';';

expr:
    '(' TEXT ',' NUM ')' #ExprRobot
    | TEXT ('|' TEXT)* #ExprEnum
    | TEXT ',' NUM  ('|' TEXT ',' NUM)* #ExprEnumWithValues
    | '(' expr ')' #ExprParenthesis
    | 'not' expr #BoolNegation
    | expr op1=logicalop VAR op2=logicalop expr #BoolDoubleCompareNum     // -10 < beaconAngle < 10
    | expr op=logicalop expr #BoolCompareNum
    | '-' expr #NumericNegative
    | expr op=('*'|'/'|'%') expr #NumericMultDivMod
    | expr op=('+'|'-') expr #NumericAddSub
    | VAR #ExprVar
    | call #ExprCall
    | TEXT #TextLiteral
    | BOOL #BoolLiteral
    | NUM #NumericLiteral
    ;

call: (VAR '.')? VAR (expr)*; //chamada de uma função/variável
logicalop: ('and'|'or'|'>'|'>='|'<'|'<='|'=='|'!=');
type:  'NUM' | 'BOOL' | 'TEXT' | 'ENUM' | 'ROBOT';

NUM: ('-')?[0-9]+('.'[0-9]+)?;
BOOL: [tT]'rue' | [fF]'alse';
TEXT: '"' (~["] | '""')* '"';
VAR: ([a-zA-Z_]+);
WS: [ \t\r\n]+ -> skip;
COMMENT_INLINE: '#' .*? '\n' -> skip;
COMMENT_MULTILINE: '/*' .*? '*/' -> skip;