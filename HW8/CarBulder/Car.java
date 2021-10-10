
import java.time.LocalDate;

public class Car {
	private String model;
	private LocalDate dateOfProduction;
	private double engineCapacity;
	private String color;
	private int passangerCapacity;
	private boolean isAirConditioning;
	// Car constructor;
	private Car() {}
	//getCarMethod;
	public static CarBuilder getCar() {
		return new CarBuilder();
	}
	//getters and setters;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public LocalDate getDateOfProduction() {
		return dateOfProduction;
	}
	public void setDateOfProduction(LocalDate dateOfProduction) {
		this.dateOfProduction = dateOfProduction;
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
	public int getPassangerCapacity() {
		return passangerCapacity;
	}
	public void setPassangerCapacity(int passangerCapacity) {
		this.passangerCapacity = passangerCapacity;
	}
	public boolean isAirConditioning() {
		return isAirConditioning;
	}
	public void setAirConditioning(boolean isAirConditioning) {
		this.isAirConditioning = isAirConditioning;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", dateOfProduction=" + dateOfProduction + ", engineCapacity=" + engineCapacity
				+ ", color=" + color + ", passangerCapacity=" + passangerCapacity + ", isAirConditioning="
				+ isAirConditioning + "]";
	}

	public static class CarBuilder{
		Car car;
		
		private CarBuilder(){
			car = new Car();
		}
		
		public CarBuilder addModel(String model) {
			car.setModel(model);
			return this;
		}
		
		public CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
			car.setDateOfProduction(dateOfProduction);
			return this;
		}
		
		public CarBuilder addEngineCapacity(double engineCapacity) {
			car.setEngineCapacity(engineCapacity);
			return this;
		}
		
		public CarBuilder addColor(String color) {
			car.setColor(color);
			return this;
		}
		
		public CarBuilder addPassangerCapacity(int passangerCapacity) {
			car.setPassangerCapacity(passangerCapacity);
			return this;
		}
		
		public CarBuilder setlsAirConditioning(boolean isAirConditioning) {
			car.setAirConditioning(isAirConditioning);
			return this;
		}

		@Override
		public String toString() {
			return "CarBuilder [car=" + car + "]";
		}
	}

}