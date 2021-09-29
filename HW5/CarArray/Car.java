
public class Car {
	private String carsMark;
	private int year;
	private double capacity;

	public Car() {
	}

	public Car(String carsMark) {

		this.carsMark = carsMark;
	}

	public Car(String carsMark, int year) {

		this.carsMark = carsMark;
		this.year = year;
	}

	public Car(String carsMark, int year, double capacity) {
		this.carsMark = carsMark;
		this.year = year;
		this.capacity = capacity;
	}

	public String getCarsMark() {
		return carsMark;
	}

	public void setCarsMark(String carsMark) {
		this.carsMark = carsMark;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {

		return "[carsMark=" + carsMark + ", year=" + year + ", capacity=" + capacity + "]";

	}

}
