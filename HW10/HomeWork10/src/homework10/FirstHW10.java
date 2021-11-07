package homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstHW10 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	    System.out.println("Enter in the console sentence of five words:");
	    String text = br.readLine();
	    
//		Enter in the console sentence of five words.     
//		display the longest word in the sentence 
//  		determine the number of its letters	    
	    String[] words = text.split(" "); 
	     if (words.length < 4) {
            System.out.println("Your enter in the console too small text (");
        } else {
            String temp = null;
            int max=0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > max){
                    max=words[i].length();
                    temp = words[i];
                }
            }
            System.out.println("The longest word in the sentence " + temp);
            System.out.println("The determine the number of its letters " + temp.length());
        }
			     
//	  		bring the second word in reverse order
	     	System.out.println("The second word is " + words[1]); 
	   		StringBuffer strBuffer = new StringBuffer(words[1]);
	   		strBuffer.reverse();
	   		System.out.println("The second word in reverse order " + strBuffer.toString()); 
	
	}
}	