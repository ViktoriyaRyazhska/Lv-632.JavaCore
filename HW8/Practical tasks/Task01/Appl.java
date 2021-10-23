package lesson008a;

import java.time.LocalDate;

public class Appl {

	  public static void main(String[] args) {
			Car car01 = Car.getCar().addModel("TOYOTA COROLLA").addColor("Black")
						.addDateOfProduction(LocalDate.of(2016, 5, 13)).setAirConditioning(true).addPassengerCapasity(5)
						.addEngineCapasity(2.8).build();
			
			Car car02 = Car.getCar().addModel("TOYOTA CAMRY").addColor("RED")
						.addDateOfProduction(LocalDate.of(2018, 11, 28)).setAirConditioning(true).addPassengerCapasity(3)
						.addEngineCapasity(1.8).build();
			
			System.out.println(car01);
			System.out.println(car02);
	  }

}
