package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


    private static void findById(Map map) throws IOException {                  //Find Value by Id
        System.out.print("Find by ID: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int id = Integer.parseInt(reader.readLine());
            if (map.containsKey(id)) {
                System.out.println(map.get(id));
                break;
            } else System.out.println("invalid ID number");
        }
    }

    private static void findByName(Map<Integer, String> map) throws IOException {           //Find Id by Value
        System.out.println("Find by name: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String name = reader.readLine();
            if (map.containsValue(name)) {
                List<Integer> mapKeys = new ArrayList<>(map.keySet());
                for (Integer key : mapKeys) {
                    Object obj = map.get(key);
                    if (name.equals(obj))
                        System.out.println(key);
                }
                break;
            } else System.out.println("name not found");
        }
    }
}


