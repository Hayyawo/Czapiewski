package com.company.devices;

public class LPGCar extends Car {
    public LPGCar(String producer, String name, String model, String manufacturer, String yearOfProduction, Double value) {
        super(producer, name, model, manufacturer, yearOfProduction, value);
    }

    @Override
    void refuel() {

    }
}
