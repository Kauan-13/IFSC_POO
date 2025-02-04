package ads.poo.exemplo;

import java.time.LocalDate;

public abstract class Pessoa {

    private String nome;
    private LocalDate datanasc;

    public Pessoa(String nome, LocalDate datanasc) {
        this.nome = nome;
        this.datanasc = datanasc;
    }

    public abstract String mover();

}
