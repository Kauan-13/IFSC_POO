package ads.poo;

import java.util.HashMap;

public class SistemaComercial {

    private HashMap<String, Cliente> clientes;

    public SistemaComercial() {
        this.clientes = new HashMap<>();
    }

    public boolean addCliente(Cliente c) {
        if(this.clientes.get(c.getCpf()) == null){
            this.clientes.put(c.getCpf(),c);
            return true;
        }
        return false;
    }

    public Cliente getCliente(String cpf) {
        return this.clientes.get(cpf);
    }

    public static void main(String[] args) {
        SistemaComercial s = new SistemaComercial();

        s.addCliente(new Cliente("Kauan","123456789","8891234"));
        s.addCliente(new Cliente("Thays","987654321","8894321"));
        s.addCliente(new Cliente("Mello","123498765","8890087"));

        System.out.println(s.getCliente("123456789"));
    }
}
