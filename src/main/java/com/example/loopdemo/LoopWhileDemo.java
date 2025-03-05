package com.example.loopdemo;

public class LoopWhileDemo {

    public static void main(String[] args) {

        //Case : Jumping Example session 5
        /*
        int i = 1;
        int totalJump = 0;

        while(i<=100)
        {
            System.out.println("Jump "+ i );
            i=i+5;
            totalJump++;
        }

        System.out.println("Total jump Count "+totalJump);

         */
        /*
        String day = "Tuesday";

        System.out.println("Office Time for "+day +" is ");
        switch (day){

            case "Monday", "Tuesday" , "Thursday" , "Wednesday":

                for(int i=9;i<12; i++)
                {
                    System.out.println(i + " AM "+"  "+ (i+1)+" AM ");
                }
                for(int j=12;j<17; j++)
                {
                    System.out.println(j + " PM " +"  "+ (j+1)+" PM ");
                }

        }



         */


            int timeStart = 9;

            while (timeStart < 17) {
                int timeEnd = timeStart + 1;
                System.out.println(timeStart + "  " + timeEnd);
                timeStart += 1;
            }

    }

}
