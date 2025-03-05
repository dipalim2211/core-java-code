package com.example.inheritancedemo;

class Calculator
{
    public int add(int a, int b)
    {
       return a+b;
    }

    public double sub(double a,double b)
    {
        return a-b;
    }

}

class AdvanceCalculator extends Calculator
{
    /*
    public int add(int a, int b)
    {
        return a+b;
    }

    public double sub(double a,double b)
    {
        return a-b;
    }

     */

    public int div(int a, int b)
    {
        return a/b;
    }

    public int multiply(int a,int b)
    {
        return a*b;
    }


}

class scientificCalculator extends AdvanceCalculator{

    /*
    public int add(int a, int b)
    {
        return a+b;
    }

    public double sub(double a,double b)
    {
        return a-b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }

    public int multiply(int a,int b)
    {
        return a*b;
    }

     */

    public double power(int a, int b)
    {
        return Math.pow(a,b);
    }

    public  double sin(double a)
    {
        return  Math.sin(a);
    }

    public  double cos(double a)
    {
        return  Math.cos(a);
    }

}

public class Calculatorfunction {

    public static void main(String[] args) {

        Calculator calculator1 = new Calculator();

        int calculatorAdd=calculator1.add(5,5);
        System.out.println(calculatorAdd);

        double calculatorSub=calculator1.sub(10.5,5.5);
        System.out.println(calculatorSub);

        AdvanceCalculator advanceCalculator =new AdvanceCalculator();
        int advAdd=advanceCalculator.add(20,30);
        System.out.println(advAdd);

        double advSub=advanceCalculator.sub(40.5,30.0);
        System.out.println(advSub);

        int advDiv=advanceCalculator.div(50,2);
        System.out.println(advDiv);

        int advMul=advanceCalculator.multiply(10,20);
        System.out.println(advMul);

        scientificCalculator sc = new scientificCalculator();

        int scAdd = sc.add(200,400);
        System.out.println("Add scientific : "+scAdd);

        double scPower = sc.power(20,2);
        System.out.println("Power : " + scPower);

        double scSin = sc.sin(200);
        System.out.println("Sin : " + scSin);

        double scCos = sc.cos(300);
        System.out.println("Cos : " + scSin);



    }

}
