package ads.poo;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SistemaGeradorDeSenhas {

    private Queue<Senha> senhas;
    private AtomicInteger contador;

    public SistemaGeradorDeSenhas() {
        this.senhas = new LinkedList<>();
        this.contador = new AtomicInteger();
    }

    public void adicionarSenha(){
        LocalDateTime horario = LocalDateTime.now();
        Integer numero = contador.incrementAndGet();
        Senha s = new Senha(numero,false,"conta",horario);
        this.senhas.add(s);
    }

    public Senha chamarProximaSenha(){
        return this.senhas.poll();
    }

    public static void main(String[] args) {
        SistemaGeradorDeSenhas s = new SistemaGeradorDeSenhas();
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        while (opcao >= 0){
            System.out.println("""
                0 - Adicionar Senha
                1 - Chamar Senha
                """);

            opcao = leitor.nextInt();

            switch (opcao) {
                case 0 -> s.adicionarSenha();
                case 1 -> {
                    Senha a = s.chamarProximaSenha();
                    System.out.println(a);
                }
            }
        }
    }
}
