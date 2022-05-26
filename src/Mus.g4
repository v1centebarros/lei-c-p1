grammar Mus;

program:
    stat* EOF
    ;

stat:
    assignment | call ;

assignment:
    type? VAR '=' expr ';';

expr:
    '(' expr ')'
    | NUM
    | BOOL
    | TEXT
    | VAR
    | (TEXT ('|' TEXT))*
    | TEXT ',' NUM  ('|' TEXT ',' NUM)*
    | call
    ;

call: VAR '.' VAR ( ('('(expr (',' expr)*))')' | '()');

type:  'NUM' | 'BOOL' | 'TEXT' | 'ENUM' | 'ROBOT';

NUM: [0-9]+('.'[0-9]+)?;
BOOL: [tT]'rue' | [fF]'alse';
TEXT: '"' (~["] | '""')* '"';
UPPERCASE: [A-Z]+; 
VAR: [a-zA-Z_]+;
WS: [ \t\r\n]+ -> skip;
COMMENT_INLINE: '#' .*? '\n' -> skip;
//COMMENT_MULTILINE: '/*' ~"*/" '*/' -> skip;