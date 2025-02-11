package poo.ads;

public enum ValoresCartas {
    AS("Ás", 1),
    DOIS("2", 2),
    TRES("3", 3),
    QUATRO("4", 4),
    CINCO("5", 5),
    SEIS("6", 6),
    SETE("7", 7),
    OITO("8", 8),
    NOVE("9", 9),
    DEZ("10", 10),
    VALETE("Valete", 11),
    DAMA("Dama", 12),
    REI("Rei", 13);

    private String num;
    private int numValor;

    ValoresCartas(String num, int numValor) {
        this.num = num;
        this.numValor = numValor;
    }

    public String getNum() {
        return num;
    }

    public int getNumValor() {
        return numValor;
    }

    @Override
    public String toString() {
        return num;
    }
}
