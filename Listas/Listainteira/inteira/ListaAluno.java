public class ListaAluno {
    NodeAluno first;

    public void addLast(Aluno adiciona){
        NodeAluno novo = new NodeAluno(adiciona);

        if (isEmpty()) {
            this.first = novo;
        }
        else {
        NodeAluno aux = this.first;
        this.first = novo;
        this.first.setNext(aux);
        }

    }
    public NodeAluno busca(Aluno valor){

        NodeAluno atual = this.first;
        String buscado = valor.getMatricula();

        if (isEmpty()) {
            System.out.println("Lista Vazia!");
            return null;
        }
        else{
            do{
                if (buscado.equals(atual.getValue().getMatricula())) {
                    System.out.println("Valor encontrado");
                    return atual;
                }
                atual = atual.getNext();
            }while (atual.getNext()!=null);

            System.out.println("Valor não encontrado");
            return null;
        }
    }
    public void alterarMedia(double media, Aluno buscar){
        NodeAluno alterarAluno = this.busca(buscar);

        if (alterarAluno != null) {

            alterarAluno.getValue().setMedia(media);
            System.out.println("Media alterada");

        }else {
            System.out.println("Aluno não existente");
        }
    }
    public void delete(Aluno deletado){
        NodeAluno atual = this.first;
        NodeAluno prox = atual.getNext();

        if (isEmpty()) {
            System.out.println("Lista vazia!");
        }
        if (first.getValue().getMatricula().equals(deletado.getMatricula())) {
            first = first.getNext();
            System.out.println("Aluno deletado");
        } else {
            do{
                if (prox.getValue().getMatricula().equals(deletado.getMatricula())) {
                    atual.setNext(prox.getNext());
                    System.out.println("Aluno deletado");
                    return;
                }

                atual.setNext(prox);
                prox.setNext(prox.getNext());

            }while (prox.getNext()!=null);
            System.out.println("Aluno não encontrado");
        }
    }
    public boolean isEmpty(){
        return first == null;
    }
}
