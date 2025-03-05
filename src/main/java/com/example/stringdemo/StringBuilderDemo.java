package com.example.stringdemo;

import java.util.Arrays;

public class StringBuilderDemo {

    public static void main(String[] args) {

        String st ="Snowy";
        st.concat(" Cat");

        System.out.println("s1 : "+st);

        System.out.println();
        System.out.println("String Builder class");

        StringBuilder sb = new StringBuilder("Snowy");
        sb.append(" Cat");

        System.out.println("sb : "+sb);

        sb.reverse();
        System.out.println("sb reverse : "+sb);

        StringBuilder sb1 = new StringBuilder("Max");

        String str =sb1.toString();

        System.out.println();
        System.out.println("StringBuilder to string : "+str);
        System.out.println("Length str : "+str.length());


    }

}
