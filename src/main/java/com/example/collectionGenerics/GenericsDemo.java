package com.example.collectionGenerics;

//Without Generics

/*
class Calculator{

    public int add(int a, int b){
         return  a+b;
    }

}
*/

//With Generics

class Calculator<T>{

    public T add(T a, T b){
      //  return  a+b;
        return a;
    }

}


public class GenericsDemo {

    public static void main(String[] args) {

    Calculator<Integer> c1 = new Calculator<>();
    c1.add(10,20);

    Calculator<Float> c2 = new Calculator<>();
    c2.add(10.2f,20.2f);

    Calculator<Double> c3 = new Calculator<>();
    c3.add(102.2,202.1);

    }
}
