package Arvore.Questão1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SearchTree<Produto> cadastro = new SearchTree<>();
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Exibir todos os produtos cadastrados");
            System.out.println("3. Procurar produto por código");
            System.out.println("4. Alterar preço de um produto");
            System.out.println("5. Alterar quantidade em estoque de um produto");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarNovoProduto(scanner, cadastro);
                    break;
                case 2:
                    exibirTodosOsProdutos(cadastro);
                    break;
                case 3:
                    procurarProdutoPorCodigo(scanner, cadastro);
                    break;
                case 4:
                    alterarPrecoDeProduto(scanner, cadastro);
                    break;
                case 5:
                    alterarQuantidadeDeProduto(scanner, cadastro);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até logo!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarNovoProduto(Scanner scanner, SearchTree<Produto> cadastro) {
        System.out.print("Informe o código do produto: ");
        Integer codigo = scanner.nextInt();
        System.out.print("Informe a descrição do produto: ");
        String descricao = scanner.nextLine();
        System.out.print("Informe o fornecedor do produto: ");
        String fornecedor = scanner.nextLine();
        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Informe a quantidade do produto: ");
        int qtd = scanner.nextInt();


        Produto novoProduto = new Produto(codigo,descricao,fornecedor,preco,qtd);
        cadastro.InserirRecursivo(novoProduto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void exibirTodosOsProdutos(SearchTree<Produto> cadastro) {
        cadastro.emOrdem();
    }

    private static void procurarProdutoPorCodigo(Scanner scanner, SearchTree<Produto> cadastro) {
        System.out.print("Informe o código do produto: ");
        int codigo = scanner.nextInt();
        Produto buscar = new Produto(codigo);
        Produto produtoEncontrado = cadastro.busca(buscar).getData();

        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado:");
            System.out.println(produtoEncontrado);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void alterarPrecoDeProduto(Scanner scanner, SearchTree<Produto> cadastro) {
        System.out.print("Informe o código do produto: ");
        int codigo = scanner.nextInt();
        Produto buscar = new Produto(codigo);
        Produto produtoEncontrado = cadastro.busca(buscar).getData();

        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado:");
            System.out.println(produtoEncontrado);
            System.out.println("Digite o novo preço");
            double val = scanner.nextDouble();
            produtoEncontrado.setPreco(val);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
    

    private static void alterarQuantidadeDeProduto(Scanner scanner, SearchTree<Produto> cadastro) {
       System.out.print("Informe o código do produto: ");
        int codigo = scanner.nextInt();
        Produto buscar = new Produto(codigo);
        Produto produtoEncontrado = cadastro.busca(buscar).getData();

        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado:");
            System.out.println(produtoEncontrado);
            System.out.println("Digite o novo preço");
            int val = scanner.nextInt();
            produtoEncontrado.setQtd(val);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

}

