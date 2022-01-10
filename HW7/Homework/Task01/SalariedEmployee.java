package lesson007g;

import java.util.Random;

public class SalariedEmployee extends Employee {
	  private double hourlyRate;
	  private double numberOfHoursWorked;
	  protected String socialSecurityNumber = getRandomForSsn();

	  public double getHourlyRate() {
			return hourlyRate;
	  }

	  public void setHourlyRate(double hourlyRate) {
			this.hourlyRate = hourlyRate;
	  }

	  public double getNumberOfHoursWorked() {
			return numberOfHoursWorked;
	  }

	  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
			this.numberOfHoursWorked = numberOfHoursWorked;
	  }

	  public SalariedEmployee(String name, double hourlyRate, double numberOfHoursWorked) {
			super(name);
			this.hourlyRate = hourlyRate;
			this.numberOfHoursWorked = numberOfHoursWorked;
	  }

	  @Override
	  public double calculatePay() {
			return hourlyRate * numberOfHoursWorked;
	  }

	  public static String getRandomForSsn() {
			Random rnd = new Random();
			int number = rnd.nextInt(999999999);
			return String.format("%d", number);
	  }

	  @Override
	  public String toString() {
			return super.toString() + ", Social security number: " + socialSecurityNumber + ", Average monthly wage: "
						+ calculatePay();
	  }

}