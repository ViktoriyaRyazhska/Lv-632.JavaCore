import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		
		System.out.println("Enter ther number of day u want to know");
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		
		switch(day) {
		case 1: System.out.println("Понеділок Monday");
				break;
		case 2: System.out.println("Вівторок Tuesday");
				break;
		case 3: System.out.println("Середа Wednesday");
				break;
		case 4: System.out.println("Четвер Thursday");
				break;
		case 5: System.out.println("Пятниця Friday");
				break;
		case 6: System.out.println("Субота Saturday");
				break;
		case 7: System.out.println("Неділя Sunday");
				break;
		}
		input.close();

	}

}
