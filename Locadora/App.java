import java.util.Scanner;

public class App {

    private static ListaCategorias lista = new ListaCategorias();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        String titulo, genero, classificacao;
        int ano;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();
            in.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Digite o Titulo do filme:");
                     titulo = in.nextLine().toUpperCase();
                    
                    System.out.println("Digite o Gênero");
                     genero = in.nextLine().toUpperCase();
                   
                    System.out.println("Digite a classificação");
                     classificacao = in.nextLine().toUpperCase();
                    in.nextLine();
                    System.out.println("Digite o ano de lançamento do filme");
                     ano = in.nextInt();
                    cadastrarFilme(titulo, genero, classificacao, ano);
                    break;
                case 2:
                System.out.println("Digite o Titulo do filme:");
                     titulo = in.nextLine().toUpperCase();
                    
                    System.out.println("Digite o Gênero");
                     genero = in.nextLine().toUpperCase();
                   
                    System.out.println("Digite a classificação");
                     classificacao = in.nextLine().toUpperCase();
                    
                    System.out.println("Digite o ano de lançamento do filme");
                     ano = in.nextInt();
                    
                    removerFilme(titulo, genero, classificacao, ano);
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

    private static void cadastrarFilme(String titulo, String genero, String classificacao, int ano) {
        Filme adicionar = new Filme(titulo, genero, classificacao, ano);
        lista.inserir(adicionar);
    }

    private static void removerFilme(String titulo, String genero, String classificacao, int ano) {
        Filme remover = new Filme(titulo, genero, classificacao, ano);
        lista.remover(remover);
    }

    private static void consultarFilme() {
      
    }

    private static void editarFilme() {
       
    }

    private static void exibirTodosFilmes() {
       lista.exibirLista();
    }

    private static void exibirFilmesPorCategoria() {
      
    }
}
