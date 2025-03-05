package com.example.methodoverriding;

import java.util.Objects;

class Teacher{

    int id;
    String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


class Student{

    int number;
    String name;

    public Student(int number, String name)
    {
        this.number = number;
        this.name = name;
    }

    public String toString(){

        return ("Roll Number : "+number+"\t"
                +" Name : "+name );

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}

public class ObjectClassMethodOverride {

    public static void main(String[] args) {

        Teacher t1 = new Teacher(01,"A");
        System.out.println(t1);

        Student s1 ;
        //toString methode called by java automatically

        s1 = new Student(1,"P");
        System.out.println(s1);

        s1 = new Student(2,"Q");
        System.out.println(s1.toString());

        Student s2 = new Student(2,"P");


        if(s1.equals(s2))
            System.out.println("Same Roll Number of S1 and S2 i.e "+ s1.number);
        else
            System.out.println("NOT Same Roll Number of S1 and S2");
    }




}
