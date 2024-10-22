package ads.poo;

public class Carro {

    // atributos
    private String modelo;
    private int velocidadeAtual;
    private String cor;

    // métodos
    public void setVelocidadeAtual(int v){
        velocidadeAtual = v;
    }

    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void setCor(String c){
        cor = c;
    }

    public String getCor(){
        return cor;
    }

    public void setModelo(String m){
        modelo = m;
    }

    public String getModelo(){
        return modelo;
    }

    public String escreverMensagem(){
        return modelo + " " + cor + " está " + velocidadeAtual + "Km/h";
    }

}
