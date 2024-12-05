package ads.poo;

public class Email {
    private String rotulo;
    private String valor;

    public Email(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.setValor(valor);
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setValor(String valor) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if(valor.matches(eR)){
            this.valor = valor;
        }else{
            this.valor = null;
        }
    }

    @Override
    public String toString() {
        return rotulo + ": " + valor;
    }
}
