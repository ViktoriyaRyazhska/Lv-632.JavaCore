
public class ContractEmployee extends Employee {
	
	private String federalTaxIDMember;
	public double fixedMonthlyPayment;
		
	
	
	public ContractEmployee(String name,int employeeID, String federalTaxIDMember, double fixedMonthlyPayment) {
		super(name,employeeID);
		this.federalTaxIDMember = federalTaxIDMember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}



	public String getFederalTaxIDMember() {
		return federalTaxIDMember;
	}



	public void setFederalTaxIDMember(String federalTaxIDMember) {
		this.federalTaxIDMember = federalTaxIDMember;
	}



	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}



	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}



	@Override
	public double calculatePay() {
		return fixedMonthlyPayment;

		
	}



	@Override
	public String toString() {
		return "ContractEmployee - "+super.getName()+" EmployeeID = "+super.getEmployeeID()+" [federalTaxIDMember = " + federalTaxIDMember + ", salary = "
				+ fixedMonthlyPayment + "]";
	}
	
	
}
