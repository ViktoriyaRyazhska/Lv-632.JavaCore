package lesson007f;

public abstract class Person {
	  private String name;

	  public String getName() {
			return name;
	  }

	  public Person(String name) {
			this.name = name;
	  }

	  @Override
	  public String toString() {
			return "Person " + getName();
	  }

	  public abstract void print();
	  
}