package Fruits;

public class Apple extends Fruit {
    public Apple(float weight) {
        super(weight);
    }

    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("apple");
    }
}
