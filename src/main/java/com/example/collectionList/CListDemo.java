package com.example.collectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CListDemo {

    public static void main(String[] args) {

        List lists = new Vector();  //Provide Loose Coupling

        //Case : Add element in ARRAY

        lists.add(10);
        lists.add(20);
        lists.add(30);
        lists.add(40);
        lists.add(50);
        lists.add("Dipa");
        lists.add("Max");

        //List with Generic Integer
        List<Integer> v1= new Vector<Integer>();

        v1.add(10);
        v1.add(20);
        v1.add(30);
        // v1.add("Di"); Error

        System.out.println("Print Array : lists ");

        for(Object l : lists){
            System.out.println(l);
        }

        System.out.println("Print Array with generic : v1 ");

        for(Integer i : v1){
            System.out.println(i);
        }

        //Case : Remove Element

        System.out.println("Remove Element");
        lists.remove(2);        //Index:2
        System.out.println(lists);

        //Case : Add Duplicate Element

        System.out.println("Add Duplicate Element");
        lists.add(30);
        lists.add(50);
        lists.add(30);
        lists.add(50);
        System.out.println(lists);

        //Case : get Methode

        System.out.println("get Methode call[2] index : "+lists.get(2));

        //Case : Add element particular location

        System.out.println("Add element particular location");
        lists.add(2,30);    //(index,element)

        System.out.println(lists);

        List lists2 = new ArrayList();
        lists2.add(50);
        lists2.add(70);
        System.out.println("New List : "+lists2);

        //Case : Add another Collection in current list

        System.out.println("Add another Collection in current list");
        lists.addAll(lists2);
        System.out.println(lists);

        //Case : Remove newly added list : Remove all matches(50,70)

        System.out.println("Remove newly added List");
        lists.removeAll(lists2);
        System.out.println(lists);

        System.out.println("Add First Element");
        lists.addFirst(0);
        System.out.println(lists);

        System.out.println("Add Last Element");
        lists.add(100);
        System.out.println(lists);

        System.out.println("Delete all element from list");
        lists2.clear(); //delete all element
        System.out.println(lists2);

        System.out.println("Search element ");
        boolean r1=lists.contains(70);
        System.out.println(r1);

        System.out.println("Reverse list");
        lists.reversed();
        System.out.println("Lists : "+lists);    //Immutable

        lists=lists.reversed();       //New list to store
        System.out.println(lists);

        System.out.println("Want to sublist from list");
        lists2 = lists.subList(0,2);
        //sublist start from 0 & 2nd element
        System.out.println(lists2);

        System.out.println("Lists "+lists);
        System.out.println("Lists2 "+lists2);

        System.out.println("Return Index of 40 number list");
        int index1=lists.indexOf(40);
        System.out.println(index1);

        System.out.println("Return Index of 400 number : Not present");
        int index2=lists.indexOf(400);
        System.out.println(index2);

        System.out.println("is Collection lists empty?");
        boolean r3 =lists.isEmpty();
        System.out.println(r3);

        System.out.println("Size of lists2 Collection : ");
        int i2 = lists2.size();
        System.out.println(i2);

        System.out.println("Convert Collection to Array : ");
        Object[] arr=lists2.toArray();
        System.out.println("0th index : "+arr[0]);


    }
}
