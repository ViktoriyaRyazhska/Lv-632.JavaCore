package lesson011c;

import java.util.ArrayList;
import java.util.List;

public abstract class Appl {

	  public static void main(String[] args) {

			List<Plant> plants = new ArrayList<>();
			
			// add - ok!
			try {
				  plants.add(new Plant("orchid", "white", 100));
			} catch (TypeException t) {
				  System.err.println(t.getMessage());
			} catch (ColorException m) {
				  System.err.println(m.getMessage() );
			}
			
			// Invalid black color 
			try {
				  plants.add(new Plant("lotus", "black", 31));
			} catch (TypeException t) {
				  System.err.println(t.getMessage());
			} catch (ColorException m) {
				  System.err.println(m.getMessage());
			}
			
			// Invalid gladiolus type 
			try {
				  plants.add(new Plant("gladiolus", "red", 300));
			} catch (TypeException t) {
				  System.err.println(t.getMessage());
			} catch (ColorException m) {
				  System.err.println(m.getMessage());
			}

			for (Plant p : plants) {
				  System.out.println(p);
			}
	  }

}
