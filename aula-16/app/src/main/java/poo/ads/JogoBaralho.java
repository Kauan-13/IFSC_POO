package poo.ads;

import java.util.ArrayList;
import java.util.List;

public class JogoBaralho {
    public static void main(String[] args) {

        List<Carta> baralho = new ArrayList<>();

        for (Naipe naipe : Naipe.values()){
            for (ValoresCartas valor : ValoresCartas.values()) {
                baralho.add(new Carta(valor,naipe));
            }
        }

        baralho.forEach(System.out::println);
    }
}
