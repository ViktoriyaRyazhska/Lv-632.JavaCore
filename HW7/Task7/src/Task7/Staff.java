package Task7;

public abstract class Staff extends Person {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Staff () {};
	
	public Staff (String name, int salary) {
		super (name);
		this.salary = salary;
	}
	
	public void salary() {
		System.out.print ("My salary "+ salary);
	}
	
	@Override
	public void print() {
		System.out.print ("I am a "+ name);
		
	}

	@Override
	public String toString() {
		return "Staff [salary=" + salary + "]";
	}
}