
public class Dog implements Animal {
	
	@Override
	public void voice() {
		System.out.println("Dog goes bark!");
	}
	@Override
	public void feed() {
		System.out.println("Dog eats bones and meat");
	}
}
