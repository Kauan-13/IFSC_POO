package poo.pecas;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Rainha extends Peca{

    public Rainha(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar(Draw draw) {
        if (this.selecionado){
            draw.setPenColor(Color.RED);
            draw.filledCircle(x + 0.5, y + 0.5, 0.4);
        }
        draw.picture(x + 0.5, y + 0.5, "rainha.png",0.8,0.8);
    }

    @Override
    public boolean isPossivelMover(int x, int y) {
        if (x != this.x && y != this.y){
            return Math.abs(x - this.x) == Math.abs(y - this.y);
        } else {
            return x == this.x && y != this.y || x != this.x && y == this.y;
        }
    }
}
