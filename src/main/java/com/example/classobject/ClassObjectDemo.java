package com.example.classobject;

class Calculator{

    //1.Properties


    /*  2.Behaviour
        Add
     */

    /*
    // CASE 1
    public void add()
    {
        int addResult = 10+5;
        System.out.println(addResult);
    }
    */

    /*
    //CASE 2 : Return Type-Function with no parameter

    int add()
    {

        int addResult = 10+5;
        return addResult;

    }
     */

    // CASE 3 : Return Type-Function with parameter

    int add(int number1 , int number2) //number1/2 - Function Argument
    {
        System.out.println("Return Type - Function with parameter");
        int res = number1+number2;
        return res;
    }

}

public class ClassObjectDemo {

    public static void main(String[] args) {

        //Real time calculator object
        Calculator calc = new Calculator();
         /*
         //CASE 1
          calc.add();

         */
        /*

         //CASE 2 : Function with no parameter
               int result = calc.add();
               System.out.println(result);

         */

            //CASE 3 : Function with parameter
        int result = calc.add(10,20); //Make Function Call
        System.out.println(result);

            //CASE 4 : Call Function Parameter Multiple Time
        result = calc.add(30, 20);
        System.out.println(result);

        result = calc.add(40,20);
        System.out.println(result);



    }


}
