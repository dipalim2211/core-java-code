package com.example.conditionalstatement;

public class ConditionalStatementTernaryDemo {

    public static void main(String[] args) {

        int mark=80;

        String result = "";

        if(mark<60)
            result="Fail";
        else
            result="Pass";
        System.out.println("Your result is "+result);
        System.out.println("\n");

        //CASE Using Ternary Operator

        //Expression/Condition ? true : false

        System.out.println("Use Of Ternary Operator");

        mark=40;

        result =mark<60 ? "Fail" : "Pass" ;

        System.out.println("Your result is "+result);

    }
}
