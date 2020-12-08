package Collections.MyLinkedList;

public class MyLinkedList<T> {
    private Node header = null;

    private int countOfElem = 0;

    private Node findLastElem() {
        Node temp = header;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        return temp;
    }

    public void add(T element) {
        if (countOfElem == 0) {
            header = new Node(element, null);
        } else {
            Node node = new Node(element, null);
            Node lastNode = this.findLastElem();
            lastNode.setNext(node);
        }
        countOfElem++;
    }

/*    public void remove(int index) {
        if (index < 0 && index > countOfElem - 1) {
            System.out.println("No such element exists");
            return;
        }

        if (index == 0) {
            header = header.getNext();
        } else {
            Node current = header;
            Node prev = header;

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
    }*/

    public void remove(T elem) {
        if (countOfElem < 1) {
            System.out.println("No such element exists");
            return;
        }

        int countElemForDel = 0;
        Node temp = header;
        for (int i = 0; i < countOfElem; i++) {
            if (temp.getElement() == elem)
                countElemForDel++;
            temp = temp.getNext();
        }

        for (int i = 0; i < countElemForDel; i++) {
            Node current = header;
            Node prev = header;

            if (header.getElement() == elem) {
                header = header.getNext();
                continue;
            }

            while (current.getElement() != elem)
                current = current.getNext();

            while (prev.getNext().getElement() != elem)
                prev = prev.getNext();

            prev.setNext(current.getNext());
            current.setNext(null);
        }

        countOfElem -= countElemForDel;
    }

    public T get(int index) {
        if (index > -1 && index < countOfElem) {
            Node current = header;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return (T)current.getElement();
        } else {
            return null;
        }
    }

    public void clear() {
        header = null;
    }
}
