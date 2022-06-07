# TODO LIST

## Mínimas

- [] Deve suportar nativamente o conceito de robô (robot)
    – [] Pode existir mais do que um robô.
    – [] Um robô é composto por propriedades (nome, estado, pose, velocidade, valores lidos pelos sensores, etc.).
    – [] Há propriedades constantes desde a criação (nome) e outras que mudam ao longo do tempo (estado, pose, velocidade).
    – [O] As propriedades podem ser do tipo numérico, booleano, textual, enumerado, etc.

- [] Deve suportar o conceito de ações protegidas (guarded actions) sobre robôs, ou seja, ações que apenas são realizadas se um determinado predicado for verdadeiro.
    – [O] A aplicação de uma velocidade e o acendimento/apagamento de leds são exemplos de ações.
    – [] O valor lido por um determinado sensor estar dentro de um dado intervalo é um
    exemplo de predicado.
    – [] As ações devem ser registadas localmente e apenas enviadas ao simulador sobre diretiva de um comando especial (apply) que as aplica.

- [] Deve conter uma linguagem secundária de leitura de mapas (por exemplo, labirintos).
    – [] Um mapa é definido por um conjunto de paredes, colocadas num recinto retangular.
    – [] A linguagem principal deve ter instruções para importar (em runtime, através de um interpretador) um mapa, recorrendo a esta linguagem secundária.

- [X] Deve permitir a definição e uso de variáveis (associadas a valores numericos, texto, pontos, poses, velocidades, robôs).

- [O] Deve possuir mecanismo de leitura, que permita a interação de um utilizador com o  programa (por exemplo, para interagir com um joystick ) **INPUT**.

- [O] Deve possuir mecanismo de escrita, que permita a escrita no terminal dos tipos de dados primitivos que suporta **PRINT**.

## Médias

- [X] Permitir a definição de expressões booleanas (predicados) contendo, pelo menos, relações de ordem e operadores booleanos (conjunção disjunção, etc.).

- [X] Incluir a instrução condicional (operando sobre expressões booleanas), para aí em da implicitamente associada a ações protegidas.

- [X] Incluir a instrução repetitiva (operando sobre expressões booleanas).

- [] Suportar nativamente, em 2D, os conceitos de ’ponto’ (point), ’pose’ (pose) e ’velo-
cidade’ (twist), assim como algumas operações sobre estes tipos de dados.
    – O ponto deve ser representado pelas suas componentes X e Y.
    – A pose deve ser representada por um ponto e uma orientação.
    – A velocidade deve ser representada pelas suas componentes linear e angular.
    – Operações como distância entre dois pontos, distância entre pose e ponto, posição
    angular de um ponto em relação a uma pose, multiplicação de uma velocidade por um
    escalar, adição e subtração de velocidades, etc., devem ser contempladas. 

## Adicionais

- [] Fazer com que a linguagem contenha um sistema de tipos. Devem existir os seguintes tipos de dados: robô ponto, pose, velocidade, número real, número inteiro, texto booleano.

- [] Implementar funções e variáveis locais às mesmas.

- [] Permitir a definição de listas.

- [] Possuir um mecanismo de gravação em ficheiros dos mapas lidos da linguagem secundária no formato aceite pelo ambiente de simulação.