package Operation;

import Assets.Students.Aspirant;
import Assets.Students.Student;

public class ExecuteStudents {
    public void PerformProcess() {
        Student s1 = new Student("Petr", "Petrov", "M101010", 4.86);
        Student s2 = new Student("Vasily", "Vasilev", "B1034", 5.0);
        Student s3 = new Student("Maksim", "Kovalev", "M101010", 4.99);
        Student a1 = new Aspirant("Alex", "Belkov", "B121212", 5.0, "Complex software solutions");
        Student a2 = new Aspirant("Ilya", "Ermakov", "B121212", 3.9, "Aircraft development");

        Student[] students = { s1, s2, s3, a1, a2 };

        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + ", ");
            System.out.println("scholarship: " + student.getScholarship());
            System.out.println();
        }
    }
}
