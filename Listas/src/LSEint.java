public class LSEint {
    private LSEnode primeiro;

    public void inserir(Integer valor){
        LSEnode novo = new LSEnode(valor);
        
        if(isEmpty()){
            this.primeiro = novo;
        }else{
            LSEnode atual = this.primeiro;
            while(atual!=null){
             if(atual.getProx() == null){
                atual.setProx(novo);
                return;
             } 
             atual = atual.getProx();
            }
        }
    }
    public boolean isEmpty(){
        return this.primeiro == null;
    }

    public void paresEImpares(LSEint par , LSEint impar){
        LSEnode atual = this.primeiro;
        if(this.primeiro == null){
            return;
        }
        while (atual!= null) {
    
        if (atual.getInfo()% 2 == 0) {
            par.inserir(atual.getInfo());
        }else{
            impar.inserir(atual.getInfo());
        }
        atual = atual.getProx();
        }
    }

    public void exbir(){
        LSEnode atual = this.primeiro;
        while (atual!=null) {
            System.out.print(atual.getInfo()+ " ");
            atual = atual.getProx();
        }
        System.out.println("");
    }
}
