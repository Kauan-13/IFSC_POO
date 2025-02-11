package poo.ads;

public enum Planeta {
    MER("Mercúrio", 1, "rochoso"),
    VEN("Vênus", 2, "rochoso"),
    TER("Terra", 3, "rochoso"),
    MAR("Marte", 4, "rochoso"),
    JUP("Júpiter", 5, "gasoso"),
    SAT("Saturno", 6, "gasoso"),
    URA("Urano", 7, "gasoso"),
    NET("Netuno", 8, "gasoso");

    private final String nome;
    private final int posicao;
    private final String tipo;

    Planeta(String nome, int posicao, String tipo) {
        this.nome = nome;
        this.posicao = posicao;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nome + ": " + posicao + "º planeta. É um planeta do tipo " + tipo;
    }
}
