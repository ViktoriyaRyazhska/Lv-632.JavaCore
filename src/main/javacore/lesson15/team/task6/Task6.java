package lesson15.team.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

    public void getTask6(BufferedReader reader) throws IOException {
        int countWords = 0;
        System.out.println("Enter words with space in a one line");
        String input = reader.readLine();

        if (input.length() != 0) {
            countWords++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    countWords++;
                }
            }
        }
        System.out.println("You entered " + countWords + " words");
    }
}