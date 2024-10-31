package ads.poo;

public class Carro {
    private int velocidadeAtual;

    private final int VELOCIDADE_MAXIMA;

    private int aceleracao;
    private int freio;

    public Carro(int velocidadeAtual, int VELOCIDADE_MAXIMA, int aceleracao, int freio) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
        this.velocidadeAtual = velocidadeAtual;
        this.aceleracao = 0;
        this.freio = 0;
        this.acelerar();
        this.frear();
        this.aceleracao = aceleracao;
        this.freio = freio;
    }

    public int getAceleracao() {
        return this.aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getFreio() {
        return this.freio;
    }

    public void setFreio(int freio) {
        this.freio = freio;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar() {
        this.velocidadeAtual = Math.min(this.velocidadeAtual + Math.max(this.aceleracao, 0), this.VELOCIDADE_MAXIMA);
    }

    public void frear() {
        this.velocidadeAtual = Math.max(this.velocidadeAtual - Math.max(this.freio, 0), 0);
    }
}
