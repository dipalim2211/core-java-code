package com.example.abstractdemo.pureAbstractClass;

abstract class Vehicle {

    //Abstract Methode
    public abstract void applyBreaks();

    public abstract void applyHorns();

}

 class Bike extends Vehicle
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
public class VerticalManage {



    public static void main(String[] args) {

        Bike b = new Bike();
        b.applyBreaks();
        b.applyHorns();
    }
}

