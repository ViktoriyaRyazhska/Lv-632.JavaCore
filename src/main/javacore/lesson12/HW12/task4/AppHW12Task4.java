package lesson12.HW12.task4;

import lesson12.HW12.task4.utils.DownloadFromFile;
import lesson12.HW12.task4.utils.LogicRez;

import java.util.Comparator;
import java.util.List;

public class AppHW12Task4 {
    private static final String inputFile = "src/main/resources/rez_input.txt";
    private static final String outputFile = "src/main/resources/rez_output.txt";

    public static void main(String[] args) {
        DownloadFromFile download = new DownloadFromFile();
        LogicRez operation = new LogicRez();
        List<String> stringList =  download.getStringFromFile(inputFile);
//        stringList.forEach(s -> System.out.println(s));

        System.out.println("Size list: " + stringList.size());
        System.out.println("Max symbol for string: " +
                stringList.stream().max(Comparator.comparing(String::length)).get() +
                ", length: " +
                stringList.stream().max(Comparator.comparing(String::length)).toString().length());

        String fio = operation.takeInformationFIO(stringList);
        String birthDay = operation.takeInformationBirthDay(stringList);
        download.saveStringForFile(outputFile, operation.getFormater(fio, birthDay));
    }
}