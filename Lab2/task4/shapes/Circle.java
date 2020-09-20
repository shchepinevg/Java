package shapes;

public class Circle implements Shape {
    public double square() {
        double r = 5.0;
        double s = Math.PI * r*r;
        return s;
    }
}