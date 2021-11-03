package lesson9.CW9.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AppCW9Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Den");
        employeeMap.put(2, "Mak");
        employeeMap.put(3, "Alex");
        employeeMap.put(4, "Dan");
        employeeMap.put(5, "Max");
        employeeMap.put(6, "Sofy");
        employeeMap.put(7, "Kris");
        System.out.println(employeeMap.entrySet());

        System.out.println("Enter Id: ");
        int id = Integer.parseInt(bufferedReader.readLine());
        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else {
            System.out.println("Not found Id!");
        }
        System.out.println("Enter Name");
        String name = bufferedReader.readLine();

        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
                }
            }
        } else {
            System.out.println("Not found Name!");
        }
    }
}