package main_package;

public class Employee{
	private String name;
	private int rate;
	private int hours;
	private double with_bonus ;
	private static int totalSum;
	private int salary;
	
	public Employee() {}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}
	

	public double getWith_bonus() {
		return with_bonus;
	}

	public void setWith_bonus(double with_bonus) {
		this.with_bonus = with_bonus;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public static   int getTotalSum() {
		
		return totalSum;
	}

	public static void setTotalSum(int totalSum) {
		Employee.totalSum = totalSum;
	}
	
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	

	public int getSalary() {
		salary = rate * hours;
		totalSum = salary;
		return this.salary;
	}
	public double getBounuses() {
		with_bonus = salary * 1.1;
		return this.with_bonus;
	}
	
	public static int getTotal() {
		double static a = this.salary
		return salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours +", salary=" + salary +"]";
	}
	

	 public int changeRate(int rate) {
		 this.rate = rate;
		 salary = rate * hours;
		 return rate; 
	 }
	
	

	
	
	
	
	
	
	
}