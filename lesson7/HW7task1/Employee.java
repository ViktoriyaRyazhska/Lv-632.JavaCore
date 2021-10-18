package HW7;

public class Employee implements Payment {
	
	String employeeId;
	public int salary;
	public Employee(String employeeId) {
		this.employeeId=employeeId;
	}

	@Override
	public int calculatePay() {
		return salary;
		
	}

	
	

	
	

}
