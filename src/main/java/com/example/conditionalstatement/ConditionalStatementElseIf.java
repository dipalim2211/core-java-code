package com.example.conditionalstatement;

public class ConditionalStatementElseIf {

    public static void main(String[] args) {
        //Case - If block

        System.out.println("if statement");
        int day = 3;

        if(day==1)
            System.out.println("Monday");
        if(day==2)
            System.out.println("Tuesday");
        if(day==3)
            System.out.println("Wed");
        if(day==4)
            System.out.println("Thurs");
        if(day==5)
            System.out.println("Friday");

        //Case - else if

        System.out.println("else if statement");
        day = 2;

        if(day==1)
            System.out.println("Monday");
        else if(day==2)
            System.out.println("Tuesday");
        else if(day==3)
            System.out.println("Wed");
        else if(day==4)
            System.out.println("Thurs");
        else if(day==5)
            System.out.println("Friday");
        else
            System.out.println("Invalid Input");
        System.out.println("Exit elseIf");



    }




}
