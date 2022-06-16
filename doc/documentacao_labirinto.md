# Exemplo de Labirinto

Para o utilizador definir um labirinto para ser usado no simulador recorre-se à linguagem secundária.

O exemplo a seguir define um labirinto chamado **lab01** com 28 de comprimentos e 14 de altura e com vários **beacons** (Ponto de Passagem do rato), **targets** (checkpoint) e *spots* (combinação de **beacon**  e **target**).

## Iniciar o labirinto

Para iniciar a definição do labirinto define-se com a keyword **LABIRINTO** passa-se como argumento o **NAME**, **WIDTH** e **HEIGHT**, nesta ordem em específico.

```
LABIRINTO (NAME = "lab01" WIDTH = 28 HEIGHT = 14) {
    ...
}
```

## Definir elementos do labirinto

### Beacon

Para definir um beacon, passa-se as coordenadas onde se quer posicioná-lo e como parâmetro opcional **HEIGHT** (inteiro), tendo esta como valor *default* 2.

```
BEACON = (15,9);
BEACON = (5,2) HEIGHT = 3;
```

### Target

Para definir um target, passa-se as coordenadas onde se quer posicioná-lo e como parâmetro opcional **RADIUS**, tendo como valor *default* 1.

```
TARGET = (10,5);
TARGET = (7,7.5) RADIUS = 1.5;
```

### Spot

Para definir um spot, passa-se as coordenadas onde se quer posicioná-lo e como parâmetros opcionais **HEIGHT** e **RADIUS**.

```
SPOT = (26,7) HEIGHT = 3 RADIUS = 1.5;
SPOT = (26,1) HEIGHT = 3;
SPOT = (20,7);
SPOT = (26,7) RADIUS = 1.5;
```

> **NOTA**: Foi decido que apesar de os parâmetros serem opcionais, estes têm de respeitar a ordem **HEIGHT** **RADIUS** para que não ocorra nenhum erro.

### Definir o mapa

O mapa de exemplo é constiuído por 14 colunas, então para definir uma linha usa-se a instrução **ROW** com o número da linha e uma string com o *layout* da linha. Na tabela a seguir estão identificados os símbolos que podem ser usados na definição de mapa.

| Símbolo | Significado       |
|:-------:| ----------------- |
| \|      | Parede Vertical   |
| --      | Parede Horizontal |
| +       | União de Paredes  |

```
ROW 12 : "           |              |              ";
ROW 11 : "--+--+--+--+  +--+--+--+  +  +  +  +  +  ";
ROW 10 : "              |        |  |              ";
ROW 9  : "  +--+--+--+--+  +--+--+  +--+  +  +  +  ";
ROW 8  : "     |           |     |     |           ";
ROW 7  : "--+  +  +  +  +--+  +  +--+  +--+  +  +  ";
ROW 6  : "  |  |        |     |  |  |     |        ";
ROW 5  : "--+  +--+--+--+  +--+  +--+--+  +  +  +  ";
ROW 4  : "     |           |  |  |        |        ";
ROW 3  : "  +--+  +--+--+--+  +  +  +--+--+  +  +  ";
ROW 2  : "  |  |  |           |     |              ";
ROW 1  : "  +--+  +  +  +  +  +--+--+  +  +  +  +  ";
ROW 0  : "        |                                ";
```

### Código de definição de mapa

```
/*
    Código do labirinto lab01
*/
LABIRINTO (NAME = "lab01" WIDTH = 28 HEIGHT = 14) { 
    BEACON = (15,9);                         
    TARGET = (7,7.5) RADIUS = 1.5;             
    SPOT = (13,4) RADIUS = 1.5;             
    TARGET = (10,5);                          
    BEACON = (5,2) HEIGHT = 3;                 
    SPOT = (26,7) HEIGHT = 3 RADIUS = 1.5;    
    SPOT = (26,1) HEIGHT = 3;                 
    SPOT = (20,7);     

    // Definição do Mapa
    ROW 12 : "           |              |              ";
    ROW 11 : "--+--+--+--+  +--+--+--+  +  +  +  +  +  ";
    ROW 10 : "              |        |  |              ";
    ROW 9  : "  +--+--+--+--+  +--+--+  +--+  +  +  +  ";
    ROW 8  : "     |           |     |     |           ";
    ROW 7  : "--+  +  +  +  +--+  +  +--+  +--+  +  +  ";
    ROW 6  : "  |  |        |     |  |  |     |        ";
    ROW 5  : "--+  +--+--+--+  +--+  +--+--+  +  +  +  ";
    ROW 4  : "     |           |  |  |        |        ";
    ROW 3  : "  +--+  +--+--+--+  +  +  +--+--+  +  +  ";
    ROW 2  : "  |  |  |           |     |              ";
    ROW 1  : "  +--+  +  +  +  +  +--+--+  +  +  +  +  ";
    ROW 0  : "        |                                ";
};
```

## Definir posição de saída do Robot

Para definir as posições possíveis de saída 

### XML Resultante

```xml
<Lab Name="Lab 1" Width="28.0" Height="14.0">
    <Beacon X="15.0" Y="9" Height="2"/>
    <Target X="7.0" Y="7.5" Radius="1.5"/>
    <Beacon X="13.0" Y="4" Height="2"/>
    <Target X="13.0" Y="4" Radius="1.5"/>
    <Target X="10.0" Y="5" Radius="1"/>
    <Beacon X="5" Y="2" Height="3"/>
    <Beacon X="26.0" Y="7" Height="3"/>
    <Target X="26.0" Y="7" Radius="1.5"/>
    <Beacon X="26.0" Y="1" Height="3"/>
    <Target X="26.0" Y="1" Radius="1"/>
    <Beacon X="20.0" Y="7" Height="2"/>
    <Target X="20.0" Y="7" Radius="1"/>
    <Row  Pos="12" Pattern="           |                             "  />
    <Row  Pos="11" Pattern="--+--+--+--+  +--+--+--+  +  +  +  +  +  "  />
    <Row  Pos="10" Pattern="              |        |  |              "  />
    <Row  Pos="9"  Pattern="  +--+--+--+--+  +--+--+  +--+  +  +  +  "  />
    <Row  Pos="8"  Pattern="     |           |     |     |           "  />
    <Row  Pos="7"  Pattern="  +  +  +  +  +--+  +  +--+  +--+  +  +  "  />
    <Row  Pos="6"  Pattern="  |  |        |     |  |  |     |        "  />
    <Row  Pos="5"  Pattern="--+  +--+--+--+  +--+  +--+--+  +  +  +  "  />
    <Row  Pos="4"  Pattern="     |           |  |  |        |        "  />
    <Row  Pos="3"  Pattern="  +  +  +--+--+--+  +  +  +--+--+  +  +  "  />
    <Row  Pos="2"  Pattern="  |  |  |           |     |              "  />
    <Row  Pos="1"  Pattern="  +--+  +  +  +  +  +--+--+  +  +  +  +  "  />
    <Row  Pos="0"  Pattern="        |                                "  />
</Lab>

<Grid>
    <Position X="3.0" Y="7.0" Dir="180"/>
    <Position X="3.0" Y="8.3" Dir="180"/>
    <Position X="3.0" Y="9.6" Dir="180"/>
</Grid>
```
