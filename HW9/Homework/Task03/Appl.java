package lesson009m;

import java.util.ArrayList;
import java.util.List;

public class Appl {

	  public static void main(String[] args) {

			List<Student> studs = new ArrayList<>();
			studs.add(new Student("Ashley Robertson", 1));
			studs.add(new Student("Marvin Richardson", 2));
			studs.add(new Student("Steven Curtis", 2));
			studs.add(new Student("Justin Sanchez", 2));
			studs.add(new Student("Doris Kelley", 1));
			studs.add(new Student("Harold Cooper", 2));
			studs.add(new Student("Debra Williams", 1));
			studs.add(new Student("Joyce Lawrence", 2));
			studs.add(new Student("Anthony Potter", 2));
			studs.add(new Student("Carmen Hawkins", 1));

			System.out.println("Students are First course: ");
			Student.printStuds(studs, 1);
			System.out.println("\nStudents are Second course: ");
			Student.printStuds(studs, 2);
			
			System.out.println("\nComparator to sort by course: ");
			Student.sortByCourse(studs);			

			System.out.println("\nComparator to sort by name: ");
			Student.sortByName(studs);		        
	  }

}
