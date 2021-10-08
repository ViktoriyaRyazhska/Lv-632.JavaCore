package lesson8.CW8;

import lesson8.CW8.model.*;

import java.time.LocalDate;

public class CW8App {
    public static void main(String[] args) {
        Car car = Car.getCar().addModel("BMW")
                .addColor("Black")
                .addDateOfProduction(LocalDate.parse("2018-10-06"))
                .setAirConditioning(true)
                .addPassengerCapasity(3)
                .addgineCapasity(3.5)
                .build();
        System.out.println(car);

        Wrapper<Figura> sq = new Wrapper<>(new Square());
        Wrapper<Figura> cir = new Wrapper<>(new Circle());
    }
}