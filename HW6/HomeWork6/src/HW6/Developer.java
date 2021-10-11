package HW6;
//Create a Developer class that extends the Employee class.
//Creates a String field and a constructor to initialize all fields in the Developer class

public class Developer extends Employee {
 
	private String position;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	public Developer () {}
 
	public Developer (String name, int age, double salary, String position) {
	 super (name, age, salary);
	 this.position=position;
	}
	
//	@Override
	public void report () {
		System.out.printf("Name: %s, Age: %s years, Position: %s, Salary:%s ", super.getName(), super.getAge(), position, super.getSalary());
	 }

	@Override
	public String toString() {
		return "Developer [position=" + position + "]";
	}
}