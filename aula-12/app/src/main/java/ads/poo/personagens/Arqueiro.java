package ads.poo.personagens;

import ads.poo.interfaces.Guerreiro;

public class Arqueiro extends Personagem implements Guerreiro {

    public Arqueiro(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String atacar() {
        return "Atacando com arco e flecha";
    }

    public String mover() {
        return "Movendo com " + velocidade;
    }
}
