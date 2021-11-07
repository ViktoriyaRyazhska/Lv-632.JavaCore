package task9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//In the main() method declare map employeeMap of pairs <Integer, String>.	
		
		Map <Integer , String> employeeMap = new HashMap <Integer , String> ();
		
//Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
		
		employeeMap.put(1,"Sveta");
		employeeMap.put(2,"Kolja");
		employeeMap.put(3,"Stiv");
		employeeMap.put(4,"Vera");
		employeeMap.put(5,"Max");
		employeeMap.put(6,"Geogre");
		employeeMap.put(7,"Tom");
		System.out.println(employeeMap);
		
//Ask user to enter ID, then find and write corresponding name from your map. 
//If you can't find this ID - say about it to user (use function containsKey()).		
		System.out.println ("Enter ID, then find and write corresponding Name");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int id = Integer.parseInt(br.readLine());
		if (employeeMap.containsKey(id))
			System.out.println("Your enter Id - " +id + " Name from your - " + employeeMap.get(id));
		else
			System.out.println("I can't find this ID");

//Ask user to enter name, verify than you have name in your map and write corresponding ID. 
//If you can't find this name - say about it to user (use function containsValue()). 		
		
		System.out.println ("Enter Name, then find and write corresponding ID");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String name = br1.readLine();
		if (employeeMap.containsValue(name)) { 
			for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
	            if (entry.getValue().equals(name)) 		{
	                System.out.println("Your enter Name - " +name + " ID from your - " + entry.getKey());
	                break;
	            									}
			}
		}
		else
			System.out.println("I can't find this Name");
	}
}