package ads.poo.produtos;

public class SemFio extends Telefone {
    private double frequencia;
    private int quantidade;
    private double distancia;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int quantidade, double distancia) {
        super(codigo, numSerie, modelo, peso, dimensao);

        this.frequencia = frequencia;
        this.quantidade = quantidade;
        this.distancia = distancia;
    }

    public String trocarCanal() {
        return "trocando canal...";
    }

    @Override
    public String imprimirDados() {
        final StringBuilder sb = new StringBuilder("SemFio{");
        sb.append("frequencia=").append(frequencia);
        sb.append(", quantidade=").append(quantidade);
        sb.append(", distancia=").append(distancia);
        sb.append('}');
        sb.append(super.imprimirDados());
        return sb.toString();
    }
}
