package ads.poo.veiculos;

import java.nio.file.FileAlreadyExistsException;

public class Ferrari extends Veiculo implements Conversivel{

    private boolean farol;
    private boolean capota;

    public Ferrari(int id, int velocidadeAtual) {
        super(id, velocidadeAtual, 200);
        this.capota = false;
        this.farol = false;
    }

    public boolean ligarDesligarFarol() {
        farol = !farol;
        return farol;
    }

    @Override
    public boolean abrirFecharCapota() {
        if (velocidadeAtual != 0) {
            return capota;
        } else {
            capota = !capota;
            return capota;
        }
    }

}
