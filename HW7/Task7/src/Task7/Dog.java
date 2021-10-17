package Task7;

public class Dog implements Animals {
	private String name;
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog() {}
	
	public Dog(String name) {
		this.name=name;
	}
	
	@Override
	public void voice( ) {
			   System.out.println( name+ " says: woof woof");
		 }
	@Override
	 public void feed ( ) {
		        System.out.println("My dog " + name + " eats meat");
		 }
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
}