package com.example;

class Animal
{
   final int data =100;         //FINAL VARIABLE

   public final void show()     //FINAL METHOD
   {
        //ok
   }

}
final class Dog extends Animal{     //FINAL CLASS


  //  public void show() {}  show() cant be override

}

//class Cat extends Dog{ } can't inherit from final



public class finalKeyword {
    public static void main(String[] args) {

        Animal a = new Animal();
       // a.data=101;  Error
    }
}
