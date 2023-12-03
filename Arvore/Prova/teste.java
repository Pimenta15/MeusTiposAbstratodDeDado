package Arvore.Prova;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        arvore<Integer> teste = new arvore<>();
        int inserir =in.nextInt();
        teste.InserirRecursivo(inserir);
        teste.InserirRepitido(inserir);
        
        in.close();
    }
}
