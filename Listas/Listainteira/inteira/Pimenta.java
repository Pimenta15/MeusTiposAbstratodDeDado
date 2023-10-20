package Listas.Listainteira.inteira;

public class Pimenta{
    private Node first;

    public void inserir(Integer valor){
        Node aux = new Node(valor);
        if(isEmpty()){
            first = aux;
        }
        else {
            aux.setNext(first);
            first = aux;
        }

    }

    public Pimenta copiar(){
        Pimenta copia = new Pimenta();
        Pimenta copia2 = new Pimenta();

        if (isEmpty()){
            return copia2;
        }
        else {
            Node atual = this.first;

                while (atual != null) {
                    copia.inserir(atual.getValue());
                    atual = atual.getNext();

                }
                atual = copia.first;

                while (atual != null) {
                    copia2.inserir(atual.getValue());
                    atual = atual.getNext();

                }


            return copia2;
        }
    }

    public void soma(Pimenta lista1, Pimenta lista2){

        Node atual1 = lista1.first;
        Node atual2 = lista2.first;

        if (lista1.isEmpty()){
            this.first = lista2.copiar().first;
        }
        if (lista2.isEmpty()){
            this.first = lista1.copiar().first;
        }
        while (atual1!=null || atual2!= null) {

            if (atual1 != null && atual2 != null) {

                this.inserir(atual1.getValue() + atual2.getValue());
                atual1 = atual1.getNext();
                atual2 = atual2.getNext();

            } else if (atual1 != null) {

                this.inserir(atual1.getValue());
                atual1 = atual1.getNext();

            } else {

                this.inserir(atual2.getValue());
                atual2 = atual2.getNext();

            }
        }
    }
    public void exibir(){
        if (isEmpty()) {
            System.out.println("Lista Vazia");
        }else {
            Node atual = this.first;
            do{
                System.out.print(atual.getValue()+ " ");
                atual = atual.getNext();
            }while (atual != null);
            System.out.println(" ");
        }
    }

    public boolean isEmpty(){
        return this.first == null;
    }

}
