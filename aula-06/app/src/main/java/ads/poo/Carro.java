package ads.poo;

public class Carro {
    private int[] posicao = new int[2];
    // 0. x; 1. y
    private int velocidadeAtual;

    private final int VELOCIDADE_MAXIMA = 200;
    private final int VELOCIDADE_MINIMA = 0;
    private int aceleracao;
    private int freio;
    private String tipoPneu;

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int a) {
        aceleracao = a;
    }

    public int getFreio() {
        return freio;
    }

    public void setFreio(int f) {
        freio = f;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int v) {
        velocidadeAtual = v;
    }

    public void acelerar() {
        if (VELOCIDADE_MAXIMA >= (velocidadeAtual + aceleracao)){
            velocidadeAtual += aceleracao;
        }else{
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
    }

    public void frear() {
        if ((velocidadeAtual - freio) >= VELOCIDADE_MINIMA){
            velocidadeAtual -= freio;
        }else{
            velocidadeAtual = VELOCIDADE_MINIMA;
        }
    }
}
