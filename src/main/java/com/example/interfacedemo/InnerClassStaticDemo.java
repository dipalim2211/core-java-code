package com.example.interfacedemo;

class Out {

   public Out() {
       System.out.println("Out class default constructor");

    }
    public void getOuter() {
        System.out.println("Outer Class Methode");
    }

    static class Inner {

        public void getInner() {
            System.out.println("Inner Class Methode");
        }

    }
}

public class InnerClassStaticDemo {

    public static void main(String[] args) {

        /*
         No need of Outer class object to call inner class method
         and so that
         default constructor of out method not called
         */

        Out.Inner inner = new Out.Inner();
        inner.getInner();
    }
}
