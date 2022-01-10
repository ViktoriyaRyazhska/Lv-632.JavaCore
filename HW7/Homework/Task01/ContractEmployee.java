package lesson007g;

import java.util.Random;

public class ContractEmployee extends Employee {
	  private double fixedMonthlyPayment;
	  protected String federalTaxIdmember = getRandomForTax();

	  public double getFixedMonthlyPayment() {
			return fixedMonthlyPayment;
	  }

	  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
			this.fixedMonthlyPayment = fixedMonthlyPayment;
	  }
	  
	  public ContractEmployee(String name, double fixedMonthlyPayment) {
			super(name);
			this.fixedMonthlyPayment = fixedMonthlyPayment;
	  }

	  public static String getRandomForTax() {
			Random rnd = new Random();
			int number = rnd.nextInt(999999);
			return String.format("000%d", number);
	  }

	  @Override
	  public double calculatePay() {
			return fixedMonthlyPayment;
	  }

	  @Override
	  public String toString() {
			return super.toString() + ", Federal Tax Id member: " + federalTaxIdmember + ", Average monthly wage: "
						+ calculatePay();
	  }

}
