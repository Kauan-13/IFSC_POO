package ads.poo;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) throws SaldoInsuficienteException, ValorNegativoException {
        if (valor < 0){
            throw new ValorNegativoException("apenas valores positivos");
        }

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("saldo insuficiente");
        }
        this.saldo -= valor;
    }

}
