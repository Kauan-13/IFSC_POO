package ads.poo;

import java.util.Random;

public class Buzz {
    private boolean capaceteAberto;
    private boolean asasAbertas;
    private String[] frases = {
                "Isto não é voar. Isto é cair, com estilo!",
                "Ao infinito e além!",
                "Vamos Salvar a Galáxia!",
                "Comando Estelar, pronto para voar!",
                "Saudações, eu sou Buzz Lightyear e venho em missão de paz.",
                "Consigo resolver todas as missões do universo."};

    public void setCapaceteAberto(boolean c) {
        capaceteAberto = c;
    }

    public boolean getCapaceteAberto() {
        return capaceteAberto;
    }

    public void setAsasAbertas(boolean a) {
        asasAbertas = a;
    }

    public boolean getAsasAbertas() {
        return asasAbertas;
    }

    public String[] getFrases() {
        return frases;
    }

    public void setFrases(String[] f) {
        frases = f;
    }

    public String capacete(){
        capaceteAberto = !capaceteAberto;

        if(capaceteAberto){
            return "Capacete Aberto!";
        }else{
            return "Capacete Fechado!";
        }
    }

    public String asas(){
        asasAbertas = !asasAbertas;

        if(asasAbertas){
            return "Asas Abertas!";
        }else{
            return "Asas Fechadas!";
        }
    }

    public String laser(){
        return "----------*\nLaser Disparado";
    }

    public String golpe(){
        return "Pfoom\nDado o golpe!";
    }

    public String falar(){
        Random r = new Random();
        int index = r.nextInt(frases.length);

        return frases[index];
    }
}
