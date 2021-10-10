package lesson5.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
	String model;
	int year;
	double engineCapacity;
	
	public static void main (String[] atgs) {
		Car [] cars = new Car[4];
		cars[0] = new Car("Mercedes-AMG GT R", 2020, 3.9);
		cars[1] = new Car("Bmw 4 Series M4 G82", 2019, 2.9);
		cars[2] = new Car("Jeep Grand Cherokee", 2018, 3.6);
		cars[3] = new Car("Toyota RAV4", 2020, 2.5);
		
		sort(cars);
		
		System.out.println("Type the year");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		carsByYear(cars, year);
	}
	
	public static void sort (Car [] cars) {
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYear() < cars[j].getYear()) {
					Car temp = cars[i];
					cars[i] = cars[j];
					cars[j] = temp;
				}
			}
		}
	}
	
	public static void carsByYear (Car [] cars, int year) {
		for (Car car : cars) {
			if (car.getYear() == year) {
				System.out.println(car);
			}
		}
	}
	
	@Override
	public String toString () {
		return model + ", " + engineCapacity + ", " + year;
	}

	public Car(String model, int year, double engineCapacity) {
		this.model = model;
		this.year = year;
		this.engineCapacity = engineCapacity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(float engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}		

}
