package com.company;

public class Animal implements IFeedable {
    final String species;
    private Double weight;

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;


    }
    public void feed(){
        System.out.println("Animal fed up. Current weight is "+weight);
        weight +=5;
    }

    @Override
    public void feed(Double foodWeight) {

    }

    public void takeForwalk(){
        System.out.println("Animal taken for walk. Current weight is "+weight);
        weight -=5;
        if(weight <= 0){
            System.out.println("dead");
        }
    }
}
