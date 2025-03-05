package com.example.abstractdemo.abstractdemo.vehicle2;

public class SportBikeVersion1  extends SportBike
{
    @Override
    public void applyBreaks() {
        System.out.println("SportBike Version 1 Applied Breaks");
    }

    @Override
    public void versionData() {
        System.out.println("Sport Bike Version 1");
    }
}
