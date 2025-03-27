package poo.pecas;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Cavalo extends Peca {

    public Cavalo(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar(Draw draw) {
        if (this.selecionado){
            draw.setPenColor(Color.RED);
            draw.filledCircle(x + 0.5, y + 0.5, 0.4);
        }
        draw.picture(x + 0.5, y + 0.5, "cavalo.png",0.8,0.8);
    }

    @Override
    public boolean isPossivelMover(int x, int y) {
        if (x == this.x + 2 || x == this.x - 2 || y == this.y + 2 || y == this.y - 2) {
            return x == this.x + 1 || x == this.x - 1 || y == this.y + 1 || y == this.y - 1;
        }
        return false;
    }
}
