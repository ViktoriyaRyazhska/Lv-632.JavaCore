package lesson7.hw;

public abstract class Employee implements Payment, Comparable<Employee> {
	
	private String employeeId;

	public Employee(String employeeId) {
		this.employeeId = employeeId;
	}

	public Employee() {}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public int compareTo(Employee o) {
		return o.calculatePay() - this.calculatePay();
	}

}
