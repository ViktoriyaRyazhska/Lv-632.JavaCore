
public abstract class Person {
	private String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	abstract void print();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
