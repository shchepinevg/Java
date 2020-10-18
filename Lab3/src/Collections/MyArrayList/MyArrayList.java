package Collections.MyArrayList;

import Collections.MyLinkedList.ListNode;

public class MyArrayList<T> {
    private Object[] array;
    private int countOfElem = 0;

    public void add(T element) {
        Object[] newArray = new Object[countOfElem + 1];
        for (int i = 0; i < countOfElem; i++) {
            newArray[i] = array[i];
        }
        newArray[countOfElem] = element;
        array = newArray;
        countOfElem++;
    }

    public void remove(int index) {
        if (index < 0 && index > countOfElem - 1) {
            System.out.println("No such element exists");
            return;
        }

        Object[] newArray = new Object[countOfElem - 1];
        int k = 0;
        for (int i = 0; i < countOfElem; i++) {
            if (i != index) {
                newArray[k] = array[i];
                k++;
            }
        }
        array = newArray;
        countOfElem--;
    }

    public T getElement(int index) {
        if (index > -1 && index < countOfElem) {
            return (T)array[index];
        } else {
            return null;
        }
    }
}
