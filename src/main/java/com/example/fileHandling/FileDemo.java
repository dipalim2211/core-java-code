package com.example.fileHandling;

import java.io.File;
import java.util.Date;
import java.util.SortedMap;

public class FileDemo {

    public static void main(String[] args) {

        /*
        String path ="E:\\Java_Trainig\\Sample.txt";

        //file object: pass file to its constructor
        File file = new File(path);

        System.out.println("File Name : "+file.getName());
        System.out.println("is it file ?  : "+file.isFile());
        System.out.println("Can Execute file ? : "+file.canExecute());
        System.out.println("Can Read file ? : "+file.canRead());
        System.out.println("Can Write file ? : "+file.canWrite());
        System.out.println("Is it Directory ? : "+file.isDirectory());
        System.out.println("Length : "+file.length());
         */

        System.out.println();

        /*
        String dirPath="E:\\Java_Trainig";
        File dirFile = new File(dirPath);
        System.out.println("Directory Name : "+dirFile.getName());
        System.out.println("Is it File ? : "+dirFile.isFile());
        System.out.println("Is it directory ? : "+dirFile.isDirectory());

        String[] fileName=dirFile.list();     //return string : Names of file
        for(String d :fileName){
            System.out.println(d);
        }
         */
        System.out.println();

        /*
        System.out.println("File : Last Modified ");
        File[] files =dirFile.listFiles();
        for(File f : files){
           // System.out.println(f.getName()+" : "+f.lastModified()); //It shows Epoch time
             System.out.println(f.getName()+" : "+new Date(f.lastModified()));
        }
         */

        /*  CASE : To delete File

            File fileToBeDeleted = new File(dirPath + "/data copy.txt");     //Concatenation
            boolean isDeleted = fileToBeDeleted.delete();
            if (isDeleted) {
                System.out.println("File deleted successfully");
            } else {
            System.out.println("Failed to delete the file");
            }

         */

        /*
        //Case : Create New Directory

        System.out.println();

        System.out.println("FileDemo and DemoTxt Not present now");
        String path1 ="E:\\Java_Trainig\\FileDemo\\Demo.txt";

        File file2 = new File(path1);
        file2.mkdirs();
        System.out.println("Now Directory Created");
        */



    }
}
