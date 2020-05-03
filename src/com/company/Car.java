package com.company;

public class Car {
    final String model;
    final String manufacturer;
    private Double value;

    public Car(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public Double getValue() {
        return value;
    }
}
