package lesson9.HW9.task3;

import lesson9.HW9.task3.model.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AppHW9Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Student> students = new ArrayList<>();
        Student student = new Student("Den", 101);
        Student student2 = new Student("Sofy", 102);
        Student student3 = new Student("Kris", 102);
        Student student4 = new Student("Alex", 102);
        Student student5 = new Student("Max", 101);
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.sort(Comparator.comparing(Student::getCourse));
        students.forEach(x ->
                System.out.println("Student name: " + x.getFistName() +
                        ", course: " + x.getCourse()));

        System.out.println("Enter course: ");
        int course = Integer.valueOf(bufferedReader.readLine());

        printStudentsOfCourse(students, course);
    }

    public static void printStudentsOfCourse(List<Student> students, Integer course) {
        students.stream()
                .sorted(Comparator.comparing(Student::getFistName))
                .filter(x -> x.getCourse() == course)
                .forEach(x -> System.out.println("Student name: " + x.getFistName() +
                        ", course: " + x.getCourse()));
    }
}