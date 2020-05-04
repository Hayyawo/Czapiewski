package com.company;

public class Animal implements IFeedable {
    final String species;
    public Double weight = 10.0;
    public static final Double DEFAULT_FOODWEIGHT =10.0;


    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;


    }
    public void feed(){
       feed(DEFAULT_FOODWEIGHT);
    }

    @Override
    public void feed(Double foodWeight) {
        if (weight <= 0.0) {
            System.out.println("probably dead");
        } else {
            this.weight += 3.2;
            System.out.println("now better " + this.weight);
        }
    }

    public void takeForwalk(){
        System.out.println("Animal taken for walk. Current weight is "+weight);
        weight -=5;
        if(weight <= 0){
            System.out.println("dead");
        }
    }
}
