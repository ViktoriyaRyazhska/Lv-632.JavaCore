import java.util.Arrays;

public class MainAppl {
	public static void main(String[] args) {
		Employee[] workers = new Employee[4];
		workers[0] = new SalariedEmployee("Vasja", 1331, "24-21-11", 20, 40);
		workers[1] = new SalariedEmployee("Katerina", 1212, "12-21-10", 17, 45);
		workers[2] = new ContractEmployee("Anna", 1010, "299736", 1100);
		workers[3] = new ContractEmployee("Marina", 2015, "283921", 1000);

		for (int i = 0; i < workers.length; i++) {
			System.out.println(workers[i].toString());
		}
		System.out.println("Array after sort of salary");

		Arrays.sort(workers);

		for (int i = 0; i < workers.length; i++) {
			System.out.println(workers[i].toString());
		}
	}
}
