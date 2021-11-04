package lesson5.HW5;

import lesson5.HW5.model.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HW5App {
    public static void main(String[] args) throws IOException {
        int[] dayMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] arrt4 = {-2, 3, -2, -4, 7};
        int[] arrt3 = {10, 5, 5, -2, 5, 5, -5, 5, 10, 5};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HW5 hw5 = new HW5();
        hw5.NumberOfMonth(dayMonth, reader);
        hw5.NumberOfMonth_Ver2(dayMonth, reader);
        hw5.calculateSumOfElements(arrt3);
        hw5.findPosition(arrt4);
        System.out.println("Result: " + hw5.enteringNotNegativNumbers(reader));

        List<Car> cars = new ArrayList<>();
        cars.add( new Car("Mers",2007,2.2));
        cars.add( new Car("Opel",2003,1.6));
        cars.add( new Car("BMW",2007,3.3));
        cars.add( new Car("Tesla",2019,2.0));

        System.out.println("Enter year car: ");
        int yearCar = Integer.parseInt(reader.readLine());
        cars.sort(Comparator.comparing(Car::getYear));
         for (Car car : cars){
             if (yearCar == car.getYear()) {
                 System.out.println(car.toString());
             }
         }
    }
}