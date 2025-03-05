package com.example.interfacedemo;


interface OldData
{
    int myData = 700;   // public static final
}

public class VariableDeclarationInterface
{

    public static void main(String[] args) {

        System.out.println(OldData.myData);

        //OldData.myData=200;       //Error final variable cant modify

    }

}
