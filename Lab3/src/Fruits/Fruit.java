package Fruits;

public class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void showDescription() {
        System.out.print("This is a ");
    }
}
