package com.example.dependencyInjection;

public class CoderTest {

    public static void main(String[] args) {

        //Want choice of choosing device to code
        //Common Reference for different object
        //Can be achieved using in same class coder

        /*
        Computer computer = new DesktopCode();
        computer.code();

        computer = new LaptopCode();
        computer.code();

        computer = new TabletCode();
        computer.code();

         */

        Coder max =  new Coder(new LaptopCode());
        max.developingApplication("max");

        Coder min = new Coder(new DesktopCode());
        min.developingApplication("min");

        Coder deep = new Coder(new TabletCode());
        deep.developingApplication("deep");

    }




}
