package poo.ads;

public class Carta {
    private ValoresCartas numero;
    private Naipe naipe;

    public Carta(ValoresCartas numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return numero + " de " + naipe;
    }
}
