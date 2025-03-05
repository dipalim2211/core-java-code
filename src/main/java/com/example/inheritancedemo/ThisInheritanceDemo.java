package com.example.inheritancedemo;

class Person{

  public   Person()
    {
        this(10);
        System.out.println("Default Person");
    }
   public Person(int a)
    {
        System.out.println("Para Person : "+a);
    }

}

class Employee extends Person{

    public   Employee()
    {
        System.out.println("Default Employee");
    }
    public Employee(int a)
    {
        System.out.println("Para Employee : "+a);
    }
}

class Manager extends Employee{

    public   Manager()
    {
        this(20);
        System.out.println("Default Manager");
    }
    public Manager(int a)
    {
        System.out.println("Para Manager : "+a);
    }
}


public class ThisInheritanceDemo
{
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Manager m1  = new Manager();
    }
}
