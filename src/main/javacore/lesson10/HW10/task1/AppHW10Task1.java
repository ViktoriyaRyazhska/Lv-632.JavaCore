package lesson10.HW10.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AppHW10Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        getLongestWord(bufferedReader);
    }
    //Привет это какой то текст наверно
     public static void getLongestWord(BufferedReader reader) throws IOException {
        String str = reader.readLine();
        List<String> words = Arrays.asList(str.split(" "));
        words.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println("The longest word in the sentence: " + words.get(0).toUpperCase() + " size: " + words.get(0).length());

        String strReverse = "";
        char[] liters = words.get(1).toCharArray();
        for (int i = liters.length-1; i >= 0 ; i--) {
            strReverse += liters[i];
        }
        System.out.println(words.get(1) + " : " + strReverse);
     }
}
