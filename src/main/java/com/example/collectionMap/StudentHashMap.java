package com.example.collectionMap;

import java.util.*;
/*
class Student{

   private int id;
   private int age;
   private String name;

    public Student(int id, int age, String name) {

        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}

*/
public class StudentHashMap {

    public static void main(String[] args) {

        List<Student> student1 = new ArrayList<>();
        student1.add(new Student(1, 10, "A"));
        student1.add(new Student(2, 15, "B"));
        student1.add(new Student(3, 10, "C"));
        student1.add(new Student(4, 20, "D"));

        //Iterate Over Collection:Read Purpose
        for (Student s1 : student1) {
            System.out.println(s1);
        }

        System.out.println();

        //Specify Print Option : Name and Age

        for (Student s2 : student1) {
            System.out.println(s2.getName() + "  " + s2.getAge());
        }

        System.out.println();

        //Iterator : Modify Collection while iterating

        Iterator<Student> itr1 = student1.iterator();

        //student1.iterator() - call iterator method on student object
        //Return iterator Object


        while (itr1.hasNext())  //return true : if element present
        {
            Student value1 = itr1.next();
            System.out.println(value1);
        }

        System.out.println();
        //remove element

        System.out.println("you cannot perform a while loop iteration twice " +
                "on the same Iterator object ");
        while (itr1.hasNext())
        {
            Student value2 = itr1.next();
            if (value2.equals("D"))
                itr1.remove();
        }

        student1.forEach(System.out::println);  //Java 8 : forEach Methode

        System.out.println();

        System.out.println("remove Function");
        Iterator<Student> itr2 = student1.iterator();

        while (itr2.hasNext())
        {
            Student value2 = itr2.next();
            if (value2.getName().equals("D"))
                itr2.remove();
        }

        student1.forEach(System.out::println);

        System.out.println();

        System.out.println("Student Object with HashMap");

        Map<Integer,Student>studentMap1 =new HashMap<>();

        studentMap1.put(11,new Student(21,30,"Dipak"));
        studentMap1.put(12,new Student(22,32,"Max"));
        studentMap1.put(13,new Student(23,35,"Mini"));
        studentMap1.put(14,new Student(24,30,"Sam"));

        studentMap1.forEach((Integer,Student)->System.out.println(" Value: " +Student));




    }
}
