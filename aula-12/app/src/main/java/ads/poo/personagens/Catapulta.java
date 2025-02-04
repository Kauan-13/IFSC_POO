package ads.poo.personagens;

public class Catapulta extends Personagem {
    public Catapulta(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String atacar() {
        return "Atacando com pedra";
    }

    public String mover() {
        return "Movendo com " + velocidade;
    }
}
