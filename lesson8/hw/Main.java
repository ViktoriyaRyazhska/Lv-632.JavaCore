package lesson8.hw;

import lesson8.hw.Person.FullName;

public class Main {
	

	public static void main(String[] args) {
		//1.
		Student[] students = new Student[2];
		students[0] = new Student(new FullName("John", "Cameron"), 20, 3);
		students[1] = new Student(new FullName("Jack", "Magny"), 21, 4);
		for (Student student : students) {
			System.out.println(student.info() + ". " + student.activity());
		}
		
		//2.
		Wrapper<Integer> wrapInt = new Wrapper<Integer>(1);
		Wrapper<Boolean> wrapBool = new Wrapper<Boolean>(true);
		Wrapper<String> wrapStr = new Wrapper<String>("String");
		System.out.printf("%d, %s, %b", wrapInt.getValue(), wrapStr.getValue(), wrapBool.getValue());
	}

}
