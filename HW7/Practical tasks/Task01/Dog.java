package lesson007d;

public class Dog implements Animal {

	  @Override
	  public String voice() {
			System.out.println("This is a dog. It can bark, howl, growl, whine.");
			return null;
	  }

	  @Override
	  public String feed() {
			System.out.println("This is a dog. It eats meat, seafood, raw bones, sometimes vegetables.");
			return null;
	  }

}
