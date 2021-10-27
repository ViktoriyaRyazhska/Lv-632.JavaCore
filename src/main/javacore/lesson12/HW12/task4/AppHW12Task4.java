package lesson12.HW12.task4;

import lesson12.HW12.task4.utils.DownloadFromFile;

import java.util.List;

public class AppHW12Task4 {
    private static final String inputFile = "src/main/resources/rez_input.txt";
    private static final String outputFile = "src/main/resources/rez_output.txt";

    public static void main(String[] args) {
        DownloadFromFile download = new DownloadFromFile();
        List<String> stringList =  download.getStringFromFile(inputFile);
        stringList.forEach(s -> System.out.println(s));

        download.saveStringForFile(outputFile, stringList);
    }
}
