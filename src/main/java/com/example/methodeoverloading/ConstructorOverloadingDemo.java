package com.example.methodeoverloading;

class Calculate{

    Calculate(String s){
        System.out.println(s);
        System.out.println("Default Constructor");

    }

    Calculate(int n1) {
        System.out.println("Two Argument int Constructor Calling");
        System.out.println("int  :"+n1);
    }

   Calculate(int n1,int n2){
        System.out.println("Two Argument int Constructor Calling");
        int res= n1+n2;
       System.out.println("Add  :"+res);
    }

    Calculate(int n1, float f1){
        System.out.println("Two Argument Int float calling");
    }

}



public class ConstructorOverloadingDemo {

    public static void main(String[] args) {

        Calculate cal = new Calculate("Debug");
        new Calculate(10);
        new Calculate(10,20);
        new Calculate(10,10.5f);
    }
}
