package HW7;

import java.util.Comparator;

public class SalariedEmployee extends Employee {
	String socialSecurityNumber;
	int rate;
	int hour;
	int salary;

	public SalariedEmployee(String employeeId, String socialSecurityNumber, int rate, int hour, int salary) {
		super(employeeId, salary);
		this.hour = hour;
		this.rate = rate;
		this.socialSecurityNumber = socialSecurityNumber;
		this.salary = hour * rate;
	}

	public int getSalary() {
		return salary = rate * hour;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void calculatePay() {
		System.out.println(employeeId + ", social number " + socialSecurityNumber + ", salary  " + salary);
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", rate=" + rate + ", hour=" + hour
				+ ", salary=" + salary + ", employeeId=" + employeeId + "]";
	}

	public class SortSalary implements Comparator<SalariedEmployee> {

		@Override
		public int compare(SalariedEmployee o1, SalariedEmployee o2) {
			int s1 = o1.getSalary();
			int s2 = o2.getSalary();
			if (s1 > s2) {
				System.out.println("1");
				return 1;
			} else if (s1 < s2) {
				return -1;
			} else {
				return 0;
			}

		}

	}

}
