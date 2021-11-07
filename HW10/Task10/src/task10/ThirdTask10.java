package task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ThirdTask10 {

	public static void main(String[] args) {
	
//		The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores. 
//		Using regular expressions implement checking the user name for validity. 
//		Input five names in the main method. Output a message to the console of the validation of each of the entered names.
		
		    String [] name = new String [5];
		    name[0]= new String ("svetlana");
		    name[1]= new String ("Svetlana");
		    name[2]= new String ("John");
		    name[3]= new String ("Vera");
		    name[4]= new String ("nick");
			
		    for (int i = 0; i < name.length; i++) {
    			if(checkWithRegExp(name[i])) {
    				System.out.println("Validation user pass:" +(name[i]));
    				}
    			else{
    				System.out.println("Not validation user: " +(name[i]));
    				}
    		}
	}
	
	public static  boolean checkWithRegExp (String userNameString){
		    Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
		    Matcher m = p.matcher(userNameString);
		    return m.matches();
		    }
}    