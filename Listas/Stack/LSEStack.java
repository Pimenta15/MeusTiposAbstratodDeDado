package Listas.Stack;



public class LSEStack {

    private LSENodeInt primeiro;

    public void push(Integer num) {

        LSENodeInt novo;

        novo = new LSENodeInt(num);

        if (this.primeiro == null) {

            this.primeiro = novo;

        }

        else {

            novo.setProx(this.primeiro);

            this.primeiro = novo;

        }
        System.out.println("Empilhado: "+ num );
    }

    public Integer pop() {
        LSENodeInt aux = null;
       
            aux = this.primeiro;
            this.primeiro = this.primeiro.getProx();
            return aux.getInfo();
        
    }

    public Integer top(){
        return this.primeiro.getInfo();
    }

    public boolean isEmpty() {

        return this.primeiro == null;
    }

    public boolean isFull() {

        return false;
    }


}
