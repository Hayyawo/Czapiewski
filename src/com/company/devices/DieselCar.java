package com.company.devices;

public class DieselCar extends Car {
    public DieselCar(String producer, String name, String model, String manufacturer, String yearOfProduction, Double value) {
        super(producer, name, model, manufacturer, yearOfProduction, value);
    }

    @Override
    void refuel() {
        System.out.println("Car refueled");
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                ", LicenePlate='" + LicenePlate + '\'' +
                '}';
    }
}
