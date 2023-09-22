package Listas.Listainteira.inteira;

import java.util.Scanner;

/**
 * LSEApp
 */
public class LSEApp {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            LSEint numeros;
            numeros = new LSEint();

            int op, num;

            do {

                exibirOpcoes();
                op = in.nextInt();

                switch (op) {

                    case 1:
                        System.out.print("Informe o valor a ser inserido: ");
                        num = in.nextInt();
                        numeros.inserirNoInicio(num);
                        break;
                    case 2:
                        numeros.exibirTodos();
                        break;
                    case 3:
                        numeros.removerPrimeiro();
                        break;
                    case 4:
                        System.out.print("Informe o valor a ser inserido: ");
                        num = in.nextInt();
                        numeros.inserirNoFinal(num);
                        break;
                    case 0:
                        System.out.println("Bye bye");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (op != 0);
        }
    }

    public static void exibirOpcoes() {
        System.out.println("Opções");
        System.out.println("1 -Inserir novo valor no início da lista");
        System.out.println("2 -Exibir valores na lista");
        System.out.println("3 -Remover o nó que se encontra no início da lista");
        System.out.println("4 -Inserir no Final ");
        System.out.println("0 -Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}