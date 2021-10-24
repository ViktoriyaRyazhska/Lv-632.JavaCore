package lesson008d.copy;


public class Appl {

	  public static void main(String[] args) {
			
			Student st1 = new Student(58, 5);
			Student.FullName stfn1 = st1.new FullName("Johnny", "Depp");
			System.out.println(stfn1.info());
			System.out.println(st1.info());
			st1.activity();
		
			Student st2 = new Student(46, 1);
			Student.FullName stfn2 = st2.new FullName("Leonardo", "DiCaprio");
			System.out.println(stfn2.info());
			System.out.println(st2.info());
			st2.activity();

			Student st5 = new Student(57, 3);
			Student.FullName stfn5 = st5.new FullName("Brad", "Pitt");
			System.out.println(stfn5.info());
			System.out.println(st5.info());
			st5.activity();
			
	  }

}