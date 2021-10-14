package lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class classes {

	public static void main(String[] args) {

		List<Integer> myCollection = new ArrayList<>();
		myCollection.add(1);
		myCollection.add(3);
		myCollection.add(6);
		myCollection.add(9);
		myCollection.add(12);
		myCollection.add(18);
		myCollection.add(15);
		myCollection.add(24);
		myCollection.add(21);
		myCollection.add(27);

		List<Integer> newCollection = new ArrayList<>();
		System.out.print("index numbers of myCollection more then 5 : ");
		for (int a = 0; a < myCollection.size(); a++) {
			if (myCollection.get(a) > 5) {
				System.out.print(a + "\s");
				newCollection.add(a);
			}
		}

		Iterator<Integer> i = myCollection.iterator();
		while (i.hasNext()) {
			Integer n = i.next();
			if (n > 20) {
				i.remove();
			}
		}
		System.out.println("\nnewCollection: " + newCollection);
		System.out.println("myCollection: " + myCollection);

		System.out.println("---------------------------");
		insert(2, 1, myCollection);
		insert(8, -3, myCollection);
		insert(5, -4, myCollection);
		System.out.println("---------------------------");

		System.out.println("befor sorting: " + myCollection);

		Collections.sort(myCollection, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.intValue() - o2.intValue();
			}
		});
		System.out.println("after sorting: " + myCollection);

	}

	public static void insert(int position, int value, List<Integer> abc) {
		if (position < abc.size()) {
			abc.add(position, value);
			System.out.printf("Position - %d, value of element: %d\n", position, value);
		} else
			System.out.printf("Position - %d is out of the collection size.\n", position);

	}

}
