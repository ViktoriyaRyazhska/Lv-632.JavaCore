import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Ivan Petrov",1));
		students.add(new Student("Maria Ivanova",2));
		students.add(new Student("Evgenij Lobanov",3));
		students.add(new Student("Petr Kiva",5));
		students.add(new Student("Aleksandr Serv",5));
		students.add(new Student("Ruslan Krasnow",4));
		
		System.out.println(students);
		
		Student.CourseComparator byCourse = new Student.CourseComparator();
		students.sort(byCourse);
		System.out.println(students);
		Student.NameComparator byName = new Student.NameComparator();
		students.sort(byName);
		System.out.println(students);	
		
	

	}
}
