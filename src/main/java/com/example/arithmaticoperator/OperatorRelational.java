package com.example.arithmaticoperator;

public class OperatorRelational {

    public static void main(String[] args) {

        int a = 10;

        System.out.println(a);

        a=20;  //You can use declared variable

        System.out.println(a);

        // Case : Relational Operator always return True / False

        System.out.println("Relational operator :  Single Check");
        int age = 25;

        boolean result;

        result= age<40;
        System.out.println(result);

        result=age>40;
        System.out.println(result);

        result= age>=25;
        System.out.println(result);

        age=40;

        result= age<=40;
        System.out.println(result);

        result= age==40;
        System.out.println("=="+result);

        result= age!=40;
        System.out.println("!="+result);
    }
}
