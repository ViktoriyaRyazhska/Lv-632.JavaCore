package lesson007f;

public abstract class Staff extends Person {

	  public Staff(String name) {
			super(name);
	  }

	  public abstract void print();

	  public abstract double salary();

}