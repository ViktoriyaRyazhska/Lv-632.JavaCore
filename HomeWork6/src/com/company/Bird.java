package com.company;

public abstract class Bird {
    protected String feathers;



    public Bird() {
            feathers = "noFeathers";
        }

    public Bird(String feathers) {
            this.feathers = feathers;
        }

        public String getFeathers () {
            return feathers;
        }

        public void setFeathers (String feathers){
            this.feathers = feathers;
        }

        public void layEggs () {
            System.out.println("The eggs have been laid");
        }


        public abstract void fly ();
    }
