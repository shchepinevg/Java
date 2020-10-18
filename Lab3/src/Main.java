import Collections.MyArrayList.MyArrayList;
import Collections.MyLinkedList.MyLinkedList;

public class Main {

    public static void main(String[] args) {
        // MyLinkedList
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.add("Hello");
        list.add("World");
        list.add("!!!");
        list.remove(1);
        System.out.println(list.getElement(1));

        System.out.println();

        // MyArrayList
        MyArrayList<String> array = new MyArrayList<String >();
        array.add("This");
        array.add("is");
        array.add("the code");
        array.remove(1);
        System.out.println(array.getElement(1));
    }
}
