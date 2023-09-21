package Listas.Listainteira.inteira;

public class LSEint {
    private LSEnode primeiro;


    public void inserirNoInicio(Integer num){

        LSEnode novo;
        
        novo = new LSEnode(num);
       
        if (this.primeiro == null) {
            this.primeiro = novo;
        }
        else{
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
    }

    public void removerPrimeiro(){

        this.primeiro = primeiro.getProx();

    }

    public int procurar(Integer buscado){
       
        int contador = 1;
        LSEnode atual = primeiro;

        while (atual != null) {
            if (atual.getInfo().equals(buscado)) {
                return contador;
            }
            atual = atual.getProx();
            contador++;
        }

    return -1;

    }
}
