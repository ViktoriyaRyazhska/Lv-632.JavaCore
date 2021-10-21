package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();
        System.out.println(Main.deleteSpaces(sentence));
    }

    private static String deleteSpaces (String sentence){
        return sentence.replaceAll("\\s+"," ");
    }
}
