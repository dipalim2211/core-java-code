package com.example.constructordemo;

class Student{

    //Instance variable

    String name;
    int age;

    Student(String s,int a)
    {
        name = s;
        age = a;
    }
}

public class ConstructorStudentDemo {



    public static void main(String[] args) {

        //example Memory address Location student1 =100
        Student student1 = new Student("Rekha",20);

        //student2 = 200;
        Student student2 = new Student("Meena",23);
        Student student3 = new Student("Amit",20);
        Student student4 = new Student("Milind",23);

        System.out.println("Student1 "+" Name : "+student1.name+" Age : "+student1.age);
        System.out.println("Student2 "+" Name : "+student2.name+" Age : "+student2.age);
        System.out.println("Student3 "+" Name : "+student3.name+" Age : "+student3.age);
        System.out.println("Student4 "+" Name : "+student4.name+" Age : "+student4.age);

        Student student5 = student2;
        System.out.println("Student5 "+" Name : "+student5.name+" Age : "+student5.age);
        //Another name given to your same memory location

    }
}
