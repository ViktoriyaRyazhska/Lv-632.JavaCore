package lesson8;

import java.time.LocalDate;

public class Car {
	private String model;
	private LocalDate dateOfProdution;
	private double enginCapacity;
	private String color;
	private int passengerCapacity;
	private boolean isAirConditioning;

	private Car() {
	}
	

	@Override
	public String toString() {
		return "Car [model=" + model + ", dateOfProdution=" + dateOfProdution + ", enginCapacity=" + enginCapacity
				+ ", color=" + color + ", passengerCapacity=" + passengerCapacity + ", isAirConditioning="
				+ isAirConditioning + "]";
	}


	public static CarBuilder getCar() {
		return new Car().new CarBuilder();
	}

	public class CarBuilder {

		public CarBuilder addModel(String model) {
			Car.this.model = model;
			return this;
		}

		public CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
			Car.this.dateOfProdution = dateOfProduction;
			return this;
		}

		public CarBuilder EnginCapacity(double enginCapacity) {
			Car.this.enginCapacity = enginCapacity;
			return this;
		}

		public CarBuilder addColor(String color) {
			Car.this.color = color;
			return this;
		}

		public CarBuilder addPassengerCapacity(int passengerCapacity) {
			Car.this.passengerCapacity = passengerCapacity;
			return this;
		}

		public CarBuilder addIsAirConditioning(boolean isAirConditioning) {
			Car.this.isAirConditioning = isAirConditioning;
			return this;
		}

		public Car build() {
			return Car.this;
		}

	}

}
