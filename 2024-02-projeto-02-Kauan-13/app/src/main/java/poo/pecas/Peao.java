package poo.pecas;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Peao extends Peca{

    private boolean primeiroMovimento;

    public Peao(double x, double y) {
        super(x, y);
        primeiroMovimento = true;
    }

    @Override
    public void desenhar(Draw draw) {
        if (this.selecionado){
            draw.setPenColor(Color.RED);
            draw.filledCircle(x + 0.5, y + 0.5, 0.4);
        }
        draw.picture(x + 0.5, y + 0.5, "peao.png",0.8,0.8);
    }

    @Override
    public boolean isPossivelMover(int x, int y) {
        if (primeiroMovimento) {
            if (x == this.x && y <= this.y + 2 && y > this.y) {
                primeiroMovimento = false;
                return true;
            }
        } else {
            return x == this.x && y <= this.y + 1 && y > this.y;
        }
        return false;
    }
}
