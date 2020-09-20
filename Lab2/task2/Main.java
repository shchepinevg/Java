import animals.Animal;
import animals.Dog;
import animals.Cat;
import animals.Horse;
import animals.Veterinarian;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog( "dog food", "a booth", "doberman"), new Cat("cat food", "a tree", "green"), new Horse("horse food", "a paddock", true) };
        
        Veterinarian veterinarian = new Veterinarian();

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
            System.out.println();
        }
    }
}

