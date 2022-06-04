grammar Lab;

program:
    (stat? ';')* EOF
    ;

stat:
    grid       
    |labirinto  
    ;

grid: 'GRID' '{' (position ';')+ '}';
position: 'POSITION' COORDENADAS 'DIRECAO' '=' DOUBLE; 

labirinto: 'LABIRINTO' '(' 'NAME' '=' ID (',' 'WIDTH' '=' DOUBLE ',' 'HEIGHT' '=' DOUBLE)? ')' '{'
                (target ';')*
                (beacon ';')*
                (row ';')*
            '}' 
    ;

target:'TARGET' '=' COORDENADAS (',' 'Raio' '=' DOUBLE)?; 
beacon:'BEACON' '=' COORDENADAS (',' 'HEIGHT' '=' DOUBLE)?; 

row :'ROW' INT 'PADRAO' ':' (PADRAO)*;

COORDENADAS: '(' DOUBLE ',' DOUBLE ')' ;
DOUBLE:[0-9]+ ('.' [0-9]+)?;
INT:[0-9]+;
ID: [a-zA-Z_][a-zA-Z_0-9]*;
PADRAO: '"' (' ' |'|'|'.'|'--')* '"';
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? ('\n'|EOF) -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;