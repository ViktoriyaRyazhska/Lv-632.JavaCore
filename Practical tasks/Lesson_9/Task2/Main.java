package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<Integer, String> employeeMap = Main.createMap();
        for (Map.Entry<Integer, String> employee : employeeMap.entrySet()) {
            System.out.println(employee);
        }

        Main.findById(employeeMap);
        Main.findByName(employeeMap);


    }

    private static Map<Integer, String> createMap() {            //Creating the new Map
        Map<Integer, String> newMap = new HashMap<>();
        String[] names = {"Eloy", "Rust", "Sam Bridges", "Ariant", "Harry", "Bruce", "Gordon"};
        for (int id = 0; id < names.length; id++) {
            newMap.put(id + 1, names[id]);
        }
        return newMap;
    }


    private static void findById(Map<Integer, String> map) throws IOException {                  //Find Value by Id
        System.out.print("Find by ID: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int key = Integer.parseInt(reader.readLine());
        if (map.containsKey(key)) {
            for (Map.Entry<Integer, String> person : map.entrySet()) {
                if (person.getKey().equals(key))
                    System.out.println(person.getValue());
            }
        } else System.out.println("Invalid Id");
    }


    private static void findByName(Map<Integer, String> map) throws IOException {                //Find Id by Value
        System.out.println("Find by name: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (map.containsValue(name)) {
            for (Map.Entry<Integer, String> person : map.entrySet()) {
                if (person.getValue().equalsIgnoreCase(name))
                    System.out.println(person.getKey());
            }
        } else System.out.println("Invalid Name");
    }
}




