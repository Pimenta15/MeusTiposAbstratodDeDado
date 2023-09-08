package ArrayFila.inteira;
public class QueueInt {
     private int[] elementos;
    private int tamanho;
    private int capacidade;
    private int head; 
    private int tail; 

    public QueueInt(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.tamanho = 0;
        this.head = 0;
        this.tail = 0;
    }
     public QueueInt() {
        this.capacidade = 20;
        this.elementos = new int[this.capacidade];
        this.tamanho = 0;
        this.head = 0;
        this.tail = 0;
    }

    
    public void enqueue(int n) {
        elementos[tail] = n;
        tamanho++;
        tail = (tail + 1) % capacidade; 
    }

  
    public int dequeue() {
        int elementoRemovido = elementos[head];
        tamanho--;
        head = (head + 1) % capacidade; 
        return elementoRemovido;
    }

   
    public int head() {
        return elementos[head];
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}