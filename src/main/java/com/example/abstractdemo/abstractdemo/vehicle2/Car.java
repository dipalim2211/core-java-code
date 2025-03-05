package com.example.abstractdemo.abstractdemo.vehicle2;

public class Car extends Vehicle
{

    public void getDetails()
    {

        System.out.println("Car Data is : ");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Car Breaks Applied");
    }
}
