package poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;
import java.awt.*;

public class App implements DrawListener {
    private final Draw draw;
    private boolean teclaPressionada;
    private Tabuleiro tabuleiro;

    public App(int dimensao) {
        tabuleiro = new Tabuleiro();

        draw = new Draw();
        draw.setCanvasSize(800, 800);
        draw.setXscale(0, dimensao);
        draw.setYscale(0, dimensao);
        draw.addListener(this);

        teclaPressionada = false;

        draw.enableDoubleBuffering();
    }

    /**
     * Limpa a tela, desenha o tabuleiro
     */
    public void desenharTela(){
        // Limpa a área de desenho
        draw.clear(Color.white);
        // Desenha o tabuleiro
        this.tabuleiro.desenhar(this.draw);
        draw.show();
    }

    public void reiniciarTabuleiro(){
        tabuleiro = new Tabuleiro();
    }

    /**
     * Captura o evento de botão pressionado do mouse
     * @param x coordenada X do cursor do mouse quando o botão foi pressionado
     * @param y coordenada Y do cursor do mouse quando o botão foi pressionado
     */
    public void mousePressed(double x, double y) {
        if(!tabuleiro.selecionar((int) Math.floor(x), (int) Math.floor(y))) {
            System.out.println("Movimento Impossivel");
        }

        // Limpa a área de desenho, desenha o tabuleiro
        desenharTela();
    }

    /**
     * Captura o evento de tecla pressionada
     * @param c caractere da tecla pressionada
     */
    @Override
    public void keyTyped(char c) {
        if ((c == 'r') && (!teclaPressionada)){
            System.out.println("Reiniciando Tabuleiro");
            reiniciarTabuleiro();
            desenharTela();
            teclaPressionada = true;
        }
    }

    /**
     * Captura o evento de tecla liberada
     * @param i código da tecla liberada
     */
    @Override
    public void keyReleased(int i) {
        teclaPressionada = false;
    }

    public static void main(String[] args) {
        // Inicializa a aplicação com um tabuleiro 8x8
        App app = new App(8);
        app.desenharTela();
    }
}
