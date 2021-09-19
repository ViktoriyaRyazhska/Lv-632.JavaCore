package lesson1;
import java.util.Scanner;

import jdk.javadoc.internal.doclets.toolkit.taglets.SummaryTaglet;

import java.math.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Завдання 1\nПлоща кола,периметр кола. Введіть радіус");
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		double perimeter = 2 * 3.14 * radius;
		double area = 3.14 * Math.pow(radius,2);
		System.out.printf("Ваш  периметр: "+"%.2f", perimeter);
		System.out.printf("\nВаша площа: "+"%.2f", area);
		
		//Task 2
		System.out.println("\nЗавдання 2\nНапишіть як вас звати:");
		String name = br.readLine();
		System.out.println("В якому місті ви живете " + name + "?");
		String location = br.readLine();
		System.out.printf("Отже " + name + " ми тепер знаємо що ти живеш в місті " + location + ", хаха)");
		
		//Task 3
		System.out.println("\nЗавдання 3\nОбрахунок вартості дзвінків: \n");
		System.out.println("Перша країна: Англія\nнапишіть спершу ціну за хвилину: ");
		double price_c1 = scan.nextInt();
		System.out.println("Та кількість хвилин: ");
		double time_t1= scan.nextInt();
		System.out.println("Друга країна: Франція\nнапишіть спершу ціну за хвилину: ");
		double price_c2 = scan.nextInt();
		System.out.println("Та кількість хвилин: ");
		double time_t2= scan.nextInt();
		System.out.println("Третя країна: Україна\nнапишіть спершу ціну за хвилину: "
				+ "");
		double price_c3 = scan.nextInt();
		System.out.println("Та кількість хвилин: ");
		double time_t3= scan.nextInt();
		System.out.printf("Отож, ціна за дзвінки в Англії: " + price_c1 * time_t1+"\n"+ 
				"Ціна за дзвінки в Франції: " + price_c2 * time_t2+"\n"+
				"Ціна за дзвінки в Україні: " + price_c3 * time_t3+"\n"+
				"Загальна сума: "+  (price_c1 * time_t1 + price_c2 * time_t2 + price_c3 * time_t3));	
	}
	

	
}
