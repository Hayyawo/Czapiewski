package com.company.devices;


import com.company.ISaleable;

public abstract class Device implements ISaleable {
    public final String producer;
    public final String name;



    public String toString() {
        return this.producer + " " + this.name;
    }

    public Device(String producer, String name) {
        this.producer = producer;
        this.name = name;
    }

    abstract void turnOn();
}

