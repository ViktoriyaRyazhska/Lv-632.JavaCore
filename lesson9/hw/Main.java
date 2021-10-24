package lesson9.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import lesson9.hw.Student.*;

public class Main {
	
    public static void main(String[] args) {
    	
    	//1.
    	Set<Integer> set1 = new HashSet<>();
    	Set<Integer> set2 = new HashSet<>();
    	
    	Random randInt = new Random();
		for (int i = 0; i < 10; i++) {
			set1.add(randInt.nextInt(20));
			set2.add(randInt.nextInt(20));
		}
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(union(set1, set2));
		System.out.println(intersect(set1, set2));
		
		//2.
		Map<String, String> personMap = new HashMap<>();
		personMap.put("DiCaprio", "Leonardo");
		personMap.put("Cruise", "Tom");
		personMap.put("Depp", "Johnny");
		personMap.put("Smith", "Will");
		personMap.put("Williams", "Robin");
		personMap.put("Pitt", "Brad");
		personMap.put("Ford", "Harrison");
		personMap.put("Momoa", "Jason");
		personMap.put("Damon", "Matt");
		personMap.put("Freeman", "Morgan");
		
		sameName(personMap);
		removeByName(personMap, "Brad");
		outputEntities(personMap);
		
    	//3.
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("John Jones", 4));
		studentList.add(new Student("Tony Ferguson", 3));
		studentList.add(new Student("Mark Hunt", 5));
		studentList.add(new Student("Petr Yan", 1));
		studentList.add(new Student("Bryan Ortega", 2));
		
		System.out.println(studentList);
		Collections.sort(studentList, new CompareByName());
		System.out.println(studentList);
		Collections.sort(studentList, new CompareByCourse());
		System.out.println(studentList);
		Student.printStudent(studentList, 3);
		
    }
    
    public static void removeByName (Map<String, String> personMap, String name) {
    	Iterator<Map.Entry<String, String>> it = personMap.entrySet().iterator();
    	String currentName;
    	while (it.hasNext()) {
    		currentName = it.next().getValue();
    		if (currentName.equals(name)) {
    			it.remove();
    		}
    	}
    }
    
    public static void sameName(Map<String, String> personMap) {
		String[] stringArray  = personMap.values().toArray(new String[personMap.size()]);
		for (int i = 0; i < stringArray.length - 1; i++) {
			for (int j = i + 1; j < stringArray.length; j++) {
				if (stringArray[i].equals(stringArray[j])) {
					System.out.println("There are two persons with the same name.");
					return;
				}
			}
		}
		System.out.println("There are no two persons with the same name.");
	}
    
    public static void outputEntities(Map<String, String> personMap) {
    	for(Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry);
		}
    }
    
    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
    	Set<E> resultSet = new HashSet<>();
    	resultSet.addAll(set1);
    	resultSet.addAll(set2);
    	return resultSet;
    }
    
    public static <E> Set<E> intersect(Set<E> set1, Set<E> set2) {
    	Set<E> resultSet = new HashSet<>();
    	resultSet.addAll(set1);
    	resultSet.retainAll(set2);
    	return resultSet;
    }

}
