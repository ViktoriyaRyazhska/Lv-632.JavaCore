package HW7;

public class ContractEmployee extends Employee{ //implements Comparable<ContractEmployee>{
String federalTaxIdmember;
int salary;


	public ContractEmployee(String employeeId, String federalTaxIdmember, int salary) {
		super(employeeId, salary);
		this.salary=salary;
		this.federalTaxIdmember=federalTaxIdmember;
	}

	@Override
	public void calculatePay() {
		System.out.println(employeeId+", social number "+federalTaxIdmember+", salary "+salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", salary=" + salary + ", employeeId="
				+ employeeId + "]";
	}


	
	
}
