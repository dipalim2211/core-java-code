package com.example.dynamicinput;

import java.util.Scanner;

class  Student
{
    private  int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }
}


public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student(1,"A");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No :");
        int data1=sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Name");
        String data2=sc.nextLine();

        Student s2 = new Student(data1,data2);

        System.out.println(s2.getNo()+" "+s2.getName());

        sc.close();
    }


}
