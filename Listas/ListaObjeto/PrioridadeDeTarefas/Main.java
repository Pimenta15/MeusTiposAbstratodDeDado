package Listas.ListaObjeto.PrioridadeDeTarefas;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        LDETarefas listaDeTarefas = new LDETarefas();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Inserir uma tarefa");
            System.out.println("2. Exibir todas as tarefas");
            System.out.println("3. Alterar a prioridade de uma tarefa");
            System.out.println("4. Exibir tarefas com uma determinada prioridade");
            System.out.println("5. Cancelar a execução de uma tarefa");
            System.out.println("6. Encontrar tarefa e exibir quantas estão antes dela");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    int prioridade;
                    do {
                        System.out.print("Digite a prioridade (1-10): ");
                        prioridade = scanner.nextInt();
                    } while (prioridade < 1 || prioridade > 10);

                    tarefas novaTarefa = new tarefas(descricao, prioridade);
                    listaDeTarefas.enQueue(novaTarefa);
                    System.out.println("Tarefa inserida com sucesso!");
                    break;
                case 2:
                    listaDeTarefas.exibirTodasTarefas();
                    break;
                case 3:
                    System.out.print("Digite a descrição da tarefa que deseja alterar: ");
                    String descricaoParaAlterar = scanner.nextLine();
                    int novaPrioridade;
                    do {
                        System.out.print("Digite a nova prioridade (1-10): ");
                        novaPrioridade = scanner.nextInt();
                    } while (novaPrioridade < 1 || novaPrioridade > 10);

                    listaDeTarefas.alterarPrioridadeTarefa(descricaoParaAlterar, novaPrioridade);
                    break;
                case 4:
                    int prioridadeProcurada;
                    do {
                        System.out.print("Digite a prioridade que deseja exibir (1-10): ");
                        prioridadeProcurada = scanner.nextInt();
                    } while (prioridadeProcurada < 1 || prioridadeProcurada > 10);

                    listaDeTarefas.exibirTarefasComPrioridade(prioridadeProcurada);
                    break;
                case 5:
                    System.out.print("Digite a descrição da tarefa que deseja cancelar: ");
                    String descricaoParaCancelar = scanner.nextLine();
                    listaDeTarefas.cancelarTarefa(descricaoParaCancelar);
                    break;
                case 6:
                    System.out.print("Digite a descrição da tarefa que deseja encontrar: ");
                    String descricaoParaEncontrar = scanner.nextLine();
                    listaDeTarefas.encontrarTarefa(descricaoParaEncontrar);
                    break;
                case 7:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 7);

        scanner.close();
    }
}
