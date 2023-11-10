public class LDEInt {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public boolean isEmpty(){
        return primeiro == null && ultimo == null && qtd == 0;
    }

    public void inserir(int valor){
        LDENode novo =  new LDENode(valor);
        LDENode atual = this.primeiro;
        if (isEmpty()) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }else{
            while(true){
                if (atual.getProx() == null) {
                    atual.setProx(novo);
                    novo.setAnt(atual);
                    return;
                }
            }
        }
    }

    public void exibirTodos(){
        if (isEmpty()) {
            System.out.println("Lista Vazia!");
        }else{
            LDENode atual = this.primeiro;
            while (atual != null) {
                System.out.print(atual.getInfo()+ " ");
            }
            System.out.println(" ");
        
        }
    }

    public int remover(int valor){
       int retorno = 0;
        LDENode atual = primeiro;
        if (isEmpty()) {
            return 0;

        }
        while(this.ultimo.getInfo() != valor && this.primeiro.getInfo() !=  valor ){
            if(this.qtd == 1 && valor == atual.getInfo() ){
                this.primeiro = null;
                this.ultimo = null;
                this.qtd--;
                retorno++;
                return retorno;
                
            }else{
            if (this.primeiro.getInfo() == valor) {
                atual.getProx().setAnt(null);
                this.primeiro = atual.getProx();
                this.qtd--;
                retorno++;
            }

            if (this.ultimo.getInfo() == valor ) {
                this.ultimo.setAnt(this.ultimo.getAnt());
                this.ultimo.setProx(null);
                this.qtd--;
                retorno++;
            }
        }
    }

        while(atual != this.ultimo){
            if (atual.getInfo() == valor) {
                LDENode aux = atual.getAnt();
                aux.setProx(atual.getProx());
                atual = atual.getProx();
                atual.setAnt(aux);
                qtd--;
                retorno++;
            }
        }
        return retorno;
    }
}
