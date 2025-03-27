import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Entre com seu nome: ");
        String nome = leitor.next();

        System.out.print("Entre com o ano que nasceu: ");
        int anoNascimento = leitor.nextInt();

        System.out.print("Entre com o ano atual: ");
        int anoAtual = leitor.nextInt();

        System.out.println(nome + ", possui " + (anoAtual - anoNascimento) + " anos.");
        
        leitor.close();
    }
}