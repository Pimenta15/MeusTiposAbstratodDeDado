package Listas.Listainteira.inteira;

public class LSEnode {
    private Integer info;
    private LSEnode prox;

    public LSEnode (Integer valoInteger){
        this.info = valoInteger;

    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer novoValor) {
        this.info = novoValor;
    }

    public LSEnode getProx() {
        return prox;
    }

    public void setProx(LSEnode novoProx) {
        this.prox = novoProx;
    }

}
