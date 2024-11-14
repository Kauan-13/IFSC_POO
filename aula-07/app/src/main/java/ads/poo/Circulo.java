package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Circulo {
    private int x;
    private int y;
    private int raio;
    private Color cor;

    public Circulo(int x, int y, int raio, Color cor) {
        this.x = x;
        this.y = y;
        this.raio = raio;
        this.cor = cor;
    }

    public void desenhar(Draw draw) {
        Color corAntiga = draw.getPenColor();
        draw.setPenColor(this.cor);
        draw.circle(this.x,this.y,this.raio);
        draw.setPenColor(corAntiga);
    }
}
