package ads.poo.personagens;

public class Arqueiro extends Pessoa{

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
