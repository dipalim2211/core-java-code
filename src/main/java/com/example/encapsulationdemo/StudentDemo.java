package com.example.encapsulationdemo;

/* Encapsulation achieved by getter and setter

 */


 class Student
 {
     String name;
     private int age;        //Protect Data

     Student(String s, int a)
     {
         name =s;
         age = a;
     }

     int getAge()        //Permission to get data
     {
         return age;
     }

     void setAge(int a){     //Permission to set value

         if(a>0 && a<100)
            age=a;
         else
             System.out.println("Invalid Age");
     } 


 }


public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Dipali",25);
        System.out.println(s1.name);
     //   System.out.println(s1.age); //ERROR : age has private access
        System.out.println("Non Updated age : "+s1.getAge());
        s1.setAge(30);      //Try to change Age
        System.out.println("Set Age : "+s1.getAge());
        s1.setAge(100);


    }


}
