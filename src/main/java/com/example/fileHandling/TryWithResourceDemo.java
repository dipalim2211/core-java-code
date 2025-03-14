package com.example.fileHandling;

//CASE : AUTO CLOSABLE

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class CloseResourceDemo
{
    public static void readFile1(String f1) {

        try (BufferedReader br = new BufferedReader(new FileReader(f1))) {

            String line = br.readLine();  //Return String

            while (line != null) {
                System.out.println(line.toUpperCase());
                line = br.readLine();
            }
        }       //File Close at '}' of try block
        catch (FileNotFoundException e) {
            System.out.println("File Name is not Valid");
        } catch (IOException e) {
            System.out.println("Interruption In File Reading");
        }

    }
}

public class TryWithResourceDemo {

    public static void main(String[] args) {
        CloseResourceDemo.readFile1("E:\\Java_Trainig\\Sample.txt");
    }
}


