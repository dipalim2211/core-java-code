package com.example.objectcomposition;

//Pluggable Instance : Want to use in car
class Engine{

    //Attribute
    private int engineNumber;
    private String engineManufacture;

    public Engine(int engineNumber, String engineManufacture) {
        this.engineNumber = engineNumber;
        this.engineManufacture = engineManufacture;
        System.out.println(engineManufacture+" " +engineNumber);
    }

    //own Behaviour
    public void startEngine(){
        System.out.println("Start Engine");
    }

    public void stopEngine(){
        System.out.println("Stop Engine");
    }

}

//Pluggable Instance : Want to use in car
class Tyre{

    //Own Attribute
     private int totalRunning;
     private int lifeTyre;
     private int maxTyreSpeed;

     //own Behaviour
     private void moveTyre()
     {
         System.out.println("Move Tyre ");
     }

     private void stopTyre()
     {
         System.out.println("Stop Tyre ");
     }
}

class Car{

    private String name;
    private String numberplate;
    private String color;
    private int manufactureYear;

    private Engine engine;      //Reference Variable
    private Tyre tyre;          //Reference Variable

    public Car(String name, int manufactureYear, Engine engine, Tyre tyre,
               String color, String numberplate)
    {
        this.name = name;
        this.manufactureYear = manufactureYear;
        this.color = color;
        this.numberplate = numberplate;

        this.engine = engine;
        this.tyre = tyre;
    }

    public void driveCar()
    {

    }

    public void startCar()
    {
        //To start car start engine
        engine.startEngine();
    }

    public void stopCar()
    {
        engine.stopEngine();
    }


    public void display() {
        System.out.println("Car{" +
                "name='" + name + '\'' +"\n"+
                ", numberplate='" + numberplate + '\'' +"\n"+
                ", color='" + color + '\'' +"\n"+
                ", manufactureYear=" + manufactureYear +"\n"+
                ", engine='" + engine + '\'' +"\n"+
                ", tyre='" + tyre+ '\'' );

    }

    public void setEngine(Engine engine) {
    this.engine=engine;

    }
}




public class CarManufacturingDemo {

    public static void main(String[] args) {

        Engine engine = new Engine(1212,"JJ");

        Tyre tyre = new Tyre();


        Car car1 = new Car("Tigor",2022,engine,tyre,"White","MH12US3240");
        car1.display();
        car1.startCar();
        car1.stopCar();
        car1.setEngine(engine);
        /*
                constructor of tyre and engine is used to insert dependency
                called Constructor Injection
         */

    }
}
