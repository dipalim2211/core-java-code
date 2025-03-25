package com.example.streamAPI;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        List<String> studName = List.of("Dipa","Sakhi","Mona","Anna","Max","Mini","Bob");

        List<String>filteredName=studName.parallelStream()       //internally Multithreading is Used using CPU core(ForkJainPool)
                .filter(name->name.startsWith("M"))
                .collect(Collectors.toList());

        System.out.println("Filter Name : "+filteredName);

    }
}
