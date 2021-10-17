package lesson09.HW9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class mainStudent {

	public static void main(String[] args) {
		List<Student> stud = new ArrayList<>();
		stud.add(new Student("Igor", 1));
		stud.add(new Student("Iryna", 1));
		stud.add(new Student("Anatoliy", 2));
		stud.add(new Student("Oleg", 3));
		stud.add(new Student("Oleksandr", 2));

		System.out.println("------NameSorting-------");
		Collections.sort(stud, Student.NameComperator);
		for (Student a : stud) {
			System.out.println(a);
		}
		System.out.println("------CourseSorting-------");
		Collections.sort(stud, Student.CourseComperator);
		for (Student a : stud) {
			System.out.println(a);
		}
		System.out.println("------printStudents-------");
		System.out.println("Enter number of course...");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Student.printStudents(stud, n);
	}
}
