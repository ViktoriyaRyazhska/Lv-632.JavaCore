package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_HW4_t1 {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        checkRange(Float.parseFloat(reader.readLine()));
        checkRange(Float.parseFloat(reader.readLine()));
        checkRange(Float.parseFloat(reader.readLine()));

        maxNumbs(Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()));

        findError(Integer.parseInt(reader.readLine()));
    }

    static void checkRange (float x){
        if  (x>-6 && x<6) System.out.println("Number is in range -5,5 ");
        else System.out.println("Number is over range -5,5");
    }

    static void maxNumbs (int a, int b, int c){
        if (a>b && a>c) System.out.println(a);
        if (b>a && b>c) System.out.println(b);
        else System.out.println(c);
    }
    static void findError(int error){
        System.out.println("description: "+ HTTPError.indexError(error));
    }
}
