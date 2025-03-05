package com.example.abstractdemo.abstractdemo.vehicle2;

abstract class SportBike extends Vehicle{

    public abstract void versionData();

    public void getSportBike()
    {
        System.out.println("Hi im second Abstract class extend First Abstract Class");
    }

}

/*
    As one abstract class extends another abstract class so methods from first class
    are not override
    Or
    If you don't want to override abstract class methode then declare new class as
    abstract class
 */