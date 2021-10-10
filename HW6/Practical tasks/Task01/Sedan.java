package lesson006c;

import java.time.LocalDate;

public class Sedan extends Car {

	protected Sedan(String model, int maxSpeed, int yearOfManufacture) {
		super(model, maxSpeed, yearOfManufacture);
	}

	private int a = 200;
	private int b = (LocalDate.now().getYear());

	public void run() {
		if (getMaxSpeed() - this.a >= 0) {
			System.out.println("Sedan run " + getMaxSpeed());
		}
	}

	public void stop() {
		if (this.b - getYearOfManufacture() >= 10) {
			System.out.println("Sedan stop " + getYearOfManufacture());
		}
	}

	@Override
	public void print() {
		super.print();
		run();
		stop();
	}

}