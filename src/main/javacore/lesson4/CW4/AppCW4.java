package lesson4.CW4;

import lesson4.CW4.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AppCW4 {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        repeadOperation(3);
        showDay();
        getProductmaxPrice();
        getCountry();
    }

    public static void getNotPairedNumbers() {
        System.out.println("Enter three numbers: ");
        int a = Integer.parseInt(scanner.nextLine());
        if (a % 2 != 0) {
            System.out.println(a);
        } else {
            System.out.println("Paire numbers!");
        }
    }

    public static void repeadOperation(int kil) {
        for (int i = 0; i < kil; i++) {
            getNotPairedNumbers();
        }
    }

    public static void getProductmaxPrice() {
        Product productA = new Product("Apple", 15, 110);
        Product productB = new Product("Banana", 33, 78);
        Product productC = new Product("Peach", 60, 65);
        Product productD = new Product("Plum", 15, 55);

        List<Product> products = new ArrayList<>();
        products.add(productA);
        products.add(productB);
        products.add(productC);
        products.add(productD);

        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        System.out.println("Max price: " + products.get(0));
        products.sort(Comparator.comparingInt(Product::getQuantity).reversed());
        System.out.println("Max quantity: " + products.get(0));
    }

    public static void showDay() {
        System.out.println("Enter number of day: ");

        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sundayy");
                break;

            default:
                System.out.println("Not day");
        }
    }

    public static void getCountry() {
        System.out.println("Enter the name of the country: ");
        switch (scanner.nextLine().toUpperCase()) {
            case "UKRAINE":
                System.out.println(continents.EURASIA);
                break;

            case "CANADA":
                System.out.println(continents.NORTHAMERICA);
                break;
        }
    }

    enum continents {EURASIA, AFRICA, NORTHAMERICA, SOUTHAMERICA, AUSTRALIA, ANTARCTICA}
}
