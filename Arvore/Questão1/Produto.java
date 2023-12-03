package Arvore.Questão1;

public class Produto implements Comparable<Produto> {
    private Integer codigo; 
    private String descricao; 
    private String fornecedor; 
    private double preco;  
    private int qtd;
    
    public Produto(Integer codigo) {
        this.codigo = codigo;
    }
    public Produto(Integer codigo, String descricao, String fornecedor, double preco, int qtd) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.qtd = qtd;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", fornecedor=" + fornecedor + ", preco="
                + preco + ", qtd=" + qtd + "]";
    }
    @Override
    public int compareTo(Produto o) {
        return this.codigo.compareTo(o.getCodigo());
    }
   
}
