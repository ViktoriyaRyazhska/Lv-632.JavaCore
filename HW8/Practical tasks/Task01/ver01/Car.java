package lesson008a;

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

	  @Override
	  public String toString() {
			return "Car:  Model=" + model + ", date Of Production=" + dateOfProduction + ", engine Capacity="
						+ engineCapacity + ", color=" + color + ", passenger Capacity=" + passengerCapacity
						+ ", is Air Conditioning=" + isAirConditioning;
	  }

	  public class CarBuilder {
			private CarBuilder() {}

			public CarBuilder addModel(String model) {
				  Car.this.model = model;
				  return this;
			}

			public CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
				  Car.this.dateOfProduction = dateOfProduction;
				  return this;
			}

			public CarBuilder addEngineCapasity(double engineCapacity) {
				  Car.this.engineCapacity = engineCapacity;
				  return this;
			}

			public CarBuilder addColor(String color) {
				  Car.this.color = color;
				  return this;
			}

			public CarBuilder addPassengerCapasity(int passengerCapacity) {
				  Car.this.passengerCapacity = passengerCapacity;
				  return this;
			}

			public CarBuilder setAirConditioning(boolean isAirConditioning) {
				  Car.this.isAirConditioning = isAirConditioning;
				  return this;
			}

			public Car build() {
				  return Car.this;
			}
	  }

}