import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in =  new Scanner(System.in);
        LDEInt numeros = new LDEInt();
        int op, num ,total;
        do{
           
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("informe o valor");
                    num = in.nextInt();
                    numeros.inserir(num);
                    break;
                case 2:
                    numeros.exibirTodos();
                    break;
                case 3:
                    System.out.println("Informe o valor");
                    num = in.nextInt();
                    total = numeros.remover(num);
                    System.out.println("totam: "+ total);
                    break;
            
                default:
                    break;
            }
        }while(op!=0);

    }
    
}
