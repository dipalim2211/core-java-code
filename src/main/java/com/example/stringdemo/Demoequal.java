package com.example.stringdemo;

public class Demoequal {

    public static void main(String[] args) {

        String s1="Dipa";        //SCP Address =100
        String s2="Snowy";       //SCP Address =200
        String s3="Dipa";        //SCP Address =100

        String s4=new String("Dipa"); //Heap Add = 500
        String s5=new String("Min");  //Heap Add = 600
        String s6=new String("Min");  //Heap Add = 700

        System.out.println("== OPERATOR CASE");
        System.out.println();

        System.out.println("CASE 1");
        if(s1==s2)      //100 == 200
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        System.out.println("CASE 2");
        if(s1==s3)      //100 == 100
            System.out.println("Equal");
        else
            System.out.println("Not Equal");


        System.out.println("CASE 3");
        if(s1==s4)      //100 == 500
            System.out.println("Equal");
        else
            System.out.println("Not Equal");


        System.out.println("CASE 4");
        if(s5==s6)      //600 == 700
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        System.out.println();

        System.out.println(".equals() Method CASE");

        System.out.println();

        System.out.println("CASE 1");
        if(s1.equals(s2))      //Dipa == Snowy
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        System.out.println("CASE 2");
        if(s1.equals(s3))      //Snowy == Snowy
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        System.out.println("CASE 3");
        if(s1.equals(s4))      //Dipa == Dipa
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        System.out.println("CASE 4");
        if(s5.equals(s6))      //Min == Min
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

    }
}
