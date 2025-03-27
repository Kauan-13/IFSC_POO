package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Navio {
    private final int coluna;
    private final char linha;
    private final char tipo;
    private int tamanho;
    private final boolean vertical;
    private final boolean[] atingido;
    private final double celula;
    private double x;
    private double y;

    public Navio(int coluna, char linha, char tipo, boolean vertical, Grade grade) {
        this.celula = 40;
        this.coluna = coluna;
        this.linha = linha;
        this.tipo = tipo;
        this.vertical = vertical;
        this.setTamanho();
        this.atingido = new boolean[this.tamanho];
        this.setX(coluna, grade);
        this.setY(linha,grade);
    }
    public int getColuna() {
        return coluna;
    }
    public char getLinha() {
        return linha;
    }
    public int getTamanho() {
        return tamanho;
    }
    private void setTamanho() {
        char[][] frota = {
                {'P',5},
                {'E',4},
                {'C',3},
                {'S',3},
                {'N',2},
        };

        for (char[] chars : frota) {
            if (chars[0] == this.tipo) {
                this.tamanho = chars[1];
            }
        }
    }
    public boolean isVertical() {
        return vertical;
    }
    private void setX(int coluna, Grade grade) {
        this.x = grade.getX() + (coluna * this.celula);
    }
    private void setY(char linha, Grade grade) {
        char letra = 'A';

        while (letra != linha) {
            letra++;
        }

        this.y = grade.getY() + ((letra - 'A') * this.celula);
    }
    public void desenhar(Draw draw) {
        Color azul = new Color(39, 89, 159);
        draw.setPenColor(azul);
        if(this.vertical) {
            for (int i = 0; i < this.tamanho; i++) {
                draw.filledSquare(this.x + celula / 2,this.y + (this.celula * i) + celula / 2,this.celula / 2);
            }
        }else{
            for (int i = 0; i < this.tamanho; i++) {
                draw.filledSquare(this.x + (this.celula * i) + celula / 2,this.y + celula / 2,this.celula / 2);
            }
        }
        draw.setPenColor(Color.black);
    }
    public void atingir(int coluna, char linha) {
        if (vertical) {
            atingido[linha - this.linha] = true;
        }else{
            atingido[coluna - this.coluna] = true;
        }
    }
    public boolean isOcupado(int coluna, char linha) {
        int colunaFinal = (this.vertical) ? this.coluna : this.coluna + this.tamanho - 1;
        int linhaFinal = (this.vertical) ? this.linha + this.tamanho - 1 : this.linha;

        return (coluna <= colunaFinal) && (coluna >= this.coluna) && (linha <= linhaFinal) && (linha >= this.linha);
    }
    public boolean isAfundado() {
        for (boolean e: atingido){
            if (!e){
                return false;
            }
        }
        return true;
    }
}