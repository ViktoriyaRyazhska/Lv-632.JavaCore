package lesson12.CW12.task3;

import lesson12.CW12.task3.utils.DownloadFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppCW12Task3 {
    private static final String INPUTFILE = "src/main/resources/cw12_text.txt";

    public static void main(String[] args) {
        DownloadFile downloadFile = new DownloadFile();
        List<String> stringList = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        try {
            stringList = downloadFile.stringStreamFromFiles(INPUTFILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stringList.forEach(s -> System.out.println("Number of characters per line: " + s.length()));

        stringList.sort(Comparator.comparing(String::length));
        System.out.println("Max: " + stringList.get(stringList.size() - 1).length());
        System.out.println("Min: " + stringList.get(0).length());
        /** Почему Optianal ? добавляет +10 символов ??? */
        System.out.println("Max : " + stringList.stream().max(Comparator.comparing(String::length)).toString().length());

        for (String string : stringList) {
            if (string.contains("download")) {
                System.out.println(string);
                strings.add(string);
            }
        }
        strings.forEach(s -> System.out.println("New list with 'download' : " + s));
    }
}