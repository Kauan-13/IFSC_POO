/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import java.util.*;

public class App {

    public static void main(String[] args) {
//        ArrayList<Integer> numeros = new ArrayList<>();
//
//        numeros.add(20);
//        numeros.add(10);
//        numeros.add(5);
//
//        // for i
//        for (int i = 0; i < numeros.size(); i++) {
//            System.out.println(numeros.get(i));
//        }
//
//        //for each tradicional
//        for (Integer elemento : numeros){
//            System.out.println(elemento);
//        }
//
//        //lambda
//        numeros.forEach(e -> System.out.println(e));
//
//        //method reference
//        numeros.forEach(System.out::println);
//
//        ArrayList<String> nomes = new ArrayList<>();
//
//        nomes.add("Kauan");
//        nomes.add("Thays");
//        nomes.add("Mello");
//
//        nomes.removeIf(e -> e.equals("Mello"));
//
//        nomes.forEach(e -> System.out.println(e));
//
//        numeros.removeIf(e ->e == 10);
//
//        Collections.sort(numeros);
//
//        Collections.shuffle(nomes);
//
//        System.out.println(numeros);
//
//        System.out.println(nomes);
//
//        HashSet<String> conjunto = new HashSet<>();
//
//        conjunto.add("Ana");
//        conjunto.add("Ana");
//
//        System.out.println(conjunto);
//
//        Queue<String> fila = new LinkedList<>();
//
//        fila.add("Ana");
//        fila.add("Juca");
//
//        String n = fila.poll();

        Aluno a = new Aluno("Kauan", 123, new String[]{"Davi","Luciene"});

        a.setDiciplina("POO");
        a.setDiciplina("EST");

        a.setTelefone("889234242");
        a.setTelefone("889123412");

        System.out.println(a);

    }
}
