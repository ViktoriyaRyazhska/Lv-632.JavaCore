package lesson007f;

public class Student extends Person {

	  private static final String TYPE_PERSON = "Student";

	  public static String getTypePerson() {
			return TYPE_PERSON;
	  }

	  public Student(String name) {
			super(name);
	  }

	  @Override
	  public void print() {
			System.out.println("I am a " + getTypePerson() + ". My name is " + super.getName());
	  }

}