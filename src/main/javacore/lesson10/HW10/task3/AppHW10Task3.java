package lesson10.HW10.task3;

import lesson10.HW10.task3.utils.DownloadFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AppHW10Task3 {
    private static final String INPUTFILE = "src/main/resources/fin_text.txt";

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        getCourse(bufferedReader);

        List<String> finList = new ArrayList<>();
        DownloadFile downloadFile = new DownloadFile();
        try {
            finList = downloadFile.stringStreamFromFiles(INPUTFILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!finList.isEmpty()){
            List<String> newList = downloadFile.getWordsOnText(finList);

            newList.forEach(x-> System.out.println("Course: " + x));

        }
    }

    public static String getFormater(BufferedReader reader) {
        System.out.println("Enter course $: ");
        double dollar = 0;
        try {
            dollar = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.format("$ %.2f", dollar);
    }

    public static void getCourse(BufferedReader reader) {
        System.out.println("How many lines with the course to display?: ");
        List<String> dollars = new ArrayList<>();
        int j = 0;
        try {
            j = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < j; i++) {
            try {
                dollars.add(getFormater(reader));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("==========");
        dollars.forEach(x -> System.out.println(x));
    }
}
