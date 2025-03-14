package com.example.fileHandling;

import java.io.*;

class WriteFile{

    /*
    public static String[] readFile2(String f2) {

        String[] data = new String[3];   //Size : 2 Line I know otherwise Collection


        try (BufferedReader br = new BufferedReader(new FileReader(f2))) {

            String line = br.readLine();  //Return String

            int i = 0;
            data[i++] = line;

            //Read Data and store it in string array (data) to write
            while (line != null) {
                line = br.readLine();       //Read Data
                data[i++]=line;             //Store Data
            }
        }      //File Close at '}' of try block
        catch (FileNotFoundException e) {
            System.out.println("File Name is not Valid");
        } catch (IOException e) {
            System.out.println("Interruption In File Reading");
        }

        //return collected lines data to user to write
        return data;
    }


     */
    public static void writeToFile(String path,String content){

        try(FileWriter fw = new FileWriter(path,true))      //append=true
        {
            //        fw.write('A');
           //       fw.write("\nBye Bye");
            fw.write(content);

        } catch (Exception e) {
            System.out.println("Something went wrong while writing to file");
            throw new RuntimeException(e);
        }
    }
}



public class WriteFileDemo {

    public static void main(String[] args) {

       String FilePath="E:\\Java_Trainig\\Sample_1.txt";

       WriteFile.writeToFile(FilePath, "\nThis is 1  new Line ");
       WriteFile.writeToFile(FilePath, "\nThis is 2  new Line ");
       WriteFile.writeToFile(FilePath, "\nThis is 3  new Line ");

        System.out.println("File Has been written");


        /*
        //Read Line and Return data in Line of string
       String[] l= WriteFile.readFile2("E:\\Java_Trainig\\Sample.txt");



       //Read Line data
       for(String s:l){
           System.out.println(s);
       }
 */
    }
}
