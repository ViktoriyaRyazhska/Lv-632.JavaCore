package com.company;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("2", "V");
        Person person3 = new Person("3", "E");
        Person person4 = new Person("4", "W");
        Person person5 = new Person("5", "Q");

        person1.input();
        person1.output();
        person2.getAge();
        person2.output();
        person3.output();
        person4.output();
        person5.output();



    }
}