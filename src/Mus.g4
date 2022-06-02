grammar Mus;

program:
    stat* EOF
    ;

stat:
    block | assignment |  singleCall;

//o analisador semântico verificará se expr representa um valor booleano
block: 'if' expr 'do' stat* 'end'                   #BlockIf
        | 'while' expr 'do' stat* 'end'             #BlockWhile
        | call 'until' expr  ';'                    #BlockUntil
        ; 

assignment:
    TYPE? ID '=' expr ';';

singleCall:
    call ';';

expr:
    '(' expr ',' expr ')'                            #ExprRobot  //'(' TEXT ',' NUM ')'
    | expr ',' expr  ('|' expr ',' expr)+            #ExprEnumWithValues // TEXT ',' NUM  ('|' TEXT ',' NUM)*
    | '(' expr ')'                                   #ExprParenthesis  //done
    | 'not' expr                                     #BoolNegation  //done
    | expr op1=LOGICALOP expr op2=LOGICALOP expr     #BoolDoubleCompare     // -10 < beaconAngle < 10      //done
    | expr op=LOGICALOP expr                         #BoolCompare  //done
    | '-' expr                                       #NumericNegative  //done
    | expr op=('*'|'/'|'%') expr                     #NumericMultDivMod  //done
    | expr op=('+'|'-') expr                         #NumericAddSub  //done
    | ID                                             #ExprVar  //done
    | call                                           #ExprCall  //pode ser comentado
    | TEXT                                           #TextLiteral  //done
    | expr ('|' expr)+                               #ExprEnum
    | BOOL                                           #BoolLiteral  //done
    | NUM                                            #NumericLiteral  //done
    ;

call: (ID '.')? ID (expr)*; //chamada de uma função/variável    //done

LOGICALOP: ('and'|'or'|'>'|'>='|'<'|'<='|'=='|'!=');       //nao me deu problemas, mas ver dps        
TYPE:  'NUM' | 'BOOL' | 'TEXT' | 'ENUM' | 'ROBOT';
NUM: ('-')?[0-9]+('.'[0-9]+)?;
BOOL: [tT]'rue' | [fF]'alse';
TEXT: '"' (~["] | '""')* '"';
ID: ([a-zA-Z_][0-9a-zA-Z_]*);
WS: [ \t\r\n]+ -> skip;
COMMENT_INLINE: '#' .*? '\n' -> skip;
COMMENT_MULTILINE: '/*' .*? '*/' -> skip;