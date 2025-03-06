package com.example.dependencyInjection;

class Desktop{

    public void code()
    {
        System.out.println("Desktop Coding");
    }

}

class Laptop{

    public void code()
    {
        System.out.println("Laptop Coding");
    }

}



public class Developer {

    /*  Tightly Coupled
        Developer has to work with only desktop can
        not work with laptop
     */

    private Desktop desktop = new Desktop();        //Tight Coupled

    public void developApplication(){

        System.out.println("Developing Application");
        desktop.code();
    }

}


