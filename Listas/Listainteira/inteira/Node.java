public class Node {
    private Node next;
    private Integer value;

    public Node(Integer value){
        this.next = null;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }
}
