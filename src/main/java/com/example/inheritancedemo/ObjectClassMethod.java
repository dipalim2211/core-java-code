package com.example.inheritancedemo;

 class Point
 {
     int x;
     int y;

     public Point(int x, int y) {
         this.x = x;
         this.y = y;
     }

 }



public class ObjectClassMethod {

    public static void main(String[] args) {

        Point p1 = new Point(5,5);      //Add : 100
        Point p2 = new Point(5,5);      //Add : 200
        Point p3 = p2;                        //Add : 200
        //Not creating new object just pointing p3 to p2


        if(p1 == p2)
            System.out.println("p1 & p2 are equal by == ");
        else
            System.out.println("p1 & p2 are not equal by == ");

        if(p1.equals(p2))
            System.out.println("p1 & p2 are equal by equals() Method ");
        else
            System.out.println("p1 & p2 are not equal by equals() Method ");

        if(p2.equals(p3))
            System.out.println("p1 & p2 are equal by equals() Method ");
        else
            System.out.println("p1 & p2 are not equal by equals() Method ");

    }
}
