package Task1;

import Task1.FullName;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(new FullName("Taras","Chornyi"),33, 1);
        Student student2 = new Student(new FullName("Fernando","Alonso"),40, 4);

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);

        for(Student student: students){
            System.out.println(student.info()+" | "+student.activity());
        }


    }
}
