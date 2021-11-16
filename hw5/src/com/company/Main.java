package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,31,30,31};
        int[] array = {-2, 3, -2, -4, 7, 2, 4, 12, 10, -12};
        Month test = new Month();
        test.numberMonth(daysOfMonth);
        Calculate calculate = new Calculate();
        calculate.Calcualates(array);
        System.out.println("Result: " + calculate.find(array));
        calculate.negetiveNumber();

        List<Car> cars = new ArrayList<>();
        cars.add( new Car("BMW",2007,3.3F));
        cars.add( new Car("Mers",2007,2.2F));
        cars.add( new Car("Opel",2003,1.6F));
        cars.add( new Car("Tesla",2019,2.0F));

        for (Car car : cars) {

            System.out.println(car.Reuslt());
        }

        System.out.println("----------------");

        System.out.println("Enter engine capacity car: ");
        int yearCar = scanner.nextInt();
        cars.sort(Comparator.comparing(Car::getEngineCapacity));
        for (Car car : cars){
            if (yearCar == car.getYearOfProduction()) {
                System.out.println(car.Reuslt());
            }
        }
    }
}
