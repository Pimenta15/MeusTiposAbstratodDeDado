package Arvore.Prova;

public class arvore<T extends Comparable<T>> {
    
    private no<T> root;

    public no<T> getRoot() {
        return root;
    }

    public void setRoot(no<T> root) {
        this.root = root;
    }


    public void InserirRecursivo(T valor){ //  não repete termos
         if (root == null) {
            root = new no<T>(valor);
        }else{
            root.InserirNoRecursivo(valor);
        }
    } // recursirvidade na classe "no"

    public void InserirRepitido(T valor){ //  não repete termos
         if (root == null) {
            root = new no<T>(valor);
            return;
        }else{
            no<T> aux = this.root;
            while (aux != null) {
                if (aux.getData().compareTo(valor) == 1) {
                    if (aux.getLeft() == null) {
                        aux.setLeft(new no<T>(valor));
                        return;
                    }else {
                        aux = aux.getLeft();
                    }
                } else if(aux.getData().compareTo(valor) == -1) {
                    if (aux.getRight() == null) {
                        aux.setRight(new no<T>(valor));
                        return;
                    }else {
                        aux = aux.getRight();
                    }
                }else{
                    System.out.println("Valor Repetido");
                    return;
                }
            }
        }
    }

    public no<T> BuscaRecursivo(T valor){
        if (this.root == null) {
            System.out.println("Lista Vazia!");
            return null;
        }else{
            return root.buscarNo(valor);
        }
    }

    public no<T> BuscaRepitido(T valor){
        if (this.root == null) {
            System.out.println("Lista Vazia!");
            return null;
        }else{
        no<T> aux = this.root;
            while (true) {
                if (valor.compareTo(aux.getData())== 0) {
                    return aux;
                }else if(valor.compareTo(aux.getData())== 1){
                    if (aux.getRight() == null) {
                        return null;
                    }else {
                        aux = aux.getRight();
                    }
                }else{
                    if (aux.getLeft() == null) {
                        return null;
                    }else {
                        aux = aux.getLeft();
                    }
                }
            }
        }
    }

    public void RemoverRecursivo(T valor){
        if (root == null) {
            System.out.println ("Árvore vazia!");
        }else{
            no<T> aux = remove(root, valor);
            if (aux == null) {
                System.out.println("valor não encontrado");
            }else{
                System.out.println("valor Removido");
            }
        }
    }
    private no<T> remove(no<T> r, T valor){
        if (r != null) {
            if (valor.compareTo(r.getData()) == 0){
                no<T> pai, filho;
                if (r.getLeft() == null && r.getRight() == null)  {
                    return null; //Não tem filhos
                } else if (r.getLeft() == null)  {  // Não tem filho a esquerda
                    r = r.getRight();
                }else if (r.getRight() == null)  {  // Não tem filho a direita
                    r = r.getLeft();
                }else{ // Tem ambos os filhos
                    
                    pai = r;
                    filho = pai.getLeft();
                    while (filho.getRight() != null){
                        pai = filho;
                        filho = filho.getRight();
                    }
                    pai.setRight(filho.getLeft());
                    r.setData(filho.getData());
                }
            }else if (valor.compareTo(r.getData()) < 0){
                r.setLeft(remove(r.getLeft(), valor));
            }else{
                r.setRight(remove (r.getRight(), valor));
            }
        }
        return r;
    }
     
    public void emOrdemRecursivo(){}
    
    public void emOrdemRepetido(){}

    public void preOrdemRecursivo(){}

    public void preOrdemRepetido(){}

}
