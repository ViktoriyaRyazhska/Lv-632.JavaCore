package lesson10.CW10.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppCW10Task3 {
    public static void main(String[] args) {
        String[] words = {"AFDhgdfasdv_hh__hdfh", "Den", "Denys_Shl_Val", "fdhv@#36_disf", "73472hbhdfbhh!@#$%^&&*(", "345_@"};
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ": " +  checkWithRegExp(words[i]));
        }
    }

    public static boolean checkWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
}