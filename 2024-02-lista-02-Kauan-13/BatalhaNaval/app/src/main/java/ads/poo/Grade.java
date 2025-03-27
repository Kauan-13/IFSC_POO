package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Grade {
    private double x;
    private double y;
    private final double celula;
    private final double linhas;
    private final double colunas;

    public Grade(double x, double y) {
        this.x = x;
        this.y = y;
        this.celula = 40;
        this.linhas = 10;
        this.colunas = 10;
    }

    public void desenhar(Draw draw) {
        Color vermelho = new Color(225, 55, 37);
        char letra = 'A';

        for (int i = 0; i <= colunas; i++) {
            if (i < 10){
                draw.setPenColor(vermelho);
                draw.text(x + (i * celula) + (celula / 2), y - (celula / 2), String.valueOf(i));
            }
            draw.setPenColor(Color.black);
            draw.line(x,y + (i * celula),x + (colunas * celula), y + (i * celula));
        }

        for (int i = 0; i <= linhas; i++) {
            if (i < 10){
                draw.setPenColor(vermelho);
                draw.text(x - (celula / 2), y + (i * celula) + (celula / 2), String.valueOf(letra));
                letra++;
            }
            draw.setPenColor(Color.black);
            draw.line(x + (i * celula), y, x + (i * celula), y + (linhas * celula));
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
