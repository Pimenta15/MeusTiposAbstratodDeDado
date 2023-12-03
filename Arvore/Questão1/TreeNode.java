package Arvore.Questão1;

public class TreeNode<T extends Comparable<T>>{

    private TreeNode<T> left;
    private TreeNode<T> right;
    private T data;
   
    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }
    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }
    public TreeNode<T> getRight() {
        return right;
    }
    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

     void InserirNodeRecursivo(T valor){
        if (valor.compareTo(this.getData()) == 0) {
            System.out.println("Produto Repitido");
        }
        else if (valor.compareTo(this.getData())< 0){
            if (this.getLeft() == null) {
                this.setLeft(new TreeNode<T>(valor));

            }else{
                this.getLeft().InserirNodeRecursivo(valor);
            }
        }else{
             if (this.getRight() == null) {
                this.setRight(new TreeNode<T>(valor));

            }else{
                this.getRight().InserirNodeRecursivo(valor);
            }
        }
    }

    TreeNode<T> buscarNode(T valor){
        if (valor.compareTo(this.getData())== 0) {
            return this;

        }else if(valor.compareTo(this.getData())<0){
            if (this.getLeft() == null) {
                return null;

            }else {
                return this.getLeft().buscarNode(valor);

            }
        }else{
             if (this.getRight() == null) {
                return null;

            }else {
                return this.getRight().buscarNode(valor);
                
            }
        }
    }
    }

