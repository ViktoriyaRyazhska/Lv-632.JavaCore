package lesson008a1;

import java.time.LocalDate;

public class Car {

	  private String model;
	  private LocalDate dateOfProduction;
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

	  private Car() {}

	  public static CarBuilder getCar() {
			return new Car().new CarBuilder();
	  }

	  public class CarBuilder {
			private CarBuilder() {}

			public CarBuilder addModel(String model) {
				  Car.this.setModel(model);
				  return this;
			}

			public CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
				  Car.this.setDateOfProduction(dateOfProduction);
				  return this;
			}

			public CarBuilder addEngineCapasity(double engineCapasity) {
				  Car.this.setEngineCapacity(engineCapasity);
				  return this;
			}

			public CarBuilder addColor(String color) {
				  Car.this.setColor(color);
				  return this;
			}

			public CarBuilder addPassengerCapasity(int passengerCapacity) {
				  Car.this.setPassengerCapacity(passengerCapacity);
				  return this;
			}

			public CarBuilder setAirConditioning(boolean isAirConditioning) {
				  Car.this.setAirConditioning(isAirConditioning);
				  return this;
			}

			public CarBuilder build() {
				  return Car.CarBuilder.this;
			}

			@Override
			public String toString() {
				return "CarBuilder =  Model: " + model + ", Date of Production: " + dateOfProduction + ", Engine Capacity: "
							+ engineCapacity + ", Color: " + color + ", Passenger Capacity: " + passengerCapacity
							+ ", Is Air Conditioning: " + isAirConditioning;
			}
	  }
}