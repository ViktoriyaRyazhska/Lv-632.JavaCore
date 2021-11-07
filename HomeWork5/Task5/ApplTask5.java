package com.softserve.javaCore.homework5.Task5;

import java.util.Scanner;

/*Create class Car with fields type, year of production and engine capacity. 
 * Create and initialize four instances of class Car. Display cars
   -certain model year  (enter year in the console);  -ordered by the field year.*/

public class ApplTask5 {

	public static void main(String[] args) {
		     Car [] car = new Car[4];
		
		     car [0] = new Car("Volkswagen Golf GTI", 2021, 2.0);
		     car [1] = new Car("Mazda 3", 2021, 2.0 );
		     car [2] = new Car("Toyota Camry", 2020, 2.5);
		     car [3] = new Car("Peugeot", 2021, 1.6 );
		     
		     
		     Scanner sc = new Scanner (System.in);
		     System.out.println("Enter model year ");
		     int year = sc.nextInt();
		     
		      chooseByYear(car, year);
		     //sortByYear(car);    // this method sorts wrongly

	}
	
	public static void chooseByYear(Car[] car, int year) {

		for (int i = 0; i < car.length; i++) {
			if (year == car[i].getYearOfProduction()) {
				System.out.println("Car with  year "+year);
				System.out.println(car[i]);
			}

		}
	}

	/*public static void sortByYear(Car[] car) {                  // this method sorts wrongly
		Car tmp;
		 for (int i = 0; i < car.length - 1; i++) {
		 	for (int j = i + 1; j < car.length; j++) {
		 		if (car[i].getYearOfProduction() < car[j].getYearOfProduction()) {
		 			tmp = car[i];
		 			car[i] = car[j];
		 			car[j] = tmp;
		 		}
		 	}
		 }
		 for (int i = 0; i < car.length; i++) {   
		 	System.out.println(car[i]);
		 }
	}*/
	
	
}
