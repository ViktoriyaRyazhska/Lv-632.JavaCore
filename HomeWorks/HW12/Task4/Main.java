package Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        ////// File 1 /////
        String file1Name = "file1.txt";
        File file1 = new File(file1Name);                                       //create file object for read(file is created and located in default project folder)

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        ArrayList<String> file1Text = new ArrayList<>();                        //create empty list and empty String
        String line = null;

        while ((line = reader.readLine()) != null) {                            //reader is reading all chars until new line in text
            file1Text.add(line);
        }

        ////// File 2 /////
        String file2Name = "file2.txt";                                         //create only file name for write(file is created and located in default project folder)

        file1Text.sort(Comparator.comparing(String::length));                               //Sort list by length of Strings
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2Name));
            writer.write("The number of lines in file1.txt is: " + file1Text.size()+
                "\nThe longest line in file1.txt is: " + file1Text.get(8)+
                "\nname: Taras Chornyi");



        writer.close();
    }
}
