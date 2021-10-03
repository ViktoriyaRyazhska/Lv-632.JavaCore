
public class MainAppl {
	public static void main(String[] args) {

		Employee[] workers = new Employee[4];
		workers[0] = new Employee("Sam", 23, 300);
		workers[1] = new Employee("Jack", 30, 900);
		workers[2] = new Developer("Kate", "Java Middle Developer", 23, 700, 5);
		workers[3] = new Developer("Joe", "Java Junior Developer", 19, 300, 1);

		for (int i = 0; i < workers.length; i++) {
			System.out.println(workers[i].report());
		}
	}
}
