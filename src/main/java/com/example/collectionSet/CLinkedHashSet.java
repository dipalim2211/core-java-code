package com.example.collectionSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CLinkedHashSet {

    //Order
    //Not Sorted based on insertion order 

    public static void main(String[] args) {

        System.out.println("Input : 10 20 10 50 30 60");

        Set<Integer> number1 = new HashSet<>();
        number1.add(10);
        number1.add(20);
        number1.add(10);      //No Error : but doesn't add to set
        number1.add(50);
        number1.add(30);
        number1.add(60);

        //Case : HashSet Don't follow order
        System.out.println("HashSet : NonOrdered : "+number1);

        Set<Integer> number2 = new LinkedHashSet<>();
        number2.add(10);
        number2.add(20);
        number2.add(10);
        number2.add(50);
        number2.add(30);
        number2.add(60);

        //Case : LinkedHashSet follow order
        System.out.println("LinkedHashSet : Ordered :"+number2);


    }
}
