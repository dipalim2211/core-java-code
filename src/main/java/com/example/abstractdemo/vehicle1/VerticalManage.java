package com.example.abstractdemo.vehicle1;

public class VerticalManage {

    public static void main(String[] args) {

        Car car= new Car();
        car.getDetails();
        car.applyBreaks();
        car.applyHorns();

        Bike bike = new Bike();
        bike.getDetails();
        bike.applyBreaks();
        bike.applyHorns();
    }
}

