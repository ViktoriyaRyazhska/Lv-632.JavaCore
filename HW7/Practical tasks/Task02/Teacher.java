package lesson007f;

public class Teacher extends Staff {

	  private static final String TYPE_PERSON = "Teacher";

	  public String getTYPE_PERSON() {
			return TYPE_PERSON;
	  }

	  public Teacher(String name) {
			super(name);
	  }

	  @Override
	  public double salary() {
			return 999999.999;
	  }

	  @Override
	  public void print() {
			System.out.println("I am a " + getTYPE_PERSON() + ". My name is " + super.getName() +  ". My salary is: " + salary());
	  }

}