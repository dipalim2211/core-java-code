package com.example.collectionsUtilClass;

import java.util.Arrays;
import java.util.List;

public class ArraysClass {
    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("Dip","Sam","Kiwi","Max","Adi","Zee");
        System.out.println("List1 : "+l1+ "\n");

        System.out.println("List.of() : Pass Number of argument ");
        List<String> l2 = List.of("Dip","Sam","Kiwi","Max","Adi","Zee","Bee");
        System.out.println("List2 : "+l2+ "\n");

        System.out.println("Create List Passing Object");
        List<Student> l3 = List.of(
                new Student(1, 20, "D"),
                new Student(2, 21, "Z"),
                new Student(3, 22, "D"),
                new Student(4, 20, "B")
        );

        System.out.println("List3 : "+l3+ "\n");

        /*

        CASE 1:
        System.out.println("Add Student obj in immutable list l2");

         l1.add("DDD");
        System.out.println("List1 : "+l1+ "\n");

        CASE 2:
        System.out.println("Add Student obj in immutable list l3");

        l3.add(new Student(4, 20, "B"));
        System.out.println("List3 : "+l3+ "\n");

            Exception
            Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)

          */




    }
}
