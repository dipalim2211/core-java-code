package com.example.anonymusClass;

abstract class A
{
    public abstract void show();
}

/*
class B extends A{

    public void show() {
        System.out.println("Show method of B");
    }
}
*/

public class AbstractDemo
{

    public static void main(String[] args) {

        /*
            we don't create object of abstract class but at
            RunTime class object created and stored at reference of A
         */

        A a = new A() {
            @Override
            public void show() {
                System.out.println("Show Method of B class");
            }
        };
        a.show();
    }
}
