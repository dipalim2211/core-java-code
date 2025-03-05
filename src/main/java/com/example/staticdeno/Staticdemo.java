package com.example.staticdeno;

class Mobile {

    //Non-static variable
    private String name;
    private int prize;

    //Static Variable
    static String category;

    public Mobile(String name, int prize) {
        this.name = name;
        this.prize = prize;
    }

    //CASE : Static Variable access in Non-static Method

    public void getData() {

        System.out.println("name : " + name + "\t" +
                "Prize : " + prize + "\t"
                + "Category : " + category);
    }

    //CASE : Non-Static Variable cant access in static Method

    public static void showData() {

        System.out.println("In Static Method");

        /*
        System.out.println("name : "+name + "\t"+
                "Prize : "+prize+"\t"
                +"Category : "+category);

        */  //ERROR
    }

    //CASE : Non-Static Variable can be accessed in static Method

    public static void showData(Mobile mob)
    {
        System.out.println("In static method of passed Object");

        System.out.println("name : "+mob.name + "\t"+
                "Prize : "+mob.prize+"\t"
                +"Category : "+category);
    }

}



public class Staticdemo {

    public static void main(String[] args) {

        Mobile.category="SmartPhone";
        Mobile.showData();

        Mobile mob1 = new Mobile("Samsung",1000);
        Mobile mob2 = new Mobile("Apple" ,2000);

        mob1.getData();
        mob2.getData();

        System.out.println("Passing Mobile Object to static Method");
        Mobile.showData(mob1);

        System.out.println();
        System.out.println("MATH CLASS");

        //Math math = new Math();   //ERROR

        System.out.println("PI Value"+Math.PI);

        //Pure Static Function
        int max =Math.max(10,20);
        System.out.println("Max Value : "+max);

        int min=Math.min(40,50);
        System.out.println("Min Value : "+min);


    }

}
