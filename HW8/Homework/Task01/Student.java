package lesson008d.copy;

public class Student extends Person {
	  private String  faculty;

	  public String getFaculty() {
			return faculty;
	  }

	  public void setfaculty(String faculty) {
			this.faculty = faculty;
	  }

	  public Student(FullName fullName, int age, String faculty) {
			super(fullName, age);
			this.faculty = faculty;
	  }

	  @Override
	  public String info() {
			return String.format("First name: %s, Last name: %s, Age: %d, faculty: %s",
						super.getFullName().getFirstName(), super.getFullName().getLastName(), super.getAge(),
						getFaculty());
	  }

	  @Override
	  public String activity() {
			return String.format("I study at university");
	  }

}