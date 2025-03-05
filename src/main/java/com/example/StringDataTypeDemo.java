package com.example;

public class StringDataTypeDemo {

    public static void main(String[] args) {

        String s1="10";
        int a = 20;

        a=a+10;
        System.out.println(a);

        s1=s1+10;
        System.out.println(s1);  //Concatenation

        String firstName = "Dipa";
        String lastName  = "Mahesh";

        String fullName = firstName+lastName;
        String fullName1 = firstName+" "+lastName;

        System.out.println(fullName);
        System.out.println(fullName1);

        String data1 = "10";

        /*Conversion of String to Int by Integer Java class Methode
                parseInt();
         */

        //  int iData =data;   cannot be converted to int

        System.out.println("Type Conversion using parseInt()");
        int iData = Integer.parseInt(data1);
        System.out.println(iData);

         /*
         Passing String for int conversion

        String data2="Snowy";
        int newData = Integer.parseInt(data2);
        System.out.println(newData);  //Error

            Error - NumberFormatException
            – if the string does not contain a parsable integer.
         */

        /*
        System.out.println("Passing string value for int conversion");

        String data3 = "10.5";
        int fData = Integer.parseInt(data3);
        System.out.println(fData);

        Error -
        NumberFormatException
        as double size is max than int

        */

        System.out.println(" String to  double and float conversion");
        double dData = Double.parseDouble("10.15343545"); //String to double
        float fData = Float.parseFloat("10.15343545f"); //String to float
        System.out.println("double "+dData);
        System.out.println("float "+fData);






    }

}
