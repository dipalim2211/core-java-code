package com.example.loopdemo;

public class LoopDemoExercise {

    public static void main(String[] args)
    {
        int day=1;

        while (day<=5)
        {
            switch (day)
            {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;

            }

            int timeStart = 9;

            while (timeStart < 17)
                {
                int timeEnd = timeStart + 1;
                System.out.println(timeStart + "  " + timeEnd);
                timeStart += 1;
                }
            
            day=day+1;
        }

        System.out.println("Total Day Of Working "+(day-1));
    }




}
