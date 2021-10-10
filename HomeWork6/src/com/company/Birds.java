package com.company;

public class Birds {

        public static void main(String[] args) {
            Bird[] birds = new Bird[]{
                    new Eagle("tight feathers", 1.2f, Eagle.EagleColor.BROWN),
                    new Chicken("rare feather", "default wings", true),
                    new Swallow("long feathers", 0.4f, 0.08f),
                    new Penguin("waterproof feather", "flippers", 0.4f),
            };

            for (Bird bird : birds){
                bird.fly();
            }

            System.out.println("\n\t***\n");

            for (Bird bird : birds){
                System.out.println(bird.getClass().toString());
            }
        }
    }

