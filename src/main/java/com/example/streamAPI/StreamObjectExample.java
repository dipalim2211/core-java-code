package com.example.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{

    String name;
    String education;
    double percentage;

    public Student(String name, String education, double percentage) {
        this.name = name;
        this.education = education;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +", education='" + education + '\'' +
                ", percentage=" + percentage +
                "\n";
    }
}

class Employee{

    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }
    

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", department='" + department + '\'' +"\n";
    }
}

public class StreamObjectExample {

    public static void main(String[] args) {

        List<Student> studentList = List.of(
        new Student("Alice", "BCA", 85.5),
        new Student("Bob", "B.Tech", 98.0),
        new Student("Charlie", "MBA", 92.3),
        new Student("David", "B.Tech", 81.2),
        new Student("Eve", "M.Sc", 89.7),
        new Student("Frank", "B.Tech", 76.4),
        new Student("Grace", "B.Tech", 95.1),
        new Student("Hank", "MCA", 98.0),
        new Student("Ivy", "BCA", 84.6),
        new Student("Jack", "MCA", 88.8)
        );

       /*
        List<Student> eligibleStudent = studentList.stream()
                .filter(student -> student.getEducation().equals("B.Tech"))
                .filter(student -> student.getPercentage()>=70)
                .collect(Collectors.toList());

        System.out.println(eligibleStudent);
        */

            //Convert Student to employee by map()
            List<Employee> employeeList = studentList.stream()
                    .filter(student -> student.getEducation().equals("B.Tech"))
                    .filter(student -> student.getPercentage()>=70)
                    .map(student -> new Employee(student.getName(), "IT"))
                    .collect(Collectors.toList());

            System.out.println(employeeList);

            //GroupingBy

        Map<String,List<Student>> studmap= studentList.stream()
                        .collect(Collectors.groupingBy(Student::getEducation));

        System.out.println("Group Student By education ");
        System.out.println(studmap);


        Map<Double,List<Student>> studentmap= studentList.stream()
                .collect(Collectors.groupingBy(Student::getPercentage));

        System.out.println("Group Student By percentage ");
        System.out.println(studentmap);


    }
}
