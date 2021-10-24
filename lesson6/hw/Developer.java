package lesson6.hw;

public class Developer extends Employee {
	private String position;
	
	public Developer(String name, int age, double salary, String position) {
		super(name, age, salary);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String report() {
		return String.format("Mame: %s, Age: %d yesrs old, Position: %s, Salary: %.2f", 
				getName(), getAge(), position, getSalary());
	}

}
