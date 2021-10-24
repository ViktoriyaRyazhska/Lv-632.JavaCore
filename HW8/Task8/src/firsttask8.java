//Create a car with four different parameters and print info about this car and its parameters

public class firsttask8 {

	public static void main(String[] args) {
		Car car = Car.getCar().addModel("getz").addcolor("black").adddataOfProduction(2014).addengineCapacity(1.2).addpassengerCapacity(4).build();
		Car car1 = Car.getCar().addModel("nican").addcolor("red").adddataOfProduction(2018).addengineCapacity(1.8).addpassengerCapacity(6).build();
		Car car2 = Car.getCar().addModel("mazda").addcolor("green").adddataOfProduction(2020).addengineCapacity(0.3).addpassengerCapacity(4).build();
		Car car3 = Car.getCar().addModel("sonata").addcolor("yellow").adddataOfProduction(2021).addengineCapacity(3.0).addpassengerCapacity(6).build();
		
		System.out.println(car);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
}