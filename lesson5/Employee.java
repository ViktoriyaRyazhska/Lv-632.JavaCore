package lesson5;

public class Employee {

	private String name;
	public int depNumber;
	public int salary;
	public Employee(String name, int depNumber, int salary) {
		super();
		this.name = name;
		this.depNumber = depNumber;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name +", depNumber=" + depNumber + ", salary=" + salary +"]";
	}
	public int getDepNumber() {
		return depNumber;
	}
	public void setDepNumber(int depNumber) {
		this.depNumber = depNumber;
	}
	public int getSalary() {
		this.salary=salary;
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	
}
