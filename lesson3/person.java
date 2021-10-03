package lesson2;

public class person {

	public static long getSalary;
	private  String name;
	private long rate;
	private int hour;
	private static double salary;
	private static long totalSum=0;
	
	
	public static double getTotalSum() {
		return totalSum;
	}
	public long getSalary() {
		long salary=(rate*hour);
		totalSum += salary;
		return salary;
		}
	
	public void changeRate(long rate) {
		this.rate = rate;
	}

	public  double getBonuses( ) {
		double b = (rate*hour)*0.1;
		totalSum +=b;
		return b;
	}
	
	public double getRate() {
		return rate;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void setRate(long rate) {
		this.rate = rate;
	}
	public double getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public String getName() {
		return name;
	}
	public static void setTotalSum(long totalSum) {
		person.totalSum = totalSum;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", rate=" + rate + ", hour=" + hour + ", salary=" + (this.getSalary() + this.getBonuses())+"]";
	}

		
	}

