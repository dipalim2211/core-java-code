package com.example.abstractdemo.abstractdemo.vehicle2;

//Abstract Method so declare class as Abstract Class
 abstract class Vehicle {

     //Abstract Methode
    public abstract void applyBreaks();

    //Non-Abstract Methode
    public void applyHorns()
    {
        System.out.println("Vehicle Horns Applied");
    }
}
