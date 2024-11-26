package ads.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Aluno {
    //nome;  matricula; n telefones; filiacao; diciplinas;

    private String nome;
    private final int matricula;
    private ArrayList<String> telefones;
    private String[] filiacao;
    private HashSet<String> disciplinas;

    public Aluno(String nome, int matricula, String[] filiacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.filiacao = filiacao;
        this.telefones = new ArrayList<>();
        this.disciplinas = new HashSet<>();
    }

    public boolean setDiciplina(String disciplina){
        return this.disciplinas.add(disciplina);
    }

    public boolean removerDiciplina(String disciplina){
        return this.disciplinas.removeIf(e -> e.equals(disciplina));
    }

    public void setTelefone(String telefone){
        this.telefones.add(telefone);
    }

    public boolean removerTelefone(String telefone){
        return this.telefones.removeIf(e -> e.equals(telefone));
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String[] getFiliacao() {
        return filiacao;
    }

    @Override
    public String toString() {
        StringBuilder tel = new StringBuilder();
        StringBuilder dis = new StringBuilder();

        for (String elemento : telefones){
             tel.append("- ").append(elemento).append("\n");
        }

        for (String elemento : disciplinas){
            dis.append("- ").append(elemento).append("\n");
        }

        return "Matricula: " + matricula +
                "\nNome: " + nome +
                "\nFiliação: " +
                "\n  pai: " + filiacao[0] +
                "\n  mãe: " + filiacao[1] +
                "\nTelefones: " +
                "\n" + tel +
                "Disciplinas: " +
                "\n" + dis;
    }
}
