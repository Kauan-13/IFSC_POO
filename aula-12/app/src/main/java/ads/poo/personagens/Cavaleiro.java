package ads.poo.personagens;

import ads.poo.interfaces.Guerreiro;

public class Cavaleiro extends Personagem implements Guerreiro {

    public Cavaleiro(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String atacar() {
        return "Atacando com espada";
    }

    public String mover() {
        return "Movendo com " + velocidade;
    }
}
