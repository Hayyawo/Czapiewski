package com.company.devices;

import com.company.Human;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Phone extends Device{
    public static final String serverAddress = "212.85.96.183";
    public static final String version = "1.03v";
    public static final String url = "www.getyourownap.com";
    public static final String appName = "tinder";
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
    public void installAnApp(String name) {
        System.out.println("App name "+ appName);
    }
    public void installAnApp(String name, Double version){
        System.out.println("App name "+ appName + " latest version is "+ version);
    }
    public void installAnApp(String name, Double version, URL url){
        System.out.println("App name "+ appName + " latest version is "+ version +
                " here is direct link to install tinder" + url);

    }
    public void installAnApp(String[] appNames){

    }

}
