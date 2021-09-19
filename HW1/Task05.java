package lesson001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task05 {
	public static void main(String[] args) throws IOException {
		String name, address;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your full name? ");
		name = br.readLine();
		System.out.println("Where You live, " + name + "?");
		address = br.readLine();
		System.out.println("NAME: " + name + " FROM: " + address);
	}
}
