package poo.pecas;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Rei extends Peca {

    public Rei(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar(Draw draw) {
        if (this.selecionado){
            draw.setPenColor(Color.RED);
            draw.filledCircle(x + 0.5, y + 0.5, 0.4);
        }
        draw.picture(x + 0.5, y + 0.5, "rei.png",0.8,0.8);
    }

    @Override
    public boolean isPossivelMover(int x, int y) {
        if (x == this.x) {
            return y == this.y + 1 || y == this.y - 1;
        } else if (y == this.y) {
            return x == this.x + 1 || x == this.x - 1;
        } else if (x != this.x && y != this.y) {
            return x == this.x + 1 && y == this.y + 1 || x == this.x + 1 && y == this.y - 1
                    || x == this.x - 1 && y == this.y + 1 || x == this.x - 1 && y == this.y - 1;
        }
        return false;
    }
}
