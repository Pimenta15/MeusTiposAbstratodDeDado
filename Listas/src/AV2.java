import java.util.Scanner;

public class AV2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        LSEint listaDeInteiros, pares, impares;
        listaDeInteiros = new LSEint();
        pares = new LSEint();
        impares = new LSEint();
        int valor;
        do{
            System.out.println("informe um inteiro");
            System.out.println("digite zero pra encerrar");
            valor = in.nextInt();
            if (valor!=0) {
                listaDeInteiros.inserir(valor);
            }
        }while(valor!=0);
        listaDeInteiros.paresEImpares(pares, impares);
        System.out.println("Lista principal");
        listaDeInteiros.exbir();
        System.out.println("\nLista Par");
        pares.exbir();
        System.out.println("\nLista Impar");
        impares.exbir();
    }
}
