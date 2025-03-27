package ads.poo;

import edu.princeton.cs.algs4.Draw;
import org.checkerframework.checker.units.qual.C;

import java.awt.*;

public class Navio {
    private double x;
    private double y;
    private char tipo;
    private double tamanho;

    private boolean vertical;
    private final double celula;

    public Navio(double x, char y, char tipo, boolean vertical, Grade grade) {
        this.celula = 40;
        this.setX(x, grade);
        this.setY(y, grade);
        this.tipo = tipo;
        this.vertical = vertical;
        this.setTamanho();
    }

    private void setX(double x, Grade grade) {
        this.x = grade.getX() + (x * this.celula);
    }

    private void setY(char y, Grade grade) {
        char letra = 'A';

        while (letra != y) {
            letra++;
        }

        this.y = grade.getY() + ((letra - 'A') * this.celula);
    }
    private void setTamanho() {
        char[][] frota = {
                {'P',5},
                {'E',4},
                {'C',3},
                {'S',3},
                {'N',2},
        };

        for (int i = 0; i < frota.length; i++) {
            if (frota[i][0] == this.tipo){
                this.tamanho = frota[i][1];
            }
        }
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
}
