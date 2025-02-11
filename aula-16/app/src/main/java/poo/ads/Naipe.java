package poo.ads;

public enum Naipe {
    PAUS("paus"),
    OUROS("ouro"),
    COPAS("copas"),
    ESPADAS("espada");

    private String naipe;

    Naipe(String naipe) {
        this.naipe = naipe;
    }

    public String getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return naipe;
    }
}
