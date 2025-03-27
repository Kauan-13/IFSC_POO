package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Tiro {
    private final int coluna;
    private final char linha;
    private final double raio;
    private final boolean acertou;
    private double x;
    private double y;

    public Tiro(int coluna, char linha, boolean acertou, Grade grade) {
        this.raio = 15;
        this.coluna = coluna;
        this.linha = linha;
        this.acertou = acertou;
        this.setX(coluna, grade);
        this.setY(linha, grade);
    }
    public int getColuna() {
        return coluna;
    }
    public char getLinha() {
        return linha;
    }
    public boolean isAcertou() {
        return acertou;
    }
    private void setX(int coluna, Grade grade) {
        this.x = grade.getX() + (coluna * grade.getCelula()) + (grade.getCelula()/2);
    }
    private void setY(char linha, Grade grade) {
        char letra = 'A';

        while (letra != linha) {
            letra++;
        }

        this.y = grade.getY() + ((letra - 'A') * grade.getCelula()) + (grade.getCelula()/2);
    }
    public void desenhar(Draw draw) {
        if(acertou){
            draw.setPenColor(Color.red);
        }else{
            draw.setPenColor(Color.CYAN);
        }
        draw.filledCircle(this.x, this.y, this.raio);
        draw.setPenColor(Color.black);
    }
    public boolean isOcupado(int coluna, char linha) {
        return coluna == this.coluna && linha == this.linha;
    }
}
