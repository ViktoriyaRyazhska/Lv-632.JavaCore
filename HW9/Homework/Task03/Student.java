package lesson009m;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student {
	  private String nameS;
	  private int courseS;

	  public String getNameS() {
			return nameS;
	  }

	  public void setNameS(String nameS) {
			this.nameS = nameS;
	  }

	  public int getCourseS() {
			return courseS;
	  }

	  public void setCourseS(int courseS) {
			this.courseS = courseS;
	  }

	  public Student(String nameS, int courseS) {
			this.nameS = nameS;
			this.courseS = courseS;
	  }

	  public static void printStuds(List<Student> studs, Integer courseS) {
			ListIterator<Student> iterator = studs.listIterator();
			while (iterator.hasNext()) {
				  Student st = iterator.next();
				  if (st.getCourseS() == courseS) {
						System.out.print(st);
				  }
			}
	  }

	  public static void sortByCourse(List<Student> studs) {
			Collections.sort(studs, new Comparator<Student>() {
				  @Override
				  public int compare(Student o1, Student o2) {
						return o1.getCourseS() - o2.getCourseS();
				  }
			});
			System.out.print(studs);
	  }

	  public static void sortByName(List<Student> studs) {
			Collections.sort(studs, new Comparator<Student>() {
				  @Override
				  public int compare(Student s1, Student s2) {
						return s1.getNameS().compareTo(s2.getNameS());
				  }
			});
			System.out.println(studs);
	  }

	  @Override
	  public String toString() {
			return "Student => Name: " + getNameS() + ", Course: " + getCourseS() + ".\n";
	  }

}