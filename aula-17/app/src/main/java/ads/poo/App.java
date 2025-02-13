/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    static int[] vetor = new int[10];

    public static int pedirValor(String pergunta) {
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.print(pergunta);
                return teclado.nextInt();
            } catch (Exception e) {
                System.err.println("Somente números");
                teclado.next();
            } finally {
                teclado.close();
            }
        }while (true);
    }

    public static void main(String[] args) throws ParseException {
        pedirValor("Entre com o número: ");
    }
}
