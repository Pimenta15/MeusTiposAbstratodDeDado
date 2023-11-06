package Listas.ListaObjeto.PrioridadeDeTarefas;


public class LDENode {
    private tarefas tarefa;
    private LDENode prox;
    private LDENode anterior;
    
    public tarefas getTarefa() {
        return tarefa;
    }


    public void setTarefa(tarefas prioridade) {
        this.tarefa = prioridade;
    }
    public LDENode(tarefas prioridade) {
        this.tarefa = prioridade;
    }

    
    public LDENode getProx() {
        return prox;
    }
    public void setProx(LDENode prox) {
        this.prox = prox;
    }
    public LDENode getAnterior() {
        return anterior;
    }
    public void setAnterior(LDENode anterior) {
        this.anterior = anterior;
    }
    
}
