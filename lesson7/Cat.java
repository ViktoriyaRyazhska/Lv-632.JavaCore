package lesson7;

public class Cat implements Animal {
	String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void voice() {
		System.out.println(name+ " say mew, mew");

	}

	@Override
	public void feed() {
		System.out.println("I like to eat fish");
	}

}
