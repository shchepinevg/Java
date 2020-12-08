package Objects;

import Collections.MyArrayList.MyArrayList;
import Fruits.Fruit;

public class Box {
    private MyArrayList<Fruit> fruits;

    public Box(MyArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    public MyArrayList<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(MyArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    public float getWeight() {
        if (fruits.size() == 0)
            return 0;

        return fruits.size() * fruits.get(0).getWeight();
    }

    public void clearBox() {
        this.getFruits().clear();
    }

    public boolean compare(Box box) {
        if (this.getWeight() == box.getWeight())
            return true;
        else
            return false;
    }

    public void pour(Box box) {
        if (box.getWeight() != 0) {
            System.out.println("The box is not empty");
            return;
        }

        MyArrayList<Fruit> newFruits = new MyArrayList<Fruit>();

        for (int i = 0; i < fruits.size(); i++) {
            newFruits.add(fruits.get(i));
        }

        box.setFruits(newFruits);
        this.clearBox();
    }
}
