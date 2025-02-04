package ads.poo.personagens;

public abstract class Personagem {
    protected double vida;
    protected double ataque;
    protected double velocidade;

    public Personagem(double vida, double ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public abstract String mover();

}
