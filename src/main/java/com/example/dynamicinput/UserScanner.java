package com.example.dynamicinput;

import java.util.Scanner;

public class UserScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");

        String input=sc.next();

        System.out.println("Name "+input);

        System.out.println();
        System.out.println("Enter Name and Surname");

        String name1=sc.next();
        String surname=sc.next();

        System.out.println(name1+" "+surname );

        sc.nextLine();

        /* ChatGPT
        If you're using Scanner and calling nextInt(), nextDouble(),
        or similar methods before nextLine(), an extra newline character (\n)
        remains in the input buffer. This causes nextLine()
        to consume the leftover newline instead of waiting for user input.
        */

        System.out.println();
        System.out.println("Enter Degree and Address");
        String data1 = sc.nextLine();

        System.out.println("Degree And Address ");
        System.out.println(data1);

        System.out.println("Enter int");
        System.out.println("int value : "+sc.nextInt());

        System.out.println("Enter Float");
        float fData=sc.nextFloat();
        System.out.println("Float value : "+fData);



        sc.close();
    }
}