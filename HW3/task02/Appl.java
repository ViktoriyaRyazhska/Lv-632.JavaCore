package lesson003c;

public class Appl {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Anna");
		s.setRait(10);
		Student s2 = new Student("Ivan");
		s2.setRait(8);
		Student s3 = new Student("Olga", 7);
		s3.setRait(10);

		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s3.betterStudent(s2));
		System.out.println(Student.getavgRating());
	}
}
