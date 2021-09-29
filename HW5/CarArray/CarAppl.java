import java.util.Arrays;
import java.util.Scanner;

public class CarAppl {
	public static void main(String[] args) {

		Car shelby = new Car("Shelby Mustang", 2019, 5.2);
		Car porshe = new Car("Porsche 911", 2018, 4.0);
		Car maserati = new Car("Maserati Quattroporte", 2013, 4.7);
		Car dodge = new Car("Dodge Charger", 2015, 6.4);

		Car[] models = new Car[4];
		models[0] = shelby;
		models[1] = porshe;
		models[2] = maserati;
		models[3] = dodge;
		System.out.println(Arrays.toString(models));
		System.out.println("Choose a yearof a car to get info");
		System.out.println("you can choose from: 2013,2015,2018,2019.");
		Scanner input = new Scanner(System.in);
		int chooseYear = input.nextInt();
		chooseYear(models, chooseYear);
		input.close();
	}

	public static void chooseYear(Car[] models, int a) {

		for (int i = 0; i < models.length; i++) {
			if (a == models[i].getYear()) {
				System.out.println("Car with same year: ");
				System.out.println(models[i]);
			}

		}
	}

}
