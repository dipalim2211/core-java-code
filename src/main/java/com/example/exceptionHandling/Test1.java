package com.example.exceptionHandling;

//Single Try and Catch
public class Test1 {

    public static void main(String[] args) {

        System.out.println("Start Of Execution ");

        try {
            int a = 10;
            int b = 0;

            int result = a/b;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Exception: "+e.getMessage());
        }

        System.out.println("End Of Execution");
    }
}
