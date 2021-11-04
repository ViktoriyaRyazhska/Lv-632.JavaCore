package Lesson5.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Create class Car with fields type, year of production and engine capacity.
Create and initialize four instances of class Car.
Display cars
    certain model year  (enter year in the console);
    ordered by the field year.
 */
public class Car {

    private String type;
    private int year;
    private double capacity;

    public Car() {
    }

    public Car(String type, int year, double capacity) {
        this.type = type;
        this.year = year;
        this.capacity = capacity;
    }

    public static void main(String[] args) throws IOException {

        Car cars[] = new Car[4];

        cars[0] = new Car("Sedan", 2005, 1.3);
        cars[1] = new Car("Truck", 2015, 5.0);
        cars[2] = new Car("Cabriolet", 2018, 2.5);
        cars[3] = new Car("Van", 2000, 2.0);

        System.out.println(Arrays.toString(cars));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter year of car production");
        int yearOfProduction = Integer.parseInt(reader.readLine());

        if (yearOfProduction == 2005) {
            System.out.println(Arrays.toString(new Car[]{cars[0]}));
        } else if (yearOfProduction == 2015) {
            System.out.println(Arrays.toString(new Car[]{cars[1]}));
        } else if (yearOfProduction == 2018) {
            System.out.println(Arrays.toString(new Car[]{cars[2]}));
        } else if (yearOfProduction == 2000) {
            System.out.println(Arrays.toString(new Car[]{cars[3]}));
        } else {
            System.out.println("Enter correct year of car production");
        }

        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                Car temp;
                if (cars[i].getYear() > cars[j].getYear()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(cars));
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                '}';
    }
}
