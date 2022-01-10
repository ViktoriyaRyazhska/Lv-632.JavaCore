package lesson005b;

public class Employee {
	private String name;
	private int depNumber;
	private int salary;
	public static int numberofobjects = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepNumber() {
		return depNumber;
	}

	public void setDepNumber(int depNumber) {
		this.depNumber = depNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String name, int depNumber, int salary) {
		this.name = name;
		this.depNumber = depNumber;
		this.salary = salary;
//		Count the Number of Objects in a Class, if they are created only in Appl
		numberofobjects++;
	}

	@Override
	public String toString() {
		return name + ", Dep: " + depNumber + ", Salary: " + salary + "\n";
	}
	
//	Number of fields in the class
	public int getColumnCount() {
		return getClass().getDeclaredFields().length;
	}
	
}