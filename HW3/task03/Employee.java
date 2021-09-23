package lesson003d;

class Employee {
	private static double totalSum = 0;

	private String name;
	private int rate;
	private int hours;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Employee() {
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	@Override
	public String toString() {
		return name + "   [rate: " + rate + "]" + ",  " + "[hours: " + hours + "]";
	}

	public void changeRate(int rate) {
		this.rate = rate;
	}

	public int getSalary() {
		totalSum += rate * hours;
		return (rate * hours);
	}

	public double getBonus() {
		totalSum += (rate * hours) * 0.1;
		return ((rate * hours) * 0.1);
	}

	public static double TotalSum() {
		return totalSum;
	}
}
