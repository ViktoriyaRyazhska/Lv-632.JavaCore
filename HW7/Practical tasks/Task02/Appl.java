package lesson007f;

public class Appl {

	  public static void main(String[] args) {

			Person[] persons = new Person[3];
			persons[0] = new Student("SomeMan");
			persons[1] = new Teacher("Life");
			persons[2] = new Cleaner("Death");

			for (Person person : persons) {
				  person.print();

				  if (person instanceof Staff) {
						System.out.println("Salary - " + ((Staff) person).salary());
				  }
			}
	  }
}
