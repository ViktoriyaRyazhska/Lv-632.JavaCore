package Task7;

public class Cat implements Animals {
	private String name;
			
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cat() {}
	
	public Cat(String name) {
		this.name=name;
	}
	
	@Override
	public void voice( ) {
		System.out.println(name + " says : meow meow");
		}
	@Override
	public void feed ( ) {
		System.out.println("My cat " + name +" eats mice");
		}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
}