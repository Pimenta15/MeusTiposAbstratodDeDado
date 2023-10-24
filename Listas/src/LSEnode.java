public class LSEnode {
    private Integer info;
    
    public LSEnode(Integer info) {
        this.info = info;
    }
    private LSEnode prox;
    
    public Integer getInfo() {
        return info;
    }
    public void setInfo(Integer info) {
        this.info = info;
    }
    public LSEnode getProx() {
        return prox;
    }
    public void setProx(LSEnode prox) {
        this.prox = prox;
    }
    
}
