package lesson9.hw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	
	private String name;
	private int course;
	
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
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
	
	public static void printStudent(List<Student> students, int course) {
		Iterator<Student> it = students.iterator();
		Student stud;
		while (it.hasNext()) {
			stud = it.next();
			if (stud.course == course) {
				System.out.println(stud);
			}
		}
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s, Course: %d", name, course);
	}
	
	public static class CompareByName implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);
		}
		
	}
	
	public static class CompareByCourse implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.course - o2.course;
		}
	
	}
	
}
