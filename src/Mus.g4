grammar Mus;

program:
    stat* EOF
    ;

stat:
    block | assignment | (call ';') ;

//o analisador semântico verificará se expr representa um valor booleano
block: 'if' expr 'do' stat* 'end'                 #BlockIf
        | 'while' expr 'do' stat* 'end'             #BlockWhile
        | call 'until' expr  ';'                    #BlockUntil
        ; 

assignment:
    TYPE? ID '=' expr ';';

expr:
    '(' TEXT ',' NUM ')'                             #ExprRobot
    | TEXT ',' NUM  ('|' TEXT ',' NUM)*              #ExprEnumWithValues
    | '(' expr ')'                                   #ExprParenthesis
    | 'not' expr                                     #BoolNegation
    | expr op1=logicalop expr op2=logicalop expr     #BoolDoubleCompare     // -10 < beaconAngle < 10
    | expr op=logicalop expr                         #BoolCompare
    | '-' expr                                       #NumericNegative
    | expr op=('*'|'/'|'%') expr                     #NumericMultDivMod
    | expr op=('+'|'-') expr                         #NumericAddSub
    | ID                                             #ExprVar
    | call                                           #ExprCall
    | TEXT                                           #TextLiteral
    | TEXT ('|' TEXT)*                               #ExprEnum
    | BOOL                                           #BoolLiteral
    | NUM                                            #NumericLiteral
    ;

call: (ID '.')? ID (expr)*; //chamada de uma função/variável
logicalop: ('and'|'or'|'>'|'>='|'<'|'<='|'=='|'!=');
TYPE:  'NUM' | 'BOOL' | 'TEXT' | 'ENUM' | 'ROBOT';

NUM: ('-')?[0-9]+('.'[0-9]+)?;
BOOL: [tT]'rue' | [fF]'alse';
TEXT: '"' (~["] | '""')* '"';
ID: ([a-zA-Z_]+);
WS: [ \t\r\n]+ -> skip;
COMMENT_INLINE: '#' .*? '\n' -> skip;
COMMENT_MULTILINE: '/*' .*? '*/' -> skip;