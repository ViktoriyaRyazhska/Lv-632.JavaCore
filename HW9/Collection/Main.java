
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Creating myCollection
		LinkedList<Integer> myCollection = new LinkedList<>();
		//newCollection
		LinkedList<Integer> newCollection = new LinkedList<>();
		//Entering numbers and adding them in newCollection if >10;
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a number.");
			myCollection.add(input.nextInt());
			if(myCollection.get(i)>10) {
				newCollection.add(myCollection.get(i));
			}
		}
		System.out.println("My Collection:");
		System.out.println(myCollection);
		System.out.println("My new Collection with numbers bigger than 10");
		System.out.println(newCollection);
		//removing elements >20;
		for (int i = 0; i < myCollection.size(); i++) {
			if(myCollection.get(i)>10) {
				myCollection.remove(i);
				i--;}
		}
		System.out.println("Removing more than 20. Collection: ");
		System.out.println(myCollection);
		//Adding elements in collection
		if (myCollection.size() > 2) {
			myCollection.add(2, 1);
		}
		if (myCollection.size() > 8) {
			myCollection.add(8, -3);
		}
		if (myCollection.size() > 5) {
			myCollection.add(5, -4);
		}
		for(int i=0; i<myCollection.size(); i++) {
			System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
		}
		Collections.sort(myCollection);
		System.out.println("Collection with added numbers");
		System.out.println(myCollection);
		input.close();
	}
}
