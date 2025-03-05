package com.example.stringdemo;

public class Stringimmutable {

    public static void main(String[] args) {

        System.out.println();

        String s1 = "A";
        s1.concat(" B");

        System.out.println("s1 : "+s1);                   // S1-A

        System.out.println(s1.concat(" C"));          // AC

        s1=s1.concat("  D");                          // s1- AD
        System.out.println("New S1 : "+s1);              //  AD


        String s2=s1.concat(" E");                   //  s2- ADE
        System.out.println("Immutable S1 : "+s1);       //   S1 - AD
        System.out.println("S2 :"+s2);                  //   ADE

        String a ="a"+"b";
        System.out.println("a : "+a);

        a ="a"+"b"+"c";
        System.out.println("a : "+a);



    }
}
