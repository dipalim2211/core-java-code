package com.example.stringdemo;

public class Stringmethod {

    public static void main(String[] args) {

        String s1="Dipa SnoWy";

        System.out.println("String : "+s1);

        System.out.println("toUpperCase : "+s1.toUpperCase());

        s1=s1.toLowerCase();
        System.out.println("toLowerCase : "+s1);

        System.out.println("charAt(4) : "+s1.charAt(2));

        char ch = s1.charAt(3);
        System.out.println("charAt(4) : "+ch);

        System.out.println("length() : "+s1.length());

        System.out.println();

        String s2 = "Dear Life";

        System.out.println("String : "+s2);

        int length=s2.length();
        System.out.println("Length : "+length);

        boolean r1=s2.isEmpty();
        System.out.println("isEmpty() : "+r1);

        boolean r2=s2.isBlank();
        System.out.println("isBlank() : "+r2);

        System.out.println();

        String s3=" ";
        System.out.println("String : "+s3);

        boolean r4=s3.isEmpty();
        System.out.println("isEmpty() : "+r4);

        boolean r5=s3.isBlank();
        System.out.println("isBlank() : "+r5);

        String s4="";
        System.out.println("String : "+s4);

        boolean r6=s4.isEmpty();
        System.out.println("isEmpty() : "+r6);

        boolean r7=s4.isBlank();
        System.out.println("isBlank() : "+r7);

        System.out.println();

        System.out.println("String s2 : "+s2);

        System.out.println("contains ear : "+s2.contains("ear"));
        System.out.println("contains fi : "+s2.contains("fi"));

        System.out.println("indexof e : "+s2.indexOf("e"));
        System.out.println("indexOf W : "+s2.indexOf('W'));


        System.out.println("lastIndexOf(e) : "+s2.lastIndexOf("e"));

        System.out.println("s2.startsWith(if) : "  + s2.startsWith("if"));
        System.out.println("s2.startsWith(Li) : "  + s2.startsWith("Li"));
        System.out.println("s2.startsWith(De) : "  + s2.startsWith("De"));

        System.out.println("s2.endsWith(fe) : "+s2.endsWith("fe"));
        System.out.println("s2.endsWith(ar) : "+s2.endsWith("ar"));

        System.out.println("s2.substring(3) : "+s2.substring(3));
        System.out.println("s2.substring(9) : "+s2.substring(9));

        System.out.println("s2.substring(3,7) : "+s2.substring(3,7));
        System.out.println("s2.substring(3,9) : "+s2.substring(3,9));








    }
}
