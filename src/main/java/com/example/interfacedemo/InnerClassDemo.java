package com.example.interfacedemo;

class Outer{

    public void getOuter()
    {
        System.out.println("Outer Class Methode");
    }

    class Inner{

        public  void getInner()
        {
            System.out.println("Inner Class Methode");
        }

        public class NewInner{

            public void getNewInnerMethod()
            {
                System.out.println("Inside Inner Inner class methode");
            }
        }
    }

    //Nested Classes

    class InnerInner{

        public void getInnerInner()
        {
            System.out.println("Inside Nested Class");
        }
    }
}



public class InnerClassDemo {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.getOuter();

       //  Inner in = new Inner();  //Error

        Outer.Inner inner = outer.new Inner();
        inner.getInner();

        //Inside Inner Class



        //Nested Class Object
        Outer.InnerInner in = outer.new InnerInner();
        in.getInnerInner();
    }
}
