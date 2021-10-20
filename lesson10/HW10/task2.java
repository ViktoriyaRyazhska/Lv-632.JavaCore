package lesson10.HW10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter sentece with a lot of spaces.... ");
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
		String text = br.readLine();
		String text1 = text.replaceAll("\\s+", " ");
		System.out.println(text1);

	}

}
