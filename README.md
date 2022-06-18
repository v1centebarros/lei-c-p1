# Tema Mus, grupo p3g3
-----

## Constituição dos grupos e participação individual global

| NMec | Nome | email | Participação |
|:--:|:---|:---|:---:|
| 102565 | EMANUEL GASPAR MARQUES | emanuel.gmarques@ua.pt | $$ \frac{100}{\:6}\% $$ |
| 102536 | LEONARDO ALMEIDA | leonardoalmeida7@ua.pt | $$ \frac{100}{\:6}\% $$ |
| 103823 | MARIANA ALEXANDRA FRANCO ANDRADE | marianaandrade@ua.pt | $$ \frac{100}{\:6}\% $$ |
| 102778 | PEDRO HENRIQUE FIGUEIREDO RODRIGUES | pedrofrodrigues4@ua.pt | $$ \frac{100}{\:6}\% $$ |
| 102534 | RAFAEL FERNANDES GONÇALVES | rfg@ua.pt | $$ \frac{100}{\:6}\% $$ |
| 97787  | VICENTE MANUEL ANDRADE BARROS | vmabarros@ua.pt | $$ \frac{100}{\:6}\% $$ |

## Organização do repositório

- **src** - contém o código fonte do projeto.

- **doc** - contém toda a documentação associada à linguagem Mus, Mmp e ainda erros de compilação.

- **examples** -- exemplos ilustrativos das linguagens criadas.


## Relatório

### Metodologia utilizada:
  Este trabalho começou pelo levantamento de requisitos necessários para que a linguagem cumprisse os desafios propostos. Nesta etapa, concluímos que a linguagem tinha de ser simples e direta, tendo em conta o público alvo: alunos da academia de Verão que não estão tão familiarizados com linguagens de programação. Algumas das decisões tomadas inicialmente foram a **criação de uma entidade Robot**, utilização de **keywords maiúsculas** para identificar **tipos de dados**, **remoção da sobreutilização de parêntesis para métodos e funções** e **possibilidade de interagir com múltiplos robots através da criação de contextos com a keyword *use***.
  
  Como o desenvolvimento deste trabalho conseguimos alcançar:
  - A linguagem **Mus** suporta nativamente o conceito de robô (robot) que tem propriedades constantes desde sua a criação (nome) e outras que mudam ao longo do tempo (estado, pose, velocidade), podendo existir mais do que um robot.

## Objetivos alcançados

- [X] Suporta nativamente o conceito de robô (robot)

- [X] Permite a definição e uso de variáveis.

- [X] Possui um mecanismo de leitura, que permita a interação de um utilizador com o  programa.

- [X] Possui um mecanismo de escrita, que permita a escrita no terminal.

- [X] Contém uma linguagem secundária de leitura de mapas (por exemplo, labirintos), com as limitações comunicadas ao professor.

- [X] Permite a definição de expressões booleanas (predicados) contendo, pelo menos, relações  de ordem e operadores booleanos (conjunção disjunção, etc.).

- [X] Inclui a instrução condicional (operando sobre expressões booleanas).

- [X] Inclui a instrução repetitiva (operando sobre expressões booleanas).

- [X] Suporta nativamente, em 2D, os conceitos de ’ponto’ (point), ’pose’ (pose) e velocidade’ (twist), assim como algumas operações sobre estes tipos de dados.

- [X] Fazer com que a linguagem contenha um sistema de tipos: texto, número, booleano, robô, ponto, pose e velocidade.

- [X] Implementa funções e variáveis locais às mesmas.

- [X] Permite a definição de listas e a sua manipulação.

- [X] Possui um mecanismo de gravação em ficheiros dos mapas lidos da linguagem secundária no formato aceite pelo ambiente de simulação.

## Contribuições

| Secção | Principais participantes |
|:--:|:---|
|Gramática|Rafael, Leonardo, Mariana, Vicente|
|Análise semântica|Rafael, Leonardo|
|Geração de código|Pedro, Emanuel|
|Segunda linguagem|Mariana, Emanuel|
|Documentação|Vicente, Pedro|


## Agradecimentos especiais
O grupo supracitado agradece ainda toda a disponibilidade demonstrada pelo professor Artur Pereira, no esclarecimento de dúvidas e na marcação de reuniões extraordinárias.
