package ads.poo;

import java.time.LocalDateTime;

public class Senha {
    private Integer numero;
    private String assunto;
    private boolean preferencia;
    private LocalDateTime horario;

    public Senha(Integer numero, String assunto, boolean preferencia, LocalDateTime horario) {
        this.numero = numero;
        this.assunto = assunto;
        this.preferencia = preferencia;
        this.horario = horario;
    }

    public String toString() {
        return "Senha{" +
                "numero=" + numero +
                ", assunto='" + assunto + '\'' +
                ", preferencia=" + preferencia +
                ", horario=" + horario +
                '}';
    }
}



