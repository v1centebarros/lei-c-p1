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
    '(' TEXT ',' NUM ')'                             #ExprRobot  //done
    | TEXT ',' NUM  ('|' TEXT ',' NUM)*              #ExprEnumWithValues
    | '(' expr ')'                                   #ExprParenthesis  //done
    | 'not' expr                                     #BoolNegation  //done
    | expr op1=Logicalop expr op2=Logicalop expr     #BoolDoubleCompare     // -10 < beaconAngle < 10      //done
    | expr op=Logicalop expr                         #BoolCompare  //done
    | '-' expr                                       #NumericNegative  //done
    | expr op=('*'|'/'|'%') expr                     #NumericMultDivMod  //done
    | expr op=('+'|'-') expr                         #NumericAddSub  //done
    | ID                                             #ExprVar  //done
    | call                                           #ExprCall  //done
    | TEXT                                           #TextLiteral  //done
    | TEXT ('|' TEXT)*                               #ExprEnum
    | BOOL                                           #BoolLiteral  //done
    | NUM                                            #NumericLiteral  //done
    ;

call: (ID '.')? ID (expr)*; //chamada de uma função/variável    //done

Logicalop: ('and'|'or'|'>'|'>='|'<'|'<='|'=='|'!=');       //nao me deu problemas, mas ver dps        
TYPE:  'NUM' | 'BOOL' | 'TEXT' | 'ENUM' | 'ROBOT';
NUM: ('-')?[0-9]+('.'[0-9]+)?;
BOOL: [tT]'rue' | [fF]'alse';
TEXT: '"' (~["] | '""')* '"';
ID: ([a-zA-Z_]+);
WS: [ \t\r\n]+ -> skip;
COMMENT_INLINE: '#' .*? '\n' -> skip;
COMMENT_MULTILINE: '/*' .*? '*/' -> skip;