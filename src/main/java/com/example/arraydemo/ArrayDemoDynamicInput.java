package com.example.arraydemo;

import java.util.Scanner;

class StudentData{

    private int rollNo;
    private String name;

    StudentData(int rollNo, String name)
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

public class ArrayDemoDynamicInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of student Information want to save");

        int noOfStudent=sc.nextInt();

        //Create Array object for student

        Student[] studarr = new Student[noOfStudent];

        for(int i =0;i<studarr.length;i++)
        {
            System.out.println("Enter Roll Number "+(i+1)+ " Student ");
            int rollNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name "+(i+1)+ " Student ");
            String name = sc.nextLine();

            studarr[i] = new Student(rollNumber,name); //store student data in array

        }

        for(int i =0;i<studarr.length;i++)
        {
            System.out.println(studarr[i].getRollNo()+"  "+studarr[i].getName());
        }





        sc.close();
    }
}
