package com.example.abstractdemo.abstractdemo.vehicle2;

public class Bike extends Vehicle {

    public void getDetails()
    {

        System.out.println("Bike Data is : ");
    }

    @Override
    public void applyBreaks() {
        //Not Defined
    }
}
