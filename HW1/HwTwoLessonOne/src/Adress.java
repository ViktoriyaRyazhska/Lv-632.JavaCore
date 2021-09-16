import java.util.Scanner;

public class Adress {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("What is your name ? ");
		String name = enter.next();
		
		System.out.println("Where do you live " + name + " ?");
		String adress = enter.next();
		
		System.out.println("Your name is - " + name + " and u live in: "+ adress);
		
		enter.close();
	

	}

}
