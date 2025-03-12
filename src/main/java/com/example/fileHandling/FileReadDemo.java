package com.example.fileHandling;

//Case 1 : Read File

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileRead{

    public static void readFile(String fileName){

        try {
            FileReader fr = new FileReader(fileName);

            //Methods FileReader:

            int ch = fr.read(); //read character by Character

            /*
            //to print convert int to character
            System.out.println((char)ch); //Print First Character
             */

            while (ch != -1){
                System.out.print((char)ch);
                ch=fr.read();
            }
            System.out.println();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();  //Always log exception
            System.out.println("File Name is not Valid");
        } catch (IOException e){
            System.out.println("Interruption In File Reading");
        }
    }

}


public class FileReadDemo {

    public static void main(String[] args) {

        FileRead.readFile("E:\\Java_Trainig\\Sample.txt");

    }
}
