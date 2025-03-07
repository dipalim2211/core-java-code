package com.example.lambdaExpression;

@FunctionalInterface
interface Calculator{

    int add(int a, int b);

}

/*
class SimpleCalculator implements Calculator{

    public int add(int a, int b) {
        return a+b;
    }
}
*/

public class Test3 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator()
        {
            @Override
            public int add(int a, int b)
            {
                return a+b;
            }
        };
        int result=calculator.add(100,20);
        System.out.println("Addition : "+result);

        System.out.println("-------------------");

        Calculator calculator1 = (a, b) -> {
            return a+b;
        };
        int result1 = calculator1.add(20,20);
        System.out.println("Addition : "+result1);

        System.out.println("---------------------");

        Calculator calculator2=(a, b) -> a+b;
        int result2 = calculator2.add(10,20);
        System.out.println("Addition : "+result2);


    }
}
