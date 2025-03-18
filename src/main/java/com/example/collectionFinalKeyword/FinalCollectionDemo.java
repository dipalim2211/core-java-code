package com.example.collectionFinalKeyword;

import java.util.ArrayList;
import java.util.*;

public class FinalCollectionDemo {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(9);
        l1.add(2);
        l1.add(1);
        l1.add(8);

        System.out.println(l1);

        l1= new ArrayList<>();
        l1.add(91);
        l1.add(22);
        l1.add(14);
        l1.add(86);

        System.out.println(l1);

        final List<Integer> l2 = new ArrayList<>();
        l2.add(9);
        l2.add(2);
        l2.add(1);
        l2.add(8);

        System.out.println(l2);

       // l2 = new ArrayList<>();

        // Cant assign to final l2 variable

    }
}
