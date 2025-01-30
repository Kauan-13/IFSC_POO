package ads.poo.personagens;

public class Cavaleiro extends Pessoa{

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
