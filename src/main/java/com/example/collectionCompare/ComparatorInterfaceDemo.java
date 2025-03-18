package com.example.collectionCompare;

import java.util.*;

class SortStudentByAge implements Comparator<Student1> {

    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getAge()-s2.getAge();
    }
}

class SortStudentByName implements Comparator<Student1> {

    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class SortProductByRating implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
        return (int) (p1.getRating()-p2.getRating());
    }
}



public class ComparatorInterfaceDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Student1> l1 = new ArrayList<>();

        l1.add(new Student1(1, "P",22));
        l1.add(new Student1(3, "B",24));
        l1.add(new Student1(2, "R",20));
        l1.add(new Student1(4, "D",18));

        for(Student1 s1 : l1) {
            System.out.println(s1);
        }

        System.out.println();

        System.out.println("Sort By Name or Age : ");
        String input = sc.next();

        if(input.equalsIgnoreCase("Age")) {
            System.out.println("Sort By Age : ");
            Collections.sort(l1, new SortStudentByAge());
        }else if (input.equalsIgnoreCase("Name")){
            System.out.println("Sort By Name : ");
            Collections.sort(l1,new SortStudentByName());
        }
        System.out.println();

        for(Student1 s1 : l1) {
            System.out.println(s1);
        }

        sc.close();
    }
}
