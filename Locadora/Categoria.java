public class Categoria implements Comparable <Categoria>{
    
    private String descricao; //nome da categoria
    private ListaFilmes lista; //referência para a lista de filmes daquela categoria
   
    public Categoria(String descricao) {
        this.descricao = descricao;
        this.lista = new ListaFilmes();
    }

    @Override
    public int compareTo(Categoria o) {
        return this.descricao.compareTo(o.descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ListaFilmes getLista() {
        return lista;
    }

    public void setLista(ListaFilmes lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return descricao ;
    }
}