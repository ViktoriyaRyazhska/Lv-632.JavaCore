
public class Employee {

	private String name;
	private int rate;
	private int hours;
	private static long totalSum;

	Employee() {
	}

	public Employee(String name) {
		
		this.name = name;
	}

	public Employee(String name, int rate) {
		
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, int hours) {
		
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	};

	public int getSalary() {
		System.out.print("Salary  = ");
		return hours * rate;
		
	}

	@Override
	public String toString() {
		return "Employee [Name=" + name + ", Rate=" + rate + ", Hours=" + hours + "]";
	}
	
	public int changeRate(int rate) {
		this.rate = rate;
		return this.rate;
		
	}
	
	public double getBonus() {
		return getSalary()*1.1;	
	}
}
