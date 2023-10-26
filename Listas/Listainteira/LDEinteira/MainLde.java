package Listas.Listainteira.LDEinteira;

import java.util.Scanner;

public class MainLde {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LDEInteira numeros = new LDEInteira();
        int op, num;

        do {
            exibirMenu();
            op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Informe o valor: ");
                    num = in.nextInt();
                    numeros.inserirInicio(num);
                    break;
                case 2:
                    System.out.print("Informe o valor: ");
                    num = in.nextInt();
                    numeros.inserirFinal(num);
                    break;
                case 3:
                    System.out.println("Lista de números:");
                    numeros.exibir();
                    break;
                case 4:
                    numeros.removerInicio();
                    break;
                case 5:
                    numeros.removerFinal();
                    break;
                case 6:
                    System.out.print("Informe o valor a ser removido: ");
                    num = in.nextInt();
                    numeros.removerEspecifico(num);
                    break;
                case 7:
                    // União de listas
                    LDEInteira listaB = new LDEInteira(); 
                    LDEInteira uniaoAB = numeros.uniao(listaB);
                    System.out.println("União das listas:");
                    uniaoAB.exibir();
                    break;
                case 8:
                    // Diferença de listas
                    LDEInteira listaB2 = new LDEInteira(); 
                    LDEInteira diferencaAB = numeros.diferenca(listaB2);
                    System.out.println("Diferença das listas:");
                    diferencaAB.exibir();
                    break;
                case 9:
                   
                    LDEInteira listaB3 = new LDEInteira(); 
                    LDEInteira intersecaoAB = numeros.intersecao(listaB3);
                    System.out.println("Interseção de listas:");
                    intersecaoAB.exibir();
                    break;
                case 10:
                    System.out.println("quais copias deseja remover: ");
                    int remover = in.nextInt();
                    numeros.removerCopias(remover);
                    System.out.println("Cópias removidas da lista.");
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
        System.out.println("1 - Inserir no início");
        System.out.println("2 - Inserir no final");
        System.out.println("3 - Exibir todos");
        System.out.println("4 - Remover primeiro");
        System.out.println("5 - Remover último");
        System.out.println("6 - Remover um elemento específico");
        System.out.println("7 - União de listas");
        System.out.println("8 - Diferença de listas");
        System.out.println("9 - Interseção de listas");
        System.out.println("10 - Remover cópias da lista");
        System.out.println("0 - Encerrar o programa");
        System.out.print("Informe a opção desejada: ");
    }
}
