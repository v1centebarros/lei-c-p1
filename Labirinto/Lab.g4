grammar Lab;

program:
    (stat? ';') EOF
    ;

stat:labirinto  
    |grid
    |grid ';' labirinto
    |labirinto ';' grid          
    ;

grid: 'GRID' '{' (position ';')* '}';
position: 'POS' coordenadas ('DIRECTION' '=' INT)?; 

labirinto: 'LABIRINTO' '(' 'NAME' '=' ID 'WIDTH' '=' INT 'HEIGHT' '=' INT')' '{'
                (dlab ';')*
            '}' 
    ;

dlab: target
    |beacon
    |spot
    |row
    ;

beacon:'BEACON' '=' coordenadas ('HEIGHT' '=' INT)?; 
target:'TARGET' '=' coordenadas ('RADIUS' '=' (num))?;

spot: 'SPOT' '=' coordenadas ('HEIGHT' '=' INT)? ('RADIUS' '=' (num))?;
row :'ROW' INT ':' PADRAO;


coordenadas: '(' num ',' num ')' ;
num:(DOUBLE|INT);
INT:[0-9]+;
DOUBLE:([0-9]+ '.')? [0-9]+;
ID: '"'[a-zA-Z_][a-zA-Z_0-9]* '"';
PADRAO: '"' (' ' |'|'|'+'|'--')* '"';
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? ('\n'|EOF) -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;
