package lesson4.HW4;

import lesson4.HW4.model.Breed;
import lesson4.HW4.model.Dog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AppHW4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getNumbers();
        readHTTPError();
        gerInformationDog();
    }

    public static void getNumbers(){
        System.out.println("Enter quality");
        gemMaxMinNumbers(scanner.nextInt());
    }

    public static void gemMaxMinNumbers(int k){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            System.out.println( "Enter of the number: " );
            list.add(scanner.nextInt());
        }
        System.out.println("Min: " + list.stream().min(Integer::compareTo));
        System.out.println("Max: " + list.stream().max(Integer::compareTo));
    }

    enum httpError {BadRequst, Unauthorized, PaymentRequired, Forbidden, NotFound}

    public static void readHTTPError() {
        switch (Integer.parseInt(scanner.nextLine())) {
            case 400:
                System.out.println(httpError.BadRequst);
                break;
            case 401:
                System.out.println(httpError.Unauthorized);
                break;
            case 402:
                System.out.println(httpError.PaymentRequired);
                break;
            case 403:
                System.out.println(httpError.Forbidden);
                break;
            case 404:
                System.out.println(httpError.NotFound);
                break;
            default:
                System.out.println("Not ");
        }
    }

    public static void gerInformationDog() {
        Dog dog = new Dog("Sultan", Breed.STAFARD, 7);
        Dog dog1 = new Dog("Cezar", Breed.LABRADOR, 3);
        Dog dog2 = new Dog("Sultan", Breed.MOBS, 5);

        if (dog.getName().equals(dog1.getName()) || dog.getName().equals(dog2.getName())) {
            System.out.println("There is a name match: " + dog.getName());
        } else if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog.getName())) {
            System.out.println("There is a name match: " + dog1.getName());
        } else {
            System.out.println("No name matches!");
        }
        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.sort(Comparator.comparing(Dog::getAge).reversed());
        System.out.println(dogs.get(0));
    }
}
