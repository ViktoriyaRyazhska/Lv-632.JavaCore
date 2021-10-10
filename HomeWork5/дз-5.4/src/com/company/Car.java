package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Car {
    private String name;
    private int year;
    private double engine;

    public Car(String name, int year, double engine) {
        this.name = name;
        this.year = year;
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public double getEngine() {
        return engine;
    }


    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Car car[] = new Car[4];
        int inYear = 0;

        car[0] = new Car("Porshe", 2010, 5.5);
        car[1] = new Car("audi",2020, 5.0);
        car[2] = new Car("wv",2010, 3.0);
        car[3] = new Car("skoda",2020, 2.5);

        try{
            System.out.println("Введіть модельний рік автомобілів, для відображення їх на екрані:");
            inYear = Integer.parseInt(reader.readLine());
        }
        catch (Exception e){

        }

        boolean bool = false;

        for (int i = 0; i < 4; i++){
            if (car[i].year == inYear){
                System.out.println(car[i].name);
                bool = true;
            }
        }

        if (bool == false)
            System.out.println("Немає автомобілів з заданим роком виготовлення.");
    }
}
