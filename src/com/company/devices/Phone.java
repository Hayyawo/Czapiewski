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

    }
}
