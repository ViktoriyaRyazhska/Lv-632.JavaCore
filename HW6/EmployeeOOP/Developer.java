
public class Developer extends Employee {

	private String position;
	private int yearsAsDeveloper;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getYearsAsDeveloper() {
		return yearsAsDeveloper;
	}

	public void setYearsAsDeveloper(int yearsAsDeveloper) {
		this.yearsAsDeveloper = yearsAsDeveloper;
	}

	public Developer(String name, String position, int age, double salary, int yearsAsDeveloper) {
		super(name, age, salary);
		this.position = position;
		this.yearsAsDeveloper = yearsAsDeveloper;
	}

	@Override
	public String report() {
		return String.format("Developers name: %s, Age %d,Position: %s,Years of working in IT: %d, Salary: %.2f,",
				getName(), getAge(), position, yearsAsDeveloper, getSalary());
	}
}
