package com.example.lambdaExpression;

@FunctionalInterface
interface CheckCondition{

    boolean check(int a);

}

/*
class  PositiveNumber implements CheckCondition{

    public boolean check(int a) {
        return a>0;  //True
    }
}

 */


public class Test4 {
    public static void main(String[] args) {

        CheckCondition checkCondition = a -> a>0;

    }
}
