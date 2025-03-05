package com.example.classobject;

class SuzukiCar{

    String carNAme = "Breeze";
    String carColor = "White";
    int carYear = 2019;
    String tyreManufacture= "Appolo";


    void startEngine()
    {
        System.out.println("Car Engine Started");
    }

    void stopEngine()
    {
        System.out.println("Car Engine Stopped");
    }

    void driveCar()
    {
        System.out.println("Drive Car");
    }

    void applyBreak()
    {
        System.out.println("Applied Break");
    }


}



public class ClassObjectMultipleCarDemo {

    public static void main(String[] args) {

        SuzukiCar car1 = new SuzukiCar();
        System.out.println("Colour of Car "+car1.carColor);
        System.out.println("TyreManufacture of Car "+car1.tyreManufacture);

        /*
            Try to change the properties of object with instance Variable
         */
        SuzukiCar car2 = new SuzukiCar();
        car2.carColor="Red";
        System.out.println("Colour of Car "+car2.carColor);
        System.out.println("TyreManufacture of Car "+(car2.tyreManufacture="Bridgestone"));

        SuzukiCar car3 = new SuzukiCar();
        System.out.println("Colour of Car "+(car3.carColor="Yellow"));

        /*
        Its very unuseful as ur defining color as red and then want Yellow
        This is not good approach
        So we Go for Constructor
         */

        /*
            CONSTRUCTOR:(Function/Method)

            1.Special Function which will be called at time of object creation
            2.The name of constructor is same as class name
            3.There is No return Type

         */
    }
}
