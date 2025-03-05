package com.example.abstractdemo.abstractPractice;

abstract class Vehicle {

    public abstract void applyBreaks();

    public Vehicle()
    {
        System.out.println("Abstract Constructor");
    }
}

class Bike extends Vehicle {
    @Override
    public void applyBreaks() {
        System.out.println("Bike Break");
    }

}


public class constructorInsideAbstract {

    public static void main(String[] args) {

            //Vehicle v = new Vehicle();         //Error-Constructor Calling

            Bike b = new Bike();               //Call the abstract class constructor
            b.applyBreaks();

        }
}
