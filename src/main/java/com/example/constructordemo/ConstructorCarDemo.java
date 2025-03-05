package com.example.constructordemo;

 /*
    CONSTRUCTOR: Function/Method

    1.Special Function which will be called at time of object creation
    2.The name of constructor is same as class name
    3.There is No return Type
    4.Even if you don't write constructor Its by default provided by compiler
    5.You can have maximum of only one default constructor
    6.You cav have multiple parameterised constructor
         */

class CarDemo{

    String colour="";

    //Default Constructor
    CarDemo()
    {
        System.out.println("Im Car Default Constructor");
    }

    //Parameterised Constructor
    CarDemo(String newColour )
    {
        colour=newColour;
        System.out.println("Im Car Parameterised Constructor");
        System.out.println("Car Colour is : "+ colour);
    }

    public void carDemo()
    {
        System.out.println("Im not Constructor Method name is carDemo " +"\n"+
                "Not CarDemo");

    }
}


public class ConstructorCarDemo {

    public static void main(String[] args) {

        CarDemo cd = new CarDemo("RED");
       // cd.carDemo();


    }
}
