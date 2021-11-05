package main.javacore.lesson15.team.task4;
//4.	Input string and calculate number of loud letters (e.g. word: “My test text”, result: 3)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Task4 {
    public void getTask4(BufferedReader taskName) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Finding number of loud letters.\nInput text: ");

        char[] symbols = reader.readLine().toCharArray();
        int count=0;
        for (int i=0; i<symbols.length; i++) {
            if (Pattern.matches("[euoaiEUOAI]", String.valueOf(symbols[i]))) {
                    count++;
            }
        }
        System.out.println(count+" loud letters is found");
    }
}

