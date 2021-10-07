package lesson8.HW8.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppTask1 {
    public static void main(String[] args) {
        FullName fullName1 = new FullName();
        fullName1.setFirstName("Alex");
        fullName1.setLastName("Sh");

        Student student1 = new Student(new FullName("Den","Sh"), 38, 102);
        Student student2 = new Student(fullName1, 35, 101);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        students.sort(Comparator.comparing(Student::getCourse));
        students.forEach(student -> System.out.println(student.info() + ", " + student.activity()));
    }
}