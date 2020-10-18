package Collections.MyLinkedList;

public class ListNode {
    private Object element;
    private ListNode next;

    public ListNode(Object element, ListNode next) {
        this.element = element;
        this.next = next;
    }

    public ListNode getNext() {
        return this.next;
    }

    public void setNext(ListNode node) {
        this.next = node;
    }

    public Object getElement() {
        return this.element;
    }
}
