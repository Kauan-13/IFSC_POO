public class Questao2 {
    public static void main(String[] args) {
        int[] pesos = {2,3};
        double mediaProjeto = 0;

        for (int i = 0; i < pesos.length; i++) {
            mediaProjeto += Double.parseDouble(args[i]) * pesos[i];
        }

        mediaProjeto = mediaProjeto / 5;

        int CF = (int) Math.round((mediaProjeto * 0.9) + (Double.parseDouble(args[2]) * 0.1));

        if (CF >= 6) {
            System.out.print("APROVADO! ");
        }else{
            System.out.print("REPROVADO! ");
        }
        System.out.println("Sua nota foi " + CF);
    }
}
