package com.example.collectionMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AHashMapDemo {

    //IMPORTANT : Set internally uses map data structure to implement uniqueness of
    //your data(And map has Key : Non duplicate)

    public static void main(String[] args) {

        System.out.println("New HashMap : student1");
        Map<Integer,String> student =  new HashMap<>();

        //Insert Element
        student.put(1,"Dip");
        student.put(3,"Max");
        student.put(2,"Min");
        student.put(5,"Sam");
        student.put(4,"Max");       //Allowed: Duplicate Value

        System.out.println(student);

        System.out.println();
        System.out.println("key : 5 value : Tin");
        student.put(5,"Tin");       //Override Value bcz same key

        System.out.println(student);

        System.out.println();

        //Search element in map
        System.out.println("get() : to get single value for 3 key");
        String value1 =student.get(3);
        System.out.println(value1);

        System.out.println();


        System.out.println("New HashMap : student2");
        Map<String,Integer> student2 =  new HashMap<>();
        student2.put("Dip",1000);
        student2.put("Max",2000);
        student2.put("Min",3000);
        student2.put("Sam",4000);

        System.out.println(student2);
        System.out.println();

        System.out.println("key : Max value : 5000");
        student2.put("Max",5000);       //Override Value bcz same key

        System.out.println(student2);
        System.out.println();

        System.out.println("get() : to get single value for Dip key");
        Integer value2 =student2.get("Dip");
        System.out.println(value2);
        System.out.println();

        //Remove Element
        System.out.println("remove(Min) : to remove value of Min key");
        student2.remove("Min");
        System.out.println(student2);
        System.out.println();

        System.out.println("Way of integrating map- dynamically iterate "+"\n" +
                "rather than specifying one key - : ");

        for(Map.Entry<String,Integer> pair : student2.entrySet())  //Faster retrieval for larger element
        {
            if(pair.getKey().equals("Max"))
            {
                System.out.println("Student is present in List");
            }
           // else : cant perform else Operation
           // {
           //     System.out.println("Student is not present in List");
           // }
            System.out.println(pair.getKey()+"\t"+pair.getValue());
        }

        System.out.println();

        System.out.println("Iterate only over Integer Values ");
        Collection<Integer> values=student2.values();
        for(Integer i : values){
            System.out.println(i);
        }

        System.out.println();

    }
}
