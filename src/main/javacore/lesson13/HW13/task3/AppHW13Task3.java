package lesson13.HW13.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppHW13Task3 {
    public static void main(String[] args) {
        String string = "30.10.2021";
        if (getMathesBirthDay(string)){
            System.out.println("Date true !!! " + string);
        }
    }
    public static boolean getMathesBirthDay(String s) {
        Pattern p = Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
                "(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)" +
                "0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|" +
                "(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)" +
                "(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
        Matcher m = p.matcher(s);
        return m.matches();
    }
}