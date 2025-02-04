package ads.poo.exemplo;

import java.time.LocalDate;

public class Professor extends Pessoa{

    public Professor(String nome, LocalDate datanasc) {
        super(nome, datanasc);
    }

    @Override
    public String mover() {
        return "Professor";
    }
}
