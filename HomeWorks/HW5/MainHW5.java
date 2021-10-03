import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainHW5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};           // Task 1 - find the number of days in the month
        System.out.print("Enter the number of month: ");
        int month = Integer.parseInt(reader.readLine());
        System.out.println("This month has "+ days[month] +" days");

        int[] numbers = new int[10];                                        // Task 2 - calculate sum of first 5 elements if they are positive and product of last 5 element
        int sum=0;
        int product=1;
        for (int i=0; i<10; i++){
            numbers[i]=Integer.parseInt(reader.readLine());
            if ( i<5 && numbers[i]>0) sum +=numbers[i];
            if (i>4) product *=numbers[i];
        }
        System.out.println("sum: "+ sum +" | odd: "+ product);

        int[] finder = new int[5];              // Task 3 - Find: position of second positive number; minimum and its position in the array
        int secondPositiveNumb = 0;
        int count = 0;
        for (int i=0; i<5; i++){
            finder[i] = Integer.parseInt(reader.readLine());
            if(finder[i] > 0) count++;
            if (count == 2) secondPositiveNumb=finder[i];
        }
        int minimum = finder[0];
        int position = 0;
        for (int a=1; a<finder.length; a++){
            if (minimum > finder[a]){
                minimum=finder[a];
                position=a;
            }
        }
        System.out.println("Second positive number is: "+ secondPositiveNumb +" | Minimum number is: "+ minimum +" and have position: "+ position);


        Cars[] listOfCars = new Cars[4];                                                        // Task 4 - create class Car
        listOfCars[0] = new Cars("Grand Turismo", 1983,3.4);
        listOfCars[1] = new Cars("Van", 2008, 2.2);
        listOfCars[2] = new Cars("SUV", 2019, 2.0);
        listOfCars[3] = new Cars("Truck", 2004, 5.6);


        Cars.findByYear(listOfCars);

        Cars.sortCars(listOfCars);
        for(Cars car:listOfCars) {
            System.out.println(car);
        }
    }
}



