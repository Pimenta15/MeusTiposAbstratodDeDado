package Listas.ListaObjeto.PrioridadeDeTarefas;


public class LDETarefas {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public boolean isEmpty() { // teste forte!
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean contains(tarefas verificar) {
        LDENode atual = this.primeiro;
        while (atual!= null) {
            if (atual.getTarefa().getDescricao().equals( verificar.getDescricao())) {
                return true;
            }
            atual = atual.getProx();
        }
        return false;
    }

    public void enQueue(tarefas adiciona) {
        LDENode novo = new LDENode(adiciona);
        LDENode atual = this.primeiro;
        if (isEmpty()) {
            this.primeiro = novo;
            this.qtd++;
            return;
        }
        if (contains(adiciona)) {
            System.out.println("Atividade ja existe, não ofi possivel adicionar");
            return;
        }
        if (adiciona.getPrioridade() < this.primeiro.getTarefa().getPrioridade()) {

            novo.setProx(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
            this.qtd++;
            return;
        }
        
        if (adiciona.getPrioridade() > this.primeiro.getTarefa().getPrioridade()) {
            this.ultimo.setProx(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
            return;
        }
        while (atual != null) {
            if (adiciona.getPrioridade() < atual.getTarefa().getPrioridade()) {
                LDENode anterior = atual.getAnterior();
                anterior.setProx(novo);
                novo.setAnterior(anterior);
                novo.setProx(atual);
                atual.setAnterior(novo);
                this.qtd++;
                return;
            }
            atual = atual.getProx();
        }
}
public tarefas executarTarefa() {
    if (isEmpty()) {
        System.out.println("Lista Vazia");
        return null; 
    }

    LDENode primeiroNode = this.primeiro;

    if (this.qtd == 1) {
       
        this.primeiro = null;
        this.ultimo = null;
    } else {
        
        this.primeiro = primeiroNode.getProx();
        this.primeiro.setAnterior(null);
    }

    this.qtd--;

    return primeiroNode.getTarefa();
}

public void encontrarTarefa(String descricaoProcurada) {
    LDENode atual = this.primeiro;
    int tarefasAntes = 0;
    boolean encontrou = false;

    while (atual != null) {
        if (atual.getTarefa().getDescricao().equals(descricaoProcurada)) {
            encontrou = true;
            break;
        }
        tarefasAntes++;
        atual = atual.getProx();
    }

    if (encontrou) {
        System.out.println("A tarefa '" + descricaoProcurada + "' foi encontrada.");
        System.out.println("Existem " + tarefasAntes + " tarefas para serem executadas antes dela.");
    } else {
        System.out.println("A tarefa '" + descricaoProcurada + "' não foi encontrada na lista.");
    }
}

public void cancelarTarefa(String descricao) {
    LDENode atual = this.primeiro;
    
    while (atual != null) {
        if (atual.getTarefa().getDescricao().equals(descricao)) {
            
            LDENode anterior = atual.getAnterior();
            LDENode proximo = atual.getProx();
            
            if (anterior != null) {
                anterior.setProx(proximo);
            } else {
                this.primeiro = proximo;
            }
            
            if (proximo != null) {
                proximo.setAnterior(anterior);
            } else {
                this.ultimo = anterior;
            }
            
            this.qtd--;
            System.out.println("Tarefa '" + descricao + "' foi cancelada com sucesso.");
            return;
        }
        
        atual = atual.getProx();
    }
    
    System.out.println("A tarefa '" + descricao + "' não foi encontrada na lista.");
}

    public void exibirTarefasComPrioridade(int prioridadeProcurada) {
        LDENode atual = this.primeiro;
        int totalTarefas = 0;

        while (atual != null) {
            if (atual.getTarefa().getPrioridade() == prioridadeProcurada) {
                System.out.println("Descrição: " + atual.getTarefa().getDescricao());
                totalTarefas++;
            }
            atual = atual.getProx();
        }

        if (totalTarefas > 0) {
            System.out.println("Total de tarefas com prioridade " + prioridadeProcurada + ": " + totalTarefas);
        } else {
            System.out.println("Nenhuma tarefa encontrada com prioridade " + prioridadeProcurada);
        }
    }

    public void exibirTodasTarefas() {
        LDENode atual = this.primeiro;
    
        while (atual != null) {
            tarefas tarefa = atual.getTarefa();
            System.out.println("Descrição: " + tarefa.getDescricao() + ", Prioridade: " + tarefa.getPrioridade());
            atual = atual.getProx();
        }
    }
    
    public void alterarPrioridadeTarefa(String descricaoParaAlterar, int novaPrioridade) {
        LDENode atual = this.primeiro;
    
        while (atual != null) {
            if (atual.getTarefa().getDescricao().equals(descricaoParaAlterar)) {
                tarefas tarefa = atual.getTarefa();
                if (tarefa.getPrioridade() != novaPrioridade) {
                  
                    tarefa.setPrioridade(novaPrioridade); 
                    LDENode anterior = atual.getAnterior();
                    LDENode proximo = atual.getProx();
                    if (anterior != null) {
                        anterior.setProx(proximo);
                    } else {
                        this.primeiro = proximo;
                    }
                    if (proximo != null) {
                        proximo.setAnterior(anterior);
                    } else {
                        this.ultimo = anterior;
                    }
    
                    enQueue(tarefa);
    
                    System.out.println("A prioridade da tarefa '" + descricaoParaAlterar + "' foi alterada para " + novaPrioridade);
                    return;
                } else {
                    System.out.println("A prioridade da tarefa '" + descricaoParaAlterar + "' já é " + novaPrioridade);
                    return;
                }
            }
            atual = atual.getProx();
        }
    
        System.out.println("A tarefa '" + descricaoParaAlterar + "' não foi encontrada na lista.");
    }
    
}