package ads.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        this.setHorarios(0,0,0);
    }

    public Horario(int hora) {
        this();
        this.setHorarios(hora,0,0);
    }

    public Horario(int hora, int minuto) {
        this(hora);
        this.setHorarios(hora,minuto,0);
    }

    public Horario(int hora, int minuto, int segundo) {
        this(hora,minuto);
        this.setHorarios(hora,minuto,segundo);
    }

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        if(hora < 24 && hora >= 0){
            this.hora = hora;
            return true;
        }
        return false;
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setMinuto(int minuto) {
        if(minuto < 60 && minuto >= 0){
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    public int getSegundo() {
        return segundo;
    }

    public boolean setSegundo(int segundo) {
        if(segundo < 60 && segundo >= 0){
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    private void setHorarios(int hora, int minuto, int segundo){
        if(!setHora(hora) || !setMinuto(minuto) || !setSegundo(segundo)){
            setHora(0);
            setMinuto(0);
            setSegundo(0);
        }
    }

    public String extenso() {
        return escreveExtenso(this.hora,"horas") + ", " + escreveExtenso(this.minuto,"minutos") + " e " + escreveExtenso(this.segundo,"segundo");
    }

    private String escreveExtenso(int tempo, String nomeTempo) {
        String[] extensoUnidade = {"zero","uma","duas","três","quatro","cinco","seis","sete","oito","nove","dez","onze","doze","treze","quatorze","quinze","dezesseis","dezessete","dezoito","dezenove"};
        String[] extensoDezena = {"","vinte","trinta","quarenta","cinquenta"};

        String extenso;

        if (tempo < 20){
            return extensoUnidade[tempo] + " " + nomeTempo;
        }else{
            extenso = extensoDezena[(tempo / 10) - 1];
            if((this.hora % 10) > 0){
                extenso += " e " + extensoUnidade[tempo % 10] ;
            }
            extenso += " " + nomeTempo;
        }

        return extenso;
    }

    public long compararHorarios(Horario horario) {
        return Math.abs(this.converterSegundos() - horario.converterSegundos());
    }

    public long converterSegundos() {
        return (this.hora * 3600) + (this.minuto * 60) + this.segundo;
    }

    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
