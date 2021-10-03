package lesson6;

public class appl {

	public static void main(String[] args) {
	
		Car[] Cars = new Car[4];
		Cars[0] = new Truck ("Volvo", 150, 1980);
		Cars[1] =new Sedan("BMW", 260,2015);
		Cars[2] = new Sedan ("Mazda", 200,2010);
		Cars[3] = new Truck ("Kamaz",120,1980);

		Cars[1].run();
		Cars[1].stop();
		Cars[3].run();
		
	}
}
