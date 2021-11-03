package lesson14.CW14.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppCW14Task1 {
    public static void main(String[] args) {
        try {
            getCalculate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getCalculate() throws IOException {
        int countCharacters = 0;
        String testWord;
        String character = "";
        String characterNew = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        testWord = br.readLine();
        System.out.println("Input character");
        character = br.readLine();
        for (int i = 0; i < testWord.length(); i++) {
            characterNew = String.valueOf(testWord.charAt(i));
            if (character.equals(characterNew)) {
                countCharacters++;
            }
        }
        System.out.println("There are character '" + character + "' " + countCharacters + " times in the word " + testWord);
    }
}