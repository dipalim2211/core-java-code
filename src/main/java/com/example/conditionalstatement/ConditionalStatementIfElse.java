package com.example.conditionalstatement;

public class ConditionalStatementIfElse {

    public static void main(String[] args){

        //Case : if condition executes immediate single line

        if(true)
            System.out.println("Condition is True");
        System.out.println("Next line of if(true) statement");

        System.out.println("\n");

        if(false)
            System.out.println("Condition is False");
        System.out.println("Next line of if(false) statement");

        System.out.println("\n");

        //Case : if block

       int age=40;

       if(age<60)
       {
           System.out.println("Not Capable for pension");
           System.out.println("Please enter valid age");
       }
        System.out.println("Sorry! for inconvenience");

        System.out.println("\n");


       age=62;

       if(age<60)
       {
           System.out.println("Age "+age+" Not Capable for pension");
           System.out.println("Please enter valid age");
       }
        System.out.println("Age  "+age+" Capable for pension");

        System.out.println("\n");

        //Case : else condition executes immediate single line
        System.out.println("if-else condition"+"\n");

        if(age<60)
        {
            System.out.println("Not capable for pension");
        }
        else
            //else scope is by default one line
            System.out.println("Age "+ age +" Congratulation capable for pension");
        System.out.println("GO for next PROCESS");

        System.out.println("\n");

        //Case : else block

        if(age>80)
        {
            System.out.println("capable for scheme ");
        }
        else {
            System.out.println("Age " + age + " Not capable for scheme");
            System.out.println("DON'T GO for next PROCESS");
        }

        System.out.println("\n");
    }
}
