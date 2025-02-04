package ads.poo.personagens;

import ads.poo.interfaces.Coletador;
import ads.poo.interfaces.Guerreiro;

public class Aldeao extends Personagem implements Coletador, Guerreiro {

    public Aldeao(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String atacar() {
        return "Atacando com picareta";
    }

    public String mover() {
        return "Movendo com " + velocidade;
    }

    @Override
    public String coletarMadeira() {
        return "Coletando Madeira";
    }

    @Override
    public String coletarOuro() {
        return "Coletando Ouro";
    }
}
