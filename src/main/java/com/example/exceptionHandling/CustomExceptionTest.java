package com.example.exceptionHandling;

//CASE 01: Checked Exception
/*
class BankException extends Exception{

    public BankException(String msg){
        super(msg);
    }

}

public class CustomExceptionTest {

    public static void main(String[] args) throws BankException {
        try {
            int a = 10;
            int b = 0;

            int result = a/b;
            System.out.println(result);

        } catch (ArithmeticException e) {
            throw new BankException("Cant Divide by 0");
        }
    }
}
 */


//CASE 02 : Unchecked Exception

class BankException extends RuntimeException{

    public BankException(String msg){
        super(msg);
    }

}

public class CustomExceptionTest {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a/b;
            System.out.println(result);

        } catch (ArithmeticException e) {
            throw new BankException("Cant Divide by 0");
        }
    }
}
