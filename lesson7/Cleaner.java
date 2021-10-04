package lesson7;

public class Cleaner extends Staff{
	int salary;

	public Cleaner(String name, String position, int salary) {
		super(name, position);
		this.salary=salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void print() {
		System.out.print("I am "+name +" "+position);			
	}
	@Override
	public void salary() {
		System.out.println(salary);
	}

}
