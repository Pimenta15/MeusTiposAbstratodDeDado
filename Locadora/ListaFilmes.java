public class ListaFilmes {
    private NodeSecundario primeiro;
    private int qtd;
    private NodeSecundario ultimo;

   
    public ListaFilmes() {
        this.primeiro = null;
        this.qtd = 0;
        this.ultimo = null;
    }
    
    public boolean isEmpty() {
        return primeiro == null;
    }

    public void inserir(Filme filme) {
        NodeSecundario inserir = new NodeSecundario(filme);

        if (isEmpty()) {
            this.primeiro = inserir;
            this.ultimo = inserir;
            inserir.setProx(inserir);
            inserir.setAnte(inserir);
            qtd++;
            return;
        }

        if (filme.compareTo(this.primeiro.getInfo()) < 0) {
            inserir.setProx(this.primeiro);
            inserir.setAnte(this.ultimo);
            this.primeiro.setAnte(inserir);
            this.ultimo.setProx(inserir);
            this.primeiro = inserir;
            qtd++;
            return;
        }

        if (filme.compareTo(this.ultimo.getInfo()) > 0) {
            inserir.setProx(this.primeiro);
            inserir.setAnte(this.ultimo);
            this.ultimo.setProx(inserir);
            this.primeiro.setAnte(inserir);
            this.ultimo = inserir;
            qtd++;
            return;
        }

        NodeSecundario atual = this.primeiro.getProx();
        while (atual != this.primeiro) {
            if (filme.compareTo(atual.getInfo()) == 0) {
                System.out.println("Filme já existente");
                return;
            } else if (filme.compareTo(atual.getInfo()) > 0 && filme.compareTo(atual.getProx().getInfo()) < 0) {
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

    public void remover(Filme filme) {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        NodeSecundario atual = this.primeiro;
        do {
            if (filme.compareTo(atual.getInfo()) == 0) {
                if (this.qtd == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                } else {
                    atual.getAnte().setProx(atual.getProx());
                    atual.getProx().setAnte(atual.getAnte());
                    if (atual == this.primeiro) {
                        this.primeiro = atual.getProx();
                    }
                    if (atual == this.ultimo) {
                        this.ultimo = atual.getAnte();
                    }
                }
                qtd--;
                System.out.println("Filme removido: " + filme);
                return;
            }
            atual = atual.getProx();
        } while (atual != this.primeiro);

        System.out.println("Filme não encontrado: " + filme);
    }

    public void exibir(){
        if (isEmpty()) {
            System.out.println("Lista Vazia");
            return;
        }
        NodeSecundario atual = this.primeiro;
        do{
            System.out.println(atual.getInfo());
            atual = atual.getProx();
        }while(atual!= this.primeiro);
    }

    public NodeSecundario buscar(Filme filme) {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return null;
        }
    
        NodeSecundario atual = this.primeiro;
        do {
            if (filme.compareTo(atual.getInfo()) == 0) {
                System.out.println("Filme encontrado:");
                System.out.println("Titulo: " + atual.getInfo().getTitulo()); 
                System.out.println("Categoria: "+ atual.getInfo().getGenero());
                System.out.println("Classificação: " + atual.getInfo().getClassificacao());
                System.out.println("Ano de Lançamento: "+ atual.getInfo().getAno());
                return atual;
            }
            atual = atual.getProx();
        } while (atual != this.primeiro);
    
        System.out.println("Filme não encontrado");
        return null;
    }
    
}
