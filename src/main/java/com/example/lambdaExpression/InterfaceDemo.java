package com.example.lambdaExpression;

interface Car{

    void applyBreak();
    void run();

}

@FunctionalInterface
interface Bike{

    void bikeBreak();

}

/*
class SportCar implements Car{

    @Override
    public void applyBreak() {
        System.out.println("SportCar Apply Break");
    }

    public void run()
    {
        System.out.println("Sport car run");
    }

}
*/

public class InterfaceDemo {

    public static void main(String[] args) {

        Car car = new Car() {
            @Override
            public void applyBreak() {
                System.out.println("Sport Car Apply Break");
            }

            public void run() {
                System.out.println("Sport Car run");
            }
        };
        car.applyBreak();
        car.run();         //Error


        Bike bike = new Bike() {
            @Override
            public void bikeBreak() {
                System.out.println("Bike apply Break");
            }

            public void bikeRun() {
                System.out.println("Bike run");
            }

        };
        bike.bikeBreak();
        //bike.bikeRun();


    }
}