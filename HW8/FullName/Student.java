
public class Student extends Person {
	private int course;

	public Student(FullName fullName, int age) {
		super(fullName, age);
	}

	public Student(FullName fullName, int age, int course) {
		super(fullName, age);
		this.course = course;
	}

	

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String info() {
		return String.format("First name: %s, Last name: %s, Age: %d, Course: %d", 
				super.getFullName().getFirstName(), super.getFullName().getLastName(), super.getAge(), getCourse());
	}

	@Override
	public void activity() {
		System.out.println("Working with homeworks!");
	}
	
	
}
