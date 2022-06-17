# Mus Language Documentation

</br>

> **NOTA:**  A ordem pela qual os conteúdos são apresentados nesta documentação, difere na ordem na qual os requisitos são apresentados no guião do projeto, uma vez que a compreensão dos conteúdo torna-se mais fácil seguindo outra ordem.

Nas seguintes secções irão ser apresentados e explicados exemplos simples e concretos da utilização da linguagem Mus (extensão .mus).
No esquema abaixo segue-se uma breve visão do que irá ser abordado ao longo desta breve documentação.

1. Tipo de dados da linguagem MUS
2. Criação de robots
3. Utilização de variáveis
4. Mecanimo de leitura (input)
5. Mecanismo de escrita (no terminal)
6. Operadores suportados
7. Instrução de decisão
8. Instrução de repetição
9. Funções
10. Listas
11. Comentários
12. Lista completa das keywords da linguagem
13. Como executar um programa em Mus

## 1. Tipo de dados da linguagem MUS

A linguagem MUS permite a utilização de vários tipos de dados, nomeadamente:

- numérico - NUM
- textual - TEXT
- boleano - BOOL
- enumerado - ENUM

## 2. Criação de robots

Uma das entidades mais importantes, senão a mais importante, é a entidade ROBOT. Para criar uma entidade do tipo <i>ROBOT</i> devemo indicar o seu nome e também a sua posição inical no mapa (começando em 1).
Ou seja,

```
ROBOT nody = ("nody", 1);
```

Este bloco de código cria e adiciona ao simulador um robot chamado "nody", cuja posição inicial é a primeira posição.

Visto que a linguagem MUS permite a criação de mais do que um robot, sempre que queremos controlar um robot, temos sempre de o indicar.

No exemplo anterior, caso quiséssemos controlar o robot nody, teríamos de inserir o seguinte:

```
use nody;
```

## 3. Utilização de variáveis

Uma necessidade básica de um programador é armazenar valores para que possam ser utilizados posteriormente. 

Com esse efeito, à semelhança de todas as linguagens de programação, a linguagem MUS permite definir variáveis da seguinte forma:

```
NUM x = 1;
NUM y = 2.5;
TEXT s = "Hello, World!";
BOOL b = True;
BOOL c = False;
```

## 4. Mecanismos de leitura (input)

Para além de podermos definir o valor de uma variável diretamente como no exemplo anterior, a linguagem MUS permite ainda definir o seu valor através do teclado.

Para isso basta fazer o seguinte:

```
NUM x = input;
```

De seguida, basta escrever o valor desejado no teclado e pressionar <i>Enter</i>

## **5. Mecanismos de escrita (no terminal)**

Para além de definirmos variáveis, é também muito importante ter algum feedback do estado do programa, como por exemplo o valor de uma variável após um conjunto de operações. Para esta verificação, podemos recorrer ao mecanismo de escrita no terminal.

Para imprimir no terminal o valor da variável <code>x</code> declarada anteriormente, faz-se o seguinte:

```
print x;
```

Podemos também imprimir texto diretamente no terminal:

```
print "Hello, World!\n";
```

## **6. Operadores suportados**

A linguagem MUS permite os seguinte operadores aritméticos:

- adição: <code>+</code>
- subtração: <code>-</code>
- multiplicação: <code>*</code>
- divisão: <code>/</code>
- resto da divisão: <code>%</code>

Exemplo de utilização:

```
NUM n1 = 5;
NUM n2 = 6;
NUM sum = n1 + n2;
```

A linguagem MUS permite também os seguintes operadores booleanos:

- <code>and</code>
- <code>or</code>
- <code>not</code>

E ainda relações de ordem:

- maior do que: <code>></code>
- menor do que: <code> < </code>
- maior ou igual do que: <code>>=</code>
- menor ou igual do que:  <code><=</code>
- igual a: <code>==</code>
- diferente:  <code>!=</code>

Exemplo de utilização:

```
BOOL a = True;
BOOL b = False;
BOOL c = a and b; #result: False
BOOL d = 1 > 2; #result: False
```

## 7. Instrução de decisão

Para garantir que uma determinada ação apenas é executada quando uma determinada condição se verifica, podemos usar a instrução de decisão <i>if</i>.

Na linguagem MUS a utilização deste tipo de instrução é da seguinte forma:

```
if condition do
    ...
end
```

Podemos também associar o <i>else</i>, para adicionar um fluxo alternativo no caso de a condição verificada ser falsa.

```
if condition do
    ...
else
    ...
end
```

## 8. Instrução de repetição

Para executar um conjunto de tarefas até se verificar uma determinada condição, recorre-se à instrução *while*.

A utilização deste tipo de instrução é da seguinte forma:

```
while condition do
    ...
end
```

## **9. Funções**

Para evitar a repetição de código, podemos criar funções que ao serem invocadas executam uma determinada rotina associada.

As funções na linguagem MUS podem retornar 3 tipos de dados: <code>NUM</code>, <code>TEXT</code> e <code>BOOL</code>.

Para retornar um valor, ou simplemente terminar a função, utiliza-se a keyword <code>return</code>.

Uma função pode ainda não retornar qualquer valor, não sendo necessário especificar o valor de retorno.

Exemplo de uma função que apenas imprime uma mensagem no terminal:

```
function print_message (
    print "This is a function message!";
)


#invocar a função
print_message;
```

Neste exemplo, a função não retorna nada, nem aceita argumentos.

Aumentando um pouco a complexidade, vejamos a seguinte função:

```
function print_message with TEXT msg(
    print msg;
)


#invocar a função
print_message "Olá!";
```

Neste caso, a função aceita um argumento <code>msg</code> do tipo <code>TEXT</code>.

Finalmente, vejamos a seguinte função:

```
NUM function sum with NUM x NUM y(
    return x + y;
)


#invocar a função
sum 1 2;
```

Neste caso, a função aceita dois argumentos <code>x</code> e <code>y</code> do tipo <code>NUM</code>. Retorna a soma destes dois números através do <code>return x + y</code>.

## **10. Listas**

Uma outra forma de armazenar dados na linguagem MUS, desta vez todos na mesma estrutura, é através de uma lista.

Uma lista em MUS pode ser declarada da seguinte forma:

```
LIST_NUM x = [1, 2, 3];           #lista de números

LIST_TEXT y = ["a", "b", "c"];    #lista de texto

LIST_BOOL z = [True, False];      #lista com valores booleanos
```

### Operações suportadas pelas listas

Podemos adicionar um novo elemento a uma lista da seguinte forma:

```
LIST_NUM x = [1, 2, 3];       #lista de números

x.add 4;           #adicionar número 4 à lista

x = x + [5, 6];    #concatenar uma lista à inicial

NUM num = x.getIndex 0;   #obter elemento no index 0
```

Podemos ainda iterar uma lista através da instrução <i>for...end</i>.

```
LIST_NUM x = [1, 2, 3, 4, 5, 6];       #lista de números


#iterar a lista e fazer print de cada elemento
for num in x do
    print num;
end
```

## **11. Comentários**

Como já foi possivel reparar, os comentários de uma linha em MUS começam com <code>#</code>.
No entanto, a linguagem Mus permite ainda comentários de multiplas linhas:

```
/*
    Isto é um comentário!
    Aqui ainda é comentário!
*/
```

## 12. Twist

O objeto **Twist**, constituído pelas componentes: velocidade linear e velocidade angular, suporta a soma e subtração com outro objeto **Twist** e multiplicação por um escalar.

```
NUM linear = 2;
NUM angular = 3;
TWIST t1 = (linear, angular);
```

## 13. Point

O objecto **Point**, constituído pelas componentes:  *x* e *y*, suporta a soma e subtração com outro objeto **Point**, multiplicação por um escalar e o cálculo da distância a outro **Point**/**Pose**.

```
# Criar 2 pontos 
POINT p1 = (0,0);
POINT p2 = (3,4);
NUM dist = p1.distanceTo p2;
```



## 14. Pose

O objecto **Pose**, constituído pelas componentes: *Point* e *angle*, suporta a soma e subtração com outro objeto **Pose**, multiplicação por um escalar, o cálculo da distância a outro **Point**/**Pose** e o cálculo do ângulo relativamente a outro **Point**/**Pose**.

```
# Criar uma pose
NUM angle_ = 100;
POSE pos= (p2, angle_);

NUM angle_to_point = pos.angleTo p1;
NUM dist1 = pos.distanceTo p1;
```

> **Nota**: É possível aceder aos atributos dos objetos **Twist**, **Point** e **Pose** através de ":"
> 
> Exemplo:  `NUM p1_x = p1:x;`



## 15. **Lista completa das keywords da linguagem**

A linguagem Mus tem um conjunto de keywords com uma funcionalidade específica, não podendo ser usadas pelo programador.

A seguir encontram-se as keywords e a respetiva funcionalidade:

| Keyword                                     | Funcionalidade                                                                                        |
| ------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| <code>print x                     </code>   | função de impressão                                                                                   |
| <code>rotate vel                  </code>   | rodar robot sobre si próprio com uma velocidade <code>vel</code>                                      |
| <code>move vel1 vel2                </code> | mover robot com uma velocidade <code>vel1</code> na roda direira e <code>vel2</code> na roda esquerda |
| <code>posX                        </code>   | devolve posição X do robot                                                                            |
| <code>posY                        </code>   | devolve posição Y do robot                                                                            |
| <code>pickUp                      </code>   | função para alterar os LEDs e estado do robot para pickUp                                             |
| <code>returning                   </code>   | função para alterar os LEDs e estado do robot para returning                                          |
| <code>finish                      </code>   | função pickUp para alterar os LEDs e estado do robot para terminado                                   |
| <code>stop                        </code>   | função para parar o robot                                                                             |
| <code>obstacleDistance sensor\_num</code>   | obter distância a um obstáculo                                                                        |
| <code> beaconAngle bn             </code>   | Obter ângulo em relação ao farol com identificador ```bn```                                           |
| <code>northAngle                  </code>   | Obter o ângulo para norte                                                                             |
| <code>onTarget bn                 </code>   | Permite saber se o robot está no target <code>bn</code> ou não                                        |
| <code>beaconCount                 </code>   | Devolve o número total de faróis no mapa                                                              |
| <code>startAngle                  </code>   | Devolve o ângulo em relação à posição inicial                                                         |
| <code>collides                    </code>   | Devolve true se o robot colidiu, false caso contrário                                                 |
| <code>setVisitedLed state         </code>   | Ligar (1) ou desligar (0) LED                                                                         |
| <code>getReturningLed             </code>   | Devolve o estado do led de returning                                                                  |
| <code>getVisitedLed               </code>   | Devolve o estado do led de visiting                                                                   |

> **NOTA IMPORTANTE:** Em funções que aceitam números inteiros como argumento, como por exemplo <code>beaconAngle arg</code>, caso seja passado um número com casa decimal, este irá ser truncado para número inteiro.

## **16. Como executar um programa em Mus**

Para executar um programa em Mus deve primeiramente situar-se na pasta do projeto e de seguida executar o script musRun.sh, passando como primeiro argumento a localização do ficheiro .mus com o código fonte e como segundo argumento o nome do Viewer.

```bash
./musRun.sh ./source_code_file_path Viewer_name
```

Para mais informação executar

```bash
./musRun.sh
```

## 17. Resultado de example6.mus

![](https://cdn.discordapp.com/attachments/987006149863817216/987497321522679848/mus_final_1.gif)
