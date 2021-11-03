package lesson12.CW12.task3.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DownloadFile {

    public List<String> stringStreamFromFiles(String inputFile) throws IOException {
        return Files.lines(getPath(inputFile)).collect(Collectors.toList());
    }

    private Path getPath(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new NullPointerException("File not found!");
        }
        try {
            return Paths.get(file.getPath());
        } catch (NullPointerException e) {
            throw new RuntimeException("Unable to find file " + fileName, e);
        }
    }
}