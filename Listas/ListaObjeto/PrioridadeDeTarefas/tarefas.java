package Listas.ListaObjeto.PrioridadeDeTarefas;

public class tarefas {
    private String descricao;
    private int prioridade;
    
    public tarefas(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    @Override
    public String toString() {
        return "tarefas [\ndescricao= " + descricao + ",\nprioridade= "  + prioridade + "\n]";
    }
    
}
