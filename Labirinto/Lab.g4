grammar Lab;

program:
    (stat? ';')* EOF
    ;

stat:
    grid       
    |labirinto  
    ;

grid: 'GRID' '{' (position ';')* '}';
position: 'POS' coordenadas ('DIRECTION' '=' INT)?; 

labirinto: 'LABIRINTO' '(' 'NAME' '=' ID ('WIDTH' '=' INT 'HEIGHT' '=' INT)? ')' '{'
                (dlab ';')*
            '}' 
    ;

dlab: target
    |beacon
    |spot
    |row
    ;

beacon:'BEACON' '=' coordenadas ('HEIGHT' '=' INT)?; 
target:'TARGET' '=' coordenadas ('RADIUS' '=' (DOUBLE|INT))?;

spot: 'SPOT' '=' coordenadas ('HEIGHT' '=' INT)? ('RADIUS' '=' (DOUBLE | INT))?;
row :'ROW' INT ':' (PADRAO)*;


coordenadas: '(' DOUBLE ',' DOUBLE ')' ;
INT:[0-9]+;
DOUBLE:([0-9]+ '.')? [0-9]+;
ID: [a-zA-Z_][a-zA-Z_0-9]*;
PADRAO: '"' (' ' |'|'|'.'|'--')* '"';
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? ('\n'|EOF) -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;