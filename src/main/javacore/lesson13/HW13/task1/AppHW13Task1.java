package lesson13.HW13.task1;

import java.util.ArrayList;
import java.util.List;

public class AppHW13Task1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList();
        List<String> stringList2 = new ArrayList();
        stringList.add("Hello world! ");
        stringList.add("Helloworld! ");
        stringList.add("loworld! ");
        stringList.add("lowe");
        stringList.add("lord");
        stringList.add("sgsfgdsgloworld! ");
        stringList.add("sgsfgdsgld! ");
        stringList.add("sgsfgdsgdsfsddfsfaffgdarfre d df df dfdd");

        stringList.removeIf(s -> s.length() > 5);
        stringList2.addAll(stringList);
        stringList2.forEach(s -> System.out.println(s));
    }
}