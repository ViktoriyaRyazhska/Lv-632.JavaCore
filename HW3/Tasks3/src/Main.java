//In the method main() create 3 objects of Employee type. Input information about them. 
//Display the total salary of all workers to screen

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Svetlana");
		employee1.setRate(5);
		employee1.setHours(10);
		employee1.getSalary(); 
		employee1.getBonuses();
		employee1.totalSum();
		System.out.println("Name of employee "+employee1);
	
		
		Employee employee2 = new Employee("Vera");
		employee2.setRate(15);
		employee2.setHours(100);
		employee2.getSalary(); 
		employee2.getBonuses();	
		employee2.totalSum();
		System.out.println("Name of employee "+employee2);
		
		Employee employee3 = new Employee("Ruslan");
		employee3.setRate(8);
		employee3.setHours(5);
		employee3.getSalary(); 
		employee3.getBonuses();
		employee3.totalSum();
		System.out.println("Name of employee "+employee3);
		
		employee3.changeRate(5);
		System.out.println("Change rate of employee "+employee3);
		}
	}


