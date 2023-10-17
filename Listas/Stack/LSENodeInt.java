package Listas.Stack;

public class LSENodeInt {
    private Integer info;
    private LSENodeInt prox;

    public LSENodeInt (Integer valoInteger){
        this.info = valoInteger;

    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer novoValor) {
        this.info = novoValor;
    }

    public LSENodeInt getProx() {
        return prox;
    }

    public void setProx(LSENodeInt novoProx) {
        this.prox = novoProx;
    }

}
