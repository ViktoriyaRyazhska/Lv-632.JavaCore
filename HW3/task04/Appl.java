package lesson003f;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Appl {

	public static void main(String[] args) throws Exception {

		ArrayList<String> persons = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int countP = 1;

		System.out.print("How many people enter data: ");
		n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			Person p = new Person();
			System.out.println("1. Input First name:  ");
			p.setFirstName(br.readLine());
			System.out.println("2. Input Last name:  ");
			p.setLastName(br.readLine());
			System.out.println("3. Input Year of birth:  ");
			p.setBirthYear(Integer.parseInt(br.readLine()));
			persons.add((countP++) + ". " + p.toString() + "\n");
		}

//      remove left and right bracket
		System.out.println("List of persons: ");
		for (String list : persons)
			System.out.print(list);
		System.out.println("Entries in the list: " + persons.size());

	}
}