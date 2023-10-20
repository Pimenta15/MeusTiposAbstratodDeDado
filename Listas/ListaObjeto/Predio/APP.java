package Listas.ListaObjeto.Predio;

import java.util.Scanner;

public class APP {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LDEpessoas numeros = new LDEpessoas();
        int op;
        String nome, rg;

        do {
            exibirMenu();
            op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Informe o Nome: ");
                    nome = in.nextLine();
                    System.out.print("Informe o RG: ");
                    rg = in.nextLine();
                    Pessoa adicionar = new Pessoa(nome, rg);
                    numeros.Cadastrar(adicionar);
                    
                    break;
                case 2:
                    System.out.print("Cancelar");
                    numeros.Cancelar();
                    
                    break;
                case 3:
                    System.out.println("Lista de pessoas:");
                    numeros.exibir();
                    break;
                case 4:
                    System.out.print("Informe o Nome: ");
                    nome = in.nextLine();
                    System.out.print("Informe o RG: ");
                    rg = in.nextLine();
                    Pessoa verificar = new Pessoa(nome, rg);
                    numeros.Verificar(verificar);
                   
                    break;
                case 5:
                    System.out.print("Informe a pessoa a ser Removida: ");
                    System.out.print("Informe o Nome: ");
                    nome = in.nextLine();
                    System.out.print("Informe o RG: ");
                    rg = in.nextLine();
                    Pessoa remover = new Pessoa(nome, rg);
                    numeros.remover(remover);
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
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Cancelar");
        System.out.println("3 - Exibir todos");
        System.out.println("4 - Verificar");
        System.out.println("5 - Remover ");
        System.out.println("0 - Encerrar o programa");
        System.out.print("Informe a opção desejada: ");
    }
}
