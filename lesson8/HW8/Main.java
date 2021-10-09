package HW8;

import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		
		Student s1=new Student(new FullName("Petro", "Ivanov"), 20, 3);
		Student s2=new Student(new FullName("Oleg", "Zaycev"), 18, 1);
		
		List<Student> s= new ArrayList<Student>();
		s.add(s1);
		s.add(s2);
		for (Student a:s) {
			System.out.println(a.info());
			System.out.println(a.activity());
		}
		

	}

}
