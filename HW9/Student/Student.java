import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

public class Student {
	private String name;
	private int course;

	public Student() {
	}

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

	public static void printStudents(ArrayList<Student> students, Integer course) {
		ListIterator<Student> iterator = students.listIterator();
		while (iterator.hasNext()) {
			if (iterator.next().getCourse() == course) {
				System.out.println(iterator.next());
			}
		}
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Course=" + course;
	}

	public static class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student a, Student b) {
			return a.getName().compareTo(b.getName());
		}
	}
	public static class CourseComparator implements Comparator<Student> {

			@Override
			public int compare(Student a, Student b) {
				return a.getCourse() - b.getCourse();
			}

		}
	

}
