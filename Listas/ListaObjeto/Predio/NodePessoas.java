package Listas.ListaObjeto.Predio;

public class NodePessoas {

    private Pessoa info;
    private NodePessoas prox;
    private NodePessoas anterior;
    
    public NodePessoas(Pessoa valor) {
        this.info = valor;
    }

   
    public NodePessoas getAnterior() {
        return anterior;
    }

    public void setAnterior(NodePessoas anterior) {
        this.anterior = anterior;
    }

    public Pessoa getInfo() {
        return info;
    }

    public void setInfo(Pessoa novoValor) {
        this.info = novoValor;
    }

    public NodePessoas getProx() {
        return prox;
    }

    public void setProx(NodePessoas novoProx) {
        this.prox = novoProx;
    }
}
