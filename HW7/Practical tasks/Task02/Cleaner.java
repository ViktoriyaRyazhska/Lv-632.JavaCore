package lesson007f;

public class Cleaner extends Staff {
	  
	  private static final String TYPE_PERSON = "Cleaner";

	  public String getTYPE_PERSON() {
			return TYPE_PERSON;
	  }

	  public Cleaner(String name) {
			super(name);
	  }

	  @Override
	  public double salary() {
			return 666666.666;
	  }

	  @Override
	  public void print() {
			System.out.println("I am a " + getTYPE_PERSON() + ". My name is " + super.getName() +  ". My salary is: " + salary());
	  }

}