package Task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car = Car.getCar().
                addModel("Citroen C8").
                addColor("Aspen").
                addDateOfProduction(LocalDate.of(2008,11,11)).
                addEngineCapacity(2.2).
                addIsAirConditioning(true).
                addPassengerCapacity(7).build();

        System.out.println(car);
    }
}

