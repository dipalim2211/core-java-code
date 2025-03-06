package com.example.anonymusClass;

class Student{

    public void subject()
    {
        System.out.println("PHY,ChEM,MATHS,HISTORY");
    }

}

class Engineer extends Student{

    @Override
    public void subject()
    {
        System.out.println("MATHS,PHY");
    }
}

//Purpose of clas is only override and use it only once
//class Doctor extends Student{
//
//    @Override
//    public void subject()
//    {
//        System.out.println("PHY,CHEM");
//    }
//}


public class TestClass {

    public static void main(String[] args) {

        //Anonymous Class
        Student student = new Student(){
            public void subject()
            {
                System.out.println("PHY,CHEM");
            }
        };
        student.subject();

        student= new Engineer();
        student.subject();
    }

}
