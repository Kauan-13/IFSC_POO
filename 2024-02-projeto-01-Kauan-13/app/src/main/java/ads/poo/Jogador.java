package ads.poo;

import java.util.ArrayList;

public class Jogador {
    private final String nome;
    private int vitorias;
    private boolean comeca;
    private final Grade grade;
    private ArrayList<Navio> navios;
    private ArrayList<Tiro> tiros;

    public Jogador(String nome) {
        this.nome = nome;
        this.comeca = true;
        this.grade = new Grade(80,100);
        this.vitorias = 0;
        navios = new ArrayList<>();
        tiros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias() {
        this.vitorias++;
    }
    public boolean isComeca() {
        return comeca;
    }
    public void setComeca(boolean comeca) {
        this.comeca = comeca;
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
    @Override
    public String toString() {
        return this.nome + ": " + this.vitorias + " Vitórias";
    }
}
