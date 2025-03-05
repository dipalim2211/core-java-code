package com.example.arraydemo;

import java.util.SortedMap;

class Student{

    //Primitive Data Type
    private int rollNo;
    private String name;

    Student(int rollNo,String name)
    {
        this.rollNo=rollNo;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }


}


public class ArrayExample {


    public static void main(String[] args) {

        int m1 = 85;
        int m2 = 87;
        int m3 = 67;
        int m4 = 78;

        //Case : Array On primitive Data Type
        int[] marks={85,87,67,78};
        float[] fmarks={56.6f,67f};
        char[] character = {'A','B','C','D'};
        String[] studName = {"Max","Min","Joey","Chandler"};


        System.out.println(marks[0]);
        System.out.println(marks[3]);

        //Array Iteration

        for(int i=0 ;i<4;i++)
        {
            System.out.print(marks[i]);
            System.out.print("\t");
        }

        System.out.println();

        for(int i=0 ;i<4;i++)
        {
            System.out.print(character[i]);
            System.out.print("\t");
        }

        System.out.println();

        for(int i=0 ;i<4;i++)
        {
            System.out.print(studName[i]);
            System.out.print("\t");
        }
        System.out.println();
        System.out.println("STUDENT DEMO ");

        Student s1 = new Student(1,"A");
        Student s2 = new Student(2,"B");
        Student s3 = new Student(3,"C");
        Student s4 = new Student(4,"D");

        //Print Array Of Student

        System.out.println();
        System.out.println("PRINT ARRAY :");
        System.out.println(s1.getRollNo()+"\t"+s1.getName());
        System.out.println(s2.getRollNo()+"\t"+s2.getName());

        //Access and Print Data using Array

        Student[] sarr = {s1,s2,s3,s4};  //Object variable Store in Array

        System.out.println();
        System.out.println("Print Address of Object stored Array");
        System.out.println(sarr[0]);   //No Other Method Called
        System.out.println(sarr[1]);   //Print Address
        System.out.println(sarr[2]);
        System.out.println(sarr[3]);

        System.out.println();
        System.out.println("Print Data of Object(Object Stored In Array)");
        System.out.println("Number"+"\t"+"Name");
        System.out.println(sarr[0].getRollNo()+"\t"+"\t"+sarr[0].getName());
        System.out.println(sarr[1].getRollNo()+"\t"+"\t"+sarr[1].getName());
        System.out.println(sarr[2].getRollNo()+"\t"+"\t"+sarr[2].getName());
        System.out.println(sarr[3].getRollNo()+"\t"+"\t"+sarr[3].getName());

        //Avoid Repeating of Data using FOR loop

        System.out.println();
        System.out.println("Using For Loop");
        System.out.println("Number"+"\t"+"Name");

        for(int i = 0;i<4;i++)
        {
            System.out.println(sarr[i].getRollNo()+"\t"+"\t"+sarr[i].getName());
        }

//        new Student(11,"P");
//        new Student(12,"Q");
//        new Student(13,"R");

        System.out.println();
        System.out.println("Annonymus Object Creation & Stored In Array");
        Student[] sarr1 ={ new Student(11,"P"),new Student(12,"Q"),
                new Student(13,"R")};

        System.out.println("Number"+"\t"+"Name");

        for(int i = 0;i<3;i++)
        {
            System.out.println(sarr1[i].getRollNo()+"\t"+"\t"+sarr1[i].getName());
        }




    }


}
