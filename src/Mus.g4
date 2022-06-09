grammar Mus;

program:
    (stat|defFunction)* EOF
    ;

stat:
    block | assignment | singleCall;


defFunction: (LIST? TYPE)? 'function' ID ('with' (LIST? TYPE ID)+)? '(' stat* ')'; 

//o analisador semântico verificará se expr representa um valor booleano
block: 'if' expr 'do' stat* blockElse? 'end'                      #BlockIf
        | 'while' expr 'do' stat* 'end'                           #BlockWhile
        | call 'until' expr  ';'                                  #BlockUntil
        | 'for' ID 'in' expr 'do' stat* 'end'                     #BlockForEach
        ;

blockElse:
    'else' stat*
    ;

assignment:
    (LIST)? TYPE? ID '=' expr ';';

singleCall:
    call ';';

expr:
    '(' expr ',' expr ')'                                                                   #ExprTuple  // Robot, Point, Twist, Pose
    | '[' (expr (',' expr)*)? ']'                                                           #ExprList
    | TEXT '->' NUM  ('|' TEXT '->' NUM)+                                                   #ExprEnumWithValues // só aceita literais
    | '(' expr ')'                                                                          #ExprParenthesis
    | 'not' expr                                                                            #BoolNegation
    | expr op1=('and'|'or'|'>'|'>='|'<'|'<=') expr op2=('and'|'or'|'>'|'>='|'<'|'<=') expr  #BoolDoubleCompare // -10 < beaconAngle < 10    
    | expr op=('and'|'or'|'>'|'>='|'<'|'<='|'=='|'!=') expr                                 #BoolCompare
    | '-' expr                                                                              #NumericNegative
    | expr op=('*'|'/'|'%') expr                                                            #NumericMultDivMod
    | expr op=('+'|'-') expr                                                                #NumericAddSub
    | ID                                                                                    #ExprVar
    | call                                                                                  #ExprCall
    | TEXT                                                                                  #TextLiteral
    | TEXT ('|' TEXT)+                                                                      #ExprEnum
    | BOOL                                                                                  #BoolLiteral
    | NUM                                                                                   #NumericLiteral
    ;

call: (ID '.')? ID (expr)*; //chamada de uma função/variável     
TYPE:  'NUM' | 'BOOL' | 'TEXT' | 'ENUM' | 'ROBOT' | 'POINT' | 'TWIST' | 'POSE';
LIST: 'LIST' ('of')?;
NUM: ('-')?[0-9]+('.'[0-9]+)?;
BOOL: [tT]'rue' | [fF]'alse';
TEXT: '"' (~["] | '""')* '"';
ID: (([a-zA-Z_][0-9a-zA-Z_]*))(':'[0-9a-zA-Z_]*)?;
WS: [ \t\r\n]+ -> skip;
COMMENT_INLINE: '#' .*? '\n' -> skip;
COMMENT_MULTILINE: '/*' .*? '*/' -> skip;