package com.example.upcastingdowncasting;

class A{

    public void show(){

        System.out.println("Super Class Show() ");
    }
    public void getData()
    {
        System.out.println("Super Class getDAta()");
    }

}

class B extends A{

    public void show()
    {

        System.out.println("Sub Class Show() ");
    }

    public void display()
    {
        System.out.println("Sub Class Display()");
    }

}

public class CastingClass {
    public static void main(String[] args) {

        System.out.println("A class Function");
        A objA = new A();
        objA.show();
    //    obj.display();  Error : Class A don't have display() method

        System.out.println("B class Function");
        B objB = new B();
        objB.show();
        objB.display();

        System.out.println("Parent Class ref. can access parent cls function");
        A objA1 = new B();      //Up Casting
        objA1.show();
        objA1.getData();
   //     objA1.display();      //Error

        System.out.println("Calling Derived class method using base class reference");

        B objB2 = (B)objA1;     //Down casting
        objB2.display();
        objB2.show();



    }

}
