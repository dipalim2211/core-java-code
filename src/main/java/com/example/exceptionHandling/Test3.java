package com.example.exceptionHandling;

public class Test3
{
    //CASE :

    /*
    public static void main(String[] args)
    {
        f1();
    }

    private static void f1(){
        f2();
    }

    private static void f2(){
        Thread.sleep(1000);

        // exception java.lang.InterruptedException


    }
    */

    //CASE : Working With Checked Exception

    /*
    public static void main(String[] args)
    {
        f1();
    }

    private static void f1(){
        f2();
    }

    private static void f2(){

        try{
            System.out.println("In Function2");
            Thread.sleep(1000);
            System.out.println("Out Function2");
        }catch (InterruptedException e)
        {
            System.out.println("Thread interrupted .. Please Take care of it");
        }

    }

     */

    //CASE :Exception Propagation

    public static void main(String[] args)throws InterruptedException
    {
        f1();
    }

    private static void f1()throws InterruptedException
    {
        f2();
    }

    private static void f2() throws InterruptedException
    {
            System.out.println("In Function2");
            Thread.sleep(1000);
            System.out.println("Out Function2");


    }
}
