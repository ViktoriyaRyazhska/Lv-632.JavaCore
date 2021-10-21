package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();

        Main.longestWord(sentence);
        Main.reverseWord(sentence);

    }

    private static void longestWord (String sentence){              //Method that split sentence to the words and find longest of them
    String[] words = sentence.split(" ");
    int position = 0;
    String longestWord = words[0];
    for (int i=0; i<words.length; i++){
        if(words[i].length()>longestWord.length()){
            longestWord = words[i];
            position = i+1;
        }
    }
        System.out.println("longest word is: " + longestWord + ", Position " + position);
    }

    private static void reverseWord (String sentence){                      //Method that print word in reverse
        String[] words = sentence.split(" ");
        System.out.println(new StringBuilder(words[1]).reverse().toString());
    }
}
