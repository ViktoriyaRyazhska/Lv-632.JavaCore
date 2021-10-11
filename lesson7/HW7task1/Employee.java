package HW7;

public class Employee implements Payment {
	
	String employeeId;
	public int salary;
	public Employee(String employeeId, int salary) {
		this.employeeId=employeeId;
	}

	@Override
	public void calculatePay() {
		
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

//	@Override
//	public int compareTo(Employee o) {
//		int result=this.salary.copmareTo(o.salary);
//		return result;
	

	
	

}
