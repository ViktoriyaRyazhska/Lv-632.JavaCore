package HW6;
								// Develop abstract class Bird 
public abstract class Bird {
								//with attributes feathers and layEggs 
	private String feathers; 
	private String layEggs;
								// get & set
	public String getFeathers() {
		return feathers;
	}
	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}
	public String getLayEggs() {
		return layEggs;
	}
	public void setLayEggs(String layEggs) {
		this.layEggs = layEggs;
	}
								// Constructors
	public Bird () {}
	
	public Bird (String feathers, String layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
								// an abstract method fly()
	public abstract void fly();
	
	@Override
	public String toString() {
		return "Bird [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	public abstract void println();
}