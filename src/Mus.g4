grammar Mus;

program:
    stat* EOF
    ;

stat:
    block | assignment | singleCall;

//o analisador semântico verificará se expr representa um valor booleano
block: 'if' expr 'do' stat* blockElse? 'end'        #BlockIf
        | 'while' expr 'do' stat* 'end'             #BlockWhile
        | call 'until' expr  ';'                    #BlockUntil
        ; 

blockElse:
    'else' stat*
    ;

assignment:
    TYPE? ID '=' expr ';';

singleCall:
    call ';';

expr:
    '(' expr ',' expr ')'                                                                   #ExprRobot  //'(' TEXT ',' NUM ')'
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
TYPE:  'NUM' | 'BOOL' | 'TEXT' | 'ENUM' | 'ROBOT';
NUM: ('-')?[0-9]+('.'[0-9]+)?;
BOOL: [tT]'rue' | [fF]'alse';
TEXT: '"' (~["] | '""')* '"';
ID: (([a-zA-Z_][0-9a-zA-Z_]*))(':'[0-9a-zA-Z_]*)?;
WS: [ \t\r\n]+ -> skip;
COMMENT_INLINE: '#' .*? '\n' -> skip;
COMMENT_MULTILINE: '/*' .*? '*/' -> skip;