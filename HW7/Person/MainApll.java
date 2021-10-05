

public class MainApll {
	public static void main(String[] args) {

		Person[] somePerson = new Person[3];
		somePerson[0] = new Student("Jack");
		somePerson[1] = new Teacher("Kate");
		somePerson[2] = new Cleaner("Mark");
						
		for (int i = 0; i < somePerson.length; i++) {
			somePerson[i].print();
			if(somePerson[i] instanceof Staff) {
				System.out.println("Salary - "+((Staff)somePerson[i]).salary());
			}
		}
		
	}
}
