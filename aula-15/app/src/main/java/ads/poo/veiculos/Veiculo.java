package ads.poo.veiculos;

public abstract class Veiculo {

    protected int id;
    protected int velocidadeAtual;
    protected final int VELOCIDADE_MAXIMA;

    public Veiculo(int id, int velocidadeAtual, int VELOCIDADE_MAXIMA) {
        this.id = id;
        this.velocidadeAtual = velocidadeAtual;
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
    }

    public int acelerar(int i){
        if (velocidadeAtual + i < VELOCIDADE_MAXIMA) {
            velocidadeAtual += i;
        } else {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        return velocidadeAtual;
    }

    public int frear(int i){
        if (velocidadeAtual - i > 0) {
            velocidadeAtual -= i;
        } else {
            velocidadeAtual = 0;
        }
        return velocidadeAtual;
    }
}
