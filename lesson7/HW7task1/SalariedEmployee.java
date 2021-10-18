package HW7;

public class SalariedEmployee extends Employee {
	String socialSecurityNumber;
	int rate;
	int hour;
	int salary;

	public SalariedEmployee(String employeeId, String socialSecurityNumber, int rate, int hour) {
		super(employeeId);
		this.hour = hour;
		this.rate = rate;
		this.socialSecurityNumber = socialSecurityNumber;
		this.salary = hour * rate;
	}


	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}



	@Override
	public int calculatePay() {
		return rate*hour;
		
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", rate=" + rate + ", hour=" + hour
				+ ", salary=" + salary + ", employeeId=" + employeeId + "]";
	}

}
