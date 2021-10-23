package lesson009c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Appl {

	  public static void main(String[] args) throws NumberFormatException, IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Random random = new Random();
			List<Integer> myCollection = new ArrayList<>();
			System.out.print("Enter the size of a collection (>5) [for example 20]: ");
			int rdSize = Integer.parseInt(br.readLine());
			if (rdSize > 5) {
				  for (int i = 0; i < rdSize; i++) {
						myCollection.add(random.nextInt(rdSize));
				  }
				  System.out.println("My collection: " + myCollection);
			} else {
				  System.out.println("Please check that all the data entered is correct!");
			}

			getElementInArray(myCollection);
			removeElementInArray(myCollection);
			addElementAtPositionInArray(myCollection, 2, 1);
			addElementAtPositionInArray(myCollection, 10, -3);
			addElementAtPositionInArray(myCollection, 5, -4);
			addElementAtPositionInArray(myCollection, 1000, 9999);
			sortCollections(myCollection);
			
	  }

	  public static void getElementInArray(List<Integer> myCollection) {
			if ((myCollection != null) && (!myCollection.isEmpty())) {
				  List<Integer> newCollection = new ArrayList<>();
				  for (int i = 0; i < myCollection.size(); i++) {
						if (myCollection.get(i) > 5) {
							  newCollection.add(myCollection.get(i));
						}
				  }
				  System.out.println("New Collection: " + newCollection);
			} else {
				  System.out.println("The collection is empty or null.");
			}
	  }

	  public static void removeElementInArray(List<Integer> myCollection) {
			if ((myCollection != null) && (!myCollection.isEmpty())) {
				  Iterator<Integer> rList = myCollection.iterator();
				  while (rList.hasNext()) {
						Integer i = rList.next();
						if (i >= 10) {
							  rList.remove();
						}
				  }
				  System.out.println("My Collection (after removal): " + myCollection);
			} else {
				  System.out.println("The collection is empty or null.");
			}
	  }

	  public static void addElementAtPositionInArray(List<Integer> myCollection, int position, int element) {
			if ((position >= 0) && (position < myCollection.size())) {
				  myCollection.add(position - 1, element);
				  System.out.println("\nMy collection: element " + element 
							  + " inserted at position " 
							  + position + ":\n"
							  + myCollection);
			} else {
				  position = myCollection.size();
				  myCollection.add(position, element);
				  System.out.println("\nIndex not exists!");
				  System.out.println("My collection: element " + element 
							  + " inserted at position " 
							  + position + ":\n"
							  + myCollection);
			}
	  }

	  public static void sortCollections(List<Integer> myCollection) {
			Comparator<Integer> comp = (Integer a, Integer b) -> {
				    return Integer.compare(a,b);
				};
			
			Collections.sort(myCollection, comp);
			System.out.println("\nMy Collection (after sorting): " + myCollection);			
	  }

}