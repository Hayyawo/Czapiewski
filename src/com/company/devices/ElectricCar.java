package com.company.devices;

public class ElectricCar extends Car {
    public ElectricCar(String producer, String name, String model, String manufacturer, String yearOfProduction, Double value) {
        super(producer, name, model, manufacturer, yearOfProduction, value);
    }

    @Override
    void refuel() {
        System.out.println("Car charged");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                ", LicenePlate='" + LicenePlate + '\'' +
                '}';
    }
}
