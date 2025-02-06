package ads.poo.veiculos;

public class Pampa extends Veiculo implements TracaoIntegral{

    private boolean cacamba;
    private boolean tracao;

    public Pampa(int id, int velocidadeAtual, int VELOCIDADE_MAXIMA) {
        super(id, velocidadeAtual, VELOCIDADE_MAXIMA);
        cacamba = false;
    }

    public boolean abrirFecharCacamba() {
        if (velocidadeAtual != 0) {
            return cacamba;
        } else {
            cacamba = !cacamba;
            return cacamba;
        }
    }

    @Override
    public boolean ativarDesativarTracao() {
        if (velocidadeAtual != 0) {
            return tracao;
        } else {
            tracao = !tracao;
            return tracao;
        }
    }
}
