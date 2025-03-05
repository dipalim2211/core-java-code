package com.example.arithmaticoperator;

public class OperatorLogical {

    public static void main(String[] args)
    {
        //Case : Logical Operator
        //Whenever you want multiple condition check use logical Operator

        int age = 17;

        System.out.println("&& Operator");

        boolean result;
        if
        ((age > 20) && (age < 60))
            result = true;
        else result = false;
        System.out.println(result);

        System.out.println("|| Operator");

        result = (age > 20) || (age < 60);
        System.out.println(result);

        System.out.println("&& Operator");

        age = 25;
        result = (age > 20) && (age < 60);
        System.out.println(result);

        System.out.println("! Operator");

        age = 13;
        result =!(age>18) || (age<60);
        System.out.println(result);

        System.out.println("& Operator");

        int a =10;
        int b =20;
        int c = a&b;

        System.out.println(c);

        a=10;
        b=25;
        c=a&b;

        System.out.println(c);



    }
}
