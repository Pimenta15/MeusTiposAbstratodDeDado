package ArrayFila.pedidos;

public class QueuePedido {
    private Pedido[] elementos;
    private int tamanho;
    private int capacidade;
    private int head; 
    private int tail; 

    public QueuePedido(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Pedido[capacidade];
        this.tamanho = 0;
        this.head = 0;
        this.tail = 0;
    }

    public QueuePedido() {
        this.capacidade = 20;
        this.elementos = new Pedido[this.capacidade];
        this.tamanho = 0;
        this.head = 0;
        this.tail = 0;
    }

    public void enqueue(Pedido pedido) {
        elementos[tail] = pedido;
        tamanho++;
        tail = (tail + 1) % capacidade; 
    }

    public Pedido dequeue() {
        Pedido pedidoRemovido = elementos[head];
        tamanho--;
        head = (head + 1) % capacidade; 
        return pedidoRemovido;
    }

    public Pedido head() {
        return elementos[head];
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}
