package Collections.MyLinkedList;

public class MyLinkedList<T> {
    private ListNode header = null;

    private int countOfElem = 0;

    private ListNode findLastElem() {
        ListNode temp = header;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        return temp;
    }

    public void add(T element) {
        if (countOfElem == 0) {
            header = new ListNode(element, null);
        } else {
            ListNode node = new ListNode(element, null);
            ListNode lastNode = this.findLastElem();
            lastNode.setNext(node);
        }
        countOfElem++;
    }

    public void remove(int index) {
        if (index < 0 && index > countOfElem - 1) {
            System.out.println("No such element exists");
            return;
        }

        if (index == 0) {
            header = header.getNext();
        } else {
            ListNode current = header;
            ListNode prev = header;

            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            for (int i = 0; i < index - 1; i++) {
                prev = prev.getNext();
            }

            prev.setNext(current.getNext());
            current.setNext(null);
        }
        countOfElem--;
    }

    public T getElement(int index) {
        if (index > -1 && index < countOfElem) {
            ListNode current = header;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return (T)current.getElement();
        } else {
            return null;
        }
    }
}
