package com.example.collectionMap;

import java.util.Properties;

public class PropertiesClassDemo {

    public static void main(String[] args) {

        Properties properties =new Properties();

        //Mostly used to read the application properties

        // public synchronized Object setProperty(String key, String value) {
        //     return put(key, value);
        //public class Properties extends Hashtable imp map

        //To set Properties

        properties.setProperty("username","Dipali");
        properties.setProperty("password","Gaikwad");

        //To retrieve Properties

        String value = properties.getProperty("username");
        System.out.println(value);


    }
}
