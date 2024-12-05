package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    private String rotulo;
    private String valor;

    public Telefone(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = this.formata("(##)#####-####",valor);
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String toString() {
        return rotulo + ": " + valor;
    }
}
