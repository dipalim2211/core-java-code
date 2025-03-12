package com.example.exceptionHandling;
//CASE : RETHROW EXCEPTION


public class Test5
{
    public static void main(String[] args)
    {

        try {
            int a = 10;
            int b = 0;

            int result = a/b;
            System.out.println(result);

        } catch (ArithmeticException e) {
           // throw new ArithmeticException("Cant Divide By 0");
            throw e;
        }finally {
            System.out.println("Finally Block Executed");
        }
    }
}
