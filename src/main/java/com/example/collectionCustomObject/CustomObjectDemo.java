package com.example.collectionCustomObject;

import com.example.abstractdemo.advjava.Entry;

import java.util.*;

public class CustomObjectDemo {


    public static void main(String[] args) {

        System.out.println("Custom Object Using List\n");

        List<Student> student1 = new ArrayList<>();

        //Pass Object of student
        student1.add(new Student(1, 10, "A"));
        student1.add(new Student(2, 15, "B"));
        student1.add(new Student(3, 10, "C"));
        student1.add(new Student(4, 20, "D"));

        //Iterate Over Collection:Read Purpose
        for (Student s1 : student1) {
            System.out.println(s1);     //toString Method of Student called
        }

        System.out.println();

        System.out.println("Specify Print Option : Name and Age");

        for (Student s2 : student1) {
            System.out.println(s2.getName() + "  " + s2.getAge());
        }

        System.out.println();

        Iterator<Student> itr1=student1.iterator();
        while(itr1.hasNext()){
            Student s1=itr1.next();
            if(s1.getName().equals("B"))
                itr1.remove();
        }

        for (Student s2 : student1) {
            System.out.println(s2.getName() + "  " + s2.getAge());
        }

        System.out.println();
        //.equals compare object
        //Want to compare only name(Inside student Object , Compare Name)

//------------------------------------------------------------------------
        System.out.println("Custom Object Using Set\n");

        Set<Student> student2 = new HashSet<>();

        student2.add(new Student(11, 10, "AA"));
        student2.add(new Student(12, 15, "BB"));
        student2.add(new Student(13, 10, "CC"));
        student2.add(new Student(14, 20, "DD"));

        for (Student s1 : student2) {
            System.out.println(s1);
        }

        System.out.println();

        System.out.println("Specify Print Option : Name and Age");

        for (Student s2 : student2) {
            System.out.println(s2.getName() + "  " + s2.getAge());
        }

        System.out.println();

//-------------------------------------------------------------------

        System.out.println("Custom Object Using Map\n");

        Map<Integer,Student> student3 = new HashMap<>();

        student3.put(1,new Student(21, 10, "AAA"));
        student3.put(2,new Student(22, 15, "BBB"));
        student3.put(3,new Student(23, 10, "CCC"));
        student3.put(4,new Student(24, 20, "DDD"));

        System.out.println(student3);

        System.out.println();

        System.out.println("Print key And Name ");
        for(Map.Entry<Integer,Student> e1:student3.entrySet())
        {
            System.out.println(e1.getKey()+" "+e1.getValue().getName());
        }

        System.out.println();

        System.out.println("Search 2nd number Student : get(Key)");

        Student s1 =student3.get(2);
        System.out.println("Name : "+s1);

        System.out.println();
    }
}
