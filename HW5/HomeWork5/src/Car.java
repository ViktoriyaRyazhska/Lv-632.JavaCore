//Class Car should consist of
public class Car {
//	three private fields: type, year of production and engine capacity; 
	private String type;
	private int year;
	private float engine_capacity; 						
												//		properties for access to these fields;
		
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getEngine_capacity() {
		return engine_capacity;
	}

	public void setEngine_capacity(float engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
	
	public Car (){							//		default constructor
	}
	public Car (String type, int year, float engine_capacity){
		this.type = type;						//constructor with 3 parameters 
		this.year = year;
		this.engine_capacity = engine_capacity;
	}
	
	@Override						//toString() - to output information about employee
	public String toString() {
	return "type = " + type + ",  year = " + year + ",  engine_capacity = "+ engine_capacity;
	} 	
}
