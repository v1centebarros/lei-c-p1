# TODO LIST

## Mínimas

- [X] Deve suportar nativamente o conceito de robô (robot)

- [X] Deve suportar o conceito de ações protegidas (guarded actions) sobre robôs, ou seja, ações que apenas são realizadas se um determinado predicado for verdadeiro.

- [] Deve conter uma linguagem secundária de leitura de mapas (por exemplo, labirintos).

- [X] Deve permitir a definição e uso de variáveis (associadas a valores numericos, texto, pontos, poses, velocidades, robôs).

- [O] Deve possuir mecanismo de leitura, que permita a interação de um utilizador com o  programa (por exemplo, para interagir com um joystick ) **INPUT**.

- [O] Deve possuir mecanismo de escrita, que permita a escrita no terminal dos tipos de dados primitivos que suporta **PRINT**.

## Médias

- [X] Permitir a definição de expressões booleanas (predicados) contendo, pelo menos, relações de ordem e operadores booleanos (conjunção disjunção, etc.).

- [X] Incluir a instrução condicional (operando sobre expressões booleanas), para aí em da implicitamente associada a ações protegidas.

- [X] Incluir a instrução repetitiva (operando sobre expressões booleanas).

- [] Suportar nativamente, em 2D, os conceitos de ’ponto’ (point), ’pose’ (pose) e velocidade’ (twist), assim como algumas opera ̧c ̃oes sobre estes tipos de dados.

## Adicionais

- [] Fazer com que a linguagem contenha um sistema de tipos. Devem existir os seguintes tipos de dados: robô ponto, pose, velocidade, número real, número inteiro, texto, booleano.

- [] Implementar funções e variáveis locais às mesmas.

- [] Permitir a definição de listas.

- [] Possuir um mecanismo de gravação em ficheiros dos mapas lidos da linguagem secundária no formato aceite pelo ambiente de simulação