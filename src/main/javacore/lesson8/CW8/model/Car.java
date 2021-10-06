package lesson8.CW8.model;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dateOfProduction;
    private double engineCapasity;
    private String color;
    private int passengerCapasity;
    private boolean isAirConditioning;

    private Car() {
    }

    public static CarBuilder getCar() {
        return new Car().new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", engineCapasity=" + engineCapasity +
                ", color='" + color + '\'' +
                ", passengerCapasity=" + passengerCapasity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }
    /**    */
    public class CarBuilder {
        public CarBuilder() {
        }

        public CarBuilder addModel(String model) {
            Car.this.model = model;
            return this;
        }

        public CarBuilder addDateOfProduction(LocalDate date) {
            Car.this.dateOfProduction = date;
            return this;
        }

        public CarBuilder addgineCapasity(double engine) {
            Car.this.engineCapasity = engine;
            return this;
        }

        public CarBuilder addColor(String color) {
            Car.this.color = color;
            return this;
        }

        public CarBuilder addPassengerCapasity(int capasity) {
            Car.this.passengerCapasity = capasity;
            return this;
        }

        public CarBuilder setAirConditioning(boolean isAir) {
            Car.this.isAirConditioning = isAir;
            return this;
        }

        public Car build() {
            return Car.this;
        }
    }
}

