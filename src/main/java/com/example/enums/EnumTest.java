package com.example.enums;

import java.util.Scanner;

enum Color
{
    RED,GREEN,BLUE,YELLOW;      //As soon as defined: Object Created

    //Constructor

    Color()
    {
        System.out.println("Object Created");
    }

}

enum Day
{
    MONDAY("Today is Monday"),TUESDAY("Today is Tuesday");

    private String msg;

    Day(String msg) {
        this.msg = msg;
    }

    //return msg
    public String getMsg() {
        return msg;
    }
}


public class EnumTest
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Color color = Color.RED;
        color = Color.RED;
        System.out.println(color);
        System.out.println("Number : "+color.ordinal());

        color = Color.GREEN;
        System.out.println(color);
        System.out.println("Number : "+color.ordinal());

        color = Color.BLUE;
        System.out.println(color);
        System.out.println("Number : "+color.ordinal());

        System.out.println();

        System.out.println("Enter Colour : ");

        color = Color.valueOf(sc.next());

        switch (color)
        {
            case RED :
                System.out.println("RED COLOR");
                break;
            case GREEN:
                System.out.println("GREEN COLOR");
                break;
        }

        System.out.println("--------");
        Day day = Day.MONDAY;
        System.out.println(day+" : "+day.getMsg());
        System.out.println(day.compareTo(Day.TUESDAY));
        System.out.println(day.describeConstable());

        System.out.println("Print color");

        Color[] col =Color.values();
        for(Color c :col)
        {
            System.out.println(c+" "+c.ordinal());
        }




        sc.close();
    }

}
