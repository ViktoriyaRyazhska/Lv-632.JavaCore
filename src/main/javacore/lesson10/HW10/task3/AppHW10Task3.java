package lesson10.HW10.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AppHW10Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        getCourse(bufferedReader);
    }

    public static String getFormater(BufferedReader reader) throws IOException {
        System.out.println("Enter course $: ");
        double dollar = Double.parseDouble(reader.readLine());
        return String.format("$ %.2f", dollar);
    }

    public static void getCourse(BufferedReader reader) throws IOException{
        System.out.println("How many lines with the course to display?: ");
        List<String> dollars = new ArrayList<>();
        int j = Integer.parseInt(reader.readLine());
        for (int i = 0; i < j ; i++) {
            dollars.add(getFormater(reader));
        }
        System.out.println("==========");
        dollars.forEach(x-> System.out.println(x));
    }
}
