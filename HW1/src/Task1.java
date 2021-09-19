import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter radius: ");
        double r = Integer.parseInt(reader.readLine());
        //Circumference = 2πr; Area = πr^2
        System.out.println("Circumference is: "+ (2*r*3.14) +"\nArea of circle is: "+ (3.14*Math.sqrt(r)));
    }
}

