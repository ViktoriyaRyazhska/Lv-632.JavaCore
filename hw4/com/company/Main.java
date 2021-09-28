package com.company;

import com.company.models.Breed;
import com.company.models.Dog;
import com.company.models.HttpError;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Task1:");
        System.out.print("Enter 1 number: ");
        float x = scanner.nextFloat();
        System.out.print("Enter 2 number: ");
        float y = scanner.nextFloat();
        System.out.print("Enter 3 number: ");
        float z = scanner.nextFloat();

        if (-5 <= x && x <= 5 && -5 <= y && y <= 5 && -5 <= z && z <= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Task2: ");
        System.out.print("Enter 1 number: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter 2 number: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter 3 number: ");
        int z1 = scanner.nextInt();
        System.out.println("1 - max;" + "2 - min");
        int selection = scanner.nextInt();

        switch (selection) {
            case (1):
                if (x1 > y1 && x1 > z1) {
                    System.out.println("Max: " + x1);
                } else if (y1 > x1 && y1 > z1) {
                    System.out.println("Max: " + y1);
                } else if (z1 > x1 && z1 > y1) {
                    System.out.println("Max: " + z1);
                } else {
                    System.out.println("Error");
                }

            case (2):
                if (x1 < y1 && x1 < z1) {
                    System.out.println("Min: " + x1);
                } else if (y1 < x1 && y1 < z1) {
                    System.out.println("Min: " + y1);
                } else if (z1 < x1 && z1 < y1) {
                    System.out.println("Min: " + z1);
                } else {
                    System.out.println("Error");
                }
            default:
                System.out.println("Don't destroy code.");

        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Task3: ");
        System.out.println("Enter number http error: ");
        System.out.println("400,401,402,403,404");
        int ht  = scanner.nextInt();
        switch (ht) {
            case 400:
                System.out.println(HttpError.BadRequest.getValue());
                break;
            case 401:
                System.out.println(HttpError.Unauthorized.getValue());
                break;
            case 402:
                System.out.println(HttpError.PaymentRequired.getValue());
                break;
            case 403:
                System.out.println(HttpError.Forbidden.getValue());
                break;
            case 404:
                System.out.println(HttpError.NotFound.getValue());
                break;
            default:
                System.out.println("Error, try again");
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        Dog obj1 = new Dog("Miner", Breed.Beagle, 14);
        Dog obj2 = new Dog("Muchtar", Breed.GermanShepherd, 4);
        Dog obj3 = new Dog("Fox", Breed.Malinois, 8);

        if (obj1.getName().equals(obj2.getName()) || obj1.getName().equals(obj3.getName())) {
            System.out.println("There is a name match: " + obj1.getName());
        } else if (obj2.getName().equals(obj3.getName()) || obj2.getName().equals(obj1.getName())) {
            System.out.println("There is a name match: " + obj2.getName());
        } else {
            System.out.println("No name matches!");
        }
        List<Dog> dogs = new ArrayList<>();
        dogs.add(obj1);
        dogs.add(obj3);
        dogs.add(obj2);
        dogs.sort(Comparator.comparing(Dog::getAge).reversed());
        System.out.println("The oldest dog is " + dogs.get(0).getName());
    }
}

