package com.example.dependencyInjection;

//Computer is generic concept with behaviour coding
interface Computer
{
    void code();
}

class DesktopCode implements Computer
{
    public void code()
    {
        System.out.println("Coding on Desktop");
    }
}

class LaptopCode implements Computer
{
    public void code()
    {
        System.out.println("Coding on Laptop");
    }

}

class TabletCode implements Computer
{
    public void code()
    {
        System.out.println("Coding on Tablet");
    }

}

public class Coder {

    private Computer computer;    //Common Reference //Loosely Coupled design

    //call constructor to pass object(Laptop/Tab/Desk)

    public Coder(Computer computer)
    {
         this.computer=computer;        //store object
    }

    public void developingApplication(String name )
    {
        System.out.println("Developing Application");
        System.out.println(name+" is ");
        computer.code();                //code method of passed object
    }


}
