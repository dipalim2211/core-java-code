package com.example.thiskeyword;

class Student
{
    //Global Scope
    private final String name;            // Object Variable
    private int age;                // Protect Data
    private String motherName;

    Student(String s, int a , String m)
    {
        name =s;
        age = a;
        motherName = m;
    }

    int getAge()        //Permission to get data
    {
        return age;
    }

    void setAge(int a)
    {     //Permission to set value
        int result = 0; //Method Variable, scope : Within Method
        if(a>0 && a<100)
            age=a;

        else
            System.out.println("Invalid Age");
    }

    void setName(String name)
    {
        //Local Scope
        /* As your using same name of global (name) variable in local scope it give
         preference to local variable
         */

        name = name;  // Name Hiding

        /*
        object value = method value,
        method value should assign to object value___ but not happening
        so go with this keyword

         */
    }

    String getName()
    {
        return name;
    }

    String getMotherName()
    {
        return motherName;
    }

    void setMotherName(String motherName)
    {
        this.motherName=motherName;
    }




}

public class StudentDemo {

    public static void main(String[] args) {

        Student student1 = new Student("Snowy",2,"DD");
        System.out.println("Name : "+student1.getName()+ "  Age : "+student1.getAge());

        Student student2 = new Student("Micky",4,"RR"); //Local Variable
        student2.setName("Kitty");
        student2.setAge(3);
        System.out.println("Name : "+student2.getName()+"  Age : "+student2.getAge());
        /*
            Try to change name but its no changed
         */


        Student student3 = new Student("Hary",6,"HH");
        student3.setMotherName("YY");
        System.out.println("HARY MOther NAme " + student3.getMotherName());
    }
}
