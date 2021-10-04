package lesson7;

public class Dog implements Animal {
	String name;
	
	public Dog(String name) {
		this.name=name;
	}

	@Override
	public void voice() {
		System.out.println(name+" say gav, gav");
		
	}

	@Override
	public void feed() {
System.out.println("I like to eat meat");
		
	}

}
