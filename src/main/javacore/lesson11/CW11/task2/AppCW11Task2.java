package lesson11.CW11.task2;

import lesson11.CW11.task2.exception.ColorException;
import lesson11.CW11.task2.exception.TypeException;
import lesson11.CW11.task2.model.Color;
import lesson11.CW11.task2.model.Plant;
import lesson11.CW11.task2.model.Type;

import java.util.ArrayList;
import java.util.List;

public class AppCW11Task2 {
    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();

            plants.add(new Plant(promptForModeColor("Dfre"), promptForModeType("flowers"), 5));
            plants.add(new Plant(promptForModeColor("white"), promptForModeType("sfdsf"), 3));
            plants.add(new Plant(promptForModeColor("ite"), promptForModeType("sf"), 3));
            plants.add(new Plant(promptForModeColor(Color.green.toString()), Type.mosses, 7));
        try {
            plants.add(new Plant("green"," mosses", 1));
        } catch (ColorException | TypeException e) {
            e.getMessage();
        }
        try {
            plants.add(new Plant("asd", "white", 2));
        } catch (ColorException | TypeException e) {
            e.getMessage();
        }
        System.out.println("");
        plants.forEach(x -> System.out.println(x));


    }

    private static Color promptForModeColor(String prompt) {
        Color mode = null;
        do {
            try {
                mode = Color.valueOf(prompt.toLowerCase());
            } catch (Exception e) {
                System.out.println("Wrong input color: " + prompt + "!, needed - 'white', 'blue', 'red', 'green'");
                break;
            }
        } while (mode == null);
        return mode;
    }

    private static Type promptForModeType(String prompt) {
        Type mode = null;
        do {
            try {
                mode = Type.valueOf(prompt.toLowerCase());
            } catch (Exception e) {
                System.out.println("Wrong input type: " + prompt + "!, needed - 'seaweed', 'mosses', 'ferns', 'conifers', 'flowers'");
                break;
            }
        } while (mode == null);
        return mode;
    }
}