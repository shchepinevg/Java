package Fruits;

public class Orange extends Fruit {
    public Orange(float weight) {
        super(weight);
    }

    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("orange");
    }
}
