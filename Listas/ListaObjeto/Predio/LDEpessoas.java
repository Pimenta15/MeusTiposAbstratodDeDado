package Listas.ListaObjeto.Predio;


public class LDEpessoas {
    private NodePessoas primeiro;
    private NodePessoas ultimo;
    private int qtd;
   
    public boolean isEmpty() { // teste forte!
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Cadastrar(Pessoa adiciona) {
        NodePessoas novo = new NodePessoas(adiciona);
        NodePessoas atual = this.primeiro;

        if (isEmpty()) {
        this.primeiro = novo;
        this.qtd++;
        }
        else {
            while(atual != null){

                if(adiciona.compareTo(atual.getInfo())== 0){
                
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
    public void Cancelar(){
        if(isEmpty()){
            return;
        }
            if(qtd == 1){
                this.primeiro = null;
                this.ultimo = null;
                this.qtd--;
            }else{
                NodePessoas novoUltimo = this.ultimo.getAnterior();
                novoUltimo.setProx(null);
                this.ultimo = novoUltimo;
                qtd--;
            }
    }

    public NodePessoas Verificar(Pessoa remover){

            NodePessoas atual = this.primeiro;
            Pessoa buscado = remover;

            if (isEmpty()) {
                System.out.println("Lista Vazia!");
                return null;
            }
            else{
                do{
                    if (buscado.equals(atual.getInfo())) {
                        System.out.println("Pessoa encontrada");
                        return atual;
                    }
                    atual = atual.getProx();

                }while (atual.getProx()!=null);

                System.out.println("Pessoa não encontrada");
                return null;
            }
        }

        public void remover(Pessoa remover){
        if (isEmpty()) {
            return;
        }
        if (Verificar(remover) == null) {
            System.out.println("Valor não encontrado");

        }else{
            NodePessoas atual = this.primeiro;
            NodePessoas auxAnt;
            NodePessoas auxProx;
            for (int i = 0; i <this.qtd; i++) {
               
                if (atual.getInfo() == remover) {
                    if (atual  == this.ultimo) {
                        Cancelar();
                         System.out.println("Valor removido");
                        return;
                    }
                    auxAnt = atual.getAnterior();
                    auxProx = atual.getProx();
                    auxAnt.setProx(auxProx);
                    auxProx.setAnterior(auxAnt);
                    qtd--;
                    System.out.println("Valor removido");
                    return;
                }
                atual = atual.getProx();
            }
        }
    }
   
    public void exibir(){
        if (isEmpty()) {
            System.out.println("Lista Vazia");
        }else {
            NodePessoas atual = this.primeiro;
            do{
                System.out.print(atual.getInfo()+ " ");
                atual = atual.getProx();
            }while (atual != null);
            System.out.println(" ");
        }
    }

}
