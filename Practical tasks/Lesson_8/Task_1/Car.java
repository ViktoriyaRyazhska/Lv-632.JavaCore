package Task1;

import java.time.LocalDate;

public class Car {

    private String model;
    private LocalDate dateOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    private Car(){}

    @Override
    public String toString() {
        return "Model "+ model
                +"\nDate Of Production: " + dateOfProduction
                +"\nEngineCapacity: " + engineCapacity
                +"\nColor: " + color
                +"\nPassenger Capacity: "+ passengerCapacity
                +"\nIs Air Conditioning" + isAirConditioning;
    }

    public static CarBuilder getCar(){
        return new Car().new CarBuilder();
    }


    public class CarBuilder{

    public CarBuilder addModel (String model){
        Car.this.model = model;
        return this;            //можна писати й без CarBuilder
    }

    public CarBuilder addDateOfProduction (LocalDate dateOfProduction){
        Car.this.dateOfProduction = dateOfProduction;
        return CarBuilder.this;
    }

    public CarBuilder addEngineCapacity (double engineCapacity){
        Car.this.engineCapacity=engineCapacity;
        return CarBuilder.this;
    }

    public CarBuilder addColor (String color){
        Car.this.color=color;
        return  CarBuilder.this;
    }

    public CarBuilder addPassengerCapacity (int passengerCapacity){
        Car.this.passengerCapacity=passengerCapacity;
        return CarBuilder.this;
    }

    public CarBuilder addIsAirConditioning (boolean isAirConditioning){
        Car.this.isAirConditioning=isAirConditioning;
        return CarBuilder.this;
    }

    public Car build(){
        return Car.this;
    }
    }
}
