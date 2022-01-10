package lesson006c;

import java.time.LocalDate;

public class Truck extends Car {

	protected Truck(String model, int maxSpeed, int yearOfManufacture) {
		super(model, maxSpeed, yearOfManufacture);
	}

	private int a = 180;
	private int b = (LocalDate.now().getYear());

	public void run() {
		if (getMaxSpeed() - this.a >= 0) {
			System.out.println("Truck run " + getMaxSpeed());
		}
	}

	public void stop() {
		if (this.b - getYearOfManufacture() >= 15) {
			System.out.println("Truck stop " + getYearOfManufacture());
		}
	}

	@Override
	public void print() {
		super.print();
		run();
		stop();
	}

}