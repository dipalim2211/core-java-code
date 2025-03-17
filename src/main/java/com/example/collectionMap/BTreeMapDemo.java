package com.example.collectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BTreeMapDemo {

    /*
        TreeSet : Sorted data based on key

     */
    public static void main(String[] args) {

        System.out.println("New HashMap : student1");
        Map<Integer,String> student =  new TreeMap<>();

        //Insert Element
        student.put(1,"Dip");
        student.put(5,"Max");
        student.put(2,"Min");
        student.put(4,"Sam");
        student.put(3,"Max");       //Allowed: Duplicate Value

        System.out.println(student);
        System.out.println();

        System.out.println("New HashMap : student2");
        Map<String,Integer> student2 =  new TreeMap<>();
        student2.put("Dip",1000);
        student2.put("Max",2000);
        student2.put("Heena",3000);
        student2.put("Anna",4000);

        for(Map.Entry<String,Integer> treePair : student2.entrySet())
        {
            System.out.println(treePair.getKey()+"  "+treePair.getValue());
        }

    }
}
