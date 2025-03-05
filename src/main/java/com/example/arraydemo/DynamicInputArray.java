package com.example.arraydemo;

import java.util.Scanner;

public class DynamicInputArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Static Array Declaration

        //int[] arr={10,20};

        /*
            Dynamic Array Allocation

            1.Declare Array with number of element
            2.Dynamically add value into array

         */

        //CASE 1.Dynamic Array Declaration with size

        int[] arr = new int [5];  //Just Allocate memory with default value of datatype

        for(int i = 0;i< arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }

        //Before you do -
        arr[0]=1;
        arr[1]=2;
       // arr[2]=3;  //it gives you default value of int = 0
        arr[3]=4;
        arr[4]=5;

        System.out.println();
        for(int i = 0;i< arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }

        //CASE 2.Now want user input to store in array

        //Loop to take input & store in array

        System.out.println();
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("Enter " + (i+1) +" Value ");
            int data =sc.nextInt();
            arr[i]=data;
        }

        //Loop to iterate array
        System.out.println();
        for(int i = 0;i< arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        //case 3 : Dynamic size of array

        System.out.println("Enter Size of array");
        int size = sc.nextInt();

        int[] a1 = new int[size];

        System.out.println();
        for(int i=0;i< size;i++)
        {
            System.out.println("Enter " + (i+1) +" Value ");
            int data =sc.nextInt();
            a1[i]=data;
        }

        System.out.println();
        for(int i = 0;i< a1.length;i++)
        {
            System.out.print(a1[i] + "  ");
        }




        sc.close();
    }


}
