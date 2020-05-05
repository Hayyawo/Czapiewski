package com.company.devices;

import com.company.Human;

public class Phone extends Device{
    public final Double valueOfInches;
    public final boolean isAndroid;
    public Phone(String producer, String name, Double valueOfInches, boolean isAndroid) {
        super(producer, name);
        this.valueOfInches = valueOfInches;
        this.isAndroid = isAndroid;
    }

    @Override
    void turnOn() {
        System.out.println("turned on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double cost) throws Exception {
        if (seller.phone == this && buyer.cash >= cost) {
            seller.cash += cost;
            seller.phone = null;
            buyer.cash -= cost;
            buyer.phone = this;
            System.out.println(buyer.toString() + " buy " + this.toString() +" from "+ seller.toString() + " for " + cost);
        } else {
            System.out.println("Buyer don't have enough money or seller don't have item");
        }
    }
}
