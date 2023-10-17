package Listas.Stack;


public class StackApp {
    public static void main(String[] args) {
        
        LSEStack pilha = new LSEStack();
    
        pilha.push(1);
        pilha.push(2);
        System.out.println(pilha.top());
        pilha.push(3);
        pilha.push(4);
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        pilha.push(5);
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
    }
}
