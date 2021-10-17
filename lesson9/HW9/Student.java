package lesson09.HW9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;

	public Student() {

	}

	public Student(String name, int course) {
		super();
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public static void printStudents(List<Student> list, int c) {
		Iterator<Student> i = list.iterator();
		while (i.hasNext()) {
			Student q = i.next();
			if (q.getCourse() == c) {
				System.out.println(q);
			}
		}
		if (c > 3) {
			System.out.println("Incorrect course number.");
		}
	}

	public static Comparator<Student> NameComperator = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};

	public static Comparator<Student> CourseComperator = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getCourse() - o2.getCourse();
		}
	};
}