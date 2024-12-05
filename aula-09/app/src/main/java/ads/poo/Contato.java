package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;

        telefones = new ArrayList<>();
        emails = new ArrayList<>();
    }

    public boolean addTelefone(String rotulo, String numero) {
        return telefones.add(new Telefone(rotulo,numero));
    }

    public boolean addEmail(String rotulo, String email) {
        return emails.add(new Email(rotulo,email));
    }

    public boolean removeTelefone(String rotulo) {
        return telefones.removeIf(e -> e.getRotulo().equals(rotulo));
    }

    public boolean removeEmail(String rotulo) {
        return emails.removeIf(e -> e.getRotulo().equals(rotulo));
    }

    public boolean updateTelefone(String rotulo, String numero) {
        for (Telefone telefone : telefones){
            if(telefone.getRotulo().equals(rotulo)){
                telefone.setValor(numero);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String email) {
        for (Email em : emails){
            if(em.getRotulo().equals(rotulo)){
                em.setValor(email);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder tels = new StringBuilder();
        StringBuilder emails = new StringBuilder();

        for (Telefone telefone : this.telefones){
            tels.append(telefone).append("\n   ");
        }

        for (Email email : this.emails){
            emails.append(email).append("\n   ");
        }

        return nome + " " + sobrenome + "\n" +
               "Data de Nascimento: " + dataNasc + "\n" +
                "Telefones: " + "\n   " + tels +
                "\nEmails: " + "\n   " + emails;
    }
}
