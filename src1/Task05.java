import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task05 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void execue5() throws IOException {
		System.out.println("Enter a String to check if it`s palindrome ");
	
			String word = br.readLine();
			String wordLC=word.toLowerCase();		
			String wordRev=new StringBuilder(wordLC).reverse().toString();
			if (wordLC.equals(wordRev)) {
				System.out.printf("Word '%s' is palindrome.\n", word);
			} else System.out.printf("Word '%s' is NOT a palindrome.\n", word);
	}
}