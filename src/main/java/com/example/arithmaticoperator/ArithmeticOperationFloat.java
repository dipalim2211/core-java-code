package com.example.arithmaticoperator;

public class ArithmeticOperationFloat {

    public static void main(String[] args) {

        /*
        float f;
        System.out.println(f);
        //Error -  variable f might not have been initialized
        */

        /*
        float fnum = 10.8888;   //Error Data Loss Error 8 byte code in 4 byte
        */

        float fNum1 = 10.55f;   //Used for banking
        float fNum2 = 20.50f;

        float fSum = fNum1 + fNum2;
        float fDiff = fNum2 - fNum1;
        float fMul = fNum1 * fNum2;

        System.out.println("float Number1 : " +fNum1);
        System.out.println(fSum);
        System.out.println(fDiff);
        System.out.println(fMul);


    }
}
