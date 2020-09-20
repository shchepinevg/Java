package cars;

public class SportCar extends Car {
    private double topSpeed;

    public SportCar(String model, String carClass, double weight, Engine engine, double topSpeed) {
        super(model, carClass, weight, engine);
        this.topSpeed = topSpeed;
    }

    public void start() {
        System.out.println("The sport car is driving");
    }

    public void stop() {
        System.out.println("The sport car just stopped");
    }

    public void printInfo() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Car class: " + this.getCarClass());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Engine power: " + this.getEngine().getPower());
        System.out.println("Engine manufacturer: " + this.getEngine().getManufacturer());
        System.out.println("Top speed: " + this.topSpeed);
    }
}