# Laboratorio 01

### 1. Classe para representar um ponto no plano cartesiano
Crie uma classe chamada Ponto que represente um ponto no plano cartesiano (x, y). A classe
deve ter os seguintes métodos:
- Método construtor que receba como parâmetros os valores de x e y;
- Métodos modificadores (set) para alterar os valores de cada um dos atributos;
- Métodos acessores (get) para retornar os valores de cada um dos atributos;
- Método toString() para retornar o ponto no formato (x, y);
- Método que receba como parâmetro um objeto da classe Ponto e retorne a distância entre os
dois pontos.
- A fórmula para calcular a distância entre dois pontos é:
√
(x2 − x1)2 + (y2 − y1)2.

### 2. Classe para representar um horário
Crie uma classe chamada Horario para representar um horário (hora, minuto e segundo). A classe
deverá ter os seguintes métodos:
- Método construtor padrão que inicialize todos atributos com zero;
- Métodos construtores sobrecarregados que permitam inicializar os atributos com valores for-
necidos como argumentos para: i) hora; ii) hora e minuto; e iii) hora, minuto e segundo. Caso
algum dos valores não seja válido, o método construtor deve inicializar todos os atributos com
zero;
- Métodos modificadores (set) para alterar os valores de cada um dos atributos. Caso o valor
fornecido não seja válido, o método deve manter o valor atual do atributo e retornar false. Caso
contrário, o método deve alterar o valor do atributo e retornar true;
- Método toString() para retornar o horário no formato HH:MM:SS (por exemplo, 23:59:59);
- Método que retorne por extenso o horário. Por exemplo, “vinte e três horas, cinquenta e nove
minutos e cinquenta e nove segundos”;
- Método que retorne o horário em segundos (um valor do tipo long). Por exemplo, se horário for
01:00:00, então deve retornar 3600;
- Método que receba como parâmetro um objeto da classe Horario e retorne a diferença em
segundos entre os dois horários.

### 3. Batalha naval
Modele uma classe para representar um navio do jogo batalha naval. Para cada navio é importante
saber o seu tamanho, a sua posição (linha e coluna) no tabuleiro, a sua orientação (vertical ou
horizontal), a letra que o representa no tabuleiro (e.g. P para porta-aviões), quais posições ele já foi
atingido e se ele foi afundado ou não. Pense em quais atributos e métodos podem ser úteis para a
classe e implemente-os. Considere que os métodos dessa classe serão invocados por um programa
principal que representa o jogo batalha naval. Assim, os métodos devem ser úteis para o jogo, como
por exemplo, verificar se o navio foi atingido, se ele foi afundado, etc.