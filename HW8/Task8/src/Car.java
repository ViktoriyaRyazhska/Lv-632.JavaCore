
public class Car {
							//Suppose we have the class Car. 
	private String model;
	private int dataOfProduction;
	private double engineCapacity;
	private String color;
	private int passengerCapacity;
	private boolean isAirConditioning;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getDataOfProduction() {
		return dataOfProduction;
	}

	public void setDataOfProduction(int dataOfProduction) {
		this.dataOfProduction = dataOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public boolean isAirConditioning() {
		return isAirConditioning;
	}

	public void setAirConditioning(boolean isAirConditioning) {
		this.isAirConditioning = isAirConditioning;
	}

		
	@Override
	public String toString() {
		return "Car [model=" + model + ", dataOfProduction=" + dataOfProduction + ", engineCapacity=" + engineCapacity
				+ ", color=" + color + ", passengerCapacity=" + passengerCapacity + ", isAirConditioning="
				+ isAirConditioning + "]";
	}

	private Car() {
	}

	public static CarBuilder getCar() {
		return new Car().new CarBuilder();
	}
				//	Create public static inner class CarBuilder inside of Car class correspond to the next class diagram
	public class CarBuilder {
		public CarBuilder() {
		}

		public CarBuilder addModel(String model) {
			Car.this.model = model;
			return this;
		}

		public CarBuilder adddataOfProduction(int dataOfProduction) {
			Car.this.dataOfProduction = dataOfProduction;
			return this;
		}

		public CarBuilder addengineCapacity(double engineCapacity) {
			Car.this.engineCapacity = engineCapacity;
			return this;
		}

		public CarBuilder addcolor(String color) {
			Car.this.color = color;
			return this;
		}

		public CarBuilder addpassengerCapacity(int passengerCapacity) {
			Car.this.passengerCapacity = passengerCapacity;
			return this;
		}

		public CarBuilder setisAirConditioning(boolean isAirConditioning) {
			Car.this.isAirConditioning = isAirConditioning;
			return this;
		}

		public Car build() {
			return Car.this;
		}

		@Override
		public String toString() {
			return "" + this.build();
		}
	}
}