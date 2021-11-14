package task11;

import java.util.ArrayList;

public class seconatask11 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		In the method main create an array of five plants. Check to work your exceptions.
		 try {
			 
		 ArrayList<Plant> plant = new ArrayList<>();
		 plant.add(new Plant ("forests","blue",6));
		 plant.add(new Plant ("steppes", "white",9));
		 plant.add( new Plant ("forests","white", 3));
		 plant.add( new Plant ("swamps","red",1));
		 plant.add( new Plant ("swamps","blue",8));
		
		 for (Plant p : plant) {
			 System.out.println(plant);
		 						}
		 }
		 catch (ColorException|TypeException e) {
		      System.err.println(e.getMessage() + "\n");
		      e.printStackTrace();
		   }
		
	}
}