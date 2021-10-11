
public class appl {

	public static void main(String[] args) {
		 Car cars [] = new Car[6];
		 
		 cars [0] = new Truck ("Seed",180,1998);
		 cars [1] = new Sedan("Polo",160,2000);
		 cars [2] = new Truck ("i30",180,2021);
		 cars [3] = new Sedan ("Fiesta",120,1990);
		 cars [4] = new Truck ("Mazda",100,2020);
		 cars [5] = new Sedan ("BMW",200,1989);
		 
		 for (int i = 0; i < cars.length; i++) {
				cars[i].run();
				cars[i].stop();
			}
	}
}