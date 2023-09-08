package ArrayFila.inteira;


import java.util.Scanner;

public class soDinheiro {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        QueueInt fila = new QueueInt();
        int senhas;

        do{
        System.out.println("Digite:");
        System.out.println("1. Fornecer senha");
        System.out.println("2. Atender Cliente");
        senhas = in.nextInt();
        int cont = 0;
        switch (senhas) {
            case 1:
                if (fila.isFull()) {
                   System.out.println("Banco cheio, por favor volte mais tarde");
                }else{
                    
                    cont++;
                    fila.enqueue(cont);
                }
                break;
            case 2:
                if (fila.isEmpty()) {
                     System.out.println("Banco vazio, espere por clientes");
                } else {
                    fila.dequeue();
                }
                break;
        
            default:
            System.out.println("Opção invalida");
                break;
            
        }
        }while(senhas != -1);
    }
}
