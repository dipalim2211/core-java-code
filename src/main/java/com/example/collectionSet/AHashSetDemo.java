package com.example.collectionSet;

import java.util.*;

public class AHashSetDemo {

    //No Order
    //No Sorted

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(10);
        l1.add(50);
        l1.add(30);
        l1.add(60);

        //List : Follow Order
        System.out.println("List : "+l1);

        Set<Integer> number1 = new HashSet<>();
        number1.add(10);
        number1.add(20);
        number1.add(10);      //No Error : but doesn't add to set
        number1.add(50);
        number1.add(30);
        number1.add(60);

        //Case : HashSet Don't follow order
        System.out.println("HashSet : "+number1);

        Set<Integer> number2 = new TreeSet<>();
        number2.add(10);
        number2.add(20);
        number2.add(10);      //No Error : but doesn't add to set
        number2.add(50);
        number2.add(30);
        number2.add(60);

        //Case : TreeSet follow order
        System.out.println("TreeSet : "+number2);



/*
        Set<Integer> number2 = new HashSet<>();

        for(int i =10;i<50;i++){
            number2.add(i+1);
        }

        System.out.println(number2);

 */
    }
}
