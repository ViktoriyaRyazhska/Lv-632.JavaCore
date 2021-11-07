package HomeWork9;

import java.util.ArrayList;
import java.util.List;

public class Main {
	//In the main() method 
	public static void main(String[] args) {
		
		//declare List students and add to the list five different students

		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Svetlana",1));
		students.add(new Student("Tania",1));
		students.add(new Student("Djon",2));
		students.add(new Student("Kolia",2));
		students.add(new Student("Denis",3));
		students.add(new Student("Alla",1));
		
		System.out.println("First course consist of: ");
		Student.printStudents(students, 1);
		System.out.println("\nSecond course consist of: ");
		Student.printStudents(students, 2);
		System.out.println("\nThird course consist of: ");
		Student.printStudents(students, 3);
		

		//display the list of students ordered by name.
		System.out.println("\nThe list of students ordered by name: ");
		Student.comparebyname(students);
		//display the list of students ordered by course.
		System.out.println("\nThe list of students ordered by course: ");
		Student.comparebycourse(students);

	}
}