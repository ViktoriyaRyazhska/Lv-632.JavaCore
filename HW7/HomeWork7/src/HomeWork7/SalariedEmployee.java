package HomeWork7;

public class SalariedEmployee extends Employee implements Payment {
	public int hourly_rate;
	public int hours;
	public int salary;
	public int socialSecurityNumber;
			
	public int getHourly_rate() {
		return hourly_rate;
	}
	public void setHourly_rate(int hourly_rate) {
		this.hourly_rate = hourly_rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public SalariedEmployee() {}
	
	public SalariedEmployee(String employeeld, int hourly_rate, int hours ) {
		super(employeeld);
		this.hourly_rate = hourly_rate;
		this.hours = hours;
		}
		
	public SalariedEmployee(String employeeld, int hourly_rate, int hours, int socialSecurityNumber) {
		super(employeeld);
		this.hourly_rate = hourly_rate;
		this.hours = hours;
		this.socialSecurityNumber = socialSecurityNumber;
		}
	
	@Override
	public Integer calculatePay () {
		return  hourly_rate * hours; 
		
	}
	
	@Override
	public String toString() {
		return  "ID " + this.getSocialSecurityNumber() + " Name " + this.getEmployeeld()  +  " Salary " + calculatePay() ;
	}
}