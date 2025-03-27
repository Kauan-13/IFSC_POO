package ads.poo;

public class Navio {
    private int coluna;
    private int linha;
    private int tamanho;
    private boolean vertical;
    private char tipo;
    private boolean[] atingido;
    private boolean afundado;

    public Navio(int coluna, int linha, boolean vertical, char tipo) {
        this.coluna = coluna;
        this.linha = linha;
        this.tipo = tipo;
        this.setTamanho(tipo);
        this.vertical = vertical;
        this.afundado = false;
        this.atingido = new boolean[this.tamanho];
    }

    public int getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    public int getTamanho() {
        return tamanho;
    }

    private void setTamanho(char tipo) {
        char[][] frota = {
                {'P',5},
                {'E',4},
                {'C',3},
                {'S',3},
                {'N',2},
        };

        for (int i = 0; i < frota.length; i++) {
            if (frota[i][0] == tipo){
                this.tamanho = frota[i][1];
            }
        }
    }

    public boolean getOrientacao() {
        return vertical;
    }

    public char getTipo() {
        return tipo;
    }

    public boolean getPosicaoAtingida(int x, int y) {
        return false;
    }

    public void setPosicoesAtinigo(int x, int y) {

    }
    public boolean isAfundado() {
        return afundado;
    }

    public void setAfundado(boolean afundado) {
        this.afundado = afundado;
    }

    public boolean verificarPosicao(int x, int y) {
        boolean achou = false;
        if (this.vertical) {
            for (int i = 0; i < this.tamanho; i++) {
                if (this.linha + i == y && this.coluna == x) {
                    achou = true;
                }
            }
        }else{
            for (int i = 0; i < this.tamanho; i++) {
                if (this.coluna + i == x && this.linha == y) {
                    achou = true;
                }
            }
        }
        return achou;
    }

    // Aula

    public boolean atirar(int x, int y) {

        return false;
    }

    public boolean isAtingido(int col, int lin) {
        atingido[1] =  true;

        if(!isOcupado(col, lin)){
            return false;
        }

//        if (this.vertical) {
//            for (int i = this.linha; i < atingido.length; i++) {
//                if (i == lin && this.coluna == col) {
//                    return atingido[i];
//                }
//            }
//        }else{
//            for (int i = 0; i < this.tamanho; i++) {
//                if (this.coluna + i == col && this.linha == lin) {
//                    return atingido[i];
//                }
//            }
//        }
        return false;
    }

    public boolean isOcupado(int col, int lin) {
        int colunaFinal = (vertical) ? coluna : coluna + tamanho - 1;
        int linhaFinal = (vertical) ? linha + tamanho - 1 : linha;

        if ( (col <= colunaFinal) && (col >= coluna) && (lin <= linhaFinal) && (lin >= linha)){
            return true;
        }
        return false;
    }
}
