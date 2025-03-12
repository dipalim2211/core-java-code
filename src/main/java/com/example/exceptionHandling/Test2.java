package com.example.exceptionHandling;

public class Test2
{
    public static void main(String[] args)
    {

        System.out.println("Start Of Execution ");

        try {

            int p = 20;
            int q = Integer.parseInt(args[0]);  //commandLine Input : Dipa

            int add = p+q;
            System.out.println(add);

            int a = 10;
         //   int b = 0;
            int b=2;

            int result = a/b;
            System.out.println(result);

            String str = null;
            System.out.println("Length : "+str.length());

        } catch (ArithmeticException e) {
            System.out.println("Exception: "+e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: "+e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Provide Integer Value ");
        } catch (Exception e) {
            System.out.println("Generic Exception");
        }

        System.out.println("End Of Execution");
    }
}
