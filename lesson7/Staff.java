package lesson7;

public abstract class Staff extends Person {
	String position;

	public Staff(String name, String position) {
		super(name);
		this.position=position;	
	}
	
	public abstract void salary();
	

}
