import cars.*;

public class Main {
    public static void main(String[] args) {
        Engine engineForLorry = new Engine(100.0, "Mercedes-benz");
        Engine engineForSportCar = new Engine(150.3, "Ferrari");

        Lorry lorry = new Lorry("Atego", "J", 10000, engineForLorry, 50000);
        SportCar sportCar = new SportCar("488", "F", 3000, engineForSportCar, 230);

        lorry.start();
        lorry.printInfo();
        lorry.stop();

        System.out.println();

        sportCar.start();
        sportCar.printInfo();
        sportCar.stop();
    }
}

