import shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();

        for (Shape sh : shapes) {
            System.out.println("The area of the figure is " + sh.square());
        }
    }
}

