import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firstHW5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
														//Create array with amount days of each month

		int [] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		String [] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};

		int numberofmonth = 0;
		BufferedReader br = new BufferedReader(			// information 
				new InputStreamReader(System.in));
		System.out.println("Input number of month ");
		numberofmonth = Integer.parseInt(br.readLine());
														// control number of month
		if (numberofmonth<=0)
		{
			System.out.println("There is no such month");
		}
		if (numberofmonth>12)
		{
			System.out.println("There is no such month");
		}
		else {
													//Read the value and write the amount of days in this month 
	System.out.println("The month "+ month[numberofmonth-1]+ " has "+ monthDays[numberofmonth-1]+" days");				
		}
	}

}
