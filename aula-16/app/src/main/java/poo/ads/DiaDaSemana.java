package poo.ads;

public enum DiaDaSemana {
    DOM("domingo", 1),
    SEG("segunda-feira", 2),
    TER("terça-feira", 3),
    QUA("quarta-feira", 4),
    QUI("quinta-feira", 5),
    SEX("sexta-feira", 6),
    SAB("sábado", 7);

    private final String extenso;

    private final int diaNum;

    DiaDaSemana(String s, int i){
        this.extenso = s;
        this.diaNum = i;
    }

    public int getDiaNum() {
        return diaNum;
    }

    public static DiaDaSemana getByDiaNum(int c){
        for (DiaDaSemana d: DiaDaSemana.values()) {
            if(d.getDiaNum() == c) {
                return d;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.extenso;
    }
}
