package com.example.arithmaticoperator;

public class ArithmeticOperationInteger {

    public static void main(String[] args) {

        int number1= 10;
        int number2= 20;
        int number3 = 35;

        int sum = number1 + number2;
        int diff = number1 - number2;
        int mul = number1 * number2;
        int div1 = number1 / number2;
        float div2 = number1 / number2; // ERROR : Cast numerator to float
        int mod = number3 % number1;

        System.out.println("Integer DataType Output : ");
        System.out.println(" SUM : " + sum);
        System.out.println(" Diff : " + diff);
        System.out.println(" Multiplication : " + mul);
        System.out.println(" Division : " + div1);
        System.out.println(" Division : " + div2);
        System.out.println(" Modulus : " + mod + "\n\n\n");

    }
}
