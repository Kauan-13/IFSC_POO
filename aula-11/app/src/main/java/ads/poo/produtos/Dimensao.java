package ads.poo.produtos;

public class Dimensao {

    private double largura;
    private double altura;
    private double profundida;

    public Dimensao(double largura, double altura, double profundida) {
        this.largura = largura;
        this.altura = altura;
        this.profundida = profundida;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Dimensao{");
        sb.append("largura=").append(largura);
        sb.append(", altura=").append(altura);
        sb.append(", profundida=").append(profundida);
        sb.append('}');
        return sb.toString();
    }
}
