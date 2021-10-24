//Create Wrapper class which should wrap any objects which implements Shape interface

public class Wrapper <T extends Shape> {
	
	private T t;
	
	public Wrapper(T t) { this.t = t;}
	
	public void setT(T t) { this.t = t;}
	
	public T get () { return t;}
	
	}
