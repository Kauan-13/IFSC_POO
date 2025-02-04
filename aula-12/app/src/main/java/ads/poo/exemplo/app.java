package ads.poo.exemplo;

public class app {

    public static void main(String[] args) {
        Pessoa e = new Estudante("Kauan", null);
        Pessoa p = new Professor("Melo", null);

        System.out.println(e.mover());
        System.out.println(p.mover());
    }
}
