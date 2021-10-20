package lesson10.HW10;


import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in the console sentence of five words...");
		String sentence = scan.nextLine();
		String[] Sent = sentence.split(" ");
		if (Sent.length < 4) {
			System.out.println("Wrong count of words");
		} else {
			String temp = null;
			for (int i = 0; i < Sent.length - 1; i++) {
				for (int j = i + 1; j < Sent.length; j++) {
					if (Sent[i].length() > Sent[j].length()) {
						temp = Sent[i];
					} else {
						temp = Sent[j];
					}
				}
			}

			System.out.println("The longest word is " + temp + ", number of its letters: " + temp.length());
		}

		String rev = new StringBuilder(Sent[1]).reverse().toString();
		System.out.println(rev);
		for (int i = Sent[1].length() - 1; i >= 0; i--) {
			System.out.print(Sent[1].charAt(i));
		}

	}
}
