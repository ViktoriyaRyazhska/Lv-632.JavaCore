
public class SalariedEmployee extends Employee {

	private String SocialSecurityNumber;
	private double hourlyRate;
	private int numberOfHours;

	public SalariedEmployee(String name, int EmployeeID, String socialSecurityNumber, double hourlyRate,
			int numberOfHours) {
		super(name, EmployeeID);
		SocialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.numberOfHours = numberOfHours;
	}

	public String getSocialSecurityNumber() {
		return SocialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		SocialSecurityNumber = socialSecurityNumber;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	@Override
	public double calculatePay() {
		return hourlyRate * numberOfHours;

	}

	@Override
	public String toString() {
		return "SalariedEmployee - " + super.getName() + " EmployeeID = " + super.getEmployeeID()
				+ " [SocialSecurityNumber = " + SocialSecurityNumber + ", hourlyRate = " + hourlyRate
				+ ", numberOfHours = " + numberOfHours + "]" + " salary = " + calculatePay();
	}

}
