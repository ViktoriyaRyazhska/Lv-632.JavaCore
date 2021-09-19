import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    int c1;


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] county = {"empty","Ukraine","Poland","Slovakia","Hungary","Romania","Germany","Austria","Italy"};     //Countries list
        double [] price = {0, 0.2, 0.8, 0.7, 0.9, 0.6, 83.58321, 5.7, 6.9};                                             //Prices list

        for (int i=1; i<county.length; i++)
            System.out.println(i+" "+county[i]+" - "+price[i]+ " UAH");


        System.out.println("\n Type indexes of three countries from list");                                             //Type indexes of countries

        int c1 = Integer.parseInt(reader.readLine());                                                                   //Check typed indexes
        while (true) {
            if (c1 < 1 || c1 > 7) System.out.print("incorrect index. Try again:");
            else break;
        }
            System.out.println(county[c1]);

            int c2 = Integer.parseInt(reader.readLine());
            while (true) {
                if (c2 < 1 || c2 > 7) System.out.print("incorrect number/ Try again:");
                else break;
            }
                System.out.println(county[c2]);

                int c3 = Integer.parseInt(reader.readLine());
                while (true) {
                    if (c3 < 1 || c3 > 7) System.out.print("incorrect number/ Try again:");
                    else break;
                }
                    System.out.println(county[c3]);

        System.out.println("\nHow many minutes do you want to talk? ");                                                 //Type number of minutes

        System.out.print(county[c1]+": ");
        int t1 = Integer.parseInt(reader.readLine());

        System.out.print(county[c2]+": ");
        int t2 = Integer.parseInt(reader.readLine());

        System.out.print(county[c3]+": ");
        int t3 = Integer.parseInt(reader.readLine());

        double resultOne = price[c1]*t1;                                                                                //Calculate results for each country
        double resultTwo = price[c2]*t2;
        double resultThree = price[c3]*t3;

        System.out.println("\nPrice for "+county[c1]+" - "+resultOne+" UAH");                                           //Output results
        System.out.println("Price for "+county[c2]+" - "+resultTwo+" UAH");
        System.out.println("Price for "+county[c3]+" - "+resultThree+" UAH");
        System.out.println("Total price is "+(resultOne + resultTwo + resultThree)+" UAH");
    }
}
