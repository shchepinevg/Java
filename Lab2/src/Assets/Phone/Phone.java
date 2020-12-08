package Assets.Phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return this.number;
    }

    public String getModel() {
        return this.model;
    }

    public double getWeight() {
        return this.weight;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " is calling, number: " + number);
    }

    public void sendMessage(String...numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
