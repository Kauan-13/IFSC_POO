package ads.poo;

public class Pessoa {
    private String nome;
    private int matricula;
    private String cpf;
    private int telefone;
    private String email;
    private char sexo;
    private int dataNascimento;
    private String[] endereco = new String[6];
    // 0. Número; 1. Rua; 2. Bairro; 3. Cidade; 4. Estado; 5. País;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
