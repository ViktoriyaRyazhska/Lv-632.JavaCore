package com.company;

public class Dog {

    private String name;
    private String breed;
    private int age;

    public static void main(String[] args) {
        Dog firstDog = new Dog("Charli", "SHEPHERD", 5);
        Dog secondDog = new Dog("Reks", "COLLIE", 10);
        Dog thirdDog = new Dog("Jeki", "DACHSHUND", 7);

        if (checkSameName(firstDog, secondDog, thirdDog)){
            System.out.println("Є собаки з однаковими іменами");
        }
        else
            System.out.println("Немає собак з однаковими іменами");

        System.out.println(getOldestDog(firstDog, secondDog, thirdDog).toString());

    }

    public enum breed {
        SHEPHERD, COLLIE, DACHSHUND
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static boolean checkSameName(Dog first, Dog second, Dog third){
        boolean bool = false;

        if (first.getName().equals(second.getName()) || first.getName().equals(third.getName())
                || second.getName().equals(third.getName()))
            bool = true;
        else
            bool = false;

        return bool;
    }

    public static Dog getOldestDog(Dog first, Dog second, Dog third){
        Dog dog = first;

        if (second.getAge() > dog.getAge())
            dog = second;
        if (third.getAge() > dog.getAge())
            dog = third;

        return dog;
    }

    @Override
    public String toString() {
        return "Старшу собаку звуть: " + getName()
                + ", її порода: " + getBreed()
                + ", вік: " + getAge();
    }
}