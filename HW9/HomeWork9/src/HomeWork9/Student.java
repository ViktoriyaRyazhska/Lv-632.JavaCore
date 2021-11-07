package HomeWork9;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student  {
//Write class Student that provides information about the name of the student and his course. 
	
	private String name;
	private int course;
//	Class Student should consist of properties for access to these fields.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	
//constructor with parameters
	public Student() {}
	
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
		}
	
// method printStudents (List students, Integer course), which receives a list of students and the course number 
// and prints to the console the names of the students from the list, which are taught in this course (use an iterator)	
	
	@Override
	public String toString() {
		return "Student [Name =" + name + ", Course =" + course + "]";
	}
	 
	public static void printStudents(List<Student> students, Integer course) {
			ListIterator<Student> iterator = students.listIterator();
			while (iterator.hasNext()) {
				  Student stud = iterator.next();
				  if (stud.getCourse() == course) {
						System.out.println(stud);
				  }
			}
	}
// methods to compare students by name 
		public static void comparebyname(List<Student> students) {
			Collections.sort(students, new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					return s1.getName().compareTo(s2.getName());
				}
				});
			System.out.println(students);
	}
// methods to compare students by course
	

		public static void comparebycourse(List<Student> students) {
			Collections.sort(students, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
				return o1.getCourse() - o2.getCourse();
				}
				});
			System.out.println(students);
}
}	