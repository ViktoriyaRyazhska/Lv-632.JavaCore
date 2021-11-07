package homework10;

public class SecondHW10 {

	public static void main(String[] args) {
		//Enter a sentence that contains the words between more than one space. 
		//Convert all spaces, consecutive, one. For example, if we introduce the sentence
		//"I    am      learning     Java   Core», we have to get the "I'm learning Java Core»

		String s1 = new String("I    am      learning     Java   Core");
		System.out.println("I    am      learning     Java   Core");
		s1 = s1.replaceAll("\\s+", " "); 
		System.out.println(s1);
		
	}
}