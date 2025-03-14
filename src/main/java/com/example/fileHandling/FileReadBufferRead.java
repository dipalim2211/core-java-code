package com.example.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class BufferReaderDemo {

    public static void readFileData(String f){

        //Type 3

        BufferedReader br=null;     //By default Value : Null

        try {

            /* Type 1
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
             */

            /* Type 2
            BufferedReader br = new BufferedReader(new FileReader(f));
             */

            br = new BufferedReader(new FileReader(f));     //Type 3

            String line=br.readLine();  //Return String

            while (line != null){
                System.out.println(line.toUpperCase());
                line=br.readLine();
            }

            System.out.println();
            System.out.println("Line Printed");
        //    fr.close();
        //    br.close();       //Should be in finally

        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.out.println("File Name is not Valid");
        } catch (IOException e){
            System.out.println("Interruption In File Reading");
        }finally {
            try{
                if(br!=null)        //If found then only close else don't effort to close
                {
                    System.out.println("Closing File");
                    br.close(); //throw IOException:Put in try catch
                    //if br didn't get file it will be null ->null.close -> NPE
                }
            } catch (IOException e) {
                System.out.println("Something went wrong while closing");
            }
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
