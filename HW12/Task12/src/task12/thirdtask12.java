package task12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class thirdtask12 {

	public static void main(String[] args) {
//		Prepare mytext.txt file with a lot of text inside.
//		Read context from file into array of strings.
//		Each array item contains one line from file.

		String fileName = "mytest.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			List<String> myLists = new ArrayList<String>();
			String line = null;	
			int count = 0;
	
		System.out.println("Read data from file: " + fileName);
		
//		Complete next tasks:
//			   1) count and write the number of symbols in every line.
//			   2) find the longest and the shortest line. 
//			   3) find and write only that lines, which consist of word «var»  = Ukraine

	   
		while ((line = br.readLine()) != null) {
	        myLists.addAll(Arrays.asList(line.split(". , ")));      
	    } 
	    for(String list : myLists) {
		    System.out.println("line" + ++count + " : " + list);
			}
	    
	    int min = myLists.get(0).length();
        int index = 0;

        for(int i = 0; i < myLists.size(); i++) {
            if(myLists.get(i).length() < min) {
                min = myLists.get(i).length();
                index = i;
            }
        }
        System.out.println("The longest line: "+ myLists.get(index));
       
        for(int i = 0; i < myLists.size(); i++) {
            if(myLists.get(i).length() > min) {
                min = myLists.get(i).length();
                index = i;
            }
        }
        System.out.println("The shortest line: "+ myLists.get(index));
        
        
        for(int i = 0; i < myLists.size(); i++) {
        	if (myLists.contains("Ukraine")) {
        		{
        			System.out.println("The sfdgsdfgne: "+ myLists);
        		}
        	}}
        		
        String find = "Ukraine";
        for(String list : myLists) {
            if(list.contains(find))
                System.out.println("The lines, which constist of word Ukraine: " + list);}

		br.close();
		}
		catch (Exception e) { e.printStackTrace();
		}
		
	}
}	