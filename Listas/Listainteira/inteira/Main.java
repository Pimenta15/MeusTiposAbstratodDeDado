package Listas.Listainteira.inteira;

public class Main {
    public static void main(String[] args) {
       teste2();
    }
    public static void teste2(){
        Aluno pimenta = new Aluno("pimenta", "1", 3,8);
        Aluno eduardo = new Aluno("Eduardo", "2", 0,10);
        ListaAluno chamada = new ListaAluno();

        chamada.addLast(pimenta);
        chamada.addLast(eduardo);

        chamada.delete(eduardo);
    }
    public static void teste1(){
        Pimenta
                lista1 = new Pimenta(),
                lista2 = new Pimenta(),
                copia1 = new Pimenta(),
                copia2 = new Pimenta(),
                Somar = new Pimenta();

        lista1.inserir(1);
        lista1.inserir(3);
        lista1.inserir(5);

        lista2.inserir(2);
        lista2.inserir(4);
        lista2.inserir(6);


        copia1 = lista1.copiar();
        copia2 = lista2.copiar();

        Somar.soma(copia1,copia2);
        Somar.exibir();
    }
}
