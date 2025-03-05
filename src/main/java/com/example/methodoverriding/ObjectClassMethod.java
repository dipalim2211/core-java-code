package com.example.methodoverriding;

 class Point
 {
     int x;
     int y;

     public Point(int x, int y) {
         this.x = x;
         this.y = y;
     }

     /*

     Override equal method of object class to make change w.r.t us
     @Override
     public boolean equals(Object obj) {
         return (this==obj);
     }
     */

     public boolean equals(Point pointObj) {
         /*
                return true -
                p1(x)==p2(x)
                p1(y)==p2(y)

          */

         boolean b1= this.x==pointObj.x && this.y==pointObj.y ;
            return  b1;
     }

 }

public class ObjectClassMethod {

    public static void main(String[] args) {

        Point p1 = new Point(5,5);      //Add : 100
        Point p2 = new Point(5,5);      //Add : 200
        Point p3 = new Point(5,10);                       //Add : 200
        //Not creating new object just pointing p3 to p2


        if(p1 == p2)
            System.out.println("p1 & p2 are equal by == ");
        else
            System.out.println("p1 & p2 are not equal by == ");

        //this=P1 , pointObj =p2
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
