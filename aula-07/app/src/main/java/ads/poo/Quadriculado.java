package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Quadriculado {
    private double x;
    private double y;
    private Color cor;
    private double tamanho;
    private int coluna;
    private int linha;

    public Quadriculado(double x, double y, int coluna, int linha, double tamanho, Color cor) {
        this.x = x;
        this.y = y;
        this.coluna = coluna;
        this.linha = linha;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void desenhar(Draw draw) {
        Color corAntiga = draw.getPenColor();
        draw.setPenColor(this.cor);
        for (int i = 0; i < coluna - 1; i++) {
            for (int j = 0; j < linha - 1; j++) {
                draw.square(this.x + (tamanho * i),this.y + (tamanho * j),this.tamanho);
            }
        }
        draw.setPenColor(corAntiga);
    }
}
