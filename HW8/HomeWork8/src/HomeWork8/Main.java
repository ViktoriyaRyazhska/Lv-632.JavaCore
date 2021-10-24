package HomeWork8;

public class Main {

	public static void main(String[] args) {
//	In the main(...) method, create two instances of the Student class and output information about them 
//		by calling the appropriate methods info() and activity().

		Student sv = new Student(new FullName("Svetlana", "Telepun"), 38, 1);
		sv.info();
		sv.activity();
		Student sv1 = new Student(new FullName("Anna", "Zakrevskiy"), 38, 2);
		sv1.info();
		sv1.activity();
	}
}