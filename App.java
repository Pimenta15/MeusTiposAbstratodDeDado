import java.util.Scanner;

public class App {

    private static ListaCategorias lista = new ListaCategorias();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();
            in.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarFilme();
                    break;
                case 2:
                    removerFilme();
                    break;
                case 3:
                    consultarFilme();
                    break;
                case 4:
                    editarFilme();
                    break;
                case 5:
                    exibirTodosFilmes();
                    break;
                case 6:
                    exibirFilmesPorCategoria();
                    break;
                case 0:
                    System.out.println("Saindo da aplicação. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        
    }

    private static void exibirMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Cadastrar Filme");
        System.out.println("2. Remover Filme");
        System.out.println("3. Consultar Filme");
        System.out.println("4. Editar Filme");
        System.out.println("5. Exibir Todos os Filmes");
        System.out.println("6. Exibir Filmes por Categoria");
        System.out.println("0. Sair");
    }

    private static void cadastrarFilme() {
        
    }

    private static void removerFilme() {
      
    }

    private static void consultarFilme() {
      
    }

    private static void editarFilme() {
       
    }

    private static void exibirTodosFilmes() {
       
    }

    private static void exibirFilmesPorCategoria() {
      
    }
}
