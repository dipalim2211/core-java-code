package com.example.staticdeno;

class Employee{

    String name;
    int id;

   // public static String company;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;

    }

    static {

        String company ="TCS";
        System.out.println("In Static Block");

    }

    public void getData(String company)
    {
        System.out.println("ID : "+id+" NAME : "+name+ " Company : " +company);
    }
}


public class StaticBlockDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee("D",1);
        e1.getData("Z");

    }
}
