package com.company;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        //Task1
        Scanner scanner = new Scanner(System.in);
        double Pi = 3.14;
        System.out.print("Enter R:");
        double R = scanner.nextInt();
        System.out.println("Your R:"+ R);
        System.out.println("Perimeter:"+ 2*Pi*R);
        System.out.println("Square:" + Pi*R*pow(R,2));
        //Task2
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where are you live,"+ name + "?");
        String address = scanner.nextLine();
        System.out.println("You are Welcome,"+name+" from "+address);
        //Task3
        double c1 = 2.5,c2 = 4.2,c3 = 2;

        System.out.println("Enter the number of minutes for 1 country: ");
        int t1 = scanner.nextInt();
        System.out.println("Enter the number of minutes for 2 country: ");
        int t2 = scanner.nextInt();
        System.out.println("Enter the number of minutes for 3 country: ");
        int t3 = scanner.nextInt();

        double v1 = t1*c1;
        double v2 = t2*c2;
        double v3 = t3*c3;
        double v4 = v3+v2+v1;
        System.out.println("Price(1): "+v1+ "\nPrice(2): "+v2+ "\nPrice(3): "+v3+"\nPrice for all: " + v4);
    }
}
