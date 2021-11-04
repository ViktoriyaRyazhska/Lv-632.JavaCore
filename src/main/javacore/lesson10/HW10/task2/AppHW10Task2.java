package lesson10.HW10.task2;

public class AppHW10Task2 {
    private static final String STR = "I    am      learning     Java   Core";

    public static void main(String[] args) {
        getSpase(STR);
    }

    private static void getSpase(String string) {
        String strNew = string.replaceAll("\\s+", " ");
        System.out.println(strNew);
    }
}