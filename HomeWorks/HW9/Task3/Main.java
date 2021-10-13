package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Gordon", 1));
        students.add(new Student("Mike", 2));
        students.add(new Student("Jerry", 2));
        students.add(new Student("Tom", 1));
        students.add(new Student("ГурбангулиБердимухамедов", 1));


        Student.printStudents(students, 1);
        System.out.println(Student.sortByName(students));
        System.out.println(Student.sortByCourse(students));
    }
}
