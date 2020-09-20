package cars;

public class Lorry extends Car {
    private double liftingCapacity;

    public Lorry(String model, String carClass, double weight, Engine engine, double liftingCapacity) {
        super(model, carClass, weight, engine);
        this.liftingCapacity = liftingCapacity;
    }

    public void start() {
        System.out.println("The truck is driving");
    }

    public void stop() {
        System.out.println("The truck has just stopped");
    }

    public void printInfo() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Car class: " + this.getCarClass());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Engine power: " + this.getEngine().getPower());
        System.out.println("Engine manufacturer: " + this.getEngine().getManufacturer());
        System.out.println("Lifting capacity: " + this.liftingCapacity);
    }
}