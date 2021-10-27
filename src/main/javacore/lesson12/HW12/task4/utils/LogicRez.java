package lesson12.HW12.task4.utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicRez {

    public List<String> takeInformationFromRez(List<String> stringList){
        StringBuilder words = new StringBuilder();
        for (String value:stringList) {
            if (value.contains("name")){
                words.append(value);
            }
        }   if (getMathes())
        return null;
    }

    public boolean getMathes(String s){
        Pattern p = Pattern.compile("[0-9]+\\.[0-9]+\\.[0-9]+");
        Matcher m = p.matcher(s);
        return m.matches();
    }

}