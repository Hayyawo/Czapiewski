package com.company;

import com.company.creatures.IFeedable;

public abstract class Animal implements IFeedable, ISaleable {
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

    public void takeForWalk(){
        System.out.println("Animal taken for walk. Current weight is "+weight);
        weight -=5;
        if(weight <= 0){
            System.out.println("dead");
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double cost) throws Exception {
          if (seller.pet == this && buyer.cash >= cost) {
            seller.cash += cost;
            seller.pet = null;
            buyer.cash -= cost;
            buyer.pet = this;
            System.out.println(buyer.toString() + " buy " + this.toString() +" from "+ seller.toString() + " for " + cost);
        } else {
            System.out.println("Buyer don't have enough money or seller don't have item");

        }
    }
}
