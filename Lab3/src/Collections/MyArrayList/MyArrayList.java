package Collections.MyArrayList;

public class MyArrayList<T> {
    private Object[] array;
    private int countOfElem = 0;

    public int size() {
        return countOfElem;
    }

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
        if (index < 0 || index > countOfElem - 1) {
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

    public void remove(T elem) {
        if (countOfElem < 1) {
            System.out.println("No such element exists");
            return;
        }

        int countElemForDel = 0;
        for (int i = 0; i < countOfElem; i++) {
            if (array[i] == elem)
                countElemForDel++;
        }

        Object[] newArray = new Object[countOfElem - countElemForDel];
        int k = 0;
        for (int i = 0; i < countOfElem; i++) {
            if (array[i] != elem) {
                newArray[k] = array[i];
                k++;
            }
        }

        array = newArray;
        countOfElem -= countElemForDel;
    }

    public T get(int index) {
        if (index > -1 && index < countOfElem) {
            return (T)array[index];
        } else {
            return null;
        }
    }

    public void clear() {
        for (int i = 0; i < countOfElem; i++) {
            this.remove(0);
        }

        countOfElem = 0;
    }
}