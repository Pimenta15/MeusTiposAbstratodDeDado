package Pilhas;

public class StackInt {

    private int[] pilha;
    private int quantidade;

    public StackInt(int tamanho) {

        this.pilha = new int[tamanho];

        this.quantidade = 0;

}

    public StackInt() {

        this.pilha = new int[5];

        this.quantidade = 0;

}

    public boolean isFull() {

        return quantidade == pilha.length;

}

    public boolean isEmpty() {

        return quantidade == 0;

}

    public void push(int valor) {

     pilha[quantidade] = valor;

     quantidade++;

    }

    public int pop() {

        quantidade--;

        int valorRemovido = pilha[quantidade];

        pilha[quantidade] = 0;

        return valorRemovido;   

    }

    public int top() {

       return pilha[quantidade - 1];

    }

}