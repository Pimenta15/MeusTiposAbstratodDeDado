public class LDENode {
    private LDENode ant;
    private Integer info;
    private LDENode prox;
    
    public LDENode(Integer valor) {
        this.info = valor;
    }

    public LDENode getAnt() {
        return ant;
    }
    public void setAnt(LDENode ant) {
        this.ant = ant;
    }
    public Integer getInfo() {
        return info;
    }
    public void setInfo(Integer info) {
        this.info = info;
    }
    public LDENode getProx() {
        return prox;
    }
    public void setProx(LDENode prox) {
        this.prox = prox;
    }
}
