package lesson13.HW13.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppHW13Task3 {
    public static void main(String[] args) {
        String string = "30-10-2021";
        if (getMathesBirthDay(string)) {
            System.out.println("Date true !!! " + string);
        }
    }

    public static boolean getMathesBirthDay(String s) {
        Pattern p = Pattern.compile("^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$");
        Matcher m = p.matcher(s);
        return m.matches();
    }
}