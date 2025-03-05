package com.example.abstractdemo.abstractPractice;

abstract class Data {

    int dataNumber = 100;

    public Data()
    {
        System.out.println(dataNumber);
    }
}

class GetData extends Data
{


}

public class VariableDeclarationAbstract {

    public static void main(String[] args) {

        GetData gd = new GetData();
        System.out.println(gd.dataNumber);
    }
}
