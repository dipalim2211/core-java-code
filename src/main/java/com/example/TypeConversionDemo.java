package com.example;

import java.sql.SQLOutput;

public class TypeConversionDemo {

    public static void main(String[] args) {

        //Type 1 - Implicit Casting

        byte b = 10;
        int a = b ;     //Assign byte to int
        short s = b;    //Assign byte to short

        System.out.println("Implicit Casting");
        System.out.println(b);
        System.out.println(a);
        System.out.println(s);

        /*
        b = s;
        System.out.println(b);
        Error : possible lossy conversion from short to byte
         */

        //Type 2 - Explicit Casting

        int i1 = 20;
        short s1 = (short) i1;      //Assign int to short
        byte b1 = (byte)s1;         //Assign short to byte

        double d2 = 20.5;
        int i11 = (int)d2;

        System.out.println("Explicit Casting");
        System.out.println(s1);
        System.out.println(b1);
        System.out.println(i11);

        int i2 = 200;
        short s2 = (short) i2;
        byte b2 = (byte)s2;

        System.out.println("Explicit Casting");
        System.out.println(s2);
        System.out.println(b2);

        System.out.println("Type Promotion");

        byte b3 = 100;
        byte b4 = 100;

        //  byte b5 =b3+b4;  Error - lossy Conversion

        int b5 = b3 + b4 ;

        System.out.println("Byte Promotion to Int  "+ b5);

        // CHARACTER CASTING
        System.out.println("Character Casting");

        char c1 = 'a';
        char c2 = 'z';
        char c3 = 'A';
        char c4 = 'Z';
        char c5 = '1';
        char c6 = '9';

        int ic1 = (int)c1;

        System.out.println("a - "+ ic1);
        System.out.println("z - "+ (int)c2);
        System.out.println("A - "+ (int)c3);
        System.out.println("Z - "+ (int)c4);
        System.out.println("0 - "+ (int)c5);
        System.out.println("9 - "+ (int)c6);


    }
}
