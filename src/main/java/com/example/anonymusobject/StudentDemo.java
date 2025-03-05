package com.example.anonymusobject;

class Student
{
    String name;
    int age;

    Student(String name,int age)
    {
        System.out.println("Parameterized Constructor Called ");

        this.age=age;
        this.name=name;
    }

    public void getData()
    {
        System.out.println("Name :"+ name);
        System.out.println("Age  :"+ age);
    }

//    public Student getStudentData()
//    {
//        Student s = new Student("P", 40);
//        s.getData();
//        return s;
//    }

}

public class StudentDemo {

    public static Student getStudent()
    {
        return new Student("Z",30);
        /*
            here, I don't want to create reference of Student
            The one who call the methode will create ref of Student
            This will create Obj in memory with address eg-100

         */
    }

    public static void main(String[] args) {

        Student s1 = new Student("A",20);
        s1.getData();

        Student ref =getStudent();
        /*
            here reference is created as you call the methode to get age
            i.e ref.age
            this refers object address into ref and use value of ref

         */
        System.out.println("Age  :"+ref.age);
    }
}
