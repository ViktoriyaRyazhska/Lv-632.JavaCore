import java.util.Scanner;

public class Continents {

	public static void main(String[] args) {

		System.out.println("What continents do you search?");
		System.out.println("If u want north or south america type:");
		System.out.println("north_america or south_america.");
		Scanner input = new Scanner(System.in);
		String continentSearch = input.next();

		switch (continentSearch.toUpperCase()) {
		case "AFRICA":
			System.out.println("There are such countries as: Nigeria, Egypt, Uganda,Marocco, Madagascar and others.");
			break;
		case "EUROPE":
			System.out.println("There are such countries as: Ukraine, Poland, Germany, France, Sweden and others.");
			break;
		case "NORTH_AMERICA":
			System.out.println("There are such countries as: United States, Mexico, Canadam, Cuba, Haiti, Dominican repiblic and others.");
			break;
		case "SOUTH_AMERICA":System.out.println("There are such countries as: Brazil, Colombia, Argentina, Peru and others.");
			break;
		case "AUSTRALIA":System.out.println("A big continet!");
		}
		input.close();
	}

}
