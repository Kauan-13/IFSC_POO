package ads.poo;

public class AppPilhas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Kauan", "1233213");
        Pessoa p2 = new Pessoa("Livoca", "1233");

        Pilha pilha = new Pilha(2);

        try {
            pilha.empilhar(p1);
            pilha.empilhar(p2);
        } catch (PilhaCheiaException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(pilha.olharTopoPilha());
        } catch (PilhaVaziaException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(pilha.isPilhaCheia());

        try {
            System.out.println(pilha.desempilhar());
        } catch (PilhaVaziaException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(pilha.isPilhaCheia());

    }
}
