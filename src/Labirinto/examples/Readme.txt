comentarios multilinhas: /* */
comentarios de uma so linha : #

GRID -- consiste no conjunto de posições inicias de onde o robo pode partir num determinado labirinto;
LABIRINTO -- consiste no mapa do labirinto, e os dados dos targets, beacons ou de ambos juntos(spot);
TARGET,BEACON, SPOT-- consiste em locais onde o robo de passar ou chegar;

Cada instrução acaba com um ponto e virgula (;), na forma de quem escrever poder escrever tudo na mesma linha.
Na maneira de facilitar o programador criamos SPOT que correspondem a um target e um spot no mesmo local. 
O Target pode ter por default valores para o raio (1), tal como este os BEACONS para a sua altura (2) e Spot para sua altura e raio.
A colocação dos BEACONS, TARGETS e SPOTs pode ser aletoria no labirinto.No entanto, as linhas que formam o mapa tem uma ordem.(explicado mais a frente)

A ordem dos argumentos do labirinto - name,width,height - é importante.
A ordem dos argumentos do SPOT - name,height,Radius - é importante, no entanto pode ser omitido o Radius e a height, por esta mesma ordem.

Construção do mapa:
    '|'  - parede vertical
    '+'  - pontos que unem paredes horizontais ou verticais
    '--' - parede horizontal
    ' '  - por onde o robo pode circular

Ordenação do mapa:
    A escrita do mapa deve começar na linha cujo valor é altura do labirinto menos dois e ir até a linha zero.
    Quanto ao padrão este deve ter acordo com construção do mapa referida anteriormente. 


NOTA IMPORTANTE: 
    -No simulador o robo não se mexe se tiver uma direção de 360, pelo é calculado o resto da divisão por 360 para 
podermos aceitar uma maior gama de direções. São excluidas as direções negativas e as que não forem inteiras;
    -A ordem de como as posições são colocadas na GRID, corresponde à ordem de como os robos são colocados no labirinto;
    -Em cada ficheiro gerado pela linguagem só é possível ter ou uma grid, ou um labirinto, ou um labirinto e uma grid,nesta mesma ordem,
ou seja,não é aceite mais de dois labirintos ou duas grids e não aceite uma grid e depois um labirinto, por exemplo;
    -A altura de um beacon, se colocada, deve ser superior a 0, e o mesmo no caso raio no target;
    -A altura e o comprimento do labirinto deve ser superior a 0;
    -O mapa não pode estar incompleto, ou seja, não pode falhar nem com tamanho do labirinto, nem por falhas linhas ou falta de espaços do labirinto;
    -No caso de ser construia apenas uma grid no labirinto, não considerado limites nas coordenadas, apenas que devem ser positivas em qualquer dos eixos.
