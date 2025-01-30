package ads.poo.personagens;

public class Aldeao extends Pessoa{

    public Aldeao(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String atacar() {
        return "Atacando com picareta";
    }

    public String mover() {
        return "Movendo com " + velocidade;
    }
}
