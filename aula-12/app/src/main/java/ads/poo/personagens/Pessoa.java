package ads.poo.personagens;

public class Pessoa {
    protected double vida;
    protected double ataque;
    protected double velocidade;

    public Pessoa(double vida, double ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String atacar() {
        return "Atacando";
    }

    public String mover() {
        return "Movendo";
    }

}
