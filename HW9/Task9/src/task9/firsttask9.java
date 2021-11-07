package task9;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class firsttask9 {

	public static void main(String[] args) throws IOException {
		   
	    ArrayList<Integer>  myCollection = new ArrayList <Integer> ();
	    myCollection.add(2);
	    myCollection.add(1);
	    myCollection.add(50);
	    myCollection.add(3);
	    myCollection.add(17);
	    myCollection.add(18);
	    myCollection.add(4);
	    myCollection.add(19);
	    myCollection.add(24);
	    myCollection.add(5);
	    
	     System.out.print (myCollection); //Find and save in list newCollection all positions of element more than 5 in the collection. 
	    								//Print newCollection

//Remove from collection myCollection elements, which are greater then 20. Print result
	    for (int i = 0; i < myCollection.size(); i++) {
	          if (myCollection.get(i)>20) {
	        	  myCollection.remove(myCollection.get(i));
	        	  }
	       }
	    System.out.print (myCollection);

	  //Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
	    
	    System.out.printf("\n ArrayList has position 2,8,5 ? ", myCollection.size());
	    	

	    	if (myCollection.contains(2))	{
	    		System.out.println ("\n ArrayList has position 2 in Arraylist");
	    		myCollection.add(2, 1);		}
	    	else System.out.println ("\n ArrayList has not position 2 in Arraylist ");
	    		    						
    		if (myCollection.contains(8)) 	{
    			System.out.println ("\n ArrayList has position 8 in Arraylist");
    			myCollection.add(8, -3);
    										}
    		else System.out.println ("\n ArrayList has not position 8 in Arraylist ");
    		if (myCollection.contains(5))	{
    			System.out.println ("\n ArrayList has position 5 in Arraylist");
    			myCollection.add(5, -4);
    										}
    		else System.out.println ("\n ArrayList has not position 5 in Arraylist ");

    		
    		for (int i = 0; i < myCollection.size(); i++) {
    			System.out.println ("\n position - " + i + ", value of element - " + myCollection.get(i));
  	        	  }
//  	Sort and print collection 
      	
			Collections.sort(myCollection);
			System.out.println("\n My Collection " + myCollection);
			
	}
}