package com.example.loopdemo;

public class LoopForDemo {


    public static void main(String[] args) {

        System.out.println("Printing * five times one bye one");

        for(int i = 1;i<=5;i++)
        {
            for (int j =1 ;j<=5 ;j++)
            {
                System.out.print("*");
            }
             System.out.println(" ");
        }

        System.out.println(" Second Example" +
                "Printing * five times");

        for(int i = 1;i<=5;i++)
        {
            for (int j =1 ;j<=i ;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        /*
       //Ex - While Loop

        System.out.println("While Loop Example");
        int i = 1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }

        //Ex - For Loop

        System.out.println("For Loop Example");
        for(i=1;i<=5;i++)
        {
            System.out.println(i);
        }

         */

        /*
            For - If you know the end condition
            While - If you don't know end condition
         */




    }

}
