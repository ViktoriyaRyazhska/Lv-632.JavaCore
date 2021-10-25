package Task3;
/*
3. Prepare mytext.txt file with a lot of text inside.
Read context from file into array of strings.
Each array item contains one line from file.
Complete next tasks:
   1) count and write the number of symbols in every line.
   2) find the longest and the shortest line.
   3) find and write only that lines, which consist of word «var»
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {            //read file
        String fileName = "C:/Users/Taras/Desktop/IT/SoftServe Academy/GitRepo/Lv-632.JavaCore/Practical tasks/Lesson_12/Task3/mytext.txt";
        ArrayList<String> text = new ArrayList<>();
        try {
            String word = null;
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while ((word = reader.readLine()) != null) {
                text.add(word);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        symbolsCount(text);
        lineSize(text);
        findWord(text, "line");
    }

    private static void symbolsCount(ArrayList<String> list) {      //counting number of symbols each line
        for (String sentence : list) {
            char[] symbols = sentence.toCharArray();
            System.out.println(symbols.length + " symbols of Line: " + sentence);
        }
    }

    private static void lineSize (ArrayList<String> list){      //also can use method "Collections.sort()" but we will loose indexes of lines
        int longestLine = list.get(0).toCharArray().length;
        int shortestLine = list.get(0).toCharArray().length;
        int longIndex = 0;
        int shortIndex = 0;
            for (int i=0; i<list.size(); i++){
            int temp = list.get(i).toCharArray().length;
            if(temp>longestLine){
                longestLine = temp;
                longIndex = i;
            }
            if(temp<shortestLine){
                shortestLine = temp;
                shortIndex = i;
            }
        }
        System.out.println("Longest Line is:\nIndex - "+longIndex+" | "+list.get(longIndex)
                      +"\nShortest Line is:\nIndex - "+shortIndex+" | "+list.get(shortIndex));
    }

    private static void findWord (ArrayList<String> list, String word){
        for (String sentence: list){
            if(sentence.contains(word))
                System.out.println(sentence);
        }
    }
}
