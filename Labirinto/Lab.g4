grammar Lab;

program:
    (stat? ';')* EOF
    ;

stat:
    grid       
    |labirinto  
    ;

grid: 'GRID' '{' (position ';')+ '}';
position: 'POSITION' COORDENADAS ('DIRECTION' '=' INT)?; 

labirinto: 'LABIRINTO' '(' 'NAME' '=' ID ('WIDTH' '=' INT 'HEIGHT' '=' INT)? ')' '{'
                //beacon (no caso de ser obrigado)
                (dlab ';')*
            '}' 
    ;

dlab: target
    |beacon
    |spot
    |row
    ;

beacon:'BEACON' '=' COORDENADAS ('HEIGHT' '=' INT)?; 
target:'TARGET' '=' COORDENADAS ('RADIUS' '=' (DOUBLE|INT))?;  //problema com o double

spot: 'SPOT' '=' COORDENADAS ('HEIGHT' '=' INT)? ('RADIUS' '=' (DOUBLE | INT))?;
row :'ROW' INT ':' (PADRAO)*;


COORDENADAS: '(' DOUBLE ',' DOUBLE ')' ;
INT:[0-9]+;
DOUBLE:([0-9]+ '.')? [0-9]+;
ID: [a-zA-Z_][a-zA-Z_0-9]*;
PADRAO: '"' (' ' |'|'|'.'|'--')* '"';
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? ('\n'|EOF) -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;