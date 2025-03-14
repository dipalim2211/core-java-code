package com.example.collectionSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BTreeSetDemo {

    //Ordered
    //Sorted

    public static void main(String[] args) {

        Set<Integer> number1 = new TreeSet<>();     //By Default : Ascending
        number1.add(10);
        number1.add(20);
        number1.add(10);      //No Error : but doesn't add to set
        number1.add(50);
        number1.add(30);
        number1.add(60);


        System.out.println("TreeSet number1 : "+number1);

        Set<Integer> number2 = new TreeSet<>(Comparator.reverseOrder());
        number2.add(10);
        number2.add(20);
        number2.add(10);      //No Error : but doesn't add to set
        number2.add(50);
        number2.add(30);
        number2.add(60);

        //Case : TreeSet follow order +Sorted
        System.out.println("TreeSet number2 : "+number2);


    }
}
