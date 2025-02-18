package ads.poo;

public class Pilha {

    private Pessoa[] pilha;
    private int quantidadeElementos;

    public Pilha(int tamanhoPilha) {
        this.pilha = new Pessoa[tamanhoPilha];
        quantidadeElementos = 0;
    }

    public void empilhar(Pessoa pessoa) throws PilhaCheiaException {
        if (isPilhaCheia()) {
            throw new PilhaCheiaException("a pilha está cheia");
        }
        pilha[quantidadeElementos] = pessoa;
        quantidadeElementos++;
    }

    public Pessoa desempilhar() throws PilhaVaziaException {
        if (isPilhaVazia()) {
            throw new PilhaVaziaException("a pilha está vazia");
        }
        quantidadeElementos--;
        Pessoa pessoa = pilha[quantidadeElementos];
        pilha[quantidadeElementos] = null;
        return pessoa;
    }

    public Pessoa olharTopoPilha() throws PilhaVaziaException {
        if (isPilhaVazia()) {
            throw new PilhaVaziaException("a pilha está vazia");
        }
        return pilha[quantidadeElementos - 1];
    }

    public boolean isPilhaVazia() {
        return quantidadeElementos == 0;
    }

    public boolean isPilhaCheia() {
        return quantidadeElementos == pilha.length;
    }
}
