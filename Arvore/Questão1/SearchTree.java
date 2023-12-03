package Arvore.Questão1;

public class SearchTree<T extends Comparable<T>> {
    
    private TreeNode<T> root;

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public void InserirRecursivo(T valor){
        if (root == null) {
            root = new TreeNode<T>(valor);
        }else{
            root.InserirNodeRecursivo(valor);
        }
    }

    public void emOrdem(){
        if (this.root == null) {
            System.out.println("Vazia!");
        }else{
            this.percorrerEmOrdemRecursivo(root);
        }

    }
    private void percorrerEmOrdemRecursivo(TreeNode<T> r){
        if (r != null) {
            percorrerEmOrdemRecursivo(r.getLeft());
            System.out.println(r.getData());
            percorrerEmOrdemRecursivo(r.getRight());
        }
    }

    public TreeNode<T> busca(T valor){
        if (root == null) {
            return null;
        }else{
            return root.buscarNode(valor);  
        }
    }

    public void exibir(T valor){
        System.out.println(busca(valor));
    }
}
