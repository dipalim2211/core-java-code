package com.example.thisandSuper;

//Constructor Chaining

class A{

    public A(){
        System.out.println("Constructor A");
    }

    public A(int a){
        System.out.println("Parameterized Constructor Called A");
    }

}

class B extends A{

    public B()
    {
        super();   //By-default given by Java
        System.out.println("Constructor B");
    }
    public B(String str)
    {
        super();    //Call to default constructor ob base class
        System.out.println("Parameterized Constructor B : "+str);
    }

}
class C extends B{

    public C() {
        System.out.println("Default Constructor C");
    }

    public C(int a) {
        super("Dipali");  //Call to parameterized Constructor of base class
        System.out.println("Parameterized Constructor C : "+a);

    }
}



public class ConstructorChainInheritance {

    public static void main(String[] args) {

         A a = new A(10);

       // B b = new B(10);

        C c = new C(20);
    }
}
