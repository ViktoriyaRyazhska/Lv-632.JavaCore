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
//        ^(0[1-9]|1[012])/(0[1-9]|[12][0-9]|[3][01])/\\d{4}$
//        Pattern p = Pattern.compile("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$");
        Pattern p = Pattern.compile("^(0[1-9]|1[012])\\/(0[1-9]|[12][0-9]|[3][01])\\/\\d{4}$");
        Matcher m = p.matcher(s);
        return m.matches();
    }
}