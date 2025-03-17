package com.example.collectionsUtilClass;

import java.util.*;

public class CollectionUtilsDemo {

    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();

        list1.add("Pooja");
        list1.add("Adi");
        list1.add("Bob");
        list1.add("Zee");
        list1.add("Nil");
        list1.add("Bob");

        System.out.println(list1);

        System.out.println();

        //Collection interface : Holds Data
        //Collection : Utility class : perform operation on collection

        System.out.println("Sort Method");
        Collections.sort(list1);     //Static Fn: Accept List
        System.out.println(list1);

        System.out.println();

        System.out.println("Binary Search : to search element");
        //prerequisite:Data must be sorted : return index
        int index=Collections.binarySearch(list1,"Zee");
        System.out.println("index of Zee : "+index);

        System.out.println();

        System.out.println("frequency : repeat of same element in list");
        int count=Collections.frequency(list1,"Bob");
        System.out.println("Bob repeated for : "+count);

        System.out.println();

        System.out.println("reverse : reverse collection");
        List<String> list2 = new ArrayList<>(list1);
        System.out.println("List2 : " +list2);
        Collections.reverse(list2);
        System.out.println("Reversed List2: ");
        System.out.println(list2);

        System.out.println();

        System.out.println("Random shuffle of Data ");
        Collections.shuffle(list1);
        System.out.println(list1);
        System.out.println();

        System.out.println("Self_Study");

        List<Integer> no1 = new ArrayList<>(Arrays.asList(1,2,9,1,8,4));

        System.out.println("List : "+no1);

        Collections.sort(no1);
        System.out.println("Sorted List : "+no1);

        Collections.reverse(no1);
        System.out.println("Reversed List : "+no1);

        Collections.shuffle(no1);
        System.out.println("Shuffled List : "+no1);

    }
}
