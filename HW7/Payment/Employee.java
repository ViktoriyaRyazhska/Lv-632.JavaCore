
public class Employee implements Payment, Comparable <Employee> {
	private String name;
	private int EmployeeID;

	public Employee() {
	}

	public Employee(String name, int employeeID) {
		this.name = name;
		EmployeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	@Override
	public int compareTo(Employee o) {
		return (int)(o.calculatePay() - this.calculatePay());
	}

	@Override
	public double calculatePay() {
		return 0;
	}

}
