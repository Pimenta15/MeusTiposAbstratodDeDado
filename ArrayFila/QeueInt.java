package ArrayFila;

public class QeueInt {
    private int[] fila;
    private int tamanho;
    private int head;
    private int tail;
    
    
    public QeueInt(int tamanho) {
        this.tamanho = tamanho;
        this.fila = new int[tamanho];
    }

    public QeueInt() {
        this.tamanho = 20;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == fila.length ;
    }

    public void enqueue(int value) {
            if (tail == fila.length - 1) {
                tail = -1;
            }
            fila[++tail] = value;
            tamanho++;
       
    }
    public int dequeue() {
       
            int temp = fila[head++];
            if (head == fila.length) {
                head = 0;
            }
            tamanho--;
            return temp;
        
    }
    
}
