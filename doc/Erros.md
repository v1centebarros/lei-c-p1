
# Análise Semântica

## Declaração de variáveis
|Entrada|Erro|
|--|--|
|```NUM x = 20;```||
|```NUM x = true;```|TypeError: cannot assign BOOL to NUM|
|```NUM x.algoQueXNaoTem = 20;```|NameError: symbol '.' is reserved for object's methods|
|```NUM x:algoQueXNaoTem = 20;```|NameError: symbol ':' is reserved for object's attributes|
|```NUM print = 20;```|NameError: name 'print' is a keyword|
|```BOOL x = 20;``` ```NUM x = 20;```|NameError: name 'x' is already defined||
|```NUM x = 20;``` ```NUM x = 20;```|NameError: name 'x' is already defined||

## Atribuição de valor a variáveis
- Exige declaração prévia da variável.

|Entrada|Erro|
|--|--|
|```NUM x = 0;``` ```x = 20;```||
|```x = 20;```|NameError: name 'x' is not defined|
|`ENUM x = "red" \| "blue";` `x = "yellow" \| "pink";`|ImmutableTypeError: enum 'x' is already defined|
|```NUM x = 0;``` ```x = true;```|TypeError: cannot assign BOOL to NUM|

## Declaração de tuplos
- Só aceita as combinações:
	- (TEXT, NUM)
	- (NUM, NUM)
	- (POINT, NUM) 

|Excerto da entrada|Tipo de dados resultante|Erro|
|--|--|--|
|```("x", 1)```|ROBOT||
|```(1, 1)```|POINT ou TWIST||
|```((1, 1), 90)```|POSE||
|```("x", "y")```||TypeError: tuple must be ROBOT, POINT, TWIST or POSE|

### Acesso ao robô
|Entrada|Erro|
|--|--|
|```ROBOT x = ("x", 1);``` ```use x;``` ```rotate 80;```||
|```rotate 80;```|MustUseRobotError: function 'rotate' must be called after a use statement|
|```use ("x", 1);```|ArgError: use statement expects a ROBOT variable, not literal|

## Declaração de enumerados
- Só aceitam literais e podem ou não conter valores associados. Por omissão, os valores são sequencialmente atribuídos, por ordem crescente, a partir do 1.

|Entrada|Erro|
|--|--|
|`ENUM colors = "red" \| "blue" | "green";`||
|`ENUM colors = "red" -> 1 \| "blue" -> 2 \| "green" -> 3;`||
|`ENUM colors = "red" \| "red" \| "green";`|DuplicatedElementsError: enum has duplicated elements|
|`ENUM colors = "red" -> 1 \| "blue" -> 2 \| "green" -> 2;`|DuplicatedValuesError: enum has duplicated values|

## Declaração de listas
|Entrada|Erro|
|--|--|
|```LIST_NUM lst = [1, 2, 3];```||
|```LIST_NUM lst = [1, true, 3];```|TypeError: all list elements must have the same type|
|```LIST_BOOL lst = [1, 2, 3];```|TypeError: cannot assign LIST_NUM to LIST_BOOL|

## Operações básicas
|Operando1|Operadores|Operando2|Erro|
|--|--|--|--|
|1|+ -|2||
|1|* / %|2||
|(1, 2)|+ -|(3, 4)||
|(1, 2)|*|2||
|"ola "|+|"amigo"||
|[1, 2, 3]|+ -|[4, 5, 6]||
|[1, 2, 3]|+ -|[true, false, true]|TypeError: unsupported operand type(s) for '*OPERADOR*': LIST_NUM and LIST_BOOL|
||-|(1 + 2)||
||not|true||
||not|10|TypeError: unsupported operand type for 'not': NUM|
|true|and or|false||
|2|and or|2|TypeError: unsupported operand type(s) for '*OPERADOR*': NUM and NUM|
|1|== != |2||
|(1, 1)|== !=|(3, 4)||
|(1, 1)|> < >= <=|(3, 4)|TypeError: unsupported operand type(s) for '*OPERADOR*': *POINT/TWIST* and *POINT/TWIST*|
|1|== != > < >= <=|"ola"|TypeError: cannot compare NUM and TEXT|

A linguagem permite também dupla comparação de números.
|Operando1|Operadores|Operando2|Operadores|Operando3|
|--|--|--|--|--|
|3|> < >= <=|2|> < >= <=|1|

## Definição de funções
|Entrada|Erro/alerta|
|--|--|
|```function xpto (``` [código] ```)```|| 
|```NUM function xpto (``` [código] ```)```||
|```NUM function xpto with NUM x NUM y (``` [código] ```)```|| 
|```function xpto:otpx (``` [código] ```)```|NameError: symbol ':' is reserved for object's attributes| 
|```function xpto.otpx (``` [código] ```)```|NameError: symbol '.' is reserved for object's methods|
|```function xpto ( return;``` [código] ```)```|ReturnWarning: code after return statement will not be executed| 
|```NUM function xpto (``` [código sem retorno] ```)```|ReturnMissingError: non-void function does not have a return statement| 

> **Nota:** Os nomes das variáveis locais, indicados após *with*, não devem conter os símbolos ':' (destinado a atributos de objetos)  e '.' (destinado a métodos de objetos) nem devem colidir com palavras reservadas, variáveis e funções do **scope** atual.

### Invocação do *return*
|Entrada|Erro|
|--|--|
|```function xpto (return 20;)```|InvalidReturnError: returned NUM inside a void function|
|```NUM function xpto (return true;)```|InvalidReturnError: returned BOOL but expected NUM|
|```NUM function xpto (return 20 20;)```|InvalidReturnError: function must return only 1 value|
|```return 20;```|InvalidReturnError: return statement must be inside a function|

## Acesso a funções
- À semelhança do que se verifica para *keywords* e variáveis, o acesso a funções inexistentes ou não visíveis no *scope* atual origina um "NameError: name [...] is not defined"

Assumindo que a função *xpto* foi definida da seguinte forma
```function xpto with TEXT txt, NUM x (``` [código] ```)```:

|Entrada|Erro|
|--|--|
|```xpto "Ola" 20```||
|```xpto "Ola"```|ArgError: argument of type NUM is missing|
|```xpto "Ola" "amigo"```|ArgError: received TEXT but expected NUM at position 1|
|```xpto "Ola" 20 20```|ArgError: expected only 3 argument(s)|

## Blocos condicionais
|Entrada|Erro|
|--|--|
|```if true do print 20; else print 10; end```||
|```if "Ola" do print 20; end```|TypeError: condition in block 'if' must be BOOL (not TEXT)|
|```while "Ola" do print 20; end```|TypeError: condition in block 'while' must be BOOL (not TEXT)|
|```for element in "Ola" do print element; end```|TypeError: forEach block must iterate over a list|
|```print 20 until "Ola";```|TypeError: condition in block 'until' must be BOOL (not TEXT)|

> **Nota:** Na estrutura "*for* element *in* list", o nome de element não deve conter os símbolos ':' (destinado a atributos de objetos)  e '.' (destinado a métodos de objetos) nem deve colidir com palavras reservadas, variáveis e funções do **scope** atual.

## Conceito de estado
### Invocação do *state*
> **Nota:** Este comando não aceita como argumento output de funções, uma vez que é preciso guardar os estados de imediato.

```
state "IDLE";
#someCode
state "MOVING";
#someCode
state "ROTATING";
#someCode
```
### Estrutura *with state*
```
with state
    "IDLE" do
        print "IDLE";
    "MOVING" do
        print "MOVING";
    "ROTATING" do
        print "ROTATING";
    "RANDOM" do         				#StateWarning: state RANDOM does not exist
        print "RANDOM";
end
```

