package lesson7.hw;

public class SalariedEmployee extends Employee {
	
	private String socialSecurityNumber;
	private int fixedPayment;

	public SalariedEmployee(String employeeId, String socialSecurityNumber, int fixedPayment) {
		super(employeeId);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedPayment = fixedPayment;
	}
	public SalariedEmployee() {
		super();
	}
			
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public void setFixedPayment(int fixedPayment) {
		this.fixedPayment = fixedPayment;
	}
	
	@Override
	public int calculatePay() {
		return fixedPayment;
	}
	
	@Override
	public String toString() {
		return "Name: " + getEmployeeId() + ", Social Security Number: " + 
				socialSecurityNumber + ", Wage: " + calculatePay();
	}

}
