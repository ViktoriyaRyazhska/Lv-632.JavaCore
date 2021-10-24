package lesson008d.copy;

public class Student extends Person {
	  private int course;

	  public int getCourse() {
	  	  return course;
	  }

	  public void setCourse(int course) {
	  	  this.course = course;
	  }

	  public Student(int age, int course) {
			super(age);
		  	this.course = course;
	  }
	  
	  public Student(FullName fullName) {
			super(fullName);
	  }
	  
	  public String info() {
			return String.format("I'm study on %d course.", getCourse());
	  }

	  @Override
	  public void activity() {
			System.out.println("The Harvard Faculty of Arts and Sciences.");
	  }

}