package lesson10.HW10.task3.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
                newList.add(arr[i].replace("$",""));
            }
        }
        return newList;
    }

    private Path getPath(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
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

    private Boolean getMatchers(String string){
        Pattern p = Pattern.compile("^\\$[0-9]+(\\,[0-9]{3})?");
        Matcher m = p.matcher(string);
        return m.matches();
    }
}