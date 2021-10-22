import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        Main.div(2.5, 0);

        for (int i = 0; i<51; i+=5){
            Main.readNumber(25+i,60+i);
        }
    }

    private static double div(double a, double b){
        double result = 0;
        try {
             result = a / b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }return result;
    }

    public static int readNumber (int start, int end) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Print number in the range: "+ start +" to " + end +" :");
        int number = 0;
        try {
            String temp = (reader.readLine());
            if (temp.matches("[0-9]+")) {
                if (Integer.parseInt(temp) >= start && Integer.parseInt(temp) <= end) {
                    number = Integer.parseInt(temp);
                    System.out.println("number is correct");
                } else System.out.println("the number is out of bounds");
            } else {
                System.out.println("type an integer number");
            }
        }catch (IOException e){
            System.out.println("type an integer number");
        }
        return number;
    }
}
