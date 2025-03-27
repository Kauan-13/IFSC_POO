package ads.poo;

import java.util.ArrayList;

public class Bot {
    private int vitorias;
    private final Grade grade;
    private ArrayList<Navio> navios;
    private ArrayList<Tiro> tiros;

    public Bot() {
        this.grade = new Grade(560,100);
        this.vitorias = 0;
        navios = new ArrayList<>();
        tiros = new ArrayList<>();
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias() {
        this.vitorias++;
    }
    public Grade getGrade() {
        return grade;
    }
    public ArrayList<Navio> getNavios() {
        return navios;
    }
    public void adicionarNavio(Navio navio) {
        navios.add(navio);
    }
    public void removeNavios() {
        navios.clear();
    }
    public ArrayList<Tiro> getTiros() {
        return tiros;
    }
    public void adicionarTiro(Tiro tiro) {
        tiros.add(tiro);
    }
    public void removeTiros() {
        tiros.clear();
    }
    public String toString() {
        return "Bot: " + this.vitorias + " Vitórias";
    }
}
