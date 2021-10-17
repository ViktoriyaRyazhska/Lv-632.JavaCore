package HomeWork7;

public class ContractEmployee extends Employee implements Payment {
	public int fixed_month;
	public int salary;
	public int federalTaxIdmember;
		
	public int getFixed_month() {
		return fixed_month;
	}
	public void setFixed_month(int fixed_month) {
		this.fixed_month = fixed_month;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
	public ContractEmployee () {}
	
	public ContractEmployee (String employeeld, int fixed_month) {
		super(employeeld);
		this.fixed_month = fixed_month;
	}
	
	public ContractEmployee(String employeeld, int fixed_month, int federalTaxIdmember ) {
		super(employeeld);
		this.fixed_month = fixed_month;
		this.federalTaxIdmember = federalTaxIdmember;
	}
		
	@Override
	public Integer calculatePay() {
		return  fixed_month; 
		
	}
	@Override
	public String toString() {
		return  "ID "+ this.getFederalTaxIdmember() + " Name " + this.getEmployeeld()  + " Salary " + calculatePay();
	}
}