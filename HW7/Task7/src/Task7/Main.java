package Task7;

public class Main {

	public static void main(String[] args) {
		
		Person [] person = new Person [5];
		person [0] = new Student ("Sveta");
		person [1] = new Student ("Vera");
		person [2] = new Teacher ("Viktor", 5000);
		person [3] = new Cleaner ("Tolia",2000);
		person [4] = new Teacher ("Djon",2000);
		
		
		for (int i = 0; i < person.length; i++) {
			person[i].print();
			System.out.println();
		}

		for (int i=0;i<person.length;i++) {
			if (person[i] instanceof Staff) {
				System.out.print("" + (Staff)person[i]);
				System.out.println();
			}
		}
	}
	
}	