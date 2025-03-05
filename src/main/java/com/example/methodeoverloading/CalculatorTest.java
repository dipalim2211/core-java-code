package com.example.methodeoverloading;

class Calculator{

    /*
            As per our need we define new methods with
            multiple parameter :
     */

    /*
    public int add(int n1, int n2 )
    {
        return n1+n2;
    }

    public int addThree(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }

    public double addDouble(double d1 , double d2)
    {
        return d1+d2;
    }

    public float addFloat(float f1,float f2)
    {
        return f1+f2;
    }

     */


    //It increases code readability
    public int add(int n1, int n2 )
    {
        return n1+n2;
    }

    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }

    public double add(double d1 , double d2)
    {
        return d1+d2;
    }

    public float add(float f1,float f2)
    {
        return f1+f2;
    }

}



public class CalculatorTest {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int intResult=cal.add(10,20);
        System.out.println(intResult);

        int intThree=cal.add(10,20,20);
        System.out.println(intThree);

        double dResult=cal.add(100,200);
        System.out.println(dResult);

        float fResult= cal.add(10.55f,20.55f);
        System.out.println(fResult);

    }
}
