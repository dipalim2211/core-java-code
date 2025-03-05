package com.example.abstractdemo.abstractdemo.vehicle2;

public class VerticalManage {

    public static void main(String[] args) {

        /*
        1.You Cant create Object of Abstract Class
        2.You can create reference of Abstract class
         */

        //Vehicle vehicle = new Vehicle();          ERROR
        // SportBike sb = new SportBike();

        //Vehicle vehicle = null;   //Reference

        /*
        Vehicle vehicle = new Car();
        vehicle.applyBreaks();
        vehicle.applyHorns();
        */


        /*
        Car car = new Car();
        car.getDetails();
        car.applyBreaks();
        car.applyHorns();
        */

        Bike bike = new Bike();
        bike.getDetails();
        bike.applyBreaks();
        bike.applyHorns();


        /*
        SportBikeVersion1 v1 = new SportBikeVersion1();
        v1.versionData();
        v1.applyBreaks();
        */


    }
}

