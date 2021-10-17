package HomeWork7;

public class Employee  implements Payment, Comparable <Employee> {
	private String employeeld;
	
	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public Employee() {	}
	
	public Employee(String employeeld) {
		this.employeeld = employeeld;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeld=" + employeeld + "]";
	}

	
	@Override
	public Integer calculatePay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Employee o) {
	return calculatePay().compareTo(((Employee)o).calculatePay());
	}
}