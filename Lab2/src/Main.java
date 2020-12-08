import Operation.ExecuteAnimals;
import Operation.ExecutePhone;
import Operation.ExecuteStudents;

public class Main {
    public static void main(String[] args) {
        new ExecutePhone().PerformProcess();
        System.out.println("\n-------------------------------------");
        new ExecuteAnimals().PerformProcess();
        System.out.println("\n-------------------------------------");
        new ExecuteStudents().PerformProcess();
    }
}