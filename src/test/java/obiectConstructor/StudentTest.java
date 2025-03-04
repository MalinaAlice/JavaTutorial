package obiectConstructor;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

public class StudentTest {

    @Test
    public void testMethod() {
        Student Alice = new Student("Malina", "Alice", 24, "Politehnica", 4);
        Alice.prezentareStudent();
        System.out.println();

        Student Razvan = new Student("Jude", "Razvan", 29, "IT School", 2);
        Razvan.prezentareStudent();
        System.out.println();

        Razvan.varsta = 39;
        System.out.println();
        Razvan.prezentareStudent();
        System.out.println();

        Student Alex = new Student("Alex", "Dorha", 30);
        Alex.prezentareStudent();
        Alex.varsta = 31;
        Alex.facultate = "IT School";
        Alex.an = 1;
        System.out.println();
        Alex.prezentareStudent();
    }
}
