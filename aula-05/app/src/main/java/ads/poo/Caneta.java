package ads.poo;

public class Caneta {

    private int nivelTinta;
    private String cor;

    public void setCor(String c) {
        cor = c;
    }

    public String getCor() {
        return cor;
    }

    public void setNivelTinta(int n) {
        nivelTinta = n;
    }

    public int getNivelTinta() {
        return nivelTinta;
    }

    public String desenhar(int distancia){
        if (nivelTinta <= 0){
            return "A caneta não possui tinta";
        }

        if (distancia <= 0){
            return "Está querendo desenhar ao contrário!? (Coloque um valor positivo)";
        }

        for (int i = 0; i < distancia; i++) {
            if(nivelTinta > i){
                System.out.print("*");
            }else{
                break;
            }
        }
        System.out.println();

        if(nivelTinta < distancia){
            distancia = nivelTinta;
            nivelTinta -= distancia;
            return "Não teve tinta suficiente para desenhar tudo\nDesenhou apenas " + distancia + "cm";
        }else{
            nivelTinta -= distancia;
            return "Desenhando em " + cor + " por " + distancia + "cm\nNivel de tinta: " + nivelTinta;
        }
    }
}
