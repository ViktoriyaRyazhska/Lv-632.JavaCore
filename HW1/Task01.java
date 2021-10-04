package lesson001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name? ");
		String name = br.readLine();

		System.out.println("How old are you?");
		int age = Integer.parseInt(br.readLine());

		System.out.print("Hello, " + name + "!  ");
		System.out.println("You are " + age);
	}
}
