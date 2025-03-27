# Batalha Naval (Projeto 1)

## Como Jogar
1. O usuário digita o seu nome (Apenas o primeiro nome, nomes compostos são ignorados).
2. O terminal irá perguntar aonde o usuário irá inserir os navios, um de cada vez e o usuário deve escrever junto e nessa ordem a linha (uma letra entre A e J), a coluna (um número entre 0 e 9) e V para vertical e H para horizontal. ex: C3H
3. O terminal irá perguntar a coordenada do tiro, e o usuário deve escrever junto e nessa ordem a linha (uma letra entre A e J), a coluna (um número entre 0 e 9). ex: D4
4. Após um dos lados destruírem todos os navios adversários, o jogo pergunta ao usuário se ele quer iniciar uma nova rodada, S para resposta afirmativa N para resposta negativa.
5. Caso resposta afirmativa o jogo reinicia limpando o tabuleiro e os navios devem ser colocados de novo, e no momento do tiro inverte a ordem de quem começa.
6. Caso resposta negativa o jogo mostra quantas partidas foram jogadas e quantas cada um ganhou.

## O jogo
![Em Combate](imgs/captura1.PNG)
![Combate Finalizado](imgs/captura2.PNG)
![Nova Partida](imgs/captura3.PNG)
![Finalizando o Jogo](imgs/captura4.PNG)

## Diagrama UML
```mermaid
classDiagram
    
    direction TB
    App "1"*--"1" Jogo
    Jogo "1"*--"1" Jogador
    Jogo "1"*--"1" Bot
    Jogador "1"*--"1" Grade
    Jogador "1"*--"0..5" Navio
    Jogador "1"*--"0..*" Tiro
    Bot "1"*--"0..*" Tiro
    Bot "1"*--"0..5" Navio
    Bot "1"*--"1" Grade
    
    class App {
        -draw: Draw
        -jogo: Jogo
        
        +App()
        +main()$
        -menu()
        -addNavios()
        -addTiros()
        -addTiroJogador()
        -addTiroBot()
        -mensagens()
    }
    
    class Jogo {
        -jogador: Jogador
        -bot: Bot
        -status: int
        
        +Jogo(nomeJogador: String, Draw draw)
        -desenharGrades(Draw draw)
        -reiniciarJogo(Draw draw)
        +adicionarNavio(coluna: int, linha: char, tipo: char, vertical: boolean, grade: Grade, Draw draw) boolean
        +adicionarNavio(tipo: char, grade: Grade) boolean
        +isValorValido(posicao: String) boolean
        +isPosicaoLivre(navios: ArrayList~Navio~, coluna: int, linha: char, tipo: char, vertical: boolean, grade: Grade) boolean
        +isPosicaoPossivel(coluna: int, linha: char, tipo: char, vertical: boolean, grade: Grade) boolean
        +isNavioAfundou(navios: ArrayList~Navio~) boolean
        +atirar(coluna: int, linha: char, grade: Grade, draw: Draw) boolean
        +atirar(grade: Grade, draw: Draw) boolean
        -addTiroBot(coluna: int, linha: char, grade: Grade, draw: Draw)
        +isTiroValorValido(posicao: String) boolean
        +isTiroPosicaoLivre(tiros: ArrayList<Tiro>, coluna: int, linha: char, grade: Grade) boolean
        +isTiroAcertou(navios: ArrayList<Navio>, coluna: int, linha: char) boolean
    }
    
    class Jogador{
        -nome: String
        -vitorias: int
        -comeca: boolean
        -grade: Grade
        -navios: ArrayList~Navio~
        -tiros: ArrayList~Tiro~
        
        +Jogador(nome: String)
        +adicionarNavio(navio: Navio)
        +removeNavios()
        +adicionarTiro(tiro: Tiro)
        +toString() String
    }
    
    class Bot {
        -vitorias: int
        -grade: Grade
        -navios: ArrayList~Navio~
        -tiros: ArrayList~Tiro~
        
        +Bot()
        +adicionarNavio(navio: Navio)
        +removeNavios() 
        +adicionarTiro(tiro: Tiro)
        +toString() String
    }

    class Grade {
        -x: double
        -y: double
        -celula: double
        -linhas: int
        -colunas: int

        +Grade(x: double, y: double)
        +desenharGrade(Draw draw)
    }
    
    class Navio {
        -coluna: int
        -linha: char
        -tipo: char
        -tamanho: int
        -vertical: boolean
        -atingido: boolean[]
        -celula: double
        -x: double
        -y: double
        
        +Navio(coluna: int, linha: char, tipo: char, vertical: boolean, grade: Grade)
        +desenhar(Draw draw)
        -setTamanho(tipo: char)
        +atingir(coluna: int, linha: char)
        +isAfundado() boolean
        +isOcupado(coluna: int, linha: char) boolean
    }
    
    class Tiro {
        -coluna: int
        -linha: char
        -raio: double
        -acertou: boolean
        -x: double
        -y: double
        
        Tiro(coluna: int, linha: char, acertou: boolean, grade: Grade)
        +desenharTiro(Draw draw)
        +isOcupado(coluna: int, linha: char) boolean
    }

```