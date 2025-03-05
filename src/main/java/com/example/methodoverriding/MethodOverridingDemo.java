package com.example.methodoverriding;

class Employee{

    public void showId()
    {
        System.out.println("Employee ID");
    }

    public void nameDisplay()
    {
        System.out.println("Employee Name");
    }

}

class Manager extends Employee{

    @Override
    public void showId()
    {
        System.out.println("Manager ID");
    }

    //Methode Signature is different so not Method Overriding

    public void nameDisplay(String name)
    {
        super.nameDisplay();
        System.out.println("Manager Name : "+ name);
    }
}


public class MethodOverridingDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.showId();
        e1.nameDisplay();

        Manager m1 = new Manager();
        m1.showId();
        m1.nameDisplay("Max");
    }

}
