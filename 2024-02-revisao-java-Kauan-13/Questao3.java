import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] contador = new int[4];
        String[] faixas = { "0 - 2     | ", "3 - 5     | ", "6 - 8     | ", "9 - 10    | " };

        System.out.print("Entre com a quantidade de alunos: ");
        int alunos = leitor.nextInt();

        leitor.nextLine();

        System.out.print("Entre com a nota dos alunos separadas por espaço: ");
        String notas = leitor.nextLine();

        String[] vetorNotas = notas.split(" ");

        if(vetorNotas.length == alunos){
            for (int i = 0; i < vetorNotas.length; i++) {
                switch (Integer.parseInt(vetorNotas[i])) {
                    case 0, 1, 2:
                        contador[0]++;
                        break;
                    case 3, 4, 5:
                        contador[1]++;
                        break;
                    case 6, 7, 8:
                        contador[2]++;
                        break;
                    case 9, 10:
                        contador[3]++;
                        break;
                }
            }
    
            for (int i = 0; i < contador.length; i++) {
                System.out.print(faixas[i]);
                for (int j = 0; j < contador[i]; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Quantidade de valores é diferente do esperado!");
        }

        leitor.close();
    }
}
