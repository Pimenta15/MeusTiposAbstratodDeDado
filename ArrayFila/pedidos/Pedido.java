package ArrayFila.pedidos;

public class Pedido {
    private String descricao;
    private int numeroPedido;

    public Pedido(String descricao, int numeroPedido) {
        this.descricao = descricao;
        this.numeroPedido = numeroPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    @Override
    public String toString() {
        return "Pedido [Descrição: " + descricao + ", Número do Pedido: " + numeroPedido + "]";
    }
}

