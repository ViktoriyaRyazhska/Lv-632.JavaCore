package lesson012f;

public class Appl {

	  public static void main(String[] args) {
			
			new ThreadX(0, "one",
						new ThreadX(3,"two",
									new ThreadX(5,"three")));	
	  }

}
