package com.example.lambdaExpression;

//CASE 01

interface A{

    void showA();

}

/*
class Aa implements  A{

    public void showA()
    {
        System.out.println("One Method to implement");
    }
}
*/

public class Test1 {

    public static void main(String[] args) {

        /*
        A a = new Aa();
        a.showA();
        */

        A a = new A(){
            public void showA() {
                System.out.println("Functional Programming Syntax");
            }
        };
        a.showA();

    }
}
