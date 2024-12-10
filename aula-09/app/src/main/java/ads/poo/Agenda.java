package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addContato(Contato contato) {
        return contatos.add(contato);
    }

    public boolean removeContato(String nome, String sobrenome) {
        return contatos.removeIf(e -> e.getNome().equals(nome) && e.getSobrenome().equals(sobrenome));
    }

    public boolean addTelefone(String rotulo, String numero, Contato contato) {
        return contato.addTelefone(rotulo, numero);
    }

    public boolean addEmail(String rotulo, String email, Contato contato) {
        return contato.addEmail(rotulo, email);
    }

    public boolean updateTelefone(String rotulo, String numero, Contato contato) {
        return contato.updateTelefone(rotulo,numero);
    }

    public boolean updateEmail(String rotulo, String email, Contato contato) {
        return contato.updateTelefone(rotulo,email);
    }

    public boolean removeTelefone(String rotulo, Contato contato) {
        return contato.removeTelefone(rotulo);
    }

    public boolean removeEmail(String rotulo, Contato contato) {
        return contato.removeEmail(rotulo);
    }

    @Override
    public String toString() {
        StringBuilder nomes = new StringBuilder();

        for (Contato e: contatos) {
            nomes.append(contatos.indexOf(e) + 1 + ". ").append(e.getNome() + " ").append(e.getSobrenome()).append("\n");
        }

        return "Agenda\n____________\n" + nomes;
    }
}
