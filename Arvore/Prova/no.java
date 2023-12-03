package Arvore.Prova;


public class no<T extends Comparable<T>> {
    private no<T> left;
    private no<T> right;
    private T data;
   
    public no(T data) {
        this.data = data;
    }

    public no<T> getLeft() {
        return left;
    }
    public void setLeft(no<T> left) {
        this.left = left;
    }
    public no<T> getRight() {
        return right;
    }
    public void setRight(no<T> right) {
        this.right = right;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    void InserirNoRecursivo(T valor){
        if (valor.compareTo(this.getData()) == 0) {
            System.out.println("Produto Repitido");
        }
        else if (valor.compareTo(this.getData())< 0){
            if (this.getLeft() == null) {
                this.setLeft(new no<T>(valor));

            }else{
                this.getLeft().InserirNoRecursivo(valor); // recursão
            }
        }else{
             if (this.getRight() == null) {
                this.setRight(new no<T>(valor));

            }else{
                this.getRight().InserirNoRecursivo(valor); // recursão
            }
        }
    }

    no<T> buscarNo(T valor){
        if (valor.compareTo(this.getData())== 0) {
            return this;

        }else if(valor.compareTo(this.getData())<0){
            if (this.getLeft() == null) {
                return null;

            }else {
                return this.getLeft().buscarNo(valor);

            }
        }else{
             if (this.getRight() == null) {
                return null;

            }else {
                return this.getRight().buscarNo(valor);
                
            }
        }
    }
}
