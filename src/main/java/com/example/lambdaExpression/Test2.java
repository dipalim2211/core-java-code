package com.example.lambdaExpression;

//CASE 02 : Parameterized Abstract Methode

@FunctionalInterface
interface B{

    void showB(int a,String name);
}

/*
class bB implements B{

    public void showB(int id, String name )
    {
        System.out.println("ID : "+id+" Name : "+name);
    }
}
*/

public class Test2 {

    public static void main(String[] args) {

//        B b = new bB();
//        b.showB(1,"John");

          B b1 =(id, name) ->
          {
              System.out.println("ID : "+id+" Name : "+name);
          } ;
          b1.showB(1,"John");

          //Functional Body has one statement - no need of { }

          B b2=(id, name) -> System.out.println("ID : "+id+" Name : "+name);
          b2.showB(2,"Max");
    }
}
