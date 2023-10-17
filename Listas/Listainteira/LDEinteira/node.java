package Listas.Listainteira.LDEinteira;



public class node {
    private Integer info;
    private node prox;
    private node anterior;
    private int qtd;
    
    public node(Integer valor) {
        this.info = valor;
    }

   
    public node getAnterior() {
        return anterior;
    }

    public void setAnterior(node anterior) {
        this.anterior = anterior;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }


    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer novoValor) {
        this.info = novoValor;
    }

    public node getProx() {
        return prox;
    }

    public void setProx(node novoProx) {
        this.prox = novoProx;
    }
}
