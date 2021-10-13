package lesson007d;

public class Cat implements Animal {

	  @Override
	  public String voice() {
			System.out.println("This is a cat. It can meow, purr, growl.");
			return null;
	  }

	  @Override
	  public String feed() {
			System.out.println("This is a cat. It eats milk products, meat, fish, vegetables, sometimes grass.");
			return null;
	  }

}
