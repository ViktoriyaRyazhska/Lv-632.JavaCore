package HW8;

public class Student extends Person {
	private int course;

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
		return String.format("First name: "+getFullname().getFirstName()+" , Last name: "+getFullname().getLastName()+" , Age: "+getAge()+" , Course: "+course);
	}

	@Override
	public String activity() {
		return String.format("I study at university");
	}

}
