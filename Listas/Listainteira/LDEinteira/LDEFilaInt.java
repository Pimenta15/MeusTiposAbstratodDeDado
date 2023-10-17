package Listas.Listainteira.LDEinteira;

public class LDEFilaInt {
    private node primeiro;
    private node ultimo;
    private int qtd;
   
    public boolean isEmpty() { // teste forte!
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(Integer adiciona) {
        node novo = new node(adiciona);
        node atual = this.primeiro;

        if (isEmpty()) {
        this.primeiro = novo;
        this.qtd++;
        }
        else {
            while(atual != null){

                if(adiciona == atual.getInfo()){
                
                    System.out.println("Valor repetido não é possivel adicionar");
                    return;
                }else{
                    if(atual.getProx()== null){
                        atual.setProx(novo);
                        return;
                    }
                }
                atual = atual.getProx();
            }
        }
    }
    public void deQueue(){
        if(isEmpty()){
            return;
        }
            if(qtd == 1){
                this.primeiro = null;
                this.ultimo = null;
                this.qtd--;
            }else{
                node novoUltimo = this.ultimo.getAnterior();
                novoUltimo.setProx(null);
                this.ultimo = novoUltimo;
                qtd--;
            }
    }
    public node head(){
        return this.ultimo;
    }

    public boolean isFull(){
        return false;
    }

}
