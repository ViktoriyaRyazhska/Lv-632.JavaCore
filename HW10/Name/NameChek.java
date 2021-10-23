import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameChek {
	public static void main(String[] args) {
		String[] names = {"Jack","Sam","Joe`","19283@@@3123","Idj1k23h1"};
		
		for (int i = 0; i < names.length; i++) {
			if(checkWithRegExpString(names[i])) {
				System.out.println("Correct entered name:");
				System.out.println(names[i]);
			}
			else{System.out.println("Incorrect entered name");}
		}
	}
	  public static boolean checkWithRegExpString(String userNameString) {
	        Pattern p = Pattern.compile("^[a-zA-Z\\s]{3,}$");
	        Matcher m = p.matcher(userNameString);
	        return m.matches();
	    }
}
