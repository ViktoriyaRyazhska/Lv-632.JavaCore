
public class Cat implements Animal {
	
	@Override
	public void voice() {
		System.out.println("Cat says Meyaww");
	}
	@Override
	public void feed() {
		System.out.println("Cat eats fish");
	}
}
