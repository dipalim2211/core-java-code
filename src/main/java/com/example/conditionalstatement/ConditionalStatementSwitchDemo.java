package com.example.conditionalstatement;

public class ConditionalStatementSwitchDemo {

    public static void main(String[] args) {

        //CASE Switch Statement

        System.out.println("Switch Statement");

        int day = 4;

        switch (day){
            case 1 :
                System.out.println("1");
            case 2 :
                System.out.println("2");
                System.out.println("2");
            case 4 :                      //Condition = True
                System.out.println("4");  //Start Execution from here
                System.out.println("4");
            case 5 :
                System.out.println("5");

            default:
                System.out.println("default case");
        }
        System.out.println("Execution of Switch");

        System.out.println("\n");

        //CASE Switch Break condition

        System.out.println("Switch Break Condition");

        String str ="Snowy";

        switch (str){

            case "Blue" :
                System.out.println("Dog");
                break;
            case "Snowy":
                System.out.println(str + "  cat");
                break;
            case "Hammi":
                System.out.println("Hamster");
                break;
            default:
                System.out.println("Default case");
        }
        System.out.println("Execution of Switch");





    }


}
