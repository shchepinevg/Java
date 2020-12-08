package Collections.MyLinkedList;

public class Node {
    private Object element;
    private Node next;

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Object getElement() {
        return this.element;
    }
}
