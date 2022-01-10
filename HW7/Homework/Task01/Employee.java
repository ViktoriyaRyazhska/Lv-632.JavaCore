package lesson007g;

import java.util.Random;

public abstract class Employee implements Payment {

	  private String name;
	  protected String employeeId = getRandomForEmpl();

	  public String getName() {
			return name;
	  }

	  public void setName(String name) {
			this.name = name;
	  }

	  public Employee(String name) {
			this.name = name;
	  }

	  @Override
	  public double calculatePay() {
			return calculatePay();
	  }

	  public static String getRandomForEmpl() {
			Random rnd = new Random();
			int number = rnd.nextInt(99999);
			return String.format("123-%d", number);
	  }

	  @Override
	  public String toString() {
			return "ID:" + getRandomForEmpl() + " " + getName();
	  }

}