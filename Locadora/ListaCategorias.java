/**
 * ListaCategorias
 */
public class ListaCategorias {

    private NodePrincipal primeiro;
    private int qtd;
    private NodePrincipal ultimo;
    
    public boolean isEmpty(){
        return this.primeiro == null && qtd == 0 && this.ultimo == null;
    }

    public void inserir(String o) {
        Categoria novo = new Categoria(o);
        NodePrincipal inserir = new NodePrincipal(novo);
    
        if (isEmpty()) {
            this.primeiro = inserir;
            this.ultimo = inserir;
            qtd++;
            return;
        }
    
        if (novo.compareTo(this.primeiro.getInfo()) < 0) {
            inserir.setProx(this.primeiro);
            this.primeiro.setAnte(inserir);
            this.primeiro = inserir;
            qtd++;
            return;
        }
    
        if (novo.compareTo(this.ultimo.getInfo()) == 0 || novo.compareTo(this.primeiro.getInfo()) == 0) {
            System.out.println("Categoria já existente");
            return;
        }
    
        if (novo.compareTo(this.ultimo.getInfo()) > 0) {
            this.ultimo.setProx(inserir);
            inserir.setAnte(this.ultimo);
            this.ultimo = inserir;
            qtd++;
            return;
        }
    
        NodePrincipal atual = this.primeiro;
        while (atual.getProx() != this.primeiro) {
            if (novo.compareTo(atual.getInfo()) == 0) {
                System.out.println("Categoria já existente");
                return;
            } else if (novo.compareTo(atual.getInfo()) > 0 && novo.compareTo(atual.getProx().getInfo()) < 0) {
                inserir.setProx(atual.getProx());
                atual.getProx().setAnte(inserir);
                inserir.setAnte(atual);
                atual.setProx(inserir);
                qtd++;
                return;
            }
            atual = atual.getProx();
        }
    }

    public void remover(String o) {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }
    
        Categoria remover = new Categoria(o);
        NodePrincipal atual = this.primeiro;
    
        do {
            if (remover.compareTo(atual.getInfo()) == 0) {
                if (this.qtd == 1) { 
                    this.primeiro = null;
                    this.ultimo = null;
                } else if (atual == this.primeiro) { 
                    this.primeiro = atual.getProx();
                    this.primeiro.setAnte(this.ultimo);
                    this.ultimo.setProx(this.primeiro);
                } else if (atual == this.ultimo) {
                    this.ultimo = atual.getAnte();
                    this.ultimo.setProx(this.primeiro);
                    this.primeiro.setAnte(this.ultimo);
                } else { 
                    atual.getAnte().setProx(atual.getProx());
                    atual.getProx().setAnte(atual.getAnte());
                }
    
                this.qtd--;
                System.out.println("Categoria removida: " + o);
                return;
            }
    
            atual = atual.getProx();
        } while (atual != this.primeiro);
    
        System.out.println("Categoria não encontrada ");
    }

    public NodePrincipal buscar(String o) {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return null;
        }
    
        Categoria categoriaBuscar = new Categoria(o);
        NodePrincipal atual = this.primeiro;
    
        do {
            if (categoriaBuscar.compareTo(atual.getInfo()) == 0) {
                System.out.println("Categoria encontrada");
                return atual;
            }
    
            atual = atual.getProx();
        } while (atual != this.primeiro);
    
        System.out.println("Categoria não encontrada ");
        return null;
    }

    public void exibirLista() {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }
    
        NodePrincipal atual = this.primeiro;
        for (int i = 0; i < qtd; i++) {
            System.out.println("Categoria: " + atual.getInfo());
            atual = atual.getProx();
        }
    }
    
    }