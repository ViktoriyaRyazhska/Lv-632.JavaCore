package lesson008d.copy;

import java.util.ArrayList;
import java.util.List;

public class Appl {

	  public static void main(String[] args) {
			
			Student st1 = new Student((new Person.FullName("Johnny", "Depp")), 57, "Faculty of Arts and Sciences");
			Student st2 = new Student((new Person.FullName("Leonardo", "DiCaprio")), 42, "GSAS");
			Student st3 = new Student((new Person.FullName("Robert", "De Niro")), 62, "Faculty of Arts and Sciences");
			Student st4 = new Student((new Person.FullName("Russell", "Crowe")), 56, "GSAS");
			Student st5 = new Student((new Person.FullName("Brad", "Pitt")), 46, "Faculty of Arts and Sciences");

			List<Student> list = new ArrayList<Student>();
			list.add(st1);
			list.add(st2);
			list.add(st3);
			list.add(st4);
			list.add(st5);

			for (Student x : list) {
				  System.out.println(x.info());
				  System.out.println(x.activity());
			}
	  }

}