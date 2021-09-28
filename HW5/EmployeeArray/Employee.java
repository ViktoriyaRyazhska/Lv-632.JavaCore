
public class Employee {
	private String name;
	private int department;
	private int salary;
	
	
	
	public Employee() {}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, int department) {
		this.name = name;
		this.department = department;
	}

	public Employee(String name, int department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
}
