package lesson10.HW10.task1;

import java.io.IOException;

public class AppHW10Task2 {
    private static final String STR = "I    am      learning     Java   Core";

    public static void main(String[] args) throws IOException {
        getSpase(STR);
    }

    public static void getSpase(String string) throws IOException {
        String strNew = string.replaceAll("\\s+"," ");
        System.out.println(strNew);
    }
}