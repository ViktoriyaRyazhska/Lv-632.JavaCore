package lesson12.HW12.task4.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicRez {

    public List<String> getFormater(String fio, String birthDay) {
        List<String> list = new ArrayList<>();
        list.add(fio);
        list.add(birthDay);
        return list;
    }

    public String takeInformationFIO(List<String> stringList) {
        StringBuilder builder = new StringBuilder();
        String[] words = null;
        for (String value : stringList) {
            if (value.contains("name")) {
                words = value.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (getMathesFIO(words[i])) {
                        System.out.println(words[i]);
                        builder.append(words[i]);
                        builder.append(" ");
                    }
                }
            }
        }
        return builder.toString();
    }

    public String takeInformationBirthDay(List<String> stringList) {
        StringBuilder builder = new StringBuilder();
        String[] words =null;
        for (String value : stringList) {
            if (value.contains("birthday")) {
                words = value.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (getMathesBirthDay(words[i])) {
                        System.out.println(words[i]);
                        builder.append(words[i]);
                    }
                }
            }
        }
        return builder.toString();
    }

    public boolean getMathesFIO(String s) {
        Pattern p = Pattern.compile("^([A-Z]?[a-z]+){4}");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public boolean getMathesBirthDay(String s) {
        Pattern p = Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
                "(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)" +
                "0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|" +
                "(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)" +
                "(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
        Matcher m = p.matcher(s);
        return m.matches();
    }
}