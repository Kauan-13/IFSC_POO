package ads.poo.exemplo;

import java.time.LocalDate;

public class Estudante extends Pessoa{

    public Estudante(String nome, LocalDate datanasc) {
        super(nome, datanasc);
    }

    @Override
    public String mover() {
        return "Estudante";
    }
}
