package Listas.Listainteira.inteira;

public class LSEint {
    private LSEnode primeiro;

    public void inserirNoInicio(Integer num) {

        LSEnode novo, retorno;

        novo = new LSEnode(num);
        if (isEmpty()) {
            this.primeiro = novo;
        } else {
            retorno = procurar(num);

            if (retorno == null) {
                this.primeiro = novo;
            } else {
                novo.setProx(this.primeiro);
                this.primeiro = novo;
            }
        }
    }

    public void removerPrimeiro() {
        if (!isEmpty()) {
            this.primeiro = primeiro.getProx();
            System.out.println("Remoção efetuada");
        } else {
            System.out.println("Lista Vazia");
        }
    }

    public void exibirTodos() {
        LSEnode aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public boolean isEmpty() {

        return this.primeiro == null;
    }

    public int buscar(Integer buscado) {

        int contador = 0;
        LSEnode atual = this.primeiro;
        if (!isEmpty()) {
            while (atual != null) {

                if (atual.getInfo() == buscado) {
                    contador++;
                }
                atual = atual.getProx();
                return contador;
            }
        }
        return -1;

    }

    public LSEnode procurar(int valor) {

        LSEnode atual = this.primeiro;

        if (!isEmpty()) {

            while (atual != null) {

                if (atual.getInfo() == valor) {
                    return atual;
                }
                atual = atual.getProx();
            }
        }
        return null;
    }

    public void inserirNoFinal(Integer adicionar) {
        LSEnode novo, 
        atual = this.primeiro;

        novo = new LSEnode(adicionar);

        if (isEmpty()) {
            this.primeiro = novo;
        } else {
            while (atual != null) {
                if (adicionar == atual.getInfo()) {
                    System.out.println("Valor repetido não adicionado");
                    break;
                } else {
                    if (atual.getProx() == null) {
                        atual.setProx(novo);
                    }
                }
                atual = atual.getProx();
            }
        }
    }
}
