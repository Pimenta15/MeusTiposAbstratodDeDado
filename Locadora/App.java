import java.util.Scanner;

public class App {
    
    private static ListaCategorias lista = new ListaCategorias();
    static Scanner in = new Scanner(System.in);
    
    static String titulo, genero, classificacao;
    static int ano;
   
    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();
            in.nextLine(); 

            switch (opcao) {
                case 1:
                    filme();
                    cadastrarFilme(titulo, genero, classificacao, ano);
                    break;
                case 2:
                    filme();
                    removerFilme(titulo, genero, classificacao, ano);
                    break;
                case 3:
                    filme();
                    consultarFilme(titulo, genero, classificacao, ano);
                    break;
                case 4:
                    filme();
                    editarFilme(titulo, genero, classificacao, ano);
                    break;
                case 5:
                    exibirTodosFilmes();
                    break;
                case 6:
                System.out.println("Digite a categoria a ser Listada");
                String categ = in.nextLine();
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

    private static void cadastrarFilme(String titulo, String genero, String classificacao, int ano) {
        Filme adicionar = new Filme(titulo, genero, classificacao, ano);
        lista.inserir(adicionar);
    }

    private static void removerFilme(String titulo, String genero, String classificacao, int ano) {
        Filme remover = new Filme(titulo, genero, classificacao, ano);
        lista.remover(remover);
    }
    private static void consultarFilme(String titulo, String genero, String classificacao, int ano) {
        Filme consultar = new Filme(titulo, genero, classificacao, ano);
        consultar = lista.buscar(genero).getInfo().getLista().buscar(consultar).getInfo();
        if (consultar != null) {
           
            System.out.println("Filme encontrado:");
            System.out.println("Titulo: " +consultar.getTitulo()); 
            System.out.println("Categoria: "+ consultar.getGenero());
            System.out.println("Classificação: " + consultar.getClassificacao());
            System.out.println("Ano de Lançamento: "+ consultar.getAno());
        }else{
            System.out.println("Filme não cadastrado:");
            
        }
    }

    private static void editarFilme(String titulo, String genero, String classificacao, int ano) {
        Filme editar = new Filme(titulo, genero, classificacao, ano);
        editar = lista.buscar(genero).getInfo().getLista().buscar(editar).getInfo();
        if (editar != null) {
           
            System.out.println("Filme encontrado:");
            System.out.println("Titulo: " +editar.getTitulo()); 
            System.out.println("Categoria: "+ editar.getGenero());
            System.out.println("Classificação: " + editar.getClassificacao());
            System.out.println("Ano de Lançamento: "+ editar.getAno());
            
            System.out.println("Editar titulo: ");
            editar.setTitulo(in.nextLine());
            System.out.println("Editar categoria: ");
            editar.setGenero(in.nextLine());
            System.out.println("Editar Classificação: ");
            editar.setClassificacao(in.nextLine());
            System.out.println("Editar Ano de Lançamento: ");
            editar.setAno(in.nextInt());
        }else{
            System.out.println("Filme não cadastrado:");
            
        }
    }

    private static void exibirTodosFilmes() {
       lista.exibirLista();
    }

    private static void exibirFilmesPorCategoria(String categoria) {
      ListaFilmes listar =lista.buscar(categoria).getInfo().getLista();
      listar.exibir();
    }

    public static void filme() {
        System.out.println("Digite o Titulo do filme:");
        titulo = in.nextLine().toUpperCase();
                    
        System.out.println("Digite o Gênero");
        genero = in.nextLine().toUpperCase();
                   
        System.out.println("Digite a classificação");
        classificacao = in.nextLine().toUpperCase();
                   
        System.out.println("Digite o ano de lançamento do filme");
        ano = in.nextInt();
    }
}
