package com.example.arithmaticoperator;

public class ArithmeticOperationDouble {

    public static void main(String[] args) {

        double dNumber1 = 10.50;
        double dNumber2 = 20.055;

        double dSum = dNumber1 + dNumber2;
        double dDiff = dNumber2 - dNumber1;
        double dMul = dNumber1 * dNumber2;
        double dDiv1 = dNumber1 / dNumber2;
        double dDiv2 = dNumber1 / dNumber2;
        double dMod = dNumber2 % dNumber1;

        System.out.println("Double DataType Output : ");
        System.out.println("number"+dNumber1);
        System.out.println(" SUM : " + dSum);
        System.out.println(" Diff : " + dDiff);
        System.out.println(" Multiplication : " + dMul);
        System.out.println(" Division : " + dDiv1);
        System.out.println(" Division : " + dDiv2);
        System.out.println(" Modulus : " + dMod + "\n\n\n");

    }
}
