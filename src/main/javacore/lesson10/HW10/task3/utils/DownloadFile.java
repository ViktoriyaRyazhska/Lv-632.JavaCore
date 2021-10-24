package lesson10.HW10.task3.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DownloadFile {

    public List<String> stringStreamFromFiles(String inputFile) throws IOException {
        return Files.lines(getPath(inputFile)).collect(Collectors.toList());
    }

    public List<String> getWordsOnText(List<String> stringList){
        List<String> newList = new ArrayList<>();
        String words = String.join(" ",stringList);
        String[] arr = words.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (getMatchers(arr[i])){
                System.out.println("add: " + arr[i]);
                newList.add(getFormater(arr[i]));
            }
        }
        newList.forEach(x-> System.out.println("getDollars: " + x));
        return newList;
    }

    private Path getPath(String fileName) {
        File file = new File(fileName);
        if (file.exists() == false) {
            throw new NullPointerException("File not found!");
        }
        if (file.length() == 0){
            throw new NullPointerException("File is empty!");
        }
        try {
            return Paths.get(file.getPath());
        } catch (NullPointerException e) {
            throw new RuntimeException("Unable to find file " + fileName, e);
        }
    }

    private String getFormater(String string) {
        return String.format("$ %.2f", Double.parseDouble(string));
    }

    private Boolean getMatchers(String string){
        System.out.println(string.matches("([0-9]+\\.[0-9]+)"));
        return string.matches("([0-9]+\\.[0-9]+)");
    }
}