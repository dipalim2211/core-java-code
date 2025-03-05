package com.example.interfacedemo;

interface Vehicle {

     void applyBreaks();
     void applyHorns();

}

class Bike implements Vehicle
{
    @Override
    public void applyBreaks() {
        System.out.println("Bike Break");
    }

    @Override
    public void applyHorns() {
        System.out.println("Bike Horn");
    }
}

class Car implements Vehicle
{

    @Override
    public void applyBreaks() {
        System.out.println("Car Break");
    }

    @Override
    public void applyHorns() {
        System.out.println("Car Horn");
    }
}

public class Vehiclemanagment {

    public static void main(String[] args) {

        //Vehicle vehicle= new Vehicle();  //Error

        Bike bike = new Bike();
        bike.applyBreaks();
        bike.applyHorns();

        Car car = new Car();
        car.applyBreaks();
        car.applyHorns();
    }

}
