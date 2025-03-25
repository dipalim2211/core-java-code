package com.example.dateUtili;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("Date : "+date);                //Current System Time
        System.out.println("Time : "+date.getTime());
        System.out.println(date.toInstant());     //Work for TimeZone

        //convert Date object into LocalDate

        LocalDate convertDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        System.out.println("Date object into LocalDate : "+convertDate);

        // convert Date object into LocalDateTime

        LocalDateTime convertDateTime1 = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        System.out.println("Date object into LocalDateTime : "+convertDateTime1);

        //Instant Class in JAVA

        Instant instant = Instant.now();    //global Time UTC
        System.out.println(instant);        //ByDefault Come under UTC
        System.out.println(instant.toEpochMilli());
        //get epoch time - unix Time - 1970-01-01 Started counting

        System.out.println();

        //1.Local Date

        LocalDate currentDate = LocalDate.now();    //Format YYYY-MM-DD
        System.out.println("Today's Date : "+currentDate);

        System.out.println();

        //2.Local Time

        LocalTime currentTime = LocalTime.now();    //HH:MM:SS:MilliSec
        System.out.println("Time : "+currentTime);

        System.out.println();

        //3.LocalDateTime:Date+Time

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time : "+dateTime);    //YYYY-MM-DD T HH:MM:SS

        System.out.println();

        //4.ZoneDateTime : Date n Time according to zone

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zone Date Time : "+zonedDateTime);
        //YYYY-MM-DD T HH:MM:SS + Zone

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("Zone Date Time : "+zonedDateTime1);

        System.out.println();

        //5.Change dateTime Format acc to your choice

        DateTimeFormatter pattern;
        pattern=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime=dateTime.format(pattern);
        System.out.println("yyyy-MM-dd HH:mm:ss - "+formattedDateTime);

        pattern=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss");
        String formattedDateTime1=dateTime.format(pattern);
        System.out.println("yyyy-MM-dd HH:mm:ss - "+formattedDateTime1);

        System.out.println();

        //6.Important : Duration Class

        LocalDateTime futureDate=dateTime.plus(Duration.ofDays(2));
        System.out.println("Future Date : " +futureDate);

        futureDate=dateTime.plus(Duration.ofHours(4));
        System.out.println("Increase in Hours : " +futureDate);

        System.out.println();

        //7. of method

        LocalDate date1 = LocalDate.of(2025,05,25);
        LocalDate date2 = LocalDate.of(2025,17,25);

        if(date1.isAfter(date2))
        {
            System.out.println(" Date1 after Date2");
        } else if (date1.isBefore(date2)) {
            System.out.println("Date1 before Date2");
        } else if (date1.isEqual(date2)) {
            System.out.println("Date1 equal Date2");
        }

        System.out.println();



    }



}
