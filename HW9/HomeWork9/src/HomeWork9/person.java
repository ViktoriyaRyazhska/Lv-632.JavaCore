package HomeWork9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class person {

	public static void main(String[] args) {
//		Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).

		Map <String, String> personMap = new HashMap<String, String>();
		
		personMap.put ("Telepun","Sveta");
		personMap.put ("Tur","Sveta");
		personMap.put ("Anohina","Jana");
		personMap.put ("Zakrevskii","Vasia");
		personMap.put ("Kotik","Lida");
		personMap.put ("Balacan","Oksana");
		personMap.put ("Lydvic","John");
		personMap.put ("Syslova","Tom");
		personMap.put ("Aleksandrov","Nick");
		personMap.put ("Berben","Nastia");
		
		
//		Output the entities of the map on the screen. 
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
		System.out.println("Keys =" + entry.getKey() + " Values = " +entry.getValue());
		}
//		same result
		System.out.println();
		Iterator<Entry<String, String>> iter = personMap.entrySet().iterator();
		while (iter.hasNext()) {   Map.Entry <String, String> entry = (Map.Entry<String, String>)iter.next();
		System.out.println("Keys=" + entry.getKey() + "->" + " Values=" + entry.getValue());
		}

//		There are at less two persons with the same firstName among these 10 people?
		
		System.out.println ("Do we have two persons with the same firstName among these 10 people?");
		
// 		Remove from the map person whose firstName is ”Orest” (or other).   
//		Remove Person whose firstName "Sveta";
		
	   	System.out.println ("Remove from the map person whose firstName is ”Sveta” ");
			
		String removePerson = "Sveta";
		
		if(personMap.containsValue(removePerson)) {
			
			Iterator<Entry<String, String>> iter1 = personMap.entrySet().iterator();
			while (iter1.hasNext()) {
				Map.Entry<String, String> entry = (Map.Entry<String, String>)iter1.next();
				if (entry.getValue() == removePerson) {
					iter1.remove();
				}
					}
	}
//		 Print result.
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println("Keys =" + entry.getKey() + " Values = " +entry.getValue());
		}
//		System.out.println(""+ personMap.size());
	}}