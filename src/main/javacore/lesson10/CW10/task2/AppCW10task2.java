package lesson10.CW10.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AppCW10task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        getFIO(bufferedReader);
    }

    private static void getFIO(BufferedReader bufferedReader) throws IOException {
        System.out.println("Enter name, FIO: ");
        String name = bufferedReader.readLine();

        if (checkWithRegExpString(name)) {
            String[] words = name.split(" ");
            if (words.length > 2) {
                System.out.println(words[0] + " " +
                        words[1].substring(0, 1) + "." +
                        words[2].substring(0, 1) + ".");
                System.out.println(words[1]);
                System.out.println(words[1] + " " + words[2] + " " + words[0]);
            }

        } else {
            System.out.println("The string contains numbers or symbols");
        }
    }

    public static boolean checkWithRegExpString(String userNameString) {
        Pattern p = Pattern.compile("^[a-zA-Z\\s]{3,}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
}