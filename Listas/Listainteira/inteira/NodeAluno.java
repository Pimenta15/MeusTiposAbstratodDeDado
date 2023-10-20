package Listas.Listainteira.inteira;

public class NodeAluno {
    private NodeAluno next;
    private Aluno value;

    public NodeAluno(Aluno value){
        this.next = null;
        this.value = value;
    }

    public NodeAluno getNext() {
        return next;
    }
    public void setNext(NodeAluno next) {
        this.next = next;
    }

    public Aluno getValue() {
        return value;
    }
    public void setValue(Aluno value) {
        this.value = value;
    }
}
