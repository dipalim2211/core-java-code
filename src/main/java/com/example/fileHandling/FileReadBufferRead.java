package com.example.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class BufferReaderDemo {

    public static void readFileData(String f){

        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line=br.readLine();  //Return String

            while (line != null){
                System.out.println(line.toUpperCase());
                line=br.readLine();
            }

            System.out.println();
            System.out.println("Line Printed");
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Name is not Valid");
        } catch (IOException e){
            System.out.println("Interruption In File Reading");
        }
    }

}

public class FileReadBufferRead {

    public static void main(String[] args) {

        System.out.println("Start");
        BufferReaderDemo.readFileData("E:\\Java_Trainig\\Sample.txt");
        System.out.println("End");

    }
}
