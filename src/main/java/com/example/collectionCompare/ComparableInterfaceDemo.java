package com.example.collectionCompare;

import java.util.*;

public class ComparableInterfaceDemo {

    public static void main(String[] args) {

        List <Integer> l1 = new ArrayList<>();

        l1.add(9);
        l1.add(2);
        l1.add(1);
        l1.add(8);

        System.out.println(l1);

        Collections.sort(l1);

        System.out.println("Sorted List");

        System.out.println(l1);

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "P"));
        students.add(new Student(3, "B"));
        students.add(new Student(2, "R"));
        students.add(new Student(4, "D"));

        for(Student s1 : students) {
            System.out.println(s1);
        }

       //Collections.sort(students); //Before Implementation give ERROR

        System.out.println("Sorting Based on id Descending Manner : ");

        System.out.println("After Sort : ");

        Collections.sort(students);

        for(Student s1 : students) {
            System.out.println(s1);
        }

    }


}
