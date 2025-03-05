package com.example.dynamicinput;

public class CommandLineArgument {

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);

        String n1 = args[0];
        String n2 = args[1];

        int number1 =Integer.parseInt(n1);
        int number2 =Integer.parseInt(n2);

        int result = number1+number2;
        System.out.println(result);
    }
}
