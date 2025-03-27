package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Jogo {
    private final Jogador jogador;
    private final Bot bot;
    private int status;

    public Jogo(String nomeJogador, Draw draw) {
        this.jogador = new Jogador(nomeJogador);
        this.bot = new Bot();
        this.desenharGrades(draw);
        this.status = 1;
    }

    private void desenharGrades(Draw draw) {
        this.jogador.getGrade().desenharGrade(draw);
        this.bot.getGrade().desenharGrade(draw);

        Font f = draw.getFont();
        draw.setFont(f.deriveFont(30.0f));
        draw.text(280, 550, this.jogador.getNome() + ": " + this.jogador.getVitorias());
        draw.text(760,550,"Computador" + ": " + this.bot.getVitorias());
    }

    public void reiniciarJogo(Draw draw) {
        draw.clear(Color.white);
        this.jogador.removeNavios();
        this.jogador.removeTiros();
        this.bot.removeNavios();
        this.bot.removeTiros();
        draw.setFont();
        desenharGrades(draw);
        this.jogador.setComeca(!this.jogador.isComeca());
    }

    public String getNomeJogador() {
        return this.jogador.getNome();
    }

    public boolean isComeca() {
        return this.jogador.isComeca();
    }

    public void addJogadorVitoria() {
        this.jogador.setVitorias();
    }

    public Grade getGradeJogador(){
        return this.jogador.getGrade();
    }

    public ArrayList<Navio> getNavioJogador(){
        return this.jogador.getNavios();
    }

    public ArrayList<Tiro> getTiroJogador() {
        return this.jogador.getTiros();
    }

    public void addBotVitoria() {
        this.bot.setVitorias();
    }

    public Grade getGradeBot(){
        return this.bot.getGrade();
    }

    public ArrayList<Navio> getNavioBot() {
        return this.bot.getNavios();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean adicionarNavio(int coluna, char linha, char tipo, boolean vertical, Grade grade, Draw draw) {
        Navio navio = new Navio(coluna,linha,tipo,vertical,grade);
        this.jogador.adicionarNavio(navio);
        this.jogador.getNavios().getLast().desenhar(draw);
        return true;
    }

    public boolean adicionarNavio(char tipo, Grade grade) {
        Random r = new Random();
        char linha = 'A';
        int coluna = 0;
        boolean vertical = false;

        Navio navioTemp = new Navio(coluna,linha,tipo,false,grade);

        if(r.nextInt(2) == 1){
            vertical = true;
        }

        if (vertical){
            coluna = r.nextInt(10);
            do {
                linha = (char) (65 + r.nextInt(10));
            }while (linha > 'K' - navioTemp.getTamanho());
        }else{
            linha = (char) (65 + r.nextInt(10));
            do {
                coluna = r.nextInt(10);
            }while (coluna > 10 - navioTemp.getTamanho());
        }

        Navio navio = new Navio(coluna, linha, tipo,vertical, grade);

        if (isPosicaoLivre(this.bot.getNavios(), coluna, linha, tipo, vertical, this.bot.getGrade())){
            this.bot.adicionarNavio(navio);
            return true;
        }
        return false;
    }

    public boolean isValorValido(String posicao) {
        boolean[] valoresCorretos = new boolean[3];

        if (posicao.length() != 3) {
            return false;
        } else {
            String[] posicoes = posicao.split("");

            char letra = 'A';
            for (int i = 0; i < 10; i++) {
                if (posicoes[0].equals(""+letra)) {
                    valoresCorretos[0] = true;
                }
                if (posicoes[1].equals(Integer.toString(i))) {
                    valoresCorretos[1] = true;
                }
                if (posicoes[2].equals("V") || posicoes[2].equals("H")) {
                    valoresCorretos[2] = true;
                }
                letra++;
            }

            for (boolean e: valoresCorretos) {
                if (!e){
                    return false;
                }
            }
            return true;
        }
    }

    public boolean isPosicaoLivre(ArrayList<Navio> navios, int coluna, char linha,char tipo, boolean vertical, Grade grade) {
        Navio navioTemp = new Navio(coluna,linha,tipo,vertical,grade);

        for (Navio n: navios) {
            for (int i = 0; i < navioTemp.getTamanho(); i++) {
                if (navioTemp.isVertical()){
                    if (n.isOcupado(navioTemp.getColuna(),(char) (navioTemp.getLinha() + i))) {
                        return false;
                    }
                }else{
                    if (n.isOcupado(navioTemp.getColuna() + i,navioTemp.getLinha())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isPosicaoPossivel(int coluna, char linha,char tipo, boolean vertical, Grade grade) {
        Navio navioTemp = new Navio(coluna,linha,tipo,vertical,grade);

        if (vertical){
            return linha <= 'K' - navioTemp.getTamanho();
        }else{
            return coluna <= 10 - navioTemp.getTamanho();
        }
    }

    public boolean isNavioAfundou(ArrayList<Navio> navios) {
        for (Navio n: navios) {
            if(n.isAfundado()){
                navios.remove(n);
                return true;
            }
        }
        return false;
    }

    public boolean atirar(int coluna, char linha, boolean acertou, Grade grade, Draw draw) {
        Tiro tiro = new Tiro(coluna, linha, acertou, grade);
        this.jogador.adicionarTiro(tiro);
        this.jogador.getTiros().getLast().desenhar(draw);
        return true;
    }

    public boolean atirar(Grade grade, Draw draw) {
        Random r = new Random();
        char linha = 'A';
        int coluna = 0;
        if(!this.bot.getTiros().isEmpty()){
            if(this.bot.getTiros().getLast().isAcertou()){
                Tiro ultimoTiro = this.bot.getTiros().getLast();
                switch (r.nextInt(4)){
                    case 0 -> {
                        coluna = ultimoTiro.getColuna();
                        if(ultimoTiro.getLinha() == 'J'){
                            linha = (char) (ultimoTiro.getLinha() - 1);
                            break;
                        }
                        linha = (char) (ultimoTiro.getLinha() + 1);
                    }
                    case 1 -> {
                        linha = ultimoTiro.getLinha();
                        if(ultimoTiro.getColuna() == 9){
                            coluna = ultimoTiro.getColuna() - 1;
                            break;
                        }
                        coluna = ultimoTiro.getColuna() + 1;
                    }
                    case 2 -> {
                        coluna = ultimoTiro.getColuna();
                        if(ultimoTiro.getLinha() == 'A'){
                            linha = (char) (ultimoTiro.getLinha() + 1);
                            break;
                        }
                        linha = (char) (ultimoTiro.getLinha() - 1);
                    }
                    case 3 -> {
                        linha = ultimoTiro.getLinha();
                        if(ultimoTiro.getColuna() == 0){
                            coluna = (char) (ultimoTiro.getLinha() + 1);
                            break;
                        }
                        coluna = ultimoTiro.getColuna() - 1;
                    }
                }
                if (isTiroPosicaoLivre(this.bot.getTiros(),coluna,linha)){
                    return addTiroBot(coluna, linha, grade, draw);
                }
            }
        }
        do{
            linha = (char) (65 + r.nextInt(10));
            coluna = r.nextInt(10);
        }while (!isTiroPosicaoLivre(this.bot.getTiros(),coluna,linha));
        return addTiroBot(coluna, linha, grade,draw);
    }

    private boolean addTiroBot(int coluna, char linha, Grade grade, Draw draw) {
        if (isTiroAcertou(this.jogador.getNavios(),coluna,linha)) {
            Tiro tiro = new Tiro(coluna, linha, true, grade);
            this.bot.adicionarTiro(tiro);
            this.bot.getTiros().getLast().desenhar(draw);
            return true;
        }else{
            Tiro tiro = new Tiro(coluna, linha, false, grade);
            this.bot.adicionarTiro(tiro);
            this.bot.getTiros().getLast().desenhar(draw);
            return false;
        }
    }

    public boolean isTiroValorValido(String posicao) {
        boolean[] valoresCorretos = new boolean[2];

        if (posicao.length() != 2) {
            return false;
        } else {
            String[] posicoes = posicao.split("");

            char letra = 'A';
            for (int i = 0; i < 10; i++) {
                if (posicoes[0].equals(""+letra)) {
                    valoresCorretos[0] = true;
                }
                if (posicoes[1].equals(Integer.toString(i))) {
                    valoresCorretos[1] = true;
                }
                letra++;
            }

            for (boolean e: valoresCorretos) {
                if (!e){
                    return false;
                }
            }
            return true;
        }
    }

    public boolean isTiroPosicaoLivre(ArrayList<Tiro> tiros, int coluna, char linha) {
        for (Tiro t: tiros) {
            if(t.isOcupado(coluna,linha)){
                return false;
            }
        }
        return true;
    }

    public boolean isTiroAcertou(ArrayList<Navio> navios, int coluna, char linha) {
        for (Navio n: navios) {
            if(n.isOcupado(coluna,linha)){
                n.atingir(coluna,linha);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Total de Partidas: " + (this.jogador.getVitorias() + this.bot.getVitorias()) + "\n" +
                this.jogador + "\n" +
                this.bot;
    }
}
