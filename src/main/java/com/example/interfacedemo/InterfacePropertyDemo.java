package com.example.interfacedemo;

interface A{

    void m1();
    void m2();
}

interface B extends A{

    void m3();
    void m2();  //method from interface A
}

class C implements A,B {


    @Override
    public void m3() {
        System.out.println("From class B");
    }

    @Override
    public void m1() {
        System.out.println("From class A");
    }

    @Override
    public void m2() {
        System.out.println("From class A");
    }
}

interface  Data{

    // Constructor not allowed

    /*
    Data()
    {

    }  */
}

public class InterfacePropertyDemo {
    public static void main(String[] args) {

        C c = new C();
                c.m1();
                c.m2();
                c.m3();
    }
}
