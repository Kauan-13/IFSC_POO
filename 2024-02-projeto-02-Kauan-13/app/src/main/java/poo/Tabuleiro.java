package poo;

import edu.princeton.cs.algs4.Draw;
import poo.pecas.*;

import java.awt.*;

public class Tabuleiro {

    private final int DIMENSAO;
    private final Peca[][] tabuleiro;
    private Peca pecaSelecionada;

    public Tabuleiro() {
        this.DIMENSAO = 8;
        this.tabuleiro = new Peca[DIMENSAO][DIMENSAO];

        this.gerarPecas();
    }

    public void desenhar(Draw draw) {
        for (int i = 0; i <= DIMENSAO; i++) {
            for (int j = 0; j <= DIMENSAO; j++) {
                if ((i + j) % 2 == 0) {
                    draw.setPenColor(Color.GRAY);
                    draw.filledSquare(i + 0.5, j + 0.5, 0.5);
                }
            }
        }

        for (Peca[] pecas: tabuleiro) {
            for (Peca peca: pecas) {
                if (peca != null) {
                    peca.desenhar(draw);
                }
            }
        }
    }

    private void gerarPecas() {
        for (int i = 0; i < DIMENSAO; i++) {
            Peca peao = new Peao(i,1);
            addPeca(peao);
            if (i == 0 || i == DIMENSAO - 1) {
                Peca torre = new Torre(i,0);
                addPeca(torre);
            }
            if (i == 2 || i == DIMENSAO - 3) {
                Peca bispo = new Bispo(i,0);
                addPeca(bispo);
            }
            if (i == 1 || i == DIMENSAO - 2) {
                Peca cavalo = new Cavalo(i,0);
                addPeca(cavalo);
            }
            Peca rainha = new Rainha(4,0);
            addPeca(rainha);
            Peca rei = new Rei(3,0);
            addPeca(rei);
        }
    }

    private void addPeca(Peca peca){
        tabuleiro[(int) peca.getX()][(int) peca.getY()] = peca;
    }

    private void atualizarTabuleiro(Peca peca, int x, int y) {
        tabuleiro[(int) peca.getX()][(int) peca.getY()] = null;
        peca.setX(x);
        peca.setY(y);
        this.addPeca(peca);
    }

    private boolean isPecaNaFrenteDiagonal(int x, int y) {
        int multiplicadorX = (pecaSelecionada.getX() < x) ? 1 : -1;
        int multiplicadorY = (pecaSelecionada.getY() < y) ? 1 : -1;
        for (int i = 1; i < Math.abs(pecaSelecionada.getX() - x); i++) {
            if (tabuleiro[(int) pecaSelecionada.getX() + (i * multiplicadorX)][(int) pecaSelecionada.getY() + (i * multiplicadorY)] != null) {
                return true;
            }
        }
        return false;
    }

    private boolean isPecaNaFrenteHorizontal(int x) {
        for (int i = Math.min(x,(int) pecaSelecionada.getX()) + 1; i < Math.max(x,(int) pecaSelecionada.getX()); i++) {
            if (tabuleiro[i][(int)pecaSelecionada.getY()] != null) {
                return true;
            }
        }
        return false;
    }

    private boolean isPecaNaFrenteVertical(int y) {
        for (int i = Math.min(y,(int) pecaSelecionada.getY()) + 1; i < Math.max(y,(int) pecaSelecionada.getY()); i++) {
            if (tabuleiro[(int)pecaSelecionada.getX()][i] != null) {
                return true;
            }
        }
        return false;
    }

    private boolean isPecaNaFrente(int x, int y) {
        // Se a peça selecionada for um cavalo, ele pula outras peça logo não tem peças no seu caminho
        if (pecaSelecionada instanceof Cavalo) {
            return false;
        }
        // Verificar as diagonais
        if (pecaSelecionada.getX() != x && pecaSelecionada.getY() != y) {
            return isPecaNaFrenteDiagonal(x,y);
        }else if (pecaSelecionada.getY() == y) { // Verificar as horizontais
            return isPecaNaFrenteHorizontal(x);
        } else if (pecaSelecionada.getX() == x) { // Verificar as verticais
            return isPecaNaFrenteVertical(y);
        }
        return false;
    }

    private void tirarSelecao() {
        pecaSelecionada.setSelecionado(false);
        pecaSelecionada = null;
    }

    public boolean selecionar(int x, int y) {
        boolean retorno = true;
        if (tabuleiro[x][y] != null) { // Clicou onde tem peça
            if (pecaSelecionada != null) { // Já tem peça selecionada
                if (pecaSelecionada == tabuleiro[x][y]) {
                    tirarSelecao();
                    return retorno;
                }
                tirarSelecao();
            }
            pecaSelecionada = tabuleiro[x][y];
            pecaSelecionada.setSelecionado(true);
        } else if (pecaSelecionada != null) { // Se clicou em um espaço vazio e tem peça selecionada
            if (pecaSelecionada.isPossivelMover(x,y) && !isPecaNaFrente(x,y)) { // Verifica se pode mover peça
                this.atualizarTabuleiro(pecaSelecionada,x,y);
            } else {
                retorno = false;
            }
            tirarSelecao();
        }

        return retorno;
    }
}
