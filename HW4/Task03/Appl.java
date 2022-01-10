package lesson004c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import lesson004c.Task03.Continent;
import lesson004c.Task03.Country;

public class Appl {

	public static void main(String[] args) throws Exception {
		System.out.print("Enter the name of the country: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nameCountry = br.readLine();

		for (Country p : Country.values()) {
			if (nameCountry.equalsIgnoreCase(p.name())) {
				System.out.println("This country is from the continent: " + p.getContinent());
			}
		}
		System.out.println("List of other countries that are on this continent: ");
		for (Country p : Country.values()) {
			if (getCountryContinent(nameCountry) == p.continent)
				System.out.print(p.name() + ", ");

		}
	}

	public static Continent getCountryContinent(String nameCountry) {
		for (Country p : Country.values()) {
			if (nameCountry.equalsIgnoreCase(p.name())) {
				return p.continent;
			}
		}
		return Continent.NON;
	}
}
