package com.example.streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

    //List out the word start with matching data
    public static List<String> getListOfName(List<String> names, String matchingData)
    {
        List<String> output = new ArrayList<>();

        //Iterate to find Match

      for(String name : names)
      {
          if(name.startsWith(matchingData)){
                output.add(name);
          }
      }
        return output;
    }

    public static List<String> getUpperCase(List<String> names)
    {
        List<String> upperCase = new ArrayList<>();

        for(String s : names){
            upperCase.add(s.toUpperCase());
        }

        return  upperCase;
    }


    public static void main(String[] args) {

        List<String> studName = List.of("Dipa","Sakhi","Mona","Anna","Max","Mini","Bob");

        //Case : Want name start with M and it in uppercase

        //Pass nameList and MatchingWord
        /*
        List <String> nameArray=getListOfName(studName,"M");

        List <String> upperCaseArray=getUpperCase(nameArray);

        System.out.println(nameArray);
        System.out.println("---------");
        System.out.println(upperCaseArray);

         */

        //Stream API : Functional Programming

        //steam() call on Any collection : return stream of String
        Stream<String> stream = studName.stream();

        List <String> finalOutput = stream
                .filter(name -> name.startsWith("M"))   //Filter Input
                .map(name -> name.toUpperCase())    //Transformation
                .collect(Collectors.toList());  //collecting Output

        System.out.println(finalOutput);

        //Stream method

        //Intermediate Operation : Always return String

        System.out.println("Intermediate Operation");

        Stream<String> stream1 = studName.stream();
        Stream<String> stream2 = stream1.filter(n->n.startsWith("M"));
        Stream<String> stream3 = stream2.map(String::toUpperCase);

        System.out.println("Terminal Operation");

        List<String> list = stream3.collect(Collectors.toList());
        list.forEach(System.out::println);

        //Reducing Element

        List<Integer> numbers = Arrays.asList(1,2,4,5);
        int sum  =numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println("sum : "+sum);

    }
}
