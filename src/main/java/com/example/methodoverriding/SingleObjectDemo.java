package com.example.methodoverriding;

import java.util.Scanner;

class A{

    public void show(){
        System.out.println("In A Show Function");
    }
}


class B extends A{

    public void show(){
        System.out.println("In B Show Function");
    }
}

class C extends B{

    public void show(){
        System.out.println("In C Show Function");
    }
}


public class SingleObjectDemo {

    public static void main(String[] args) {

        //Base Class reference can point any derived clas object

        A obj1 =new A();
        obj1.show();

        obj1 = new B();
        obj1.show();

        obj1 =new C();
        obj1.show();

        System.out.println();

        // Late Binding
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Behavior Class "+"\t"+"A"+"\t"+"B"+"\t"+"C");
        String input = sc.next();

        A obj2 = null;

        switch (input)
        {
            case "A" :
                obj2 = new A();
                break;
            case "B" :
                obj2 = new B();
                break;
            case "C" :
                obj2 = new C();
                break;
        }

        obj2.show();

        sc.close();
    }



}
