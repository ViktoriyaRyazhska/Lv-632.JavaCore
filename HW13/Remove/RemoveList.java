import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveList {

	public static void main(String[] args) {
		
		List<String> sentence =  Arrays.asList("Ceep ","calm ","and ","learn ","Java ","Core.");
		sentence.forEach(System.out::print);
		List<String> sentence2 = new ArrayList<>(sentence);
		sentence2.removeIf(x->(x.length()>5));
		sentence2.forEach(System.out::print);
		
	}

}
