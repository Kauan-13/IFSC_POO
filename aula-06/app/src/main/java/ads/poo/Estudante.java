package ads.poo;

public class Estudante {
    private String nomeCompleto;
    private String curso;
    private int matricula;
    private static int total = 0;

    public Estudante(String nomeCompleto, String curso, int matricula) {
        this.nomeCompleto = nomeCompleto;
        this.curso = curso;
        this.matricula = matricula;
        total++;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        Estudante.total = total;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "Nome: " + this.nomeCompleto + "\nCurso: " + this.curso + "\nMatricula: " + this.matricula;
    }
}
