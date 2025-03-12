package com.example.exceptionHandling;


import java.util.Arrays;

//Case : Exception Class Methods
public class Test4 {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a/b;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Exception: "+e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

}
