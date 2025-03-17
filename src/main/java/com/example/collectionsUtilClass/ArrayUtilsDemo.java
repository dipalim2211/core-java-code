package com.example.collectionsUtilClass;

import java.util.Arrays;
import java.util.List;

public class ArrayUtilsDemo {

    public static void main(String[] args) {

        System.out.println("asList : Take input  create list");
        List<String> s1 =Arrays.asList("Dip","Sam","Kiwi","Max","Adi","Zee");
        System.out.println(s1);

        System.out.println();

        System.out.println("Arrays.toString : Print Array");
        int[] a1 ={1,3,4,5,6,2};
        System.out.println("Array a1[] : "+Arrays.toString(a1));

        System.out.println();



        Arrays.sort(a1);
        System.out.println("Arrays.sort(a1) : "+Arrays.toString(a1));
        //Returns a string representation of the array

        System.out.println();
        int index=Arrays.binarySearch(a1,5);
        System.out.println("Arrays.binarySearch(a1,5) : "+index);

        System.out.println();
        int[] a2 =Arrays.copyOf(a1,7);
        System.out.println("int[] a2 =Arrays.copyOf(a1,7) : ");
        //element not present add 0 to suffix
        System.out.println("a2[] : "+Arrays.toString(a2));

        System.out.println();
        int[] a3 =Arrays.copyOfRange(a1,4,7);
        System.out.println("Arrays.copyOfRange(a1,4,7)");
        System.out.println("a3[] : "+Arrays.toString(a3));
    }
}
