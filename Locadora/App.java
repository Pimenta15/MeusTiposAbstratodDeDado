import java.util.Scanner;

public class App {

    private static ListaCategorias lista = new ListaCategorias();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
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
                    System.out.println("Digite a categoria a ser Listada");
                    String categ = in.nextLine().toUpperCase();
                    exibirFilmesPorCategoria(categ);
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
        System.out.println("Digite o Titulo do filme:");
        String titulo = in.nextLine().toUpperCase();

        System.out.println("Digite o Gênero");
        String genero = in.nextLine().toUpperCase();

        System.out.println("Digite a classificação");
        String classificacao = in.nextLine().toUpperCase();

        System.out.println("Digite o ano de lançamento do filme");
        int ano = in.nextInt();

        Filme adicionar = new Filme(titulo, genero, classificacao, ano);
        lista.inserir(adicionar);
    }

    private static void removerFilme() {
        System.out.println("Digite o Titulo do filme:");
        String titulo = in.nextLine().toUpperCase();

        System.out.println("Digite o Gênero");
        String genero = in.nextLine().toUpperCase();

        System.out.println("Digite a classificação");
        String classificacao = in.nextLine().toUpperCase();

        System.out.println("Digite o ano de lançamento do filme");
        int ano = in.nextInt();

        Filme remover = new Filme(titulo, genero, classificacao, ano);
        try {
            lista.remover(remover);

        } catch (Exception e) {
            System.out.println("Categoria não encontrada");
        }
    }

    private static void consultarFilme() {
        System.out.println("Digite o Titulo do filme:");
        String titulo = in.nextLine().toUpperCase();

        System.out.println("Digite o Gênero");
        String genero = in.nextLine().toUpperCase();

        System.out.println("Digite a classificação");
        String classificacao = in.nextLine().toUpperCase();

        System.out.println("Digite o ano de lançamento do filme");
        int ano = in.nextInt();

        Filme consultar = new Filme(titulo, genero, classificacao, ano);
        try {
            consultar = lista.buscar(genero).getInfo().getLista().buscar(consultar).getInfo();
        } catch (Exception e) {
            consultar = null;
        }
        if (consultar != null) {
            System.out.println(consultar);
            System.out.println("Filme encontrado:");
            System.out.println("Titulo: " + consultar.getTitulo());
            System.out.println("Categoria: " + consultar.getGenero());
            System.out.println("Classificação: " + consultar.getClassificacao());
            System.out.println("Ano de Lançamento: " + consultar.getAno());
        } else {
            System.out.println("Filme não cadastrado");
        }
    }

    private static void editarFilme() {
        System.out.println("Digite o Titulo do filme:");
        String titulo = in.nextLine().toUpperCase();

        System.out.println("Digite o Gênero");
        String genero = in.nextLine().toUpperCase();

               Filme editar = new Filme(titulo, genero, "null", 0);
        try {
            editar = lista.buscar(genero).getInfo().getLista().buscar(editar).getInfo();
        } catch (Exception e) {
            editar = null;
        }

        if (editar != null) {
            System.out.println("Filme encontrado:");
            System.out.println("Titulo: " + editar.getTitulo());
            System.out.println("Categoria: " + editar.getGenero());
            System.out.println("Classificação: " + editar.getClassificacao());
            System.out.println("Ano de Lançamento: " + editar.getAno());

            System.out.println("Editar titulo: ");
            editar.setTitulo(in.nextLine().toUpperCase());

            System.out.println("Editar Classificação: ");
            editar.setClassificacao(in.nextLine().toUpperCase());

            System.out.println("Editar Ano de Lançamento: ");
            editar.setAno(Integer.parseInt(in.nextLine()));
        } else {
            System.out.println("Filme não cadastrado");
        }
    }

    private static void exibirTodosFilmes() {
        lista.exibirLista();
    }

    private static void exibirFilmesPorCategoria(String categoria) {
        try {
            ListaFilmes listar = lista.buscar(categoria).getInfo().getLista();
            if (listar != null) {
                listar.exibir();

            }
        } catch (Exception e) {

        }
    }
    
  
}
