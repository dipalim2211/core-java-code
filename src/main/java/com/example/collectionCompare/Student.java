package com.example.collectionCompare;

public class Student implements Comparable<Student>{

    private  int id;
    private String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student other)
    {
        /*
        //Integer Comparison
        if (this.id>other.id)
        {
            return  -1;
        }else if (this.id<other.id)
        {
            return  1;
        }

        return 0;

         */

        //String Comparison : Logic given String Class

        //return this.name.compareTo(other.name);

       // return other.name.compareTo(this.name);

       // return other.id-this.id;

        return  this.id-other.id;

    }
}
