package poo.pecas;

import edu.princeton.cs.algs4.Draw;

public abstract class Peca {

    protected double x;
    protected double y;
    protected boolean selecionado;

    public Peca(double x, double y) {
        this.x = Math.floor(x);
        this.y = Math.floor(y);
        this.selecionado = false;
    }

    public abstract void desenhar(Draw draw);

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract boolean isPossivelMover(int x, int y);

    public void setSelecionado(boolean selecionado) {
        this.selecionado = selecionado;
    }

    public boolean isSelecionado() {
        return selecionado;
    }
}
