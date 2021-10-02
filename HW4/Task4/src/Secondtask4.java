import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Secondtask4 { 
		public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	    System.out.println("Enter day:");
	    int day = Integer.parseInt(br.readLine());
	    System.out.println("You day is: "+ day);
	   
	    switch (day) {
	    case 1 : 
	    System.out.println ("Понеділок, Понедельник, Monday");
	    break;
	    case 2 : 
		System.out.println("Вівторок, Вторник, Tuesday");
		break;
	    case 3:
		System.out.println("Середа, Среда, Wednesday");
		break;
	    case 4:
	    System.out.println("Четвер, Черверг, Thursday");
	    break;
	    case 5:
	    System.out.println("П'яниця, Пятница, Friday");
		break;
	    case 6:
		System.out.println("Субота , Суббота, Saturday");
		break;
	    case 7:
		System.out.println("Неділя, Воскресенье, Sunday");
		break;
		default:
			System.out.println("Wrong!!!");
	    }
	 } 
 }
		
