package com.example.collectionIterator;


import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class IteratorInterfaceDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Iteration Type 1 - Advance for loop");

        for(String s : names){
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Iteration Type 2 - Iterator Pattern");

        Iterator<String> iterator1 = names.iterator();

        //names.iterator(); calls the iterator() method on the names collection

        while (iterator1.hasNext())   // Check if there's another element
        {
            String name1 = iterator1.next();  // retrieve actual Value
            System.out.println(name1);
        }
        System.out.println();

        System.out.println("Remove element while iterating");

       Iterator<String> iterator2 = names.iterator();

        while (iterator2.hasNext())
        {
            String name2 = iterator2.next();
            if(name2.equals("Bob")){
                iterator2.remove();}
        }

        System.out.println(names);

        System.out.println();
        System.out.println("Iteration type 3:For Each Loop Java 1.8 Version");
        names.forEach((name)-> System.out.println(name));

        System.out.println();

        System.out.println("Iteration over Map");

        System.out.println("New HashMap : student2");
        Map<String,Integer> student2 =  new HashMap<>();
        student2.put("Dip",1000);
        student2.put("Max",2000);
        student2.put("Min",3000);
        student2.put("Sam",4000);

        System.out.println("Iteration For Each");
        student2.forEach(((key,value)-> System.out.println(key+" "+value)));
        System.out.println();



    }
}
