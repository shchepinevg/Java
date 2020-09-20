package cars;

public class Engine {
    private double power;
    private String manufacturer;

    public Engine(double power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public double getPower() {
        return this.power;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }
}