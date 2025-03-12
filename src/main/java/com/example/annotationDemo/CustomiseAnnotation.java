package com.example.annotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)     //Whom to use?
@Target(ElementType.TYPE)               //Where to use? - Class
@interface Animal{}

@Animal
class Dog{

  //  @Animal : Error Not applicable to methode
    public void bark(){}

}

@Retention(RetentionPolicy.RUNTIME)     //Whom to use?
@Target({ElementType.FIELD,ElementType.METHOD})               //Where to use? - Variable
@interface Bird{}

class crow{

    @Bird
    private String color;

   // @Bird : Not Applicable to constructor
    crow(){}

    @Bird
    public void getColor(){}

}


public class CustomiseAnnotation {
}
