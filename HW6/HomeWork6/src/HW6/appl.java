package HW6;

public class appl {

	public static void main(String[] args) {
		
		Employee first = new Employee ("Svetlana", 32, 20000.0);
		first.report();
		System.out.println();
		Developer second = new Developer ("Taras", 32,32735.35,"Average Java developer");
		second.report();
	}
}