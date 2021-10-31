package com.company;



    public class main {

        public static void main(String[] args) {

            Car car=Car.getCar().addModel("Nissan").addColor("Red").addPassengerCapacity(4).build();
            System.out.println(car);
        }

    }
