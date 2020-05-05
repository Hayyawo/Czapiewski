package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {
    final String model;
    final String manufacturer;
    final String yearOfProduction;
    public String LicenePlate;
    private Double value;

    public Car(String producer, String name, String model, String manufacturer, String yearOfProduction, Double value) {
        super(producer, name);
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }


    public Double getValue() {
        return value;
    }


    public String toString() {
        return this.producer + " " + this.name + " " + this.LicenePlate;
    }


    void turnOn() {
        System.out.println("Turned on");
    }


    @Override
    public void sell(Human seller, Human buyer, Double cost) throws Exception {
            if(seller.getCar() == this && buyer.cash >= cost) {
                seller.cash += cost;
                seller.car = null;
                buyer.cash -= cost;
                buyer.setCar(this);
                System.out.println(buyer.toString() + " buy " + this.toString() +" from "+ seller.toString() + " for " + cost);
            } else {
                System.out.println("Buyer don't have enough money or seller don't have item");
            }
    }

    abstract void refuel();


}