package com.example.classobject;

class Car {

     //Car - Properties(Instance Variable)

     /*  INSTANCE VARIABLE

          1.Variable declared inside the class directly
          2.When you created object of car,with that object
            you can access these variable
          3.They remain in memory till the object is alive
          4.When object get destroyed by garbage Collector-Variable get destroy
      */

     String carNAme = "TATA PUNCH";
     String carColor = "White";
     int carYear = 2019 ;

     //Car - Behaviour(Function/Methode)(Instance Method)

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

     //Print all car information on console

     void displayInfo()
     {
         System.out.println("Car Information");
         System.out.println("Car Name : "+carNAme);
         System.out.println("Car Colour : "+ carColor);
         System.out.println("Car Manufacturing Year : "+carYear);
     }

 }




public class ClassObjectCarDemo {

    public static void main(String[] args) {

        int carSoldYear = 2024;
                    // Not instance Variable (its Local Variable)


         /*
         LOCAL VARIABLE :
         the variable declared inside function (Methode)
         Life = { Between Methode declaration } ,
                out of method body not accessible
          When function execution done it destroyed from Memory
        */

        /*
         OBJECT :
            Create a physical Copy of your design
            new Car() - Object Creation
            You Can access properties and behaviour of class by using object
            objName.Function
            objName.PropertyNAme
         */

        Car car = new Car();

        System.out.println();

        System.out.println("This is "+car.carNAme+" of " + car.carColor +"\n"+"Colour"+
                "  With Manufacturing Year "+ car.carYear);

        System.out.println("\n");
        car.startEngine();
        car.displayInfo();
        car.driveCar();
        car.applyBreak();
        car.stopEngine();
        /*

         */

        System.out.println("Car Sold on the Year : "+carSoldYear);

    }


}
