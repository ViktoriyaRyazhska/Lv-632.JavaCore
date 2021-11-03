package lesson12.HW12.task4.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DownloadFromFile {
    public List<String> getStringFromFile(String fileName) {
        List<String> stringList = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String line = null;
            while (true) {
                try {
                    if (!((line = br.readLine()) != null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stringList.add(line);
            }
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringList;
    }

    public void saveStringForFile(String outputFileName, List<String> stringList) {
        try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String value : stringList) {
                if (value != null) {
                    writter.write(value + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}