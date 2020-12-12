import Collections.MyArrayList.MyArrayList;
import Fruits.Apple;
import Fruits.Fruit;
import Fruits.Orange;
import Objects.Box;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple(1.2f);
        Orange orange = new Orange(1.5f);

        MyArrayList<Fruit> apples = new MyArrayList<Fruit>();
        MyArrayList<Fruit> oranges = new MyArrayList<Fruit>();

        for (int i = 0; i < 5; i++)
            apples.add(apple);

        for (int i = 0; i < 3; i++)
            oranges.add(orange);

        Box box1 = new Box(apples);
        Box box2 = new Box(oranges);

        if (box1.compare(box2))
            System.out.println("Boxes are the same weight");
        else
            System.out.println("Boxes are the different weight");

        box1.pour(box2);
        box2.clearBox();
        box1.pour(box2);
        System.out.println(box1.getWeight());
        box2.getFruits().get(0).showDescription();
    }
}
