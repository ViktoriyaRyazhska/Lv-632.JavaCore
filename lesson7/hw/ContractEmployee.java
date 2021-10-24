package lesson7.hw;

public class ContractEmployee extends Employee {
	
	private String federalTaxIdNumber;
	private int rate;
	private int hours;
	
	public ContractEmployee(String employeeId, String federalTaxIdMember, int rate, int hours) {
		super(employeeId);
		this.federalTaxIdNumber = federalTaxIdMember;
		this.rate = rate;
		this.hours = hours;
	}
	public ContractEmployee() {
		super();
	}

	public String getFederalTaxIdMember() {
		return federalTaxIdNumber;
	}
	public void setFederalTaxIdMember(String federalTaxIdMember) {
		this.federalTaxIdNumber = federalTaxIdMember;
	}	
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public int calculatePay() {
		return rate * hours;
	}
	
	@Override
	public String toString() {
		return "Name: " + getEmployeeId() + ", Federal Tax ID number: " + 
				federalTaxIdNumber + ", Wage: " + calculatePay();
	}

}
