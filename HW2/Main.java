package main_package;

public class Main {
	
	public static void main(String[] args) {
		Employee first_worker = new Employee();
		Employee second_worker = new Employee();
		first_worker.setName("Taras");
		first_worker.setRate(3);
		first_worker.setHours(12);
		first_worker.getSalary();
		first_worker.getBounuses();
		second_worker.setName("Oleh");
		second_worker.setRate(1);
		second_worker.setHours(4);
		second_worker.getSalary();
		second_worker.getBounuses();

		System.out.println(first_worker);
		System.out.println(second_worker);
		System.out.println(Employee.getTotalSum());
		
		
		
		
		
	}
}
