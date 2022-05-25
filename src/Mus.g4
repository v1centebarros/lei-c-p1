grammar Mus;

program:
    stat* EOF
    ;

stat:
    assignment? NEWLINE
    ;

assignment:
    'NUM' VAR '=' NUM #AssignNum
    | 'BOOL' VAR '=' BOOL #AssignBool
    | 'TEXT' VAR '=' TEXT #AssignText
    | 'ENUM' VAR '=' TEXT ('|' TEXT)* #AssignEnum
    | 'ENUM' VAR '=' TEXT ',' NUM  ('|' TEXT ',' NUM)* #AssignEnumWithValues
    | 'ROBOT' VAR '=' '(' TEXT ',' NUM ')' #AssignRobot   
    ;
NUM: [0-9]+('.'[0-9]+)?;
BOOL: [tT]'rue' | [fF]'alse'; 
TEXT: '"' (~[\r\n"] | '""')* '"';
VAR: [a-zA-Z_]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;