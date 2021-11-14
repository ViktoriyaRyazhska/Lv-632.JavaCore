package homework12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fourthomework12 {

	public static void main(String[] args) {
		
		String fileName = "file1.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			List<String> myLists = new ArrayList<String>();
			String line = null;	
			int count = 0;
	
		System.out.println("Read data from file: " + fileName);
		
  		while ((line = br.readLine()) != null) {
	        myLists.addAll(Arrays.asList(line.split(". , ")));      
	    } 
	    for(String list : myLists) {
		    System.out.println("Numder of line " + ++count + " : " + list);
			}
	    
	    int min = myLists.get(0).length();
        int index = 0;

        for(int i = 0; i < myLists.size(); i++) {
            if(myLists.get(i).length() > min) {
                min = myLists.get(i).length();
                index = i;
            }
        }
        System.out.println("The longest line: "+ myLists.get(index));

		br.close();
		}
		catch (Exception e) { e.printStackTrace();
		}
		String file2 = "file2.txt";
		String file1 = "file1.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader(file1);
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			int c = fr.read();
			while (c!=-1) {
				fw.write(c);
				c = fr.read();
			}
			bw.write("Numders of line " + c + "\n");
			bw.write("My name is Svetlana, my birthday 16.04.1983");
			
			bw.close();
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
}