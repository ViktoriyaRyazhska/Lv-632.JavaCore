
public abstract class Car {
	private String model;
	private int maxSpeed;
	private int year;

	public Car(String model, int maxSpeed, int year) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.year = year;
	}

	public void run() {
		System.out.println("Car runs!");
	}

	public void stop() {
		System.out.println("It stoped!");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", maxSpeed=" + maxSpeed + ", year=" + year + "]";
	}

}
