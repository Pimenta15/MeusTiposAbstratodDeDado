package Listas.Listainteira.LDEinteiraOrdenada;

import java.util.Scanner;

public class LDECrescente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LDEInt numeros = new LDEInt();
        int op, num;

        do {
            exibirMenu();
            op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Informe o valor: ");
                    num = in.nextInt();
                    numeros.inserirOrdenado(num);
                    break;
                case 2:
                    numeros.exibirTodos();
                    break;
                case 3:
                    System.out.print("Informe o valor: ");
                    num = in.nextInt();
                    numeros.remover(num);
                    break;
                case 0:
                    System.out.println("Fim de programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }

    public static void exibirMenu() {
        System.out.println("Opções");
        System.out.println("1 - Inserir");
        System.out.println("2 - Exibir todos");
        System.out.println("3 - Remover");
        System.out.println("0 - Encerrar o programa");
        System.out.print("Informe a opção desejada: ");
    }
}
